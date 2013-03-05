// $ANTLR 3.x D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g 2013-03-05 22:40:29

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



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class PHP54TranslatorWalker extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTUAL_PARAMETERS", "ARRAY_ACCESS", "Abstract", "Arrow", "As", "Assign", "At", "BINARY", "BLOCK", "BLOCK_CONDITIONAL", "Backslash", "BitwiseAnd", "BitwiseAndAssign", "BitwiseNot", "BitwiseOr", "BitwiseOrAssign", "BitwiseXor", "BitwiseXorAssign", "Bool", "Break", "CASTING", "CASTING_ASSIGN", "CLASS_BODY", "CLASS_MEMBER", "CLASS_MEMBER_ACCESS", "CLASS_MEMBER_MODIFIER", "CLASS_MODIFIER", "CLASS_STATIC_ACCESS", "CLASS_STATIC_ACCESS_VARIABLE_ID", "CONSTANT", "CONSTANT_DECLARATION", "CONSTANT_DECLARATION_LIST", "Case", "Cast", "Catch", "Class", "Clone", "Colon", "Comma", "Comment", "Const", "Construct", "Continue", "DECIMAL", "DEFAULT_NAMESPACE", "Default", "Destruct", "Divide", "DivideAssign", "Do", "Dolar", "Dot", "DotAssign", "DoubleColon", "EXPONENT", "EXPRESSION", "EXPRESSION_LIST", "Echo", "Else", "Equal", "Exit", "Extends", "FUNCTION_CALL", "FUNCTION_MODIFIER", "Final", "Float", "For", "Foreach", "Function", "GreaterEqualThan", "GreaterThan", "HEXADECIMAL", "INTERFACE_BODY", "Identical", "Identifier", "If", "Implements", "Instanceof", "Int", "Interface", "LeftCurlyBrace", "LeftParanthesis", "LeftSquareBrace", "LessEqualThan", "LessThan", "LogicAnd", "LogicAndWeak", "LogicNot", "LogicOr", "LogicOrWeak", "LogicXorWeak", "METHOD_CALL", "METHOD_CALL_POSTFIX", "METHOD_CALL_STATIC", "METHOD_DECLARATION", "METHOD_MODIFIER", "Minus", "MinusAssign", "MinusMinus", "Modulo", "ModuloAssign", "Multiply", "MultiplyAssign", "NAMESPACE_BODY", "Namespace", "New", "NotEqual", "NotEqualAlternative", "NotIdentical", "Null", "OCTAL", "ObjectOperator", "PARAMETER_DECLARATION", "PARAMETER_LIST", "PARAMETER_TYPE", "POST_DECREMENT", "POST_INCREMENT", "PRE_DECREMENT", "PRE_INCREMENT", "Parent", "ParentColonColon", "Plus", "PlusAssign", "PlusPlus", "Private", "ProtectThis", "Protected", "Public", "QuestionMark", "Return", "RightCurlyBrace", "RightParanthesis", "RightSquareBrace", "STRING_DOUBLE_QUOTED", "STRING_SINGLE_QUOTED", "SWITCH_CASES", "Self", "SelfColonColon", "Semicolon", "ShiftLeft", "ShiftLeftAssign", "ShiftRight", "ShiftRightAssign", "Static", "String", "Switch", "TYPE", "TYPE_MODIFIER", "TYPE_NAME", "This", "Throw", "Try", "TypeAliasBool", "TypeAliasFloat", "TypeAliasInt", "TypeArray", "TypeBool", "TypeFloat", "TypeInt", "TypeObject", "TypeResource", "TypeString", "UNARY_MINUS", "USE_DECLARATION", "Use", "VARIABLE_DECLARATION", "VARIABLE_DECLARATION_LIST", "VariableId", "Void", "While", "Whitespace"
	};

	public static final int EOF=-1;
	public static final int ACTUAL_PARAMETERS=4;
	public static final int ARRAY_ACCESS=5;
	public static final int Abstract=6;
	public static final int Arrow=7;
	public static final int As=8;
	public static final int Assign=9;
	public static final int At=10;
	public static final int BINARY=11;
	public static final int BLOCK=12;
	public static final int BLOCK_CONDITIONAL=13;
	public static final int Backslash=14;
	public static final int BitwiseAnd=15;
	public static final int BitwiseAndAssign=16;
	public static final int BitwiseNot=17;
	public static final int BitwiseOr=18;
	public static final int BitwiseOrAssign=19;
	public static final int BitwiseXor=20;
	public static final int BitwiseXorAssign=21;
	public static final int Bool=22;
	public static final int Break=23;
	public static final int CASTING=24;
	public static final int CASTING_ASSIGN=25;
	public static final int CLASS_BODY=26;
	public static final int CLASS_MEMBER=27;
	public static final int CLASS_MEMBER_ACCESS=28;
	public static final int CLASS_MEMBER_MODIFIER=29;
	public static final int CLASS_MODIFIER=30;
	public static final int CLASS_STATIC_ACCESS=31;
	public static final int CLASS_STATIC_ACCESS_VARIABLE_ID=32;
	public static final int CONSTANT=33;
	public static final int CONSTANT_DECLARATION=34;
	public static final int CONSTANT_DECLARATION_LIST=35;
	public static final int Case=36;
	public static final int Cast=37;
	public static final int Catch=38;
	public static final int Class=39;
	public static final int Clone=40;
	public static final int Colon=41;
	public static final int Comma=42;
	public static final int Comment=43;
	public static final int Const=44;
	public static final int Construct=45;
	public static final int Continue=46;
	public static final int DECIMAL=47;
	public static final int DEFAULT_NAMESPACE=48;
	public static final int Default=49;
	public static final int Destruct=50;
	public static final int Divide=51;
	public static final int DivideAssign=52;
	public static final int Do=53;
	public static final int Dolar=54;
	public static final int Dot=55;
	public static final int DotAssign=56;
	public static final int DoubleColon=57;
	public static final int EXPONENT=58;
	public static final int EXPRESSION=59;
	public static final int EXPRESSION_LIST=60;
	public static final int Echo=61;
	public static final int Else=62;
	public static final int Equal=63;
	public static final int Exit=64;
	public static final int Extends=65;
	public static final int FUNCTION_CALL=66;
	public static final int FUNCTION_MODIFIER=67;
	public static final int Final=68;
	public static final int Float=69;
	public static final int For=70;
	public static final int Foreach=71;
	public static final int Function=72;
	public static final int GreaterEqualThan=73;
	public static final int GreaterThan=74;
	public static final int HEXADECIMAL=75;
	public static final int INTERFACE_BODY=76;
	public static final int Identical=77;
	public static final int Identifier=78;
	public static final int If=79;
	public static final int Implements=80;
	public static final int Instanceof=81;
	public static final int Int=82;
	public static final int Interface=83;
	public static final int LeftCurlyBrace=84;
	public static final int LeftParanthesis=85;
	public static final int LeftSquareBrace=86;
	public static final int LessEqualThan=87;
	public static final int LessThan=88;
	public static final int LogicAnd=89;
	public static final int LogicAndWeak=90;
	public static final int LogicNot=91;
	public static final int LogicOr=92;
	public static final int LogicOrWeak=93;
	public static final int LogicXorWeak=94;
	public static final int METHOD_CALL=95;
	public static final int METHOD_CALL_POSTFIX=96;
	public static final int METHOD_CALL_STATIC=97;
	public static final int METHOD_DECLARATION=98;
	public static final int METHOD_MODIFIER=99;
	public static final int Minus=100;
	public static final int MinusAssign=101;
	public static final int MinusMinus=102;
	public static final int Modulo=103;
	public static final int ModuloAssign=104;
	public static final int Multiply=105;
	public static final int MultiplyAssign=106;
	public static final int NAMESPACE_BODY=107;
	public static final int Namespace=108;
	public static final int New=109;
	public static final int NotEqual=110;
	public static final int NotEqualAlternative=111;
	public static final int NotIdentical=112;
	public static final int Null=113;
	public static final int OCTAL=114;
	public static final int ObjectOperator=115;
	public static final int PARAMETER_DECLARATION=116;
	public static final int PARAMETER_LIST=117;
	public static final int PARAMETER_TYPE=118;
	public static final int POST_DECREMENT=119;
	public static final int POST_INCREMENT=120;
	public static final int PRE_DECREMENT=121;
	public static final int PRE_INCREMENT=122;
	public static final int Parent=123;
	public static final int ParentColonColon=124;
	public static final int Plus=125;
	public static final int PlusAssign=126;
	public static final int PlusPlus=127;
	public static final int Private=128;
	public static final int ProtectThis=129;
	public static final int Protected=130;
	public static final int Public=131;
	public static final int QuestionMark=132;
	public static final int Return=133;
	public static final int RightCurlyBrace=134;
	public static final int RightParanthesis=135;
	public static final int RightSquareBrace=136;
	public static final int STRING_DOUBLE_QUOTED=137;
	public static final int STRING_SINGLE_QUOTED=138;
	public static final int SWITCH_CASES=139;
	public static final int Self=140;
	public static final int SelfColonColon=141;
	public static final int Semicolon=142;
	public static final int ShiftLeft=143;
	public static final int ShiftLeftAssign=144;
	public static final int ShiftRight=145;
	public static final int ShiftRightAssign=146;
	public static final int Static=147;
	public static final int String=148;
	public static final int Switch=149;
	public static final int TYPE=150;
	public static final int TYPE_MODIFIER=151;
	public static final int TYPE_NAME=152;
	public static final int This=153;
	public static final int Throw=154;
	public static final int Try=155;
	public static final int TypeAliasBool=156;
	public static final int TypeAliasFloat=157;
	public static final int TypeAliasInt=158;
	public static final int TypeArray=159;
	public static final int TypeBool=160;
	public static final int TypeFloat=161;
	public static final int TypeInt=162;
	public static final int TypeObject=163;
	public static final int TypeResource=164;
	public static final int TypeString=165;
	public static final int UNARY_MINUS=166;
	public static final int USE_DECLARATION=167;
	public static final int Use=168;
	public static final int VARIABLE_DECLARATION=169;
	public static final int VARIABLE_DECLARATION_LIST=170;
	public static final int VariableId=171;
	public static final int Void=172;
	public static final int While=173;
	public static final int Whitespace=174;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public PHP54TranslatorWalker(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public PHP54TranslatorWalker(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("PHP54TranslatorWalkerTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
@SuppressWarnings("serial")
public static class STAttrMap extends HashMap<String, Object> {
	public STAttrMap put(String attrName, Object value) {
		super.put(attrName, value);
		return this;
	}
}
	@Override public String[] getTokenNames() { return PHP54TranslatorWalker.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g"; }


	public static class compilationUnit_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "compilationUnit"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:49:1: compilationUnit : (n+= namespace ) -> file(namespaces=$n);
	public final PHP54TranslatorWalker.compilationUnit_return compilationUnit() throws RecognitionException {
		PHP54TranslatorWalker.compilationUnit_return retval = new PHP54TranslatorWalker.compilationUnit_return();
		retval.start = input.LT(1);

		List<Object> list_n=null;
		RuleReturnScope n = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:50:2: ( (n+= namespace ) -> file(namespaces=$n))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:50:4: (n+= namespace )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:50:4: (n+= namespace )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:50:5: n+= namespace
			{
			pushFollow(FOLLOW_namespace_in_compilationUnit54);
			n=namespace();
			state._fsp--;

			if (list_n==null) list_n=new ArrayList<Object>();
			list_n.add(n.getTemplate());
			}

			// TEMPLATE REWRITE
			// 50:19: -> file(namespaces=$n)
			{
				retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("namespaces", list_n));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compilationUnit"


	public static class namespace_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namespace"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:53:1: namespace : ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody ) -> namespace(name=namespaceNamebody=$namespaceBody.st);
	public final PHP54TranslatorWalker.namespace_return namespace() throws RecognitionException {
		PHP54TranslatorWalker.namespace_return retval = new PHP54TranslatorWalker.namespace_return();
		retval.start = input.LT(1);

		ITSPHPAst name=null;
		TreeRuleReturnScope namespaceBody1 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:54:2: ( ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody ) -> namespace(name=namespaceNamebody=$namespaceBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:54:4: ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody )
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespace77); 
			match(input, Token.DOWN, null); 
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:54:18: (name= TYPE_NAME | DEFAULT_NAMESPACE )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TYPE_NAME) ) {
				alt1=1;
			}
			else if ( (LA1_0==DEFAULT_NAMESPACE) ) {
				alt1=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:54:19: name= TYPE_NAME
					{
					name=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_namespace82); 
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:54:34: DEFAULT_NAMESPACE
					{
					match(input,DEFAULT_NAMESPACE,FOLLOW_DEFAULT_NAMESPACE_in_namespace84); 
					}
					break;

			}

			pushFollow(FOLLOW_namespaceBody_in_namespace87);
			namespaceBody1=namespaceBody();
			state._fsp--;

			match(input, Token.UP, null); 


						String namespaceName = null; 
					 	if(name!=null){
					 		namespaceName=name.getText().substring(1,name.getText().length()-1);
				 		}
				  	
			// TEMPLATE REWRITE
			// 62:4: -> namespace(name=namespaceNamebody=$namespaceBody.st)
			{
				retval.st = templateLib.getInstanceOf("namespace",new STAttrMap().put("name", namespaceName).put("body", (namespaceBody1!=null?((StringTemplate)namespaceBody1.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namespace"


	public static class namespaceBody_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "namespaceBody"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:65:1: namespaceBody : ( ^( NAMESPACE_BODY (statements+= statement )* ) -> body(statements=$statements)| NAMESPACE_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.namespaceBody_return namespaceBody() throws RecognitionException {
		PHP54TranslatorWalker.namespaceBody_return retval = new PHP54TranslatorWalker.namespaceBody_return();
		retval.start = input.LT(1);

		List<Object> list_statements=null;
		RuleReturnScope statements = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:66:2: ( ^( NAMESPACE_BODY (statements+= statement )* ) -> body(statements=$statements)| NAMESPACE_BODY -> body(statements=null))
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==NAMESPACE_BODY) ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1==DOWN) ) {
					alt3=1;
				}
				else if ( (LA3_1==UP) ) {
					alt3=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:66:4: ^( NAMESPACE_BODY (statements+= statement )* )
					{
					match(input,NAMESPACE_BODY,FOLLOW_NAMESPACE_BODY_in_namespaceBody122); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:66:31: (statements+= statement )*
						loop2:
						do {
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==CONSTANT_DECLARATION_LIST||LA2_0==Class||LA2_0==Use) ) {
								alt2=1;
							}

							switch (alt2) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:66:31: statements+= statement
								{
								pushFollow(FOLLOW_statement_in_namespaceBody126);
								statements=statement();
								state._fsp--;

								if (list_statements==null) list_statements=new ArrayList<Object>();
								list_statements.add(statements.getTemplate());
								}
								break;

							default :
								break loop2;
							}
						} while (true);

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 66:45: -> body(statements=$statements)
					{
						retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_statements));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:67:4: NAMESPACE_BODY
					{
					match(input,NAMESPACE_BODY,FOLLOW_NAMESPACE_BODY_in_namespaceBody142); 
					// TEMPLATE REWRITE
					// 67:19: -> body(statements=null)
					{
						retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", null));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namespaceBody"


	public static class statement_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:70:1: statement : ( useDeclarationList -> {$useDeclarationList.st}| definition -> {$definition.st});
	public final PHP54TranslatorWalker.statement_return statement() throws RecognitionException {
		PHP54TranslatorWalker.statement_return retval = new PHP54TranslatorWalker.statement_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope useDeclarationList2 =null;
		TreeRuleReturnScope definition3 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:71:2: ( useDeclarationList -> {$useDeclarationList.st}| definition -> {$definition.st})
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==Use) ) {
				alt4=1;
			}
			else if ( (LA4_0==CONSTANT_DECLARATION_LIST||LA4_0==Class) ) {
				alt4=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:71:4: useDeclarationList
					{
					pushFollow(FOLLOW_useDeclarationList_in_statement162);
					useDeclarationList2=useDeclarationList();
					state._fsp--;

					// TEMPLATE REWRITE
					// 71:23: -> {$useDeclarationList.st}
					{
						retval.st = (useDeclarationList2!=null?((StringTemplate)useDeclarationList2.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:72:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement171);
					definition3=definition();
					state._fsp--;

					// TEMPLATE REWRITE
					// 72:15: -> {$definition.st}
					{
						retval.st = (definition3!=null?((StringTemplate)definition3.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class useDeclarationList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "useDeclarationList"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:75:1: useDeclarationList : ^( 'use' ( useDeclaration )+ ) -> useDeclarationList(useDeclarations=$useDeclaration.st);
	public final PHP54TranslatorWalker.useDeclarationList_return useDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.useDeclarationList_return retval = new PHP54TranslatorWalker.useDeclarationList_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope useDeclaration4 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:2: ( ^( 'use' ( useDeclaration )+ ) -> useDeclarationList(useDeclarations=$useDeclaration.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:4: ^( 'use' ( useDeclaration )+ )
			{
			match(input,Use,FOLLOW_Use_in_useDeclarationList188); 
			match(input, Token.DOWN, null); 
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:12: ( useDeclaration )+
			int cnt5=0;
			loop5:
			do {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==USE_DECLARATION) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:12: useDeclaration
					{
					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList190);
					useDeclaration4=useDeclaration();
					state._fsp--;

					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
						EarlyExitException eee =
							new EarlyExitException(5, input);
						throw eee;
				}
				cnt5++;
			} while (true);

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 77:3: -> useDeclarationList(useDeclarations=$useDeclaration.st)
			{
				retval.st = templateLib.getInstanceOf("useDeclarationList",new STAttrMap().put("useDeclarations", (useDeclaration4!=null?((StringTemplate)useDeclaration4.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "useDeclarationList"


	public static class useDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "useDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:80:1: useDeclaration : ^( USE_DECLARATION TYPE_NAME Identifier ) -> useDeclaration(type=$TYPE_NAMEalias=$Identifier);
	public final PHP54TranslatorWalker.useDeclaration_return useDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.useDeclaration_return retval = new PHP54TranslatorWalker.useDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME5=null;
		ITSPHPAst Identifier6=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:81:2: ( ^( USE_DECLARATION TYPE_NAME Identifier ) -> useDeclaration(type=$TYPE_NAMEalias=$Identifier))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:81:4: ^( USE_DECLARATION TYPE_NAME Identifier )
			{
			match(input,USE_DECLARATION,FOLLOW_USE_DECLARATION_in_useDeclaration216); 
			match(input, Token.DOWN, null); 
			TYPE_NAME5=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_useDeclaration218); 
			Identifier6=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration220); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 82:3: -> useDeclaration(type=$TYPE_NAMEalias=$Identifier)
			{
				retval.st = templateLib.getInstanceOf("useDeclaration",new STAttrMap().put("type", TYPE_NAME5).put("alias", Identifier6));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "useDeclaration"


	public static class definition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "definition"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:85:1: definition : ( classDeclaration -> {$classDeclaration.st}| constDeclarationList -> {$constDeclarationList.st});
	public final PHP54TranslatorWalker.definition_return definition() throws RecognitionException {
		PHP54TranslatorWalker.definition_return retval = new PHP54TranslatorWalker.definition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope classDeclaration7 =null;
		TreeRuleReturnScope constDeclarationList8 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:86:2: ( classDeclaration -> {$classDeclaration.st}| constDeclarationList -> {$constDeclarationList.st})
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==Class) ) {
				alt6=1;
			}
			else if ( (LA6_0==CONSTANT_DECLARATION_LIST) ) {
				alt6=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:86:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition249);
					classDeclaration7=classDeclaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 86:21: -> {$classDeclaration.st}
					{
						retval.st = (classDeclaration7!=null?((StringTemplate)classDeclaration7.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:89:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_definition262);
					constDeclarationList8=constDeclarationList();
					state._fsp--;

					// TEMPLATE REWRITE
					// 89:25: -> {$constDeclarationList.st}
					{
						retval.st = (constDeclarationList8!=null?((StringTemplate)constDeclarationList8.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "definition"


	public static class classDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "classDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:92:1: classDeclaration : ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody ) -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st);
	public final PHP54TranslatorWalker.classDeclaration_return classDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.classDeclaration_return retval = new PHP54TranslatorWalker.classDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier10=null;
		TreeRuleReturnScope classModifier9 =null;
		TreeRuleReturnScope extendsDeclaration11 =null;
		TreeRuleReturnScope implementsDeclaration12 =null;
		TreeRuleReturnScope classBody13 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:93:2: ( ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody ) -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:93:4: ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody )
			{
			match(input,Class,FOLLOW_Class_in_classDeclaration278); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_classModifier_in_classDeclaration280);
			classModifier9=classModifier();
			state._fsp--;

			Identifier10=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration282); 
			pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration284);
			extendsDeclaration11=extendsDeclaration();
			state._fsp--;

			pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration286);
			implementsDeclaration12=implementsDeclaration();
			state._fsp--;

			pushFollow(FOLLOW_classBody_in_classDeclaration288);
			classBody13=classBody();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 94:3: -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st)
			{
				retval.st = templateLib.getInstanceOf("class",new STAttrMap().put("modifier", (classModifier9!=null?((StringTemplate)classModifier9.getTemplate()):null)).put("identifier", Identifier10).put("ext", (extendsDeclaration11!=null?((StringTemplate)extendsDeclaration11.getTemplate()):null)).put("impl", (implementsDeclaration12!=null?((StringTemplate)implementsDeclaration12.getTemplate()):null)).put("body", (classBody13!=null?((StringTemplate)classBody13.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classDeclaration"


	public static class classModifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "classModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:102:1: classModifier : ( ^( CLASS_MODIFIER list+= classModifierNames ) -> modifier(modifiers=$list)| CLASS_MODIFIER -> {null});
	public final PHP54TranslatorWalker.classModifier_return classModifier() throws RecognitionException {
		PHP54TranslatorWalker.classModifier_return retval = new PHP54TranslatorWalker.classModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:103:2: ( ^( CLASS_MODIFIER list+= classModifierNames ) -> modifier(modifiers=$list)| CLASS_MODIFIER -> {null})
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==CLASS_MODIFIER) ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1==DOWN) ) {
					alt7=1;
				}
				else if ( (LA7_1==Identifier) ) {
					alt7=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:103:4: ^( CLASS_MODIFIER list+= classModifierNames )
					{
					match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_classModifier352); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_classModifierNames_in_classModifier356);
					list=classModifierNames();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 103:47: -> modifier(modifiers=$list)
					{
						retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:104:4: CLASS_MODIFIER
					{
					match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_classModifier371); 
					// TEMPLATE REWRITE
					// 104:19: -> {null}
					{
						retval.st = null;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classModifier"


	public static class classModifierNames_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "classModifierNames"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:107:1: classModifierNames : ( Final | Abstract );
	public final PHP54TranslatorWalker.classModifierNames_return classModifierNames() throws RecognitionException {
		PHP54TranslatorWalker.classModifierNames_return retval = new PHP54TranslatorWalker.classModifierNames_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:109:2: ( Final | Abstract )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:
			{
			if ( input.LA(1)==Abstract||input.LA(1)==Final ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.st = new StringTemplate(templateLib,input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classModifierNames"


	public static class extendsDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "extendsDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:113:1: extendsDeclaration : ( ^( 'extends' (identifiers+= TYPE_NAME )+ ) -> extends(identifiers=$identifiers)| 'extends' -> {null});
	public final PHP54TranslatorWalker.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.extendsDeclaration_return retval = new PHP54TranslatorWalker.extendsDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifiers=null;
		List<Object> list_identifiers=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:114:2: ( ^( 'extends' (identifiers+= TYPE_NAME )+ ) -> extends(identifiers=$identifiers)| 'extends' -> {null})
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Extends) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					alt9=1;
				}
				else if ( (LA9_1==Implements) ) {
					alt9=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:114:4: ^( 'extends' (identifiers+= TYPE_NAME )+ )
					{
					match(input,Extends,FOLLOW_Extends_in_extendsDeclaration410); 
					match(input, Token.DOWN, null); 
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:114:27: (identifiers+= TYPE_NAME )+
					int cnt8=0;
					loop8:
					do {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==TYPE_NAME) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:114:27: identifiers+= TYPE_NAME
							{
							identifiers=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_extendsDeclaration414); 
							if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
							list_identifiers.add(identifiers);
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
								EarlyExitException eee =
									new EarlyExitException(8, input);
								throw eee;
						}
						cnt8++;
					} while (true);

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 114:41: -> extends(identifiers=$identifiers)
					{
						retval.st = templateLib.getInstanceOf("extends",new STAttrMap().put("identifiers", list_identifiers));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:115:4: 'extends'
					{
					match(input,Extends,FOLLOW_Extends_in_extendsDeclaration430); 
					// TEMPLATE REWRITE
					// 115:18: -> {null}
					{
						retval.st = null;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "extendsDeclaration"


	public static class implementsDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "implementsDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:119:1: implementsDeclaration : ( ^( 'implements' (identifiers+= TYPE_NAME )+ ) -> impl(identifiers=$identifiers)| 'implements' -> {null});
	public final PHP54TranslatorWalker.implementsDeclaration_return implementsDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.implementsDeclaration_return retval = new PHP54TranslatorWalker.implementsDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifiers=null;
		List<Object> list_identifiers=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:120:2: ( ^( 'implements' (identifiers+= TYPE_NAME )+ ) -> impl(identifiers=$identifiers)| 'implements' -> {null})
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Implements) ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1==DOWN) ) {
					alt11=1;
				}
				else if ( (LA11_1==CLASS_BODY) ) {
					alt11=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:120:4: ^( 'implements' (identifiers+= TYPE_NAME )+ )
					{
					match(input,Implements,FOLLOW_Implements_in_implementsDeclaration451); 
					match(input, Token.DOWN, null); 
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:120:30: (identifiers+= TYPE_NAME )+
					int cnt10=0;
					loop10:
					do {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==TYPE_NAME) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:120:30: identifiers+= TYPE_NAME
							{
							identifiers=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_implementsDeclaration455); 
							if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
							list_identifiers.add(identifiers);
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
								EarlyExitException eee =
									new EarlyExitException(10, input);
								throw eee;
						}
						cnt10++;
					} while (true);

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 120:44: -> impl(identifiers=$identifiers)
					{
						retval.st = templateLib.getInstanceOf("impl",new STAttrMap().put("identifiers", list_identifiers));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:121:4: 'implements'
					{
					match(input,Implements,FOLLOW_Implements_in_implementsDeclaration471); 
					// TEMPLATE REWRITE
					// 121:21: -> {null}
					{
						retval.st = null;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "implementsDeclaration"


	public static class classBody_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "classBody"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:124:1: classBody : ( ^( CLASS_BODY (def+= classBodyDefinition )* ) -> body(statements=$def)| CLASS_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.classBody_return classBody() throws RecognitionException {
		PHP54TranslatorWalker.classBody_return retval = new PHP54TranslatorWalker.classBody_return();
		retval.start = input.LT(1);

		List<Object> list_def=null;
		RuleReturnScope def = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:2: ( ^( CLASS_BODY (def+= classBodyDefinition )* ) -> body(statements=$def)| CLASS_BODY -> body(statements=null))
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==CLASS_BODY) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==DOWN) ) {
					alt13=1;
				}
				else if ( (LA13_1==UP) ) {
					alt13=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:4: ^( CLASS_BODY (def+= classBodyDefinition )* )
					{
					match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_classBody492); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:20: (def+= classBodyDefinition )*
						loop12:
						do {
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==CLASS_MEMBER||LA12_0==CONSTANT_DECLARATION_LIST||LA12_0==Construct||LA12_0==METHOD_DECLARATION) ) {
								alt12=1;
							}

							switch (alt12) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:20: def+= classBodyDefinition
								{
								pushFollow(FOLLOW_classBodyDefinition_in_classBody496);
								def=classBodyDefinition();
								state._fsp--;

								if (list_def==null) list_def=new ArrayList<Object>();
								list_def.add(def.getTemplate());
								}
								break;

							default :
								break loop12;
							}
						} while (true);

						match(input, Token.UP, null); 
					}

					// TEMPLATE REWRITE
					// 125:44: -> body(statements=$def)
					{
						retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_def));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:126:4: CLASS_BODY
					{
					match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_classBody512); 
					// TEMPLATE REWRITE
					// 126:15: -> body(statements=null)
					{
						retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", null));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classBody"


	public static class classBodyDefinition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "classBodyDefinition"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:129:1: classBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| constructDeclaration -> {$constructDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st});
	public final PHP54TranslatorWalker.classBodyDefinition_return classBodyDefinition() throws RecognitionException {
		PHP54TranslatorWalker.classBodyDefinition_return retval = new PHP54TranslatorWalker.classBodyDefinition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope constDeclarationList14 =null;
		TreeRuleReturnScope classMemberDeclaration15 =null;
		TreeRuleReturnScope constructDeclaration16 =null;
		TreeRuleReturnScope abstractMethodDeclaration17 =null;
		TreeRuleReturnScope methodDeclaration18 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:2: ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| constructDeclaration -> {$constructDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st})
			int alt14=5;
			switch ( input.LA(1) ) {
			case CONSTANT_DECLARATION_LIST:
				{
				alt14=1;
				}
				break;
			case CLASS_MEMBER:
				{
				alt14=2;
				}
				break;
			case Construct:
				{
				alt14=3;
				}
				break;
			case METHOD_DECLARATION:
				{
				int LA14_4 = input.LA(2);
				if ( (LA14_4==DOWN) ) {
					int LA14_5 = input.LA(3);
					if ( (LA14_5==METHOD_MODIFIER) ) {
						int LA14_6 = input.LA(4);
						if ( (LA14_6==DOWN) ) {
							switch ( input.LA(5) ) {
							case Abstract:
								{
								alt14=4;
								}
								break;
							case Private:
								{
								int LA14_9 = input.LA(6);
								if ( (LA14_9==Abstract) ) {
									alt14=4;
								}
								else if ( (LA14_9==UP||LA14_9==Final||LA14_9==Static) ) {
									alt14=5;
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 9, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case Protected:
								{
								int LA14_10 = input.LA(6);
								if ( (LA14_10==Abstract) ) {
									alt14=4;
								}
								else if ( (LA14_10==UP||LA14_10==Final||LA14_10==Static) ) {
									alt14=5;
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 10, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case Public:
								{
								int LA14_11 = input.LA(6);
								if ( (LA14_11==Abstract) ) {
									alt14=4;
								}
								else if ( (LA14_11==UP||LA14_11==Final||LA14_11==Static) ) {
									alt14=5;
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 11, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case Final:
							case Static:
								{
								alt14=5;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 14, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 6, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 14, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_classBodyDefinition533);
					constDeclarationList14=constDeclarationList();
					state._fsp--;

					// TEMPLATE REWRITE
					// 130:25: -> {$constDeclarationList.st}
					{
						retval.st = (constDeclarationList14!=null?((StringTemplate)constDeclarationList14.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:131:4: classMemberDeclaration
					{
					pushFollow(FOLLOW_classMemberDeclaration_in_classBodyDefinition542);
					classMemberDeclaration15=classMemberDeclaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 131:27: -> {$classMemberDeclaration.st}
					{
						retval.st = (classMemberDeclaration15!=null?((StringTemplate)classMemberDeclaration15.getTemplate()):null);
					}



					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:133:4: constructDeclaration
					{
					pushFollow(FOLLOW_constructDeclaration_in_classBodyDefinition553);
					constructDeclaration16=constructDeclaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 133:25: -> {$constructDeclaration.st}
					{
						retval.st = (constructDeclaration16!=null?((StringTemplate)constructDeclaration16.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:134:4: abstractMethodDeclaration
					{
					pushFollow(FOLLOW_abstractMethodDeclaration_in_classBodyDefinition562);
					abstractMethodDeclaration17=abstractMethodDeclaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 134:30: -> {$abstractMethodDeclaration.st}
					{
						retval.st = (abstractMethodDeclaration17!=null?((StringTemplate)abstractMethodDeclaration17.getTemplate()):null);
					}



					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:135:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBodyDefinition571);
					methodDeclaration18=methodDeclaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 135:22: -> {$methodDeclaration.st}
					{
						retval.st = (methodDeclaration18!=null?((StringTemplate)methodDeclaration18.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classBodyDefinition"


	public static class constDeclarationList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constDeclarationList"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:138:1: constDeclarationList : ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ ) -> const(identifiers=$identifiers);
	public final PHP54TranslatorWalker.constDeclarationList_return constDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.constDeclarationList_return retval = new PHP54TranslatorWalker.constDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_identifiers=null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:139:2: ( ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ ) -> const(identifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:139:4: ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ )
			{
			match(input,CONSTANT_DECLARATION_LIST,FOLLOW_CONSTANT_DECLARATION_LIST_in_constDeclarationList588); 
			match(input, Token.DOWN, null); 
			match(input,TYPE,FOLLOW_TYPE_in_constDeclarationList595); 
			match(input, Token.DOWN, null); 
			match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_constDeclarationList598); 
			match(input, Token.DOWN, null); 
			match(input,Public,FOLLOW_Public_in_constDeclarationList600); 
			match(input,Static,FOLLOW_Static_in_constDeclarationList602); 
			match(input,Final,FOLLOW_Final_in_constDeclarationList604); 
			match(input, Token.UP, null); 

			pushFollow(FOLLOW_scalarTypes_in_constDeclarationList607);
			scalarTypes();
			state._fsp--;

			match(input, Token.UP, null); 

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:141:15: (identifiers+= constantAssignment )+
			int cnt15=0;
			loop15:
			do {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==Identifier) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:141:15: identifiers+= constantAssignment
					{
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList615);
					identifiers=constantAssignment();
					state._fsp--;

					if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
					list_identifiers.add(identifiers.getTemplate());
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
						EarlyExitException eee =
							new EarlyExitException(15, input);
						throw eee;
				}
				cnt15++;
			} while (true);

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 143:3: -> const(identifiers=$identifiers)
			{
				retval.st = templateLib.getInstanceOf("const",new STAttrMap().put("identifiers", list_identifiers));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constDeclarationList"


	public static class constantAssignment_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constantAssignment"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:146:1: constantAssignment : ^( Identifier v= Int ) -> assign(id=$Identifiervalue=v);
	public final PHP54TranslatorWalker.constantAssignment_return constantAssignment() throws RecognitionException {
		PHP54TranslatorWalker.constantAssignment_return retval = new PHP54TranslatorWalker.constantAssignment_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst Identifier19=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:147:2: ( ^( Identifier v= Int ) -> assign(id=$Identifiervalue=v))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:147:4: ^( Identifier v= Int )
			{
			Identifier19=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment645); 
			match(input, Token.DOWN, null); 
			v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_constantAssignment649); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 148:4: -> assign(id=$Identifiervalue=v)
			{
				retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", Identifier19).put("value", v));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constantAssignment"


	public static class scalarTypes_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "scalarTypes"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:151:1: scalarTypes : ( 'bool' | 'int' | 'float' | 'string' );
	public final PHP54TranslatorWalker.scalarTypes_return scalarTypes() throws RecognitionException {
		PHP54TranslatorWalker.scalarTypes_return retval = new PHP54TranslatorWalker.scalarTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:153:2: ( 'bool' | 'int' | 'float' | 'string' )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:
			{
			if ( (input.LA(1) >= TypeBool && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.st = new StringTemplate(templateLib,input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalarTypes"


	public static class classMemberDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "classMemberDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:159:1: classMemberDeclaration : ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st};
	public final PHP54TranslatorWalker.classMemberDeclaration_return classMemberDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.classMemberDeclaration_return retval = new PHP54TranslatorWalker.classMemberDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope variableDeclarationList20 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:160:2: ( ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:160:4: ^( CLASS_MEMBER variableDeclarationList )
			{
			match(input,CLASS_MEMBER,FOLLOW_CLASS_MEMBER_in_classMemberDeclaration710); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_variableDeclarationList_in_classMemberDeclaration712);
			variableDeclarationList20=variableDeclarationList();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 160:44: -> {$variableDeclarationList.st}
			{
				retval.st = (variableDeclarationList20!=null?((StringTemplate)variableDeclarationList20.getTemplate()):null);
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classMemberDeclaration"


	public static class variableDeclarationList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableDeclarationList"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:163:1: variableDeclarationList : ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers);
	public final PHP54TranslatorWalker.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclarationList_return retval = new PHP54TranslatorWalker.variableDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_identifiers=null;
		TreeRuleReturnScope typeModifier21 =null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:164:2: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:164:4: ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ )
			{
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList729); 
			match(input, Token.DOWN, null); 
			match(input,TYPE,FOLLOW_TYPE_in_variableDeclarationList736); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_variableDeclarationList738);
			typeModifier21=typeModifier();
			state._fsp--;

			pushFollow(FOLLOW_allTypes_in_variableDeclarationList740);
			allTypes();
			state._fsp--;

			match(input, Token.UP, null); 

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:166:15: (identifiers+= variableDeclaration )+
			int cnt16=0;
			loop16:
			do {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==VariableId) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:166:15: identifiers+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList749);
					identifiers=variableDeclaration();
					state._fsp--;

					if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
					list_identifiers.add(identifiers.getTemplate());
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
						EarlyExitException eee =
							new EarlyExitException(16, input);
						throw eee;
				}
				cnt16++;
			} while (true);

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 168:3: -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers)
			{
				retval.st = templateLib.getInstanceOf("variableDeclarationList",new STAttrMap().put("modifier", (typeModifier21!=null?((StringTemplate)typeModifier21.getTemplate()):null)).put("identifiers", list_identifiers));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclarationList"


	public static class typeModifier_return extends TreeRuleReturnScope {
		public boolean isCast;
		public boolean isNullable;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:171:1: typeModifier returns [boolean isCast, boolean isNullable] : ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null});
	public final PHP54TranslatorWalker.typeModifier_return typeModifier() throws RecognitionException {
		PHP54TranslatorWalker.typeModifier_return retval = new PHP54TranslatorWalker.typeModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst cast=null;
		ITSPHPAst nullable=null;
		TreeRuleReturnScope variableModifier22 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:2: ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null})
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==TYPE_MODIFIER) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOWN) ) {
					alt20=1;
				}
				else if ( (LA20_1==TYPE_NAME||(LA20_1 >= TypeArray && LA20_1 <= TypeString)||LA20_1==Void) ) {
					alt20=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:4: ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? )
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier785); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:24: (cast= Cast )?
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==Cast) ) {
							alt17=1;
						}
						switch (alt17) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:24: cast= Cast
								{
								cast=(ITSPHPAst)match(input,Cast,FOLLOW_Cast_in_typeModifier789); 
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:39: (nullable= '?' )?
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==QuestionMark) ) {
							alt18=1;
						}
						switch (alt18) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:39: nullable= '?'
								{
								nullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_typeModifier794); 
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:45: ( variableModifier )?
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==Private||(LA19_0 >= Protected && LA19_0 <= Public)||LA19_0==Static) ) {
							alt19=1;
						}
						switch (alt19) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:45: variableModifier
								{
								pushFollow(FOLLOW_variableModifier_in_typeModifier797);
								variableModifier22=variableModifier();
								state._fsp--;

								}
								break;

						}

						match(input, Token.UP, null); 
					}

					retval.isCast =cast!=null; retval.isNullable =nullable!=null;
					// TEMPLATE REWRITE
					// 172:114: -> {$variableModifier.st}
					{
						retval.st = (variableModifier22!=null?((StringTemplate)variableModifier22.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:4: TYPE_MODIFIER
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier810); 
					// TEMPLATE REWRITE
					// 173:18: -> {null}
					{
						retval.st = null;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "typeModifier"


	public static class variableModifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:176:1: variableModifier : (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st});
	public final PHP54TranslatorWalker.variableModifier_return variableModifier() throws RecognitionException {
		PHP54TranslatorWalker.variableModifier_return retval = new PHP54TranslatorWalker.variableModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		TreeRuleReturnScope accessModifier23 =null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:177:2: (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st})
			int alt21=3;
			switch ( input.LA(1) ) {
			case Static:
				{
				alt21=1;
				}
				break;
			case Private:
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2==Static) ) {
					alt21=2;
				}
				else if ( (LA21_2==UP) ) {
					alt21=3;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Protected:
				{
				int LA21_3 = input.LA(2);
				if ( (LA21_3==Static) ) {
					alt21=2;
				}
				else if ( (LA21_3==UP) ) {
					alt21=3;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Public:
				{
				int LA21_4 = input.LA(2);
				if ( (LA21_4==Static) ) {
					alt21=2;
				}
				else if ( (LA21_4==UP) ) {
					alt21=3;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:177:4: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_variableModifier828);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_variableModifier832);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					// 177:43: -> modifier(modifiers=$list)
					{
						retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:178:4: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier848);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_variableModifier852);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					// 178:43: -> modifier(modifiers=$list)
					{
						retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					}



					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:179:4: accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier866);
					accessModifier23=accessModifier();
					state._fsp--;

					// TEMPLATE REWRITE
					// 179:19: -> {$accessModifier.st}
					{
						retval.st = (accessModifier23!=null?((StringTemplate)accessModifier23.getTemplate()):null);
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableModifier"


	public static class staticToken_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "staticToken"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:1: staticToken : Static -> {%{$Static.text}};
	public final PHP54TranslatorWalker.staticToken_return staticToken() throws RecognitionException {
		PHP54TranslatorWalker.staticToken_return retval = new PHP54TranslatorWalker.staticToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Static24=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:183:2: ( Static -> {%{$Static.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:183:4: Static
			{
			Static24=(ITSPHPAst)match(input,Static,FOLLOW_Static_in_staticToken882); 
			// TEMPLATE REWRITE
			// 183:11: -> {%{$Static.text}}
			{
				retval.st = new StringTemplate(templateLib,(Static24!=null?Static24.getText():null));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "staticToken"


	public static class accessModifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "accessModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:186:1: accessModifier : ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}});
	public final PHP54TranslatorWalker.accessModifier_return accessModifier() throws RecognitionException {
		PHP54TranslatorWalker.accessModifier_return retval = new PHP54TranslatorWalker.accessModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst Private25=null;
		ITSPHPAst Protected26=null;
		ITSPHPAst Public27=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:187:2: ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}})
			int alt22=3;
			switch ( input.LA(1) ) {
			case Private:
				{
				alt22=1;
				}
				break;
			case Protected:
				{
				alt22=2;
				}
				break;
			case Public:
				{
				alt22=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:187:4: Private
					{
					Private25=(ITSPHPAst)match(input,Private,FOLLOW_Private_in_accessModifier898); 
					// TEMPLATE REWRITE
					// 187:12: -> {%{$Private.text}}
					{
						retval.st = new StringTemplate(templateLib,(Private25!=null?Private25.getText():null));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:188:4: Protected
					{
					Protected26=(ITSPHPAst)match(input,Protected,FOLLOW_Protected_in_accessModifier907); 
					// TEMPLATE REWRITE
					// 188:14: -> {%{$Protected.text}}
					{
						retval.st = new StringTemplate(templateLib,(Protected26!=null?Protected26.getText():null));
					}



					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:189:4: Public
					{
					Public27=(ITSPHPAst)match(input,Public,FOLLOW_Public_in_accessModifier916); 
					// TEMPLATE REWRITE
					// 189:11: -> {%{$Public.text}}
					{
						retval.st = new StringTemplate(templateLib,(Public27!=null?Public27.getText():null));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "accessModifier"


	public static class variableDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "variableDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:192:1: variableDeclaration : ( ^( VariableId v= Int ) -> assign(id=$VariableIdvalue=v)| VariableId -> {%{$VariableId.text}});
	public final PHP54TranslatorWalker.variableDeclaration_return variableDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclaration_return retval = new PHP54TranslatorWalker.variableDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst VariableId28=null;
		ITSPHPAst VariableId29=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:193:2: ( ^( VariableId v= Int ) -> assign(id=$VariableIdvalue=v)| VariableId -> {%{$VariableId.text}})
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==VariableId) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==DOWN) ) {
					alt23=1;
				}
				else if ( (LA23_1==UP||LA23_1==VariableId) ) {
					alt23=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:193:4: ^( VariableId v= Int )
					{
					VariableId28=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration933); 
					match(input, Token.DOWN, null); 
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_variableDeclaration937); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 193:24: -> assign(id=$VariableIdvalue=v)
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", VariableId28).put("value", v));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:194:4: VariableId
					{
					VariableId29=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration956); 
					// TEMPLATE REWRITE
					// 194:15: -> {%{$VariableId.text}}
					{
						retval.st = new StringTemplate(templateLib,(VariableId29!=null?VariableId29.getText():null));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class allTypes_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:197:1: allTypes : ( primitiveTypes | TYPE_NAME );
	public final PHP54TranslatorWalker.allTypes_return allTypes() throws RecognitionException {
		PHP54TranslatorWalker.allTypes_return retval = new PHP54TranslatorWalker.allTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:198:2: ( primitiveTypes | TYPE_NAME )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= TypeArray && LA24_0 <= TypeString)) ) {
				alt24=1;
			}
			else if ( (LA24_0==TYPE_NAME) ) {
				alt24=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:198:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_allTypes971);
					primitiveTypes();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:199:4: TYPE_NAME
					{
					match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_allTypes976); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "allTypes"


	public static class primitiveTypes_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "primitiveTypes"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:202:1: primitiveTypes : ( scalarTypes | 'array' | 'resource' | 'object' );
	public final PHP54TranslatorWalker.primitiveTypes_return primitiveTypes() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypes_return retval = new PHP54TranslatorWalker.primitiveTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:203:2: ( scalarTypes | 'array' | 'resource' | 'object' )
			int alt25=4;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeString:
				{
				alt25=1;
				}
				break;
			case TypeArray:
				{
				alt25=2;
				}
				break;
			case TypeResource:
				{
				alt25=3;
				}
				break;
			case TypeObject:
				{
				alt25=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:203:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypes987);
					scalarTypes();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:204:4: 'array'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypes992); 
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:205:4: 'resource'
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypes997); 
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:206:4: 'object'
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypes1002); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primitiveTypes"


	public static class primitiveTypesWithoutArray_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "primitiveTypesWithoutArray"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:209:1: primitiveTypesWithoutArray : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}});
	public final PHP54TranslatorWalker.primitiveTypesWithoutArray_return primitiveTypesWithoutArray() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypesWithoutArray_return retval = new PHP54TranslatorWalker.primitiveTypesWithoutArray_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource31=null;
		ITSPHPAst TypeObject32=null;
		TreeRuleReturnScope scalarTypes30 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:210:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}})
			int alt26=3;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeString:
				{
				alt26=1;
				}
				break;
			case TypeResource:
				{
				alt26=2;
				}
				break;
			case TypeObject:
				{
				alt26=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:210:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1014);
					scalarTypes30=scalarTypes();
					state._fsp--;

					// TEMPLATE REWRITE
					// 210:16: -> {$scalarTypes.st}
					{
						retval.st = (scalarTypes30!=null?((StringTemplate)scalarTypes30.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:211:4: TypeResource
					{
					TypeResource31=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesWithoutArray1023); 
					// TEMPLATE REWRITE
					// 211:17: -> {%{$TypeResource.text}}
					{
						retval.st = new StringTemplate(templateLib,(TypeResource31!=null?TypeResource31.getText():null));
					}



					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:212:4: TypeObject
					{
					TypeObject32=(ITSPHPAst)match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypesWithoutArray1032); 
					// TEMPLATE REWRITE
					// 212:15: -> {%{$TypeObject.text}}
					{
						retval.st = new StringTemplate(templateLib,(TypeObject32!=null?TypeObject32.getText():null));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "primitiveTypesWithoutArray"


	public static class constructDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constructDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:215:1: constructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.constructDeclaration_return constructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.constructDeclaration_return retval = new PHP54TranslatorWalker.constructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope methodModifier33 =null;
		TreeRuleReturnScope formalParameters34 =null;
		TreeRuleReturnScope block35 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:4: ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_constructDeclaration1050); 
			match(input, Token.DOWN, null); 
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_constructDeclaration1057); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_methodModifier_in_constructDeclaration1059);
			methodModifier33=methodModifier();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,TYPE,FOLLOW_TYPE_in_constructDeclaration1066); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_constructDeclaration1068);
			typeModifier();
			state._fsp--;

			pushFollow(FOLLOW_returnType_in_constructDeclaration1070);
			returnType();
			state._fsp--;

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_formalParameters_in_constructDeclaration1076);
			formalParameters34=formalParameters();
			state._fsp--;

			pushFollow(FOLLOW_block_in_constructDeclaration1081);
			block35=block();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 222:3: -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			{
				retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier33!=null?((StringTemplate)methodModifier33.getTemplate()):null)).put("identifier", identifier).put("params", (formalParameters34!=null?((StringTemplate)formalParameters34.getTemplate()):null)).put("body", (block35!=null?((PHP54TranslatorWalker.block_return)block35).instructions:null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "constructDeclaration"


	public static class abstractMethodDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "abstractMethodDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:230:1: abstractMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.abstractMethodDeclaration_return abstractMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodDeclaration_return retval = new PHP54TranslatorWalker.abstractMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope abstractMethodModifier36 =null;
		TreeRuleReturnScope formalParameters37 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:231:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:231:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1140); 
			match(input, Token.DOWN, null); 
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1146); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1148);
			abstractMethodModifier36=abstractMethodModifier();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,TYPE,FOLLOW_TYPE_in_abstractMethodDeclaration1155); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_abstractMethodDeclaration1157);
			typeModifier();
			state._fsp--;

			pushFollow(FOLLOW_returnType_in_abstractMethodDeclaration1159);
			returnType();
			state._fsp--;

			match(input, Token.UP, null); 

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:234:4: (identfier= Identifier |identfier= Destruct )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==Identifier) ) {
				alt27=1;
			}
			else if ( (LA27_0==Destruct) ) {
				alt27=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:234:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_abstractMethodDeclaration1168); 
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:234:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_abstractMethodDeclaration1172); 
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_abstractMethodDeclaration1178);
			formalParameters37=formalParameters();
			state._fsp--;

			match(input,BLOCK,FOLLOW_BLOCK_in_abstractMethodDeclaration1183); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 238:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st)
			{
				retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", (abstractMethodModifier36!=null?((StringTemplate)abstractMethodModifier36.getTemplate()):null)).put("identifier", identfier).put("params", (formalParameters37!=null?((StringTemplate)formalParameters37.getTemplate()):null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "abstractMethodDeclaration"


	public static class abstractMethodModifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "abstractMethodModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:245:1: abstractMethodModifier : (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.abstractMethodModifier_return abstractMethodModifier() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodModifier_return retval = new PHP54TranslatorWalker.abstractMethodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:246:2: ( (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:246:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:246:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Abstract) ) {
				alt28=1;
			}
			else if ( (LA28_0==Private||(LA28_0 >= Protected && LA28_0 <= Public)) ) {
				alt28=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:246:6: list+= abstractToken list+= accessModifier
					{
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1237);
					list=abstractToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1241);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:247:5: list+= accessModifier list+= abstractToken
					{
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1250);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1254);
					list=abstractToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;

			}

			// TEMPLATE REWRITE
			// 249:3: -> modifier(modifiers=$list)
			{
				retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "abstractMethodModifier"


	public static class abstractToken_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "abstractToken"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:252:1: abstractToken : Abstract -> {%{$Abstract.text}};
	public final PHP54TranslatorWalker.abstractToken_return abstractToken() throws RecognitionException {
		PHP54TranslatorWalker.abstractToken_return retval = new PHP54TranslatorWalker.abstractToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Abstract38=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:253:2: ( Abstract -> {%{$Abstract.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:253:4: Abstract
			{
			Abstract38=(ITSPHPAst)match(input,Abstract,FOLLOW_Abstract_in_abstractToken1280); 
			// TEMPLATE REWRITE
			// 253:13: -> {%{$Abstract.text}}
			{
				retval.st = new StringTemplate(templateLib,(Abstract38!=null?Abstract38.getText():null));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "abstractToken"


	public static class methodDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "methodDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:256:1: methodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.methodDeclaration_return methodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.methodDeclaration_return retval = new PHP54TranslatorWalker.methodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope methodModifier39 =null;
		TreeRuleReturnScope formalParameters40 =null;
		TreeRuleReturnScope block41 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:257:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:257:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_methodDeclaration1296); 
			match(input, Token.DOWN, null); 
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_methodDeclaration1302); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_methodModifier_in_methodDeclaration1304);
			methodModifier39=methodModifier();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,TYPE,FOLLOW_TYPE_in_methodDeclaration1311); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_methodDeclaration1313);
			typeModifier();
			state._fsp--;

			pushFollow(FOLLOW_returnType_in_methodDeclaration1315);
			returnType();
			state._fsp--;

			match(input, Token.UP, null); 

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:260:4: (identfier= Identifier |identfier= Destruct )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==Identifier) ) {
				alt29=1;
			}
			else if ( (LA29_0==Destruct) ) {
				alt29=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:260:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1324); 
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:260:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_methodDeclaration1328); 
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_methodDeclaration1334);
			formalParameters40=formalParameters();
			state._fsp--;

			pushFollow(FOLLOW_block_in_methodDeclaration1339);
			block41=block();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 264:3: -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions)
			{
				retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier39!=null?((StringTemplate)methodModifier39.getTemplate()):null)).put("identifier", identfier).put("params", (formalParameters40!=null?((StringTemplate)formalParameters40.getTemplate()):null)).put("body", (block41!=null?((PHP54TranslatorWalker.block_return)block41).instructions:null)));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodDeclaration"


	public static class methodModifier_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "methodModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:272:1: methodModifier : (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.methodModifier_return methodModifier() throws RecognitionException {
		PHP54TranslatorWalker.methodModifier_return retval = new PHP54TranslatorWalker.methodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:273:2: ( (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:273:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:273:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			int alt30=11;
			switch ( input.LA(1) ) {
			case Static:
				{
				switch ( input.LA(2) ) {
				case Final:
					{
					alt30=1;
					}
					break;
				case Private:
					{
					int LA30_7 = input.LA(3);
					if ( (LA30_7==Final) ) {
						alt30=2;
					}
					else if ( (LA30_7==UP) ) {
						alt30=3;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Protected:
					{
					int LA30_8 = input.LA(3);
					if ( (LA30_8==Final) ) {
						alt30=2;
					}
					else if ( (LA30_8==UP) ) {
						alt30=3;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Public:
					{
					int LA30_9 = input.LA(3);
					if ( (LA30_9==Final) ) {
						alt30=2;
					}
					else if ( (LA30_9==UP) ) {
						alt30=3;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Final:
				{
				switch ( input.LA(2) ) {
				case Static:
					{
					alt30=4;
					}
					break;
				case Private:
					{
					int LA30_11 = input.LA(3);
					if ( (LA30_11==Static) ) {
						alt30=5;
					}
					else if ( (LA30_11==UP) ) {
						alt30=6;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Protected:
					{
					int LA30_12 = input.LA(3);
					if ( (LA30_12==Static) ) {
						alt30=5;
					}
					else if ( (LA30_12==UP) ) {
						alt30=6;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Public:
					{
					int LA30_13 = input.LA(3);
					if ( (LA30_13==Static) ) {
						alt30=5;
					}
					else if ( (LA30_13==UP) ) {
						alt30=6;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Private:
				{
				switch ( input.LA(2) ) {
				case Final:
					{
					int LA30_14 = input.LA(3);
					if ( (LA30_14==Static) ) {
						alt30=7;
					}
					else if ( (LA30_14==UP) ) {
						alt30=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA30_15 = input.LA(3);
					if ( (LA30_15==Final) ) {
						alt30=8;
					}
					else if ( (LA30_15==UP) ) {
						alt30=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt30=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Protected:
				{
				switch ( input.LA(2) ) {
				case Final:
					{
					int LA30_14 = input.LA(3);
					if ( (LA30_14==Static) ) {
						alt30=7;
					}
					else if ( (LA30_14==UP) ) {
						alt30=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA30_15 = input.LA(3);
					if ( (LA30_15==Final) ) {
						alt30=8;
					}
					else if ( (LA30_15==UP) ) {
						alt30=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt30=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Public:
				{
				switch ( input.LA(2) ) {
				case Final:
					{
					int LA30_14 = input.LA(3);
					if ( (LA30_14==Static) ) {
						alt30=7;
					}
					else if ( (LA30_14==UP) ) {
						alt30=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA30_15 = input.LA(3);
					if ( (LA30_15==Final) ) {
						alt30=8;
					}
					else if ( (LA30_15==UP) ) {
						alt30=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 30, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt30=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:273:6: list+= staticToken list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1400);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1404);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1408);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:274:5: list+= staticToken list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1416);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1420);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1424);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:275:5: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1432);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1436);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:277:5: list+= finalToken list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1447);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1451);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1455);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:278:5: list+= finalToken list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1463);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1467);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1471);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:279:5: list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1480);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1484);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:282:5: list+= accessModifier list+= finalToken list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1498);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1502);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1506);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:283:5: list+= accessModifier list+= staticToken list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1514);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1518);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1522);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:284:5: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1530);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1534);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:285:5: list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1542);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1546);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:286:5: list+= accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1554);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;

			}

			// TEMPLATE REWRITE
			// 288:3: -> modifier(modifiers=$list)
			{
				retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodModifier"


	public static class finalToken_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "finalToken"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:291:1: finalToken : Final -> {%{$Final.text}};
	public final PHP54TranslatorWalker.finalToken_return finalToken() throws RecognitionException {
		PHP54TranslatorWalker.finalToken_return retval = new PHP54TranslatorWalker.finalToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Final42=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:292:2: ( Final -> {%{$Final.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:292:4: Final
			{
			Final42=(ITSPHPAst)match(input,Final,FOLLOW_Final_in_finalToken1581); 
			// TEMPLATE REWRITE
			// 292:10: -> {%{$Final.text}}
			{
				retval.st = new StringTemplate(templateLib,(Final42!=null?Final42.getText():null));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "finalToken"


	public static class returnType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "returnType"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:295:1: returnType : ( allTypes | Void );
	public final PHP54TranslatorWalker.returnType_return returnType() throws RecognitionException {
		PHP54TranslatorWalker.returnType_return retval = new PHP54TranslatorWalker.returnType_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:296:2: ( allTypes | Void )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==TYPE_NAME||(LA31_0 >= TypeArray && LA31_0 <= TypeString)) ) {
				alt31=1;
			}
			else if ( (LA31_0==Void) ) {
				alt31=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:296:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1597);
					allTypes();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:297:4: Void
					{
					match(input,Void,FOLLOW_Void_in_returnType1602); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class formalParameters_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formalParameters"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:300:1: formalParameters : ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null});
	public final PHP54TranslatorWalker.formalParameters_return formalParameters() throws RecognitionException {
		PHP54TranslatorWalker.formalParameters_return retval = new PHP54TranslatorWalker.formalParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:301:2: ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null})
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==PARAMETER_LIST) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==DOWN) ) {
					alt33=1;
				}
				else if ( (LA33_1==BLOCK) ) {
					alt33=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:301:4: ^( PARAMETER_LIST (params+= paramDeclaration )+ )
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1616); 
					match(input, Token.DOWN, null); 
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:301:27: (params+= paramDeclaration )+
					int cnt32=0;
					loop32:
					do {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==PARAMETER_DECLARATION) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:301:27: params+= paramDeclaration
							{
							pushFollow(FOLLOW_paramDeclaration_in_formalParameters1620);
							params=paramDeclaration();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt32 >= 1 ) break loop32;
								EarlyExitException eee =
									new EarlyExitException(32, input);
								throw eee;
						}
						cnt32++;
					} while (true);

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 301:48: -> parameterList(declarations=$params)
					{
						retval.st = templateLib.getInstanceOf("parameterList",new STAttrMap().put("declarations", list_params));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:302:4: PARAMETER_LIST
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1636); 
					// TEMPLATE REWRITE
					// 302:19: -> {null}
					{
						retval.st = null;
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formalParameters"


	public static class paramDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "paramDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:305:1: paramDeclaration : ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=variableIddefaultValue=defaultValue);
	public final PHP54TranslatorWalker.paramDeclaration_return paramDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.paramDeclaration_return retval = new PHP54TranslatorWalker.paramDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope typeName =null;
		TreeRuleReturnScope parameterNormalOrOptional43 =null;
		TreeRuleReturnScope typeModifier44 =null;

		String defaultValue =null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:307:2: ( ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=variableIddefaultValue=defaultValue))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:307:4: ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional )
			{
			match(input,PARAMETER_DECLARATION,FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1656); 
			match(input, Token.DOWN, null); 
			match(input,TYPE,FOLLOW_TYPE_in_paramDeclaration1663); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_paramDeclaration1665);
			typeModifier44=typeModifier();
			state._fsp--;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:309:5: ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType )
			int alt34=4;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeResource:
			case TypeString:
				{
				alt34=1;
				}
				break;
			case TypeArray:
				{
				alt34=2;
				}
				break;
			case TypeObject:
				{
				alt34=3;
				}
				break;
			case TYPE_NAME:
				{
				alt34=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:309:7: scalarAndResource
					{
					pushFollow(FOLLOW_scalarAndResource_in_paramDeclaration1674);
					scalarAndResource();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:310:7: typeName= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_paramDeclaration1684);
					typeName=arrayType();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:311:7: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_paramDeclaration1692); 
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:312:7: typeName= classInterfaceType
					{
					pushFollow(FOLLOW_classInterfaceType_in_paramDeclaration1702);
					typeName=classInterfaceType();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_parameterNormalOrOptional_in_paramDeclaration1718);
			parameterNormalOrOptional43=parameterNormalOrOptional();
			state._fsp--;

			match(input, Token.UP, null); 


					    String variableId = (parameterNormalOrOptional43!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional43).variableId:null);		    
					    defaultValue =  (typeModifier44!=null?((PHP54TranslatorWalker.typeModifier_return)typeModifier44).isNullable:false) && typeName!=null ? "null" : (parameterNormalOrOptional43!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional43).defaultValue:null);
					
			// TEMPLATE REWRITE
			// 321:3: -> parameter(type=$typeName.textvariableId=variableIddefaultValue=defaultValue)
			{
				retval.st = templateLib.getInstanceOf("parameter",new STAttrMap().put("type", (typeName!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(typeName.start),input.getTreeAdaptor().getTokenStopIndex(typeName.start))):null)).put("variableId", variableId).put("defaultValue", defaultValue));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramDeclaration"


	public static class arrayType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayType"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:323:1: arrayType : TypeArray -> {%{$TypeArray.text}};
	public final PHP54TranslatorWalker.arrayType_return arrayType() throws RecognitionException {
		PHP54TranslatorWalker.arrayType_return retval = new PHP54TranslatorWalker.arrayType_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeArray45=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:324:2: ( TypeArray -> {%{$TypeArray.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:324:4: TypeArray
			{
			TypeArray45=(ITSPHPAst)match(input,TypeArray,FOLLOW_TypeArray_in_arrayType1757); 
			// TEMPLATE REWRITE
			// 324:14: -> {%{$TypeArray.text}}
			{
				retval.st = new StringTemplate(templateLib,(TypeArray45!=null?TypeArray45.getText():null));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayType"


	public static class classInterfaceType_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "classInterfaceType"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:327:1: classInterfaceType : TYPE_NAME -> {%{$TYPE_NAME.text}};
	public final PHP54TranslatorWalker.classInterfaceType_return classInterfaceType() throws RecognitionException {
		PHP54TranslatorWalker.classInterfaceType_return retval = new PHP54TranslatorWalker.classInterfaceType_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME46=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:328:2: ( TYPE_NAME -> {%{$TYPE_NAME.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:328:4: TYPE_NAME
			{
			TYPE_NAME46=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_classInterfaceType1772); 
			// TEMPLATE REWRITE
			// 328:14: -> {%{$TYPE_NAME.text}}
			{
				retval.st = new StringTemplate(templateLib,(TYPE_NAME46!=null?TYPE_NAME46.getText():null));
			}



			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "classInterfaceType"


	public static class scalarAndResource_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "scalarAndResource"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:331:1: scalarAndResource : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}});
	public final PHP54TranslatorWalker.scalarAndResource_return scalarAndResource() throws RecognitionException {
		PHP54TranslatorWalker.scalarAndResource_return retval = new PHP54TranslatorWalker.scalarAndResource_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource48=null;
		TreeRuleReturnScope scalarTypes47 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:332:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}})
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( ((LA35_0 >= TypeBool && LA35_0 <= TypeInt)||LA35_0==TypeString) ) {
				alt35=1;
			}
			else if ( (LA35_0==TypeResource) ) {
				alt35=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:332:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_scalarAndResource1788);
					scalarTypes47=scalarTypes();
					state._fsp--;

					// TEMPLATE REWRITE
					// 332:16: -> {$scalarTypes.st}
					{
						retval.st = (scalarTypes47!=null?((StringTemplate)scalarTypes47.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:333:4: TypeResource
					{
					TypeResource48=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_scalarAndResource1797); 
					// TEMPLATE REWRITE
					// 333:17: -> {%{$TypeResource.text}}
					{
						retval.st = new StringTemplate(templateLib,(TypeResource48!=null?TypeResource48.getText():null));
					}



					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalarAndResource"


	public static class parameterNormalOrOptional_return extends TreeRuleReturnScope {
		public String variableId;
		public String defaultValue;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "parameterNormalOrOptional"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:336:1: parameterNormalOrOptional returns [String variableId,String defaultValue] : ( ^( VariableId v= Int ) | VariableId );
	public final PHP54TranslatorWalker.parameterNormalOrOptional_return parameterNormalOrOptional() throws RecognitionException {
		PHP54TranslatorWalker.parameterNormalOrOptional_return retval = new PHP54TranslatorWalker.parameterNormalOrOptional_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst VariableId49=null;
		ITSPHPAst VariableId50=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:337:2: ( ^( VariableId v= Int ) | VariableId )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==VariableId) ) {
				int LA36_1 = input.LA(2);
				if ( (LA36_1==DOWN) ) {
					alt36=1;
				}
				else if ( (LA36_1==UP) ) {
					alt36=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 36, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:337:4: ^( VariableId v= Int )
					{
					VariableId49=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional1816); 
					match(input, Token.DOWN, null); 
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_parameterNormalOrOptional1820); 
					match(input, Token.UP, null); 

					retval.variableId =(VariableId49!=null?VariableId49.getText():null); retval.defaultValue =(v!=null?v.getText():null);
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:338:4: VariableId
					{
					VariableId50=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional1829); 
					retval.variableId =(VariableId50!=null?VariableId50.getText():null);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "parameterNormalOrOptional"


	public static class block_return extends TreeRuleReturnScope {
		public List<Object> instructions;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "block"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:341:1: block returns [List<Object> instructions] : ( ^( BLOCK (instr+= instruction )* ) | BLOCK );
	public final PHP54TranslatorWalker.block_return block() throws RecognitionException {
		PHP54TranslatorWalker.block_return retval = new PHP54TranslatorWalker.block_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:342:2: ( ^( BLOCK (instr+= instruction )* ) | BLOCK )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==BLOCK) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==DOWN) ) {
					alt38=1;
				}
				else if ( (LA38_1==UP) ) {
					alt38=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:342:4: ^( BLOCK (instr+= instruction )* )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block1846); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:342:17: (instr+= instruction )*
						loop37:
						do {
							int alt37=2;
							int LA37_0 = input.LA(1);
							if ( (LA37_0==VariableId) ) {
								alt37=1;
							}

							switch (alt37) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:342:17: instr+= instruction
								{
								pushFollow(FOLLOW_instruction_in_block1850);
								instr=instruction();
								state._fsp--;

								if (list_instr==null) list_instr=new ArrayList<Object>();
								list_instr.add(instr.getTemplate());
								}
								break;

							default :
								break loop37;
							}
						} while (true);

						match(input, Token.UP, null); 
					}

					retval.instructions =list_instr;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:343:4: BLOCK
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block1859); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class instruction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:346:1: instruction : VariableId ;
	public final PHP54TranslatorWalker.instruction_return instruction() throws RecognitionException {
		PHP54TranslatorWalker.instruction_return retval = new PHP54TranslatorWalker.instruction_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:347:2: ( VariableId )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:347:4: VariableId
			{
			match(input,VariableId,FOLLOW_VariableId_in_instruction1871); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "instruction"

	// Delegated rules



	public static final BitSet FOLLOW_namespace_in_compilationUnit54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespace77 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_namespace82 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_DEFAULT_NAMESPACE_in_namespace84 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_namespaceBody_in_namespace87 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NAMESPACE_BODY_in_namespaceBody122 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_namespaceBody126 = new BitSet(new long[]{0x0000008800000008L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_NAMESPACE_BODY_in_namespaceBody142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList188 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList190 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_USE_DECLARATION_in_useDeclaration216 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_useDeclaration218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration220 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classDeclaration_in_definition249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classModifier_in_classDeclaration280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration286 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration288 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_classModifier352 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classModifierNames_in_classModifier356 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_classModifier371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration410 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_extendsDeclaration414 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_implementsDeclaration455 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_BODY_in_classBody492 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classBodyDefinition_in_classBody496 = new BitSet(new long[]{0x0000200808000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_CLASS_BODY_in_classBody512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBodyDefinition533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classMemberDeclaration_in_classBodyDefinition542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructDeclaration_in_classBodyDefinition553 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstractMethodDeclaration_in_classBodyDefinition562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBodyDefinition571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_DECLARATION_LIST_in_constDeclarationList588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_constDeclarationList595 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_constDeclarationList598 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Public_in_constDeclarationList600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_Static_in_constDeclarationList602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_Final_in_constDeclarationList604 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_scalarTypes_in_constDeclarationList607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList615 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment645 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_constantAssignment649 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_in_classMemberDeclaration710 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclarationList_in_classMemberDeclaration712 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList729 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_variableDeclarationList736 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_variableDeclarationList738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclarationList740 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList749 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier785 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_typeModifier789 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008001DL});
	public static final BitSet FOLLOW_QuestionMark_in_typeModifier794 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008000DL});
	public static final BitSet FOLLOW_variableModifier_in_typeModifier797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_staticToken882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessModifier898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Protected_in_accessModifier907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_accessModifier916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_variableDeclaration937 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_allTypes971 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_allTypes976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypes987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypes992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypes997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypes1002 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesWithoutArray1023 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypesWithoutArray1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_constructDeclaration1050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_constructDeclaration1057 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_constructDeclaration1059 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_constructDeclaration1066 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_constructDeclaration1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_constructDeclaration1070 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_constructDeclaration1076 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_constructDeclaration1081 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1140 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1146 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1148 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractMethodDeclaration1155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractMethodDeclaration1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractMethodDeclaration1159 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_abstractMethodDeclaration1168 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_abstractMethodDeclaration1172 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_abstractMethodDeclaration1178 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_abstractMethodDeclaration1183 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1250 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Abstract_in_abstractToken1280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_methodDeclaration1296 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_methodDeclaration1302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_methodDeclaration1304 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_methodDeclaration1311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_methodDeclaration1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_methodDeclaration1315 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1324 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_methodDeclaration1328 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration1334 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_methodDeclaration1339 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1502 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1546 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Final_in_finalToken1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramDeclaration_in_formalParameters1620 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_paramDeclaration1663 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_paramDeclaration1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_scalarAndResource_in_paramDeclaration1674 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_paramDeclaration1684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeObject_in_paramDeclaration1692 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceType_in_paramDeclaration1702 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_parameterNormalOrOptional_in_paramDeclaration1718 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeArray_in_arrayType1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_classInterfaceType1772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_scalarAndResource1788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_scalarAndResource1797 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional1816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_parameterNormalOrOptional1820 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional1829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block1846 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_block1850 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_BLOCK_in_block1859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instruction1871 = new BitSet(new long[]{0x0000000000000002L});
}
