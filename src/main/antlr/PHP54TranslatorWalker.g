/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
tree grammar PHP54TranslatorWalker;

options {
	tokenVocab = TSPHP;
	ASTLabelType = ITSPHPAst;
	output = template;
}

@header{
/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.tutteli.tsphp.translators.php54.antlr;

import ch.tutteli.tsphp.common.ITSPHPAst;

}


compilationUnit	
	:	(n+=namespace) -> file(namespaces={$n})
	;
	
namespace
	:	^('namespace' (name=TYPE_NAME|DEFAULT_NAMESPACE) namespaceBody)
		{
			String namespaceName = null; 
		 	if(name!=null){
		 		namespaceName=name.getText().substring(1,name.getText().length()-1);
	 		}
	  	}

		 -> namespace(name={namespaceName},body={$namespaceBody.st})
	;
	
namespaceBody
	:	^(NAMESPACE_BODY statements+=statement*) -> body(statements={$statements})
	|	NAMESPACE_BODY -> body(statements={null})
	;

statement
	:	useDeclarationList -> {$useDeclarationList.st}
	|	definition -> {$definition.st}
	;
	
useDeclarationList
	:	^('use' useDeclaration+) 
		-> useDeclarationList(useDeclarations={$useDeclaration.st})
	;

useDeclaration
	:	^(USE_DECLARATION TYPE_NAME Identifier) 
		-> useDeclaration(type={$TYPE_NAME}, alias={$Identifier})
	;

definition
	:	classDeclaration -> {$classDeclaration.st}
	|	interfaceDeclaration ->{$interfaceDeclaration.st}
	|	functionDeclaration -> {$functionDeclaration.st}
	|	constDeclarationList ->{$constDeclarationList.st}
	;
	
classDeclaration
	:	^('class' classModifier Identifier extendsDeclaration implementsDeclaration classBody)
		-> class(
			modifier={$classModifier.st}, 
			identifier={$Identifier}, 
			ext={$extendsDeclaration.st},
			impl={$implementsDeclaration.st},
			body={$classBody.st}
		)
	;
classModifier
	:	^(CLASS_MODIFIER list+=classModifierNames) -> modifier(modifiers={$list})
	|	CLASS_MODIFIER -> {null}
	;

classModifierNames
@after {$st = %{$text};}
	:	Final 
	|	Abstract
	;
	
extendsDeclaration
	:	^('extends' identifiers+=TYPE_NAME+)	-> extends(identifiers={$identifiers})
	|	'extends' 				-> {null}
	;


implementsDeclaration
	:	^('implements' identifiers+=TYPE_NAME+) -> impl(identifiers={$identifiers})
	|	'implements' 				-> {null}
	;
	
classBody
	:	^(CLASS_BODY def+=classBodyDefinition*) -> body(statements={$def})
	|	CLASS_BODY -> body(statements={null})
	;
	
classBodyDefinition
	:	constDeclarationList -> {$constDeclarationList.st}
	|	classMemberDeclaration	-> {$classMemberDeclaration.st}
	|	abstractConstructDeclaration -> {$abstractConstructDeclaration.st}
	|	constructDeclaration -> {$constructDeclaration.st}
	|	abstractMethodDeclaration -> {$abstractMethodDeclaration.st}
	|	methodDeclaration -> {$methodDeclaration.st}
	;
	
constDeclarationList
	:	^(CONSTANT_DECLARATION_LIST 
			^(TYPE ^(TYPE_MODIFIER Public Static Final) scalarTypes)
			identifiers+=constantAssignment+
		) 
		-> const(identifiers={$identifiers})
	;
	
constantAssignment
	:	^(Identifier v=Int)
		 -> assign(id={$Identifier}, value={v})
	;

scalarTypes
@after {$st = %{$text};}
	:	'bool'
	|	'int'
	|	'float'
	|	'string'
	;

classMemberDeclaration
	:	^(CLASS_MEMBER variableDeclarationList) -> {$variableDeclarationList.st}
	;

variableDeclarationList
	:	^(VARIABLE_DECLARATION_LIST 
			^(TYPE typeModifier allTypes) 
			identifiers+=variableDeclaration+
		)
		-> variableDeclarationList(modifier={$typeModifier.st},identifiers={$identifiers})
	;
	
typeModifier returns[boolean isCast, boolean isNullable]
	:	^(TYPE_MODIFIER cast=Cast? nullable='?'? variableModifier?) {$isCast=cast!=null; $isNullable=nullable!=null;} -> {$variableModifier.st}
	|	TYPE_MODIFIER -> {null}
	;
	
variableModifier
	:	list+=staticToken list+=accessModifier -> modifier(modifiers={$list})
	|	list+=accessModifier list+=staticToken -> modifier(modifiers={$list})
	|	accessModifier -> {$accessModifier.st}
	;
	
staticToken
	:	Static -> {%{$Static.text}}
	;
	
accessModifier
	:	Private -> {%{$Private.text}}
	|	Protected -> {%{$Protected.text}}
	|	Public -> {%{$Public.text}}
	;
	
variableDeclaration
	:	^(VariableId v=Int) -> assign(id={$VariableId},value={v})
	|	VariableId -> {%{$VariableId.text}}
	;

allTypes
	:	primitiveTypes
	|	TYPE_NAME
	;

primitiveTypes
	:	scalarTypes
	|	'array'
	|	'resource'
	|	'object'
	;
	
primitiveTypesWithoutArray
	:	scalarTypes -> {$scalarTypes.st}
	|	TypeResource -> {%{$TypeResource.text}}
	|	TypeObject -> {%{$TypeObject.text}}
	;
	
abstractConstructDeclaration
	:	^(identifier='__construct' 
			^(METHOD_MODIFIER abstractMethodModifier)
			^(TYPE typeModifier returnType)
			formalParameters
			block
		)	
		-> abstractMethod(
			modifier={$abstractMethodModifier.st},
			identifier={$identifier},
			params={$formalParameters.st},
			body={$block.instructions}
		)
	;
	
constructDeclaration
	:	^(identifier='__construct' 
			^(METHOD_MODIFIER methodModifier)
			^(TYPE typeModifier returnType)
			formalParameters
			block
		)	
		-> method(
			modifier={$methodModifier.st},
			identifier={$identifier},
			params={$formalParameters.st},
			body={$block.instructions}
		)
	;

abstractMethodDeclaration
	:	^(METHOD_DECLARATION
			^(METHOD_MODIFIER abstractMethodModifier)
			^(TYPE typeModifier returnType)
			(identfier=Identifier|identfier=Destruct)
			formalParameters
			BLOCK
		)
		-> abstractMethod(
			modifier={$abstractMethodModifier.st},
			identifier={$identfier},
			params={$formalParameters.st}
		)
	;
	
abstractMethodModifier
	:	(	list+=abstractToken list+=accessModifier 
		|	list+=accessModifier list+=abstractToken
		)
		-> modifier(modifiers={$list})
	;

abstractToken
	:	Abstract -> {%{$Abstract.text}}
	;

methodDeclaration
	:	^(METHOD_DECLARATION
			^(METHOD_MODIFIER methodModifier)
			^(TYPE typeModifier returnType)
			(identfier=Identifier|identfier=Destruct)
			formalParameters
			block
		)
		-> method(
			modifier={$methodModifier.st},
			identifier={$identfier},
			params={$formalParameters.st},
			body={$block.instructions}
		)
	;

methodModifier
	:	(	list+=staticToken list+=finalToken list+=accessModifier
		|	list+=staticToken list+=accessModifier list+=finalToken
		|	list+=staticToken list+=accessModifier
		
		|	list+=finalToken list+=staticToken list+=accessModifier
		|	list+=finalToken list+=accessModifier list+=staticToken 
		|	list+=finalToken list+=accessModifier
		
		
		|	list+=accessModifier list+=finalToken list+=staticToken
		|	list+=accessModifier list+=staticToken list+=finalToken
		|	list+=accessModifier list+=staticToken
		|	list+=accessModifier list+=finalToken
		|	list+=accessModifier
		)
		-> modifier(modifiers={$list})
	;
	
finalToken
	:	Final -> {%{$Final.text}}
	;
	
returnType
	:	allTypes
	|	Void 
	;
	
formalParameters
	:	^(PARAMETER_LIST params+=paramDeclaration+) -> parameterList(declarations={$params})
	|	PARAMETER_LIST -> {null}
	;

paramDeclaration
@init{String defaultValue =null;}
	:	^(PARAMETER_DECLARATION 
			^(TYPE typeModifier 
				(	scalarAndResource
				|	typeName=arrayType
				|	TypeObject
				|	typeName=classInterfaceType
				)
			)
			parameterNormalOrOptional
		)
		{
		    String variableId = $parameterNormalOrOptional.variableId;		    
		    defaultValue =  $typeModifier.isNullable && typeName!=null ? "null" : $parameterNormalOrOptional.defaultValue;
		}
		-> parameter(type={$typeName.text}, variableId={variableId}, defaultValue={defaultValue})
	;
arrayType
	:	TypeArray -> {%{$TypeArray.text}}
	;

classInterfaceType
	:	TYPE_NAME -> {%{$TYPE_NAME.text}}	
	;

scalarAndResource
	:	scalarTypes -> {$scalarTypes.st}
	|	TypeResource -> {%{$TypeResource.text}}
	;

parameterNormalOrOptional returns[String variableId,String defaultValue]
	:	^(VariableId v=Int) {$variableId=$VariableId.text; $defaultValue=$v.text;} 
	|	VariableId {$variableId=$VariableId.text;}
	;

block returns[List<Object> instructions]
	:	^(BLOCK instr+=instruction*) {$instructions=$instr;}
	|	BLOCK 
	;

instruction
	:	VariableId
	;
	
interfaceDeclaration
	:	^('interface' 
			^(CLASS_MODIFIER Abstract)
			Identifier 
			extendsDeclaration
			interfaceBody
		)
		-> interface(
			identifier={$Identifier}, 
			ext={$extendsDeclaration.st},
			body={$interfaceBody.st}
		)
	;
	
interfaceBody
	:	^(INTERFACE_BODY def+=interfaceBodyDefinition*) -> body(statements={$def})
	|	INTERFACE_BODY -> body(statements={null})
	;

interfaceBodyDefinition
	:	constDeclarationList -> {$constDeclarationList.st}
	//|	interfaceMethodDeclaration
	//|	interfaceConstruct
	;
	
functionDeclaration
	:	^('function' 
			FUNCTION_MODIFIER
			^(TYPE typeModifier returnType)
			Identifier
			formalParameters
			block
		)	
		-> method(
			modifier={null},
			identifier={$Identifier},
			params={$formalParameters.st},
			body={$block.instructions}
		)
	;