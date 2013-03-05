// $ANTLR 3.x D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g 2013-03-05 22:25:02

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
							if ( (LA12_0==CLASS_MEMBER||LA12_0==CONSTANT_DECLARATION_LIST||LA12_0==METHOD_DECLARATION) ) {
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:129:1: classBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st});
	public final PHP54TranslatorWalker.classBodyDefinition_return classBodyDefinition() throws RecognitionException {
		PHP54TranslatorWalker.classBodyDefinition_return retval = new PHP54TranslatorWalker.classBodyDefinition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope constDeclarationList14 =null;
		TreeRuleReturnScope classMemberDeclaration15 =null;
		TreeRuleReturnScope abstractMethodDeclaration16 =null;
		TreeRuleReturnScope methodDeclaration17 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:2: ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st})
			int alt14=4;
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
			case METHOD_DECLARATION:
				{
				int LA14_3 = input.LA(2);
				if ( (LA14_3==DOWN) ) {
					int LA14_4 = input.LA(3);
					if ( (LA14_4==METHOD_MODIFIER) ) {
						int LA14_5 = input.LA(4);
						if ( (LA14_5==DOWN) ) {
							switch ( input.LA(5) ) {
							case Abstract:
								{
								alt14=3;
								}
								break;
							case Private:
								{
								int LA14_8 = input.LA(6);
								if ( (LA14_8==Abstract) ) {
									alt14=3;
								}
								else if ( (LA14_8==UP||LA14_8==Final||LA14_8==Static) ) {
									alt14=4;
								}
								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 8, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case Protected:
								{
								int LA14_9 = input.LA(6);
								if ( (LA14_9==Abstract) ) {
									alt14=3;
								}
								else if ( (LA14_9==UP||LA14_9==Final||LA14_9==Static) ) {
									alt14=4;
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
							case Public:
								{
								int LA14_10 = input.LA(6);
								if ( (LA14_10==Abstract) ) {
									alt14=3;
								}
								else if ( (LA14_10==UP||LA14_10==Final||LA14_10==Static) ) {
									alt14=4;
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
							case Final:
							case Static:
								{
								alt14=4;
								}
								break;
							default:
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
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
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 14, 4, input);
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
							new NoViableAltException("", 14, 3, input);
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:134:4: abstractMethodDeclaration
					{
					pushFollow(FOLLOW_abstractMethodDeclaration_in_classBodyDefinition555);
					abstractMethodDeclaration16=abstractMethodDeclaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 134:30: -> {$abstractMethodDeclaration.st}
					{
						retval.st = (abstractMethodDeclaration16!=null?((StringTemplate)abstractMethodDeclaration16.getTemplate()):null);
					}



					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:135:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBodyDefinition564);
					methodDeclaration17=methodDeclaration();
					state._fsp--;

					// TEMPLATE REWRITE
					// 135:22: -> {$methodDeclaration.st}
					{
						retval.st = (methodDeclaration17!=null?((StringTemplate)methodDeclaration17.getTemplate()):null);
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
			match(input,CONSTANT_DECLARATION_LIST,FOLLOW_CONSTANT_DECLARATION_LIST_in_constDeclarationList581); 
			match(input, Token.DOWN, null); 
			match(input,TYPE,FOLLOW_TYPE_in_constDeclarationList588); 
			match(input, Token.DOWN, null); 
			match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_constDeclarationList591); 
			match(input, Token.DOWN, null); 
			match(input,Public,FOLLOW_Public_in_constDeclarationList593); 
			match(input,Static,FOLLOW_Static_in_constDeclarationList595); 
			match(input,Final,FOLLOW_Final_in_constDeclarationList597); 
			match(input, Token.UP, null); 

			pushFollow(FOLLOW_scalarTypes_in_constDeclarationList600);
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
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList608);
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
		ITSPHPAst Identifier18=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:147:2: ( ^( Identifier v= Int ) -> assign(id=$Identifiervalue=v))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:147:4: ^( Identifier v= Int )
			{
			Identifier18=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment638); 
			match(input, Token.DOWN, null); 
			v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_constantAssignment642); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 148:4: -> assign(id=$Identifiervalue=v)
			{
				retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", Identifier18).put("value", v));
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

		TreeRuleReturnScope variableDeclarationList19 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:160:2: ( ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:160:4: ^( CLASS_MEMBER variableDeclarationList )
			{
			match(input,CLASS_MEMBER,FOLLOW_CLASS_MEMBER_in_classMemberDeclaration703); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_variableDeclarationList_in_classMemberDeclaration705);
			variableDeclarationList19=variableDeclarationList();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 160:44: -> {$variableDeclarationList.st}
			{
				retval.st = (variableDeclarationList19!=null?((StringTemplate)variableDeclarationList19.getTemplate()):null);
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
		TreeRuleReturnScope typeModifier20 =null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:164:2: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:164:4: ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ )
			{
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList722); 
			match(input, Token.DOWN, null); 
			match(input,TYPE,FOLLOW_TYPE_in_variableDeclarationList729); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_variableDeclarationList731);
			typeModifier20=typeModifier();
			state._fsp--;

			pushFollow(FOLLOW_allTypes_in_variableDeclarationList733);
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
					pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList742);
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
				retval.st = templateLib.getInstanceOf("variableDeclarationList",new STAttrMap().put("modifier", (typeModifier20!=null?((StringTemplate)typeModifier20.getTemplate()):null)).put("identifiers", list_identifiers));
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
		TreeRuleReturnScope variableModifier21 =null;

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
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier778); 
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
								cast=(ITSPHPAst)match(input,Cast,FOLLOW_Cast_in_typeModifier782); 
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
								nullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_typeModifier787); 
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
								pushFollow(FOLLOW_variableModifier_in_typeModifier790);
								variableModifier21=variableModifier();
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
						retval.st = (variableModifier21!=null?((StringTemplate)variableModifier21.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:4: TYPE_MODIFIER
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier803); 
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
		TreeRuleReturnScope accessModifier22 =null;
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
					pushFollow(FOLLOW_staticToken_in_variableModifier821);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_variableModifier825);
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
					pushFollow(FOLLOW_accessModifier_in_variableModifier841);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_variableModifier845);
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
					pushFollow(FOLLOW_accessModifier_in_variableModifier859);
					accessModifier22=accessModifier();
					state._fsp--;

					// TEMPLATE REWRITE
					// 179:19: -> {$accessModifier.st}
					{
						retval.st = (accessModifier22!=null?((StringTemplate)accessModifier22.getTemplate()):null);
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

		ITSPHPAst Static23=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:183:2: ( Static -> {%{$Static.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:183:4: Static
			{
			Static23=(ITSPHPAst)match(input,Static,FOLLOW_Static_in_staticToken875); 
			// TEMPLATE REWRITE
			// 183:11: -> {%{$Static.text}}
			{
				retval.st = new StringTemplate(templateLib,(Static23!=null?Static23.getText():null));
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

		ITSPHPAst Private24=null;
		ITSPHPAst Protected25=null;
		ITSPHPAst Public26=null;

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
					Private24=(ITSPHPAst)match(input,Private,FOLLOW_Private_in_accessModifier891); 
					// TEMPLATE REWRITE
					// 187:12: -> {%{$Private.text}}
					{
						retval.st = new StringTemplate(templateLib,(Private24!=null?Private24.getText():null));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:188:4: Protected
					{
					Protected25=(ITSPHPAst)match(input,Protected,FOLLOW_Protected_in_accessModifier900); 
					// TEMPLATE REWRITE
					// 188:14: -> {%{$Protected.text}}
					{
						retval.st = new StringTemplate(templateLib,(Protected25!=null?Protected25.getText():null));
					}



					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:189:4: Public
					{
					Public26=(ITSPHPAst)match(input,Public,FOLLOW_Public_in_accessModifier909); 
					// TEMPLATE REWRITE
					// 189:11: -> {%{$Public.text}}
					{
						retval.st = new StringTemplate(templateLib,(Public26!=null?Public26.getText():null));
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
		ITSPHPAst VariableId27=null;
		ITSPHPAst VariableId28=null;

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
					VariableId27=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration926); 
					match(input, Token.DOWN, null); 
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_variableDeclaration930); 
					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 193:24: -> assign(id=$VariableIdvalue=v)
					{
						retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", VariableId27).put("value", v));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:194:4: VariableId
					{
					VariableId28=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration949); 
					// TEMPLATE REWRITE
					// 194:15: -> {%{$VariableId.text}}
					{
						retval.st = new StringTemplate(templateLib,(VariableId28!=null?VariableId28.getText():null));
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
					pushFollow(FOLLOW_primitiveTypes_in_allTypes964);
					primitiveTypes();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:199:4: TYPE_NAME
					{
					match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_allTypes969); 
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
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypes980);
					scalarTypes();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:204:4: 'array'
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypes985); 
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:205:4: 'resource'
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypes990); 
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:206:4: 'object'
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypes995); 
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

		ITSPHPAst TypeResource30=null;
		ITSPHPAst TypeObject31=null;
		TreeRuleReturnScope scalarTypes29 =null;

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
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1007);
					scalarTypes29=scalarTypes();
					state._fsp--;

					// TEMPLATE REWRITE
					// 210:16: -> {$scalarTypes.st}
					{
						retval.st = (scalarTypes29!=null?((StringTemplate)scalarTypes29.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:211:4: TypeResource
					{
					TypeResource30=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesWithoutArray1016); 
					// TEMPLATE REWRITE
					// 211:17: -> {%{$TypeResource.text}}
					{
						retval.st = new StringTemplate(templateLib,(TypeResource30!=null?TypeResource30.getText():null));
					}



					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:212:4: TypeObject
					{
					TypeObject31=(ITSPHPAst)match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypesWithoutArray1025); 
					// TEMPLATE REWRITE
					// 212:15: -> {%{$TypeObject.text}}
					{
						retval.st = new StringTemplate(templateLib,(TypeObject31!=null?TypeObject31.getText():null));
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


	public static class abstractMethodDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "abstractMethodDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:215:1: abstractMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$Identifierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.abstractMethodDeclaration_return abstractMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodDeclaration_return retval = new PHP54TranslatorWalker.abstractMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier33=null;
		TreeRuleReturnScope abstractMethodModifier32 =null;
		TreeRuleReturnScope formalParameters34 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$Identifierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1041); 
			match(input, Token.DOWN, null); 
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1047); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1049);
			abstractMethodModifier32=abstractMethodModifier();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,TYPE,FOLLOW_TYPE_in_abstractMethodDeclaration1056); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_abstractMethodDeclaration1058);
			typeModifier();
			state._fsp--;

			pushFollow(FOLLOW_returnType_in_abstractMethodDeclaration1060);
			returnType();
			state._fsp--;

			match(input, Token.UP, null); 

			Identifier33=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_abstractMethodDeclaration1066); 
			pushFollow(FOLLOW_formalParameters_in_abstractMethodDeclaration1071);
			formalParameters34=formalParameters();
			state._fsp--;

			match(input,BLOCK,FOLLOW_BLOCK_in_abstractMethodDeclaration1076); 
			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 223:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$Identifierparams=$formalParameters.st)
			{
				retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", (abstractMethodModifier32!=null?((StringTemplate)abstractMethodModifier32.getTemplate()):null)).put("identifier", Identifier33).put("params", (formalParameters34!=null?((StringTemplate)formalParameters34.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:230:1: abstractMethodModifier : (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.abstractMethodModifier_return abstractMethodModifier() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodModifier_return retval = new PHP54TranslatorWalker.abstractMethodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:231:2: ( (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:231:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:231:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==Abstract) ) {
				alt27=1;
			}
			else if ( (LA27_0==Private||(LA27_0 >= Protected && LA27_0 <= Public)) ) {
				alt27=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:231:6: list+= abstractToken list+= accessModifier
					{
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1130);
					list=abstractToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1134);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:232:5: list+= accessModifier list+= abstractToken
					{
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1143);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1147);
					list=abstractToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;

			}

			// TEMPLATE REWRITE
			// 234:3: -> modifier(modifiers=$list)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:237:1: abstractToken : Abstract -> {%{$Abstract.text}};
	public final PHP54TranslatorWalker.abstractToken_return abstractToken() throws RecognitionException {
		PHP54TranslatorWalker.abstractToken_return retval = new PHP54TranslatorWalker.abstractToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Abstract35=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:238:2: ( Abstract -> {%{$Abstract.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:238:4: Abstract
			{
			Abstract35=(ITSPHPAst)match(input,Abstract,FOLLOW_Abstract_in_abstractToken1173); 
			// TEMPLATE REWRITE
			// 238:13: -> {%{$Abstract.text}}
			{
				retval.st = new StringTemplate(templateLib,(Abstract35!=null?Abstract35.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:241:1: methodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.methodDeclaration_return methodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.methodDeclaration_return retval = new PHP54TranslatorWalker.methodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier37=null;
		TreeRuleReturnScope methodModifier36 =null;
		TreeRuleReturnScope formalParameters38 =null;
		TreeRuleReturnScope block39 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:242:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:242:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters block )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_methodDeclaration1189); 
			match(input, Token.DOWN, null); 
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_methodDeclaration1195); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_methodModifier_in_methodDeclaration1197);
			methodModifier36=methodModifier();
			state._fsp--;

			match(input, Token.UP, null); 

			match(input,TYPE,FOLLOW_TYPE_in_methodDeclaration1204); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_methodDeclaration1206);
			typeModifier();
			state._fsp--;

			pushFollow(FOLLOW_returnType_in_methodDeclaration1208);
			returnType();
			state._fsp--;

			match(input, Token.UP, null); 

			Identifier37=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1214); 
			pushFollow(FOLLOW_formalParameters_in_methodDeclaration1219);
			formalParameters38=formalParameters();
			state._fsp--;

			pushFollow(FOLLOW_block_in_methodDeclaration1224);
			block39=block();
			state._fsp--;

			match(input, Token.UP, null); 

			// TEMPLATE REWRITE
			// 249:3: -> method(modifier=$methodModifier.stidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions)
			{
				retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier36!=null?((StringTemplate)methodModifier36.getTemplate()):null)).put("identifier", Identifier37).put("params", (formalParameters38!=null?((StringTemplate)formalParameters38.getTemplate()):null)).put("body", (block39!=null?((PHP54TranslatorWalker.block_return)block39).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:257:1: methodModifier : (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.methodModifier_return methodModifier() throws RecognitionException {
		PHP54TranslatorWalker.methodModifier_return retval = new PHP54TranslatorWalker.methodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:258:2: ( (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:258:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:258:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			int alt28=11;
			switch ( input.LA(1) ) {
			case Static:
				{
				switch ( input.LA(2) ) {
				case Final:
					{
					alt28=1;
					}
					break;
				case Private:
					{
					int LA28_7 = input.LA(3);
					if ( (LA28_7==Final) ) {
						alt28=2;
					}
					else if ( (LA28_7==UP) ) {
						alt28=3;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Protected:
					{
					int LA28_8 = input.LA(3);
					if ( (LA28_8==Final) ) {
						alt28=2;
					}
					else if ( (LA28_8==UP) ) {
						alt28=3;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Public:
					{
					int LA28_9 = input.LA(3);
					if ( (LA28_9==Final) ) {
						alt28=2;
					}
					else if ( (LA28_9==UP) ) {
						alt28=3;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 9, input);
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
							new NoViableAltException("", 28, 1, input);
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
					alt28=4;
					}
					break;
				case Private:
					{
					int LA28_11 = input.LA(3);
					if ( (LA28_11==Static) ) {
						alt28=5;
					}
					else if ( (LA28_11==UP) ) {
						alt28=6;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Protected:
					{
					int LA28_12 = input.LA(3);
					if ( (LA28_12==Static) ) {
						alt28=5;
					}
					else if ( (LA28_12==UP) ) {
						alt28=6;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Public:
					{
					int LA28_13 = input.LA(3);
					if ( (LA28_13==Static) ) {
						alt28=5;
					}
					else if ( (LA28_13==UP) ) {
						alt28=6;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 13, input);
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
							new NoViableAltException("", 28, 2, input);
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
					int LA28_14 = input.LA(3);
					if ( (LA28_14==Static) ) {
						alt28=7;
					}
					else if ( (LA28_14==UP) ) {
						alt28=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA28_15 = input.LA(3);
					if ( (LA28_15==Final) ) {
						alt28=8;
					}
					else if ( (LA28_15==UP) ) {
						alt28=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt28=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 3, input);
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
					int LA28_14 = input.LA(3);
					if ( (LA28_14==Static) ) {
						alt28=7;
					}
					else if ( (LA28_14==UP) ) {
						alt28=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA28_15 = input.LA(3);
					if ( (LA28_15==Final) ) {
						alt28=8;
					}
					else if ( (LA28_15==UP) ) {
						alt28=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt28=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 4, input);
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
					int LA28_14 = input.LA(3);
					if ( (LA28_14==Static) ) {
						alt28=7;
					}
					else if ( (LA28_14==UP) ) {
						alt28=10;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA28_15 = input.LA(3);
					if ( (LA28_15==Final) ) {
						alt28=8;
					}
					else if ( (LA28_15==UP) ) {
						alt28=9;
					}
					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 28, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt28=11;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:258:6: list+= staticToken list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1285);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1289);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1293);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:259:5: list+= staticToken list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1301);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1305);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1309);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:260:5: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1317);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1321);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:262:5: list+= finalToken list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1332);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1336);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1340);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:263:5: list+= finalToken list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1348);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1352);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1356);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:264:5: list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1365);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1369);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:267:5: list+= accessModifier list+= finalToken list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1383);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1387);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1391);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:268:5: list+= accessModifier list+= staticToken list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1399);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1403);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1407);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:269:5: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1415);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1419);
					list=staticToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:270:5: list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1427);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1431);
					list=finalToken();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:271:5: list+= accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1439);
					list=accessModifier();
					state._fsp--;

					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;

			}

			// TEMPLATE REWRITE
			// 273:3: -> modifier(modifiers=$list)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:276:1: finalToken : Final -> {%{$Final.text}};
	public final PHP54TranslatorWalker.finalToken_return finalToken() throws RecognitionException {
		PHP54TranslatorWalker.finalToken_return retval = new PHP54TranslatorWalker.finalToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Final40=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:277:2: ( Final -> {%{$Final.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:277:4: Final
			{
			Final40=(ITSPHPAst)match(input,Final,FOLLOW_Final_in_finalToken1466); 
			// TEMPLATE REWRITE
			// 277:10: -> {%{$Final.text}}
			{
				retval.st = new StringTemplate(templateLib,(Final40!=null?Final40.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:280:1: returnType : ( allTypes | Void );
	public final PHP54TranslatorWalker.returnType_return returnType() throws RecognitionException {
		PHP54TranslatorWalker.returnType_return retval = new PHP54TranslatorWalker.returnType_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:281:2: ( allTypes | Void )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==TYPE_NAME||(LA29_0 >= TypeArray && LA29_0 <= TypeString)) ) {
				alt29=1;
			}
			else if ( (LA29_0==Void) ) {
				alt29=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:281:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1482);
					allTypes();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:282:4: Void
					{
					match(input,Void,FOLLOW_Void_in_returnType1487); 
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:285:1: formalParameters : ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null});
	public final PHP54TranslatorWalker.formalParameters_return formalParameters() throws RecognitionException {
		PHP54TranslatorWalker.formalParameters_return retval = new PHP54TranslatorWalker.formalParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:286:2: ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null})
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==PARAMETER_LIST) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==DOWN) ) {
					alt31=1;
				}
				else if ( (LA31_1==BLOCK) ) {
					alt31=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:286:4: ^( PARAMETER_LIST (params+= paramDeclaration )+ )
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1501); 
					match(input, Token.DOWN, null); 
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:286:27: (params+= paramDeclaration )+
					int cnt30=0;
					loop30:
					do {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==PARAMETER_DECLARATION) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:286:27: params+= paramDeclaration
							{
							pushFollow(FOLLOW_paramDeclaration_in_formalParameters1505);
							params=paramDeclaration();
							state._fsp--;

							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
								EarlyExitException eee =
									new EarlyExitException(30, input);
								throw eee;
						}
						cnt30++;
					} while (true);

					match(input, Token.UP, null); 

					// TEMPLATE REWRITE
					// 286:48: -> parameterList(declarations=$params)
					{
						retval.st = templateLib.getInstanceOf("parameterList",new STAttrMap().put("declarations", list_params));
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:287:4: PARAMETER_LIST
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1521); 
					// TEMPLATE REWRITE
					// 287:19: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:290:1: paramDeclaration : ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=variableIddefaultValue=defaultValue);
	public final PHP54TranslatorWalker.paramDeclaration_return paramDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.paramDeclaration_return retval = new PHP54TranslatorWalker.paramDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope typeName =null;
		TreeRuleReturnScope parameterNormalOrOptional41 =null;
		TreeRuleReturnScope typeModifier42 =null;

		String defaultValue =null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:292:2: ( ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=variableIddefaultValue=defaultValue))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:292:4: ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional )
			{
			match(input,PARAMETER_DECLARATION,FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1541); 
			match(input, Token.DOWN, null); 
			match(input,TYPE,FOLLOW_TYPE_in_paramDeclaration1548); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_typeModifier_in_paramDeclaration1550);
			typeModifier42=typeModifier();
			state._fsp--;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:294:5: ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType )
			int alt32=4;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeResource:
			case TypeString:
				{
				alt32=1;
				}
				break;
			case TypeArray:
				{
				alt32=2;
				}
				break;
			case TypeObject:
				{
				alt32=3;
				}
				break;
			case TYPE_NAME:
				{
				alt32=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:294:7: scalarAndResource
					{
					pushFollow(FOLLOW_scalarAndResource_in_paramDeclaration1559);
					scalarAndResource();
					state._fsp--;

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:295:7: typeName= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_paramDeclaration1569);
					typeName=arrayType();
					state._fsp--;

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:296:7: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_paramDeclaration1577); 
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:297:7: typeName= classInterfaceType
					{
					pushFollow(FOLLOW_classInterfaceType_in_paramDeclaration1587);
					typeName=classInterfaceType();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			pushFollow(FOLLOW_parameterNormalOrOptional_in_paramDeclaration1603);
			parameterNormalOrOptional41=parameterNormalOrOptional();
			state._fsp--;

			match(input, Token.UP, null); 


					    String variableId = (parameterNormalOrOptional41!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional41).variableId:null);		    
					    defaultValue =  (typeModifier42!=null?((PHP54TranslatorWalker.typeModifier_return)typeModifier42).isNullable:false) && typeName!=null ? "null" : (parameterNormalOrOptional41!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional41).defaultValue:null);
					
			// TEMPLATE REWRITE
			// 306:3: -> parameter(type=$typeName.textvariableId=variableIddefaultValue=defaultValue)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:308:1: arrayType : TypeArray -> {%{$TypeArray.text}};
	public final PHP54TranslatorWalker.arrayType_return arrayType() throws RecognitionException {
		PHP54TranslatorWalker.arrayType_return retval = new PHP54TranslatorWalker.arrayType_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeArray43=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:309:2: ( TypeArray -> {%{$TypeArray.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:309:4: TypeArray
			{
			TypeArray43=(ITSPHPAst)match(input,TypeArray,FOLLOW_TypeArray_in_arrayType1642); 
			// TEMPLATE REWRITE
			// 309:14: -> {%{$TypeArray.text}}
			{
				retval.st = new StringTemplate(templateLib,(TypeArray43!=null?TypeArray43.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:312:1: classInterfaceType : TYPE_NAME -> {%{$TYPE_NAME.text}};
	public final PHP54TranslatorWalker.classInterfaceType_return classInterfaceType() throws RecognitionException {
		PHP54TranslatorWalker.classInterfaceType_return retval = new PHP54TranslatorWalker.classInterfaceType_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME44=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:313:2: ( TYPE_NAME -> {%{$TYPE_NAME.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:313:4: TYPE_NAME
			{
			TYPE_NAME44=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_classInterfaceType1657); 
			// TEMPLATE REWRITE
			// 313:14: -> {%{$TYPE_NAME.text}}
			{
				retval.st = new StringTemplate(templateLib,(TYPE_NAME44!=null?TYPE_NAME44.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:316:1: scalarAndResource : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}});
	public final PHP54TranslatorWalker.scalarAndResource_return scalarAndResource() throws RecognitionException {
		PHP54TranslatorWalker.scalarAndResource_return retval = new PHP54TranslatorWalker.scalarAndResource_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource46=null;
		TreeRuleReturnScope scalarTypes45 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}})
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( ((LA33_0 >= TypeBool && LA33_0 <= TypeInt)||LA33_0==TypeString) ) {
				alt33=1;
			}
			else if ( (LA33_0==TypeResource) ) {
				alt33=2;
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_scalarAndResource1673);
					scalarTypes45=scalarTypes();
					state._fsp--;

					// TEMPLATE REWRITE
					// 317:16: -> {$scalarTypes.st}
					{
						retval.st = (scalarTypes45!=null?((StringTemplate)scalarTypes45.getTemplate()):null);
					}



					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:318:4: TypeResource
					{
					TypeResource46=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_scalarAndResource1682); 
					// TEMPLATE REWRITE
					// 318:17: -> {%{$TypeResource.text}}
					{
						retval.st = new StringTemplate(templateLib,(TypeResource46!=null?TypeResource46.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:321:1: parameterNormalOrOptional returns [String variableId,String defaultValue] : ( ^( VariableId v= Int ) | VariableId );
	public final PHP54TranslatorWalker.parameterNormalOrOptional_return parameterNormalOrOptional() throws RecognitionException {
		PHP54TranslatorWalker.parameterNormalOrOptional_return retval = new PHP54TranslatorWalker.parameterNormalOrOptional_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst VariableId47=null;
		ITSPHPAst VariableId48=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:322:2: ( ^( VariableId v= Int ) | VariableId )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==VariableId) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==DOWN) ) {
					alt34=1;
				}
				else if ( (LA34_1==UP) ) {
					alt34=2;
				}
				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:322:4: ^( VariableId v= Int )
					{
					VariableId47=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional1701); 
					match(input, Token.DOWN, null); 
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_parameterNormalOrOptional1705); 
					match(input, Token.UP, null); 

					retval.variableId =(VariableId47!=null?VariableId47.getText():null); retval.defaultValue =(v!=null?v.getText():null);
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:323:4: VariableId
					{
					VariableId48=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional1714); 
					retval.variableId =(VariableId48!=null?VariableId48.getText():null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:326:1: block returns [List<Object> instructions] : ( ^( BLOCK (instr+= instruction )* ) | BLOCK );
	public final PHP54TranslatorWalker.block_return block() throws RecognitionException {
		PHP54TranslatorWalker.block_return retval = new PHP54TranslatorWalker.block_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:327:2: ( ^( BLOCK (instr+= instruction )* ) | BLOCK )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==BLOCK) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:327:4: ^( BLOCK (instr+= instruction )* )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block1731); 
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); 
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:327:17: (instr+= instruction )*
						loop35:
						do {
							int alt35=2;
							int LA35_0 = input.LA(1);
							if ( (LA35_0==VariableId) ) {
								alt35=1;
							}

							switch (alt35) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:327:17: instr+= instruction
								{
								pushFollow(FOLLOW_instruction_in_block1735);
								instr=instruction();
								state._fsp--;

								if (list_instr==null) list_instr=new ArrayList<Object>();
								list_instr.add(instr.getTemplate());
								}
								break;

							default :
								break loop35;
							}
						} while (true);

						match(input, Token.UP, null); 
					}

					retval.instructions =list_instr;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:328:4: BLOCK
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block1744); 
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:331:1: instruction : VariableId ;
	public final PHP54TranslatorWalker.instruction_return instruction() throws RecognitionException {
		PHP54TranslatorWalker.instruction_return retval = new PHP54TranslatorWalker.instruction_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:332:2: ( VariableId )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:332:4: VariableId
			{
			match(input,VariableId,FOLLOW_VariableId_in_instruction1756); 
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
	public static final BitSet FOLLOW_classBodyDefinition_in_classBody496 = new BitSet(new long[]{0x0000000808000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_CLASS_BODY_in_classBody512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBodyDefinition533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classMemberDeclaration_in_classBodyDefinition542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstractMethodDeclaration_in_classBodyDefinition555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBodyDefinition564 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_DECLARATION_LIST_in_constDeclarationList581 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_constDeclarationList588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_constDeclarationList591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Public_in_constDeclarationList593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_Static_in_constDeclarationList595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_Final_in_constDeclarationList597 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_scalarTypes_in_constDeclarationList600 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList608 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment638 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_constantAssignment642 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_in_classMemberDeclaration703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclarationList_in_classMemberDeclaration705 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList722 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_variableDeclarationList729 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_variableDeclarationList731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclarationList733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList742 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_typeModifier782 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008001DL});
	public static final BitSet FOLLOW_QuestionMark_in_typeModifier787 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008000DL});
	public static final BitSet FOLLOW_variableModifier_in_typeModifier790 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier825 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_staticToken875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessModifier891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Protected_in_accessModifier900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_accessModifier909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_variableDeclaration930 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_allTypes964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_allTypes969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypes980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypes985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypes990 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypes995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesWithoutArray1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypesWithoutArray1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1047 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractMethodDeclaration1056 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractMethodDeclaration1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractMethodDeclaration1060 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_abstractMethodDeclaration1066 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_abstractMethodDeclaration1071 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_abstractMethodDeclaration1076 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1143 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Abstract_in_abstractToken1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_methodDeclaration1189 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_methodDeclaration1195 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_methodDeclaration1197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_methodDeclaration1204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_methodDeclaration1206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_methodDeclaration1208 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1214 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration1219 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_methodDeclaration1224 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1340 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1369 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Final_in_finalToken1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramDeclaration_in_formalParameters1505 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1541 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_paramDeclaration1548 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_paramDeclaration1550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_scalarAndResource_in_paramDeclaration1559 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_paramDeclaration1569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeObject_in_paramDeclaration1577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceType_in_paramDeclaration1587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_parameterNormalOrOptional_in_paramDeclaration1603 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeArray_in_arrayType1642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_classInterfaceType1657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_scalarAndResource1673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_scalarAndResource1682 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional1701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_parameterNormalOrOptional1705 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional1714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block1731 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_block1735 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_BLOCK_in_block1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_instruction1756 = new BitSet(new long[]{0x0000000000000002L});
}
