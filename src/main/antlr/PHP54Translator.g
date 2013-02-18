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
tree grammar PHP54Translator;

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
	:	useDeclarationList
	;
	
useDeclarationList
	:	^('use' useDeclaration+) 
		-> useDeclarationList(useDeclarations={$useDeclaration.st})
	;

useDeclaration
	:	^(USE_DECLARATION TYPE_NAME Identifier) 
		-> useDeclaration(type={$TYPE_NAME}, alias={$Identifier})
	;
	
