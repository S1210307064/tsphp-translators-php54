tree grammar PHP54TranslatorWalker;

options {
	tokenVocab = TSPHP;
	ASTLabelType = ITSPHPAst;
	output = template;
}

@header{
package ch.tutteli.tsphp.translators.php54.antlr;

import ch.tutteli.tsphp.common.ITSPHPAst;
import ch.tutteli.tsphp.translators.php54.IPrecedenceHelper;
import ch.tutteli.tsphp.translators.php54.ITempVariableHelper;

}

@members{
private IPrecedenceHelper precedenceHelper;
private ITempVariableHelper tempVariableHelper;

public PHP54TranslatorWalker(TreeNodeStream input, IPrecedenceHelper thePrecedenceHelper, ITempVariableHelper theTempVariableHelper) {
    this(input);
    precedenceHelper = thePrecedenceHelper;
    tempVariableHelper = theTempVariableHelper;
}

private String getMethodName(String name) {
   return name.substring(0, name.length() - 2);
}

}

compilationUnit	
	:	(n+=namespace+) -> file(namespaces={$n})
	;
	
namespace
@init{String namespaceName = null;}
	:	^('namespace' (name=TYPE_NAME|DEFAULT_NAMESPACE) namespaceBody)
		{
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
	|	instruction -> {$instruction.st}
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
	:	classDeclaration		-> {$classDeclaration.st}
	|	interfaceDeclaration	-> {$interfaceDeclaration.st}
	|	functionDeclaration		-> {$functionDeclaration.st}
	|	constDeclarationList	-> {$constDeclarationList.st}
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
	:	constDeclarationList 		-> {$constDeclarationList.st}
	|	classMemberDeclaration		-> {$classMemberDeclaration.st}
	|	abstractConstructDeclaration 	-> {$abstractConstructDeclaration.st}
	|	constructDeclaration 		-> {$constructDeclaration.st}
	|	abstractMethodDeclaration 	-> {$abstractMethodDeclaration.st}
	|	methodDeclaration 		-> {$methodDeclaration.st}
	;
	
constDeclarationList
	:	^(CONSTANT_DECLARATION_LIST 
			^(TYPE ^(TYPE_MODIFIER Public Static Final) scalarTypes)
			identifiers+=constDeclaration+
		) 
		-> const(identifiers={$identifiers})
	;
	
constDeclaration
	:	^(Identifier unaryPrimitiveAtom)
		 -> assign(id={$Identifier.text.substring(0,$Identifier.text.length()-1)}, value={$unaryPrimitiveAtom.st})
	;
	
unaryPrimitiveAtom
	:	primitiveAtomWithConstant -> {$primitiveAtomWithConstant.st}
	|	^(	(	unary=UNARY_MINUS
			|	unary=UNARY_PLUS
			) primitiveAtomWithConstant
		) 
		-> unaryPostOperator(operator = {$unary.text}, expression = {$primitiveAtomWithConstant.st})
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
	
localVariableDeclarationList
	:	^(VARIABLE_DECLARATION_LIST 
			^(TYPE typeModifier allTypes) 
			variables+=localVariableDeclaration[$typeModifier.st]+
		)
		-> localVariableDeclarationList(variables={$variables})
	;
	
typeModifier returns[boolean isCast, boolean isNullable]
	:	^(TYPE_MODIFIER cast='cast'? nullable='?'? variableModifier?) {$isCast=cast!=null; $isNullable=nullable!=null;} -> {$variableModifier.st}
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
	:	^(VariableId expression) -> assign(id={$VariableId},value={$expression.st})
	|	VariableId -> {%{$VariableId.text}}
	;
	
localVariableDeclaration[StringTemplate modifier]
	:	^(VariableId v=expression) -> localVariableDeclaration(modifier={modifier}, variableId={$VariableId.text}, initValue={v})
	|	VariableId -> localVariableDeclaration(modifier={modifier}, variableId={$VariableId.text}, initValue={null})
	;

allTypes
	:	primitiveTypes
	|	TYPE_NAME
	;
	
primitiveTypes
	:	scalarTypes 
	|	TypeArray 
	|	TypeResource 
	|	TypeObject 
	;
	
primitiveTypesWithoutArray
	:	scalarTypes -> {$scalarTypes.st}
	|	TypeResource -> {%{$TypeResource.text}}
	|	TypeObject -> {%{$TypeObject.text}}
	;
	
scalarTypes
	:	TypeBool -> {%{$TypeBool.text}}
	|	TypeInt -> {%{$TypeInt.text}}
	|	TypeFloat -> {%{$TypeFloat.text}}
	|	TypeString -> {%{$TypeString.text}}
	;
	
abstractConstructDeclaration
	:	^(identifier='__construct' 
			^(METHOD_MODIFIER abstractMethodModifier)
			^(TYPE typeModifier returnTypes)
			formalParameters
			BLOCK
		)	
		-> abstractMethod(
			modifier={$abstractMethodModifier.st},
			identifier={getMethodName($identifier.text)},
			params={$formalParameters.st}
		)
	;
	
constructDeclaration
	:	^(identifier='__construct' 
			^(METHOD_MODIFIER methodModifier)
			^(TYPE typeModifier returnTypes)
			formalParameters
			block
		)	
		-> method(
			modifier={$methodModifier.st},
			identifier={getMethodName($identifier.text)},
			params={$formalParameters.st},
			body={$block.instructions}
		)
	;

abstractMethodDeclaration
	:	^(METHOD_DECLARATION
			^(METHOD_MODIFIER abstractMethodModifier)
			^(TYPE typeModifier returnTypes)
			(identfier=Identifier|identfier=Destruct)
			formalParameters
			BLOCK
		)
		-> abstractMethod(
			modifier={$abstractMethodModifier.st},
			identifier={getMethodName($identfier.text)},
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
			^(TYPE typeModifier returnTypes)
			(identifier=Identifier|identifier=Destruct)
			formalParameters
			block
		)
		-> method(
			modifier={$methodModifier.st},
			identifier={getMethodName($identifier.text)},
			params={$formalParameters.st},
			body={$block.instructions}
		)
	;

methodModifier
	:	(	list+=staticToken list+=finalToken 	list+=accessModifier
		|	list+=staticToken list+=accessModifier 	list+=finalToken
		|	list+=staticToken list+=accessModifier
		
		|	list+=finalToken list+=staticToken 	list+=accessModifier
		|	list+=finalToken list+=accessModifier 	list+=staticToken 
		|	list+=finalToken list+=accessModifier
		
		
		|	list+=accessModifier list+=finalToken 	list+=staticToken
		|	list+=accessModifier list+=staticToken 	list+=finalToken
		|	list+=accessModifier list+=staticToken
		|	list+=accessModifier list+=finalToken
		|	list+=accessModifier
		)
		-> modifier(modifiers={$list})
	;
	
finalToken
	:	Final -> {%{$Final.text}}
	;
	
returnTypes
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
		    defaultValue =  $typeModifier.isNullable && typeName!=null ? "null" : $parameterNormalOrOptional.defaultValue;
		}
		-> parameter(type={$typeName.text}, variableId={$parameterNormalOrOptional.variableId}, defaultValue={defaultValue})
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
	:	VariableId {$variableId=$VariableId.text;}
	|	^(VariableId v=unaryPrimitiveAtom) {$variableId=$VariableId.text; $defaultValue=$v.text;} 
	;

block returns[List<Object> instructions]
	:	^(BLOCK instr+=instruction*) {$instructions=$instr;}
	|	BLOCK 
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
	|	interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}
	|	interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st}
	;

interfaceConstructDeclaration
	:	^(identifier='__construct' 
			^(METHOD_MODIFIER abstractMethodModifier)
			^(TYPE typeModifier returnTypes)
			formalParameters
			block
		)	
		-> abstractMethod(
			modifier={"public"},
			identifier={getMethodName($identifier.text)},
			params={$formalParameters.st}
		)
	;
	
interfaceMethodDeclaration
	:	^(METHOD_DECLARATION
			^(METHOD_MODIFIER abstractMethodModifier)
			^(TYPE typeModifier returnTypes)
			Identifier
			formalParameters
			BLOCK
		)
		-> abstractMethod(
			modifier={"public"},
			identifier={getMethodName($Identifier.text)},
			params={$formalParameters.st}
		)
	;
	
functionDeclaration
	:	^('function' 
			FUNCTION_MODIFIER
			^(TYPE typeModifier returnTypes)
			Identifier
			formalParameters
			block
		)	
		-> method(
			modifier={null},
			identifier={getMethodName($Identifier.text)},
			params={$formalParameters.st},
			body={$block.instructions}
		)
	;

instruction
	:	localVariableDeclarationList 	-> {$localVariableDeclarationList.st}
	|	ifCondition 			-> {$ifCondition.st}
	|	switchCondition 		-> {$switchCondition.st}
	|	forLoop 			-> {$forLoop.st}
	|	foreachLoop 			-> {$foreachLoop.st}
	|	whileLoop 			-> {$whileLoop.st}
	|	doWhileLoop 			-> {$doWhileLoop.st}
	|	tryCatch 			-> {$tryCatch.st}
	|	^(EXPRESSION expression?)	-> expression(expression={$expression.st})
	|	^('return' expression?) 	-> return(expression = {$expression.st})
	|	^('throw' expression)		-> throw(expression = {$expression.st})
	|	^('echo' exprs+=expression+)	-> echo(expressions = {$exprs})
	|	^('break' index=Int)		-> break(index={$index.text})
	|	'break'				-> break(index={null})
	|	^('continue' index=Int)		-> continue(index={$index.text})
	|	'continue'			-> continue(index={null})
	;

ifCondition
	:	^('if' 
			expression 
			ifBlock=blockConditional
			elseBlock=blockConditional?
		)
		-> if(condition={$expression.st}, ifBlock={$ifBlock.instructions}, elseBlock={$elseBlock.instructions})
	;

blockConditional returns[List<Object> instructions]
	:	^(BLOCK_CONDITIONAL instr+=instruction*) {$instructions=$instr;}
	;

switchCondition
	:	^('switch' expression content+=switchContent*) -> switch(condition={$expression.st}, content={$content})
	;

switchContent
	:	^(SWITCH_CASES labels+=caseLabel+) blockConditional
		-> switchContent(labels={$labels}, block={$blockConditional.instructions})
	;
	
caseLabel
	:	expression 	-> caseLabel(label={$expression.st})
	|	Default		-> {%{$Default.text+":"}}
	;
	
forLoop
	:	^('for' 
			(init=variableDeclarationList|init=expressionList[true])
			condition=expressionList[true]
			update=expressionList[false]
			blockConditional
		)
		-> for(init={$init.st}, condition={$condition.st}, update={$update.st}, block={$blockConditional.instructions})
	;

expressionList[boolean semicolonAtTheEnd]
	:	^(EXPRESSION_LIST expr+=expression*) -> expressionList(expressions={$expr}, semicolonAtTheEnd={semicolonAtTheEnd})
	|	EXPRESSION_LIST -> expressionList(expressions={null}, semicolonAtTheEnd={semicolonAtTheEnd})
	;

foreachLoop
	:	^('foreach' 
			expression
			
			//key 
			(	^(VARIABLE_DECLARATION_LIST
					^(TYPE TYPE_MODIFIER scalarTypes) 
					keyVariableId=VariableId
				)
			)?
				
			^(VARIABLE_DECLARATION_LIST ^(TYPE TYPE_MODIFIER allTypes) valueVariableId=VariableId) 
			blockConditional
		)
		-> foreach(array={$expression.st}, keyVariableId={$keyVariableId.text}, valueVariableId={$valueVariableId.text}, block={$blockConditional.instructions})
	;

whileLoop
	:	^('while' expression blockConditional) -> while(condition={$expression.st}, block={$blockConditional.instructions})
	;

doWhileLoop
	:	^('do' block expression) -> doWhile(block={$block.instructions}, condition={$expression.st})
	;

tryCatch
	:	^('try' blockConditional catchBlocks+=catchBlock+) 
		-> tryCatch(tryBlock={$blockConditional.instructions}, catchBlocks={$catchBlocks})
	;
	
catchBlock
	:	^('catch'
			^(VARIABLE_DECLARATION_LIST
				^(TYPE TYPE_MODIFIER TYPE_NAME)
				VariableId
			)
			blockConditional
		)
		-> catchBlock(type={$TYPE_NAME.text}, variableId={$VariableId.text}, block={$blockConditional.instructions})
	;

expression
	:   	atom 			-> {$atom.st}
	|	operator		-> {$operator.st}
    	|	functionCall 		-> {$functionCall.st}
	|	methodCall 		-> {$methodCall.st}
	|	methodCallSelfOrParent 	-> {$methodCallSelfOrParent.st}
	|	methodCallStatic 	-> {$methodCallStatic.st}
	|	classStaticAccess	-> {$classStaticAccess.st}
	|	postFixExpression	-> {$postFixExpression.st}
	|	exit			-> {$exit.st}
    	;
  
atom
	:	primitiveAtomWithConstant 			-> {$primitiveAtomWithConstant.st}
	|	VariableId 					-> {%{$VariableId.text}}
	|	This						-> {%{$This.text}}
	;
    	
primitiveAtomWithConstant
	:	Bool 						-> {%{$Bool.text}}
	|	Int						-> {%{$Int.text}}
	|	Float						-> {%{$Float.text}}
	|	String						-> {%{$String.text}}
	|	Null						-> {%{$Null.text}}
	|	^(TypeArray keyValuePairs+=arrayKeyValue*)	-> array(content ={$keyValuePairs})
	|	CONSTANT					-> {%{$CONSTANT.text.substring(0,$CONSTANT.text.length()-1)}}
	|	^(CLASS_STATIC_ACCESS staticAccess CONSTANT)    -> classMemberAccessStatic(accessor={$staticAccess.st}, identifier={$CONSTANT.text.substring(0,$CONSTANT.text.length()-1)})
	;

arrayKeyValue
	:	^('=>' key=expression value=expression) -> keyValue(key={$key.st}, value={$value.st})
	|	expression -> {$expression.st}
	;
	
staticAccess
 	:	TYPE_NAME -> {%{$TYPE_NAME.text}}
 	|	Self -> {%{$Self.text}}
 	|	Parent -> {%{$Parent.text}}
 	;
 
operator
 	:	^(unaryPreOperator expr=expression) 					-> unaryPreOperator(operator ={$unaryPreOperator.st}, expression = {$expr.st})
	|	^(unaryPostOperator expr=expression)					-> unaryPostOperator(operator = {$unaryPostOperator.st}, expression = {$expr.st})
	|	^(binaryOperator left=expression right=expression) 			-> binaryOperator(operator={$binaryOperator.st}, left={$left.st}, right={$right.st}, needParentheses={$binaryOperator.needParentheses})
	|	^(QuestionMark cond=expression ifCase=expression elseCase=expression) 	-> ternaryOperator(cond={$cond.st}, ifCase={$ifCase.st}, elseCase={$elseCase.st}, needParentheses={precedenceHelper.needParentheses($QuestionMark)})
	|	castingOperator 							-> {$castingOperator.st}
	|	^(Instanceof expr=expression (type=TYPE_NAME|type=VariableId))  	-> instanceof(expression={$expr.st}, type={$type.text}, needParentheses={precedenceHelper.needParentheses($Instanceof)})
	|	newOperator								-> {$newOperator.st}
	|	^('clone' expr=expression)						-> clone(expression={$expr.st})	
	; 	

unaryPreOperator 
	:	PRE_INCREMENT	-> {%{"++"}}
    	|	PRE_DECREMENT 	-> {%{"--"}}
    	|	'@' 		-> {%{"@"}}
    	|	'~' 		-> {%{"~"}}
    	|	'!' 		-> {%{"!"}}
    	|	UNARY_MINUS	-> {%{"-"}}
    	|	UNARY_PLUS	-> {%{"+"}}
   	;
   	
unaryPostOperator  
	:	POST_INCREMENT -> {%{"++"}}
    	|	POST_DECREMENT -> {%{"--"}}
    	;

binaryOperator returns[boolean needParentheses]
@after {
    $st = %operator(o={$start.getText()});
    $needParentheses = precedenceHelper.needParentheses($start);
}
	:	'or' 
	|	'xor' 
	|	'and' 
	
	|	'=' 
	|	'+='
	|	'-='
	|	'*='
	|	'/='
	|	'&='
	|	'|='
	|	'^='
	|	'%='
	|	'.='
	|	'<<=' 
	|	'>>=' 
	
	|	'||' 
	|	'&&' 
	|	'|' 
	|	'^' 
	|	'&' 
	
	|	'==' 			
	|	'!=' 
	|	'<>' 
	|	'==='
	|	'!=='
	
	|	'<' 
	|	'<=' 
	|	'>' 
	|	'>=' 
	
	|	'<<' 
	|	'>>' 
	
	|	'+' 
	|	'-' 
	|	'.' 
	
	|	'*' 
	|	'/' 
	|	'%' 
	;

castingOperator
@init{boolean isNullable = false;}
	:	^(CASTING
			^(TYPE 
				(	^(TYPE_MODIFIER Cast? ('?'{isNullable=true;})?)
				|	TYPE_MODIFIER
				)
				(type=scalarTypes|type=arrayType{isNullable=true;})
			)
			expression
		)
		-> primitiveCast(isNullable = {isNullable}, type={$type.st}, expression={$expression.st})
		
	|	^(CASTING
			^(TYPE 
				(	^(TYPE_MODIFIER Cast? '?'?)
				|	TYPE_MODIFIER
				)
				TYPE_NAME
			)
			expr=expression
		)
		{
		    ITSPHPAst ast = $expr.start;
		    if(ast!=null){
		        String exprSt = ast.getText();
		        String tempVariableName=null;
   		        if(!exprSt.substring(0,1).equals("$")){
		            tempVariableName = tempVariableHelper.getTempVariableNameForCast(ast);
		            $st = %castWithTempVariable(type={$TYPE_NAME.text}, expression={$expr.st}, tempVariableName={tempVariableName});
		        }else{
		            $st = %cast(type={$TYPE_NAME.text}, variableId={$expr.st});
		        }
		    }
		}
	;
	
newOperator
	:	^('new' 
			type=TYPE_NAME 
			actualParameters
		)	
		-> new(type={$type.text}, parameters={$actualParameters.parameters})
	;

actualParameters returns[List<Object> parameters]
	:	^(ACTUAL_PARAMETERS params+=expression+) {$parameters=$params;}
	|	ACTUAL_PARAMETERS
	;

functionCall
	:	^(FUNCTION_CALL	identifier=TYPE_NAME actualParameters)
		-> functionCall(identifier={getMethodName($identifier.text)}, parameters={$actualParameters.parameters})
	;
	
methodCall
	:	^(METHOD_CALL (callee=This|callee=VariableId) identifier=Identifier actualParameters)
		-> methodCall(callee={$callee.text}, identifier={getMethodName($identifier.text)}, parameters={$actualParameters.parameters})
	;

methodCallSelfOrParent
	:	^(METHOD_CALL (callee=Self|callee=Parent) identifier=Identifier actualParameters)
		-> methodCallStatic(callee={$callee.text}, identifier={getMethodName($identifier.text)}, parameters={$actualParameters.parameters})
	;

methodCallStatic
	:	^(METHOD_CALL_STATIC TYPE_NAME identifier=Identifier actualParameters)	
		-> methodCallStatic(callee={$TYPE_NAME.text}, identifier={getMethodName($identifier.text)}, parameters={$actualParameters.parameters})
	;

classStaticAccess
	:	^(CLASS_STATIC_ACCESS staticAccess identifier=CLASS_STATIC_ACCESS_VARIABLE_ID)
		-> classMemberAccessStatic(accessor={$staticAccess.st}, identifier={$identifier.text})
	;	

postFixExpression
	:	^(CLASS_MEMBER_ACCESS expression Identifier) 			-> classMemberAccess(expression={$expression.st}, identifier={$Identifier.text})
	|	^(ARRAY_ACCESS expr=expression index=expression)		-> arrayAccess(expression={$expr.st}, index={$index.st})
	|	^(METHOD_CALL_POSTFIX expression Identifier actualParameters)	-> postFixCall(expression={$expression.st}, identifier={getMethodName($Identifier.text)}, parameters={$actualParameters.parameters})
	;

exit
	:	^('exit' expression?)	-> exit(expression={$expression.st})
	|	'exit'			-> exit(expression={null})
	;
	