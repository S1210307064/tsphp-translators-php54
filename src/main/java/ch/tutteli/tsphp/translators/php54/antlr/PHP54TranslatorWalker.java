// $ANTLR 3.x D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g 2013-03-07 01:38:13

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
import  ch.tutteli.tsphp.translators.php54.IPrecedenceHelper;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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


	private IPrecedenceHelper precedenceHelper;

	public PHP54TranslatorWalker(TreeNodeStream input, IPrecedenceHelper thePrecedenceHelper) {
	    this(input);
	    precedenceHelper = thePrecedenceHelper;
	}


	public static class compilationUnit_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "compilationUnit"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:58:1: compilationUnit : (n+= namespace ) -> file(namespaces=$n);
	public final PHP54TranslatorWalker.compilationUnit_return compilationUnit() throws RecognitionException {
		PHP54TranslatorWalker.compilationUnit_return retval = new PHP54TranslatorWalker.compilationUnit_return();
		retval.start = input.LT(1);

		List<Object> list_n=null;
		RuleReturnScope n = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:59:2: ( (n+= namespace ) -> file(namespaces=$n))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:59:4: (n+= namespace )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:59:4: (n+= namespace )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:59:5: n+= namespace
			{
			pushFollow(FOLLOW_namespace_in_compilationUnit58);
			n=namespace();
			state._fsp--;
			if (state.failed) return retval;
			if (list_n==null) list_n=new ArrayList<Object>();
			list_n.add(n.getTemplate());
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 59:19: -> file(namespaces=$n)
			  {
			  	retval.st = templateLib.getInstanceOf("file",new STAttrMap().put("namespaces", list_n));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:62:1: namespace : ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody ) -> namespace(name=namespaceNamebody=$namespaceBody.st);
	public final PHP54TranslatorWalker.namespace_return namespace() throws RecognitionException {
		PHP54TranslatorWalker.namespace_return retval = new PHP54TranslatorWalker.namespace_return();
		retval.start = input.LT(1);

		ITSPHPAst name=null;
		TreeRuleReturnScope namespaceBody1 =null;

		String namespaceName = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:64:2: ( ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody ) -> namespace(name=namespaceNamebody=$namespaceBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:64:4: ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody )
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespace85); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:64:18: (name= TYPE_NAME | DEFAULT_NAMESPACE )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==TYPE_NAME) ) {
				alt1=1;
			}
			else if ( (LA1_0==DEFAULT_NAMESPACE) ) {
				alt1=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:64:19: name= TYPE_NAME
					{
					name=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_namespace90); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:64:34: DEFAULT_NAMESPACE
					{
					match(input,DEFAULT_NAMESPACE,FOLLOW_DEFAULT_NAMESPACE_in_namespace92); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_namespaceBody_in_namespace95);
			namespaceBody1=namespaceBody();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==0 ) {
					    if(name!=null){
					        namespaceName=name.getText().substring(1,name.getText().length()-1);
				 	    }
				  	}
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 71:4: -> namespace(name=namespaceNamebody=$namespaceBody.st)
			  {
			  	retval.st = templateLib.getInstanceOf("namespace",new STAttrMap().put("name", namespaceName).put("body", (namespaceBody1!=null?((StringTemplate)namespaceBody1.getTemplate()):null)));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:74:1: namespaceBody : ( ^( NAMESPACE_BODY (statements+= statement )* ) -> body(statements=$statements)| NAMESPACE_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.namespaceBody_return namespaceBody() throws RecognitionException {
		PHP54TranslatorWalker.namespaceBody_return retval = new PHP54TranslatorWalker.namespaceBody_return();
		retval.start = input.LT(1);

		List<Object> list_statements=null;
		RuleReturnScope statements = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:75:2: ( ^( NAMESPACE_BODY (statements+= statement )* ) -> body(statements=$statements)| NAMESPACE_BODY -> body(statements=null))
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:75:4: ^( NAMESPACE_BODY (statements+= statement )* )
					{
					match(input,NAMESPACE_BODY,FOLLOW_NAMESPACE_BODY_in_namespaceBody130); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:75:31: (statements+= statement )*
						loop2:
						do {
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==Break||LA2_0==CONSTANT_DECLARATION_LIST||LA2_0==Class||LA2_0==Continue||LA2_0==EXPRESSION||LA2_0==Echo||LA2_0==For||LA2_0==Function||LA2_0==If||LA2_0==Interface||LA2_0==Return||LA2_0==Switch||LA2_0==Throw||LA2_0==Use||LA2_0==VARIABLE_DECLARATION_LIST) ) {
								alt2=1;
							}

							switch (alt2) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:75:31: statements+= statement
								{
								pushFollow(FOLLOW_statement_in_namespaceBody134);
								statements=statement();
								state._fsp--;
								if (state.failed) return retval;
								if (list_statements==null) list_statements=new ArrayList<Object>();
								list_statements.add(statements.getTemplate());
								}
								break;

							default :
								break loop2;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 75:45: -> body(statements=$statements)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_statements));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:4: NAMESPACE_BODY
					{
					match(input,NAMESPACE_BODY,FOLLOW_NAMESPACE_BODY_in_namespaceBody150); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 76:19: -> body(statements=null)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", null));
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:79:1: statement : ( useDeclarationList -> {$useDeclarationList.st}| definition -> {$definition.st}| instruction -> {$instruction.st});
	public final PHP54TranslatorWalker.statement_return statement() throws RecognitionException {
		PHP54TranslatorWalker.statement_return retval = new PHP54TranslatorWalker.statement_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope useDeclarationList2 =null;
		TreeRuleReturnScope definition3 =null;
		TreeRuleReturnScope instruction4 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:80:2: ( useDeclarationList -> {$useDeclarationList.st}| definition -> {$definition.st}| instruction -> {$instruction.st})
			int alt4=3;
			switch ( input.LA(1) ) {
			case Use:
				{
				alt4=1;
				}
				break;
			case CONSTANT_DECLARATION_LIST:
			case Class:
			case Function:
			case Interface:
				{
				alt4=2;
				}
				break;
			case Break:
			case Continue:
			case EXPRESSION:
			case Echo:
			case For:
			case If:
			case Return:
			case Switch:
			case Throw:
			case VARIABLE_DECLARATION_LIST:
				{
				alt4=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:80:4: useDeclarationList
					{
					pushFollow(FOLLOW_useDeclarationList_in_statement170);
					useDeclarationList2=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 80:23: -> {$useDeclarationList.st}
					  {
					  	retval.st = (useDeclarationList2!=null?((StringTemplate)useDeclarationList2.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:81:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement179);
					definition3=definition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 81:15: -> {$definition.st}
					  {
					  	retval.st = (definition3!=null?((StringTemplate)definition3.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:82:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_statement188);
					instruction4=instruction();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 82:16: -> {$instruction.st}
					  {
					  	retval.st = (instruction4!=null?((StringTemplate)instruction4.getTemplate()):null);
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:85:1: useDeclarationList : ^( 'use' ( useDeclaration )+ ) -> useDeclarationList(useDeclarations=$useDeclaration.st);
	public final PHP54TranslatorWalker.useDeclarationList_return useDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.useDeclarationList_return retval = new PHP54TranslatorWalker.useDeclarationList_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope useDeclaration5 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:86:2: ( ^( 'use' ( useDeclaration )+ ) -> useDeclarationList(useDeclarations=$useDeclaration.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:86:4: ^( 'use' ( useDeclaration )+ )
			{
			match(input,Use,FOLLOW_Use_in_useDeclarationList205); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:86:12: ( useDeclaration )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:86:12: useDeclaration
					{
					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList207);
					useDeclaration5=useDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(5, input);
						throw eee;
				}
				cnt5++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 87:3: -> useDeclarationList(useDeclarations=$useDeclaration.st)
			  {
			  	retval.st = templateLib.getInstanceOf("useDeclarationList",new STAttrMap().put("useDeclarations", (useDeclaration5!=null?((StringTemplate)useDeclaration5.getTemplate()):null)));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:90:1: useDeclaration : ^( USE_DECLARATION TYPE_NAME Identifier ) -> useDeclaration(type=$TYPE_NAMEalias=$Identifier);
	public final PHP54TranslatorWalker.useDeclaration_return useDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.useDeclaration_return retval = new PHP54TranslatorWalker.useDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME6=null;
		ITSPHPAst Identifier7=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:91:2: ( ^( USE_DECLARATION TYPE_NAME Identifier ) -> useDeclaration(type=$TYPE_NAMEalias=$Identifier))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:91:4: ^( USE_DECLARATION TYPE_NAME Identifier )
			{
			match(input,USE_DECLARATION,FOLLOW_USE_DECLARATION_in_useDeclaration233); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			TYPE_NAME6=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_useDeclaration235); if (state.failed) return retval;
			Identifier7=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration237); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 92:3: -> useDeclaration(type=$TYPE_NAMEalias=$Identifier)
			  {
			  	retval.st = templateLib.getInstanceOf("useDeclaration",new STAttrMap().put("type", TYPE_NAME6).put("alias", Identifier7));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:95:1: definition : ( classDeclaration -> {$classDeclaration.st}| interfaceDeclaration -> {$interfaceDeclaration.st}| functionDeclaration -> {$functionDeclaration.st}| constDeclarationList -> {$constDeclarationList.st});
	public final PHP54TranslatorWalker.definition_return definition() throws RecognitionException {
		PHP54TranslatorWalker.definition_return retval = new PHP54TranslatorWalker.definition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope classDeclaration8 =null;
		TreeRuleReturnScope interfaceDeclaration9 =null;
		TreeRuleReturnScope functionDeclaration10 =null;
		TreeRuleReturnScope constDeclarationList11 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:96:2: ( classDeclaration -> {$classDeclaration.st}| interfaceDeclaration -> {$interfaceDeclaration.st}| functionDeclaration -> {$functionDeclaration.st}| constDeclarationList -> {$constDeclarationList.st})
			int alt6=4;
			switch ( input.LA(1) ) {
			case Class:
				{
				alt6=1;
				}
				break;
			case Interface:
				{
				alt6=2;
				}
				break;
			case Function:
				{
				alt6=3;
				}
				break;
			case CONSTANT_DECLARATION_LIST:
				{
				alt6=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:96:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition266);
					classDeclaration8=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 96:22: -> {$classDeclaration.st}
					  {
					  	retval.st = (classDeclaration8!=null?((StringTemplate)classDeclaration8.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:97:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition276);
					interfaceDeclaration9=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 97:26: -> {$interfaceDeclaration.st}
					  {
					  	retval.st = (interfaceDeclaration9!=null?((StringTemplate)interfaceDeclaration9.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:98:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition286);
					functionDeclaration10=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 98:25: -> {$functionDeclaration.st}
					  {
					  	retval.st = (functionDeclaration10!=null?((StringTemplate)functionDeclaration10.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:99:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_definition296);
					constDeclarationList11=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 99:26: -> {$constDeclarationList.st}
					  {
					  	retval.st = (constDeclarationList11!=null?((StringTemplate)constDeclarationList11.getTemplate()):null);
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:102:1: classDeclaration : ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody ) -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st);
	public final PHP54TranslatorWalker.classDeclaration_return classDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.classDeclaration_return retval = new PHP54TranslatorWalker.classDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier13=null;
		TreeRuleReturnScope classModifier12 =null;
		TreeRuleReturnScope extendsDeclaration14 =null;
		TreeRuleReturnScope implementsDeclaration15 =null;
		TreeRuleReturnScope classBody16 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:103:2: ( ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody ) -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:103:4: ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody )
			{
			match(input,Class,FOLLOW_Class_in_classDeclaration314); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_classModifier_in_classDeclaration316);
			classModifier12=classModifier();
			state._fsp--;
			if (state.failed) return retval;
			Identifier13=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration318); if (state.failed) return retval;
			pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration320);
			extendsDeclaration14=extendsDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration322);
			implementsDeclaration15=implementsDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_classBody_in_classDeclaration324);
			classBody16=classBody();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 104:3: -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st)
			  {
			  	retval.st = templateLib.getInstanceOf("class",new STAttrMap().put("modifier", (classModifier12!=null?((StringTemplate)classModifier12.getTemplate()):null)).put("identifier", Identifier13).put("ext", (extendsDeclaration14!=null?((StringTemplate)extendsDeclaration14.getTemplate()):null)).put("impl", (implementsDeclaration15!=null?((StringTemplate)implementsDeclaration15.getTemplate()):null)).put("body", (classBody16!=null?((StringTemplate)classBody16.getTemplate()):null)));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:112:1: classModifier : ( ^( CLASS_MODIFIER list+= classModifierNames ) -> modifier(modifiers=$list)| CLASS_MODIFIER -> {null});
	public final PHP54TranslatorWalker.classModifier_return classModifier() throws RecognitionException {
		PHP54TranslatorWalker.classModifier_return retval = new PHP54TranslatorWalker.classModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:113:2: ( ^( CLASS_MODIFIER list+= classModifierNames ) -> modifier(modifiers=$list)| CLASS_MODIFIER -> {null})
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:113:4: ^( CLASS_MODIFIER list+= classModifierNames )
					{
					match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_classModifier388); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_classModifierNames_in_classModifier392);
					list=classModifierNames();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 113:47: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:114:4: CLASS_MODIFIER
					{
					match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_classModifier407); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 114:19: -> {null}
					  {
					  	retval.st = null;
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:117:1: classModifierNames : ( Final | Abstract );
	public final PHP54TranslatorWalker.classModifierNames_return classModifierNames() throws RecognitionException {
		PHP54TranslatorWalker.classModifierNames_return retval = new PHP54TranslatorWalker.classModifierNames_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:119:2: ( Final | Abstract )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:
			{
			if ( input.LA(1)==Abstract||input.LA(1)==Final ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			if ( state.backtracking==0 ) {retval.st = new StringTemplate(templateLib,input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:123:1: extendsDeclaration : ( ^( 'extends' (identifiers+= TYPE_NAME )+ ) -> extends(identifiers=$identifiers)| 'extends' -> {null});
	public final PHP54TranslatorWalker.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.extendsDeclaration_return retval = new PHP54TranslatorWalker.extendsDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifiers=null;
		List<Object> list_identifiers=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:124:2: ( ^( 'extends' (identifiers+= TYPE_NAME )+ ) -> extends(identifiers=$identifiers)| 'extends' -> {null})
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==Extends) ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1==DOWN) ) {
					alt9=1;
				}
				else if ( (LA9_1==INTERFACE_BODY||LA9_1==Implements) ) {
					alt9=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:124:4: ^( 'extends' (identifiers+= TYPE_NAME )+ )
					{
					match(input,Extends,FOLLOW_Extends_in_extendsDeclaration446); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:124:27: (identifiers+= TYPE_NAME )+
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:124:27: identifiers+= TYPE_NAME
							{
							identifiers=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_extendsDeclaration450); if (state.failed) return retval;
							if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
							list_identifiers.add(identifiers);
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(8, input);
								throw eee;
						}
						cnt8++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 124:41: -> extends(identifiers=$identifiers)
					  {
					  	retval.st = templateLib.getInstanceOf("extends",new STAttrMap().put("identifiers", list_identifiers));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:4: 'extends'
					{
					match(input,Extends,FOLLOW_Extends_in_extendsDeclaration466); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 125:18: -> {null}
					  {
					  	retval.st = null;
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:129:1: implementsDeclaration : ( ^( 'implements' (identifiers+= TYPE_NAME )+ ) -> impl(identifiers=$identifiers)| 'implements' -> {null});
	public final PHP54TranslatorWalker.implementsDeclaration_return implementsDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.implementsDeclaration_return retval = new PHP54TranslatorWalker.implementsDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifiers=null;
		List<Object> list_identifiers=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:2: ( ^( 'implements' (identifiers+= TYPE_NAME )+ ) -> impl(identifiers=$identifiers)| 'implements' -> {null})
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}
			switch (alt11) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:4: ^( 'implements' (identifiers+= TYPE_NAME )+ )
					{
					match(input,Implements,FOLLOW_Implements_in_implementsDeclaration487); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:30: (identifiers+= TYPE_NAME )+
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:30: identifiers+= TYPE_NAME
							{
							identifiers=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_implementsDeclaration491); if (state.failed) return retval;
							if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
							list_identifiers.add(identifiers);
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(10, input);
								throw eee;
						}
						cnt10++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 130:44: -> impl(identifiers=$identifiers)
					  {
					  	retval.st = templateLib.getInstanceOf("impl",new STAttrMap().put("identifiers", list_identifiers));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:131:4: 'implements'
					{
					match(input,Implements,FOLLOW_Implements_in_implementsDeclaration507); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 131:21: -> {null}
					  {
					  	retval.st = null;
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:134:1: classBody : ( ^( CLASS_BODY (def+= classBodyDefinition )* ) -> body(statements=$def)| CLASS_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.classBody_return classBody() throws RecognitionException {
		PHP54TranslatorWalker.classBody_return retval = new PHP54TranslatorWalker.classBody_return();
		retval.start = input.LT(1);

		List<Object> list_def=null;
		RuleReturnScope def = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:135:2: ( ^( CLASS_BODY (def+= classBodyDefinition )* ) -> body(statements=$def)| CLASS_BODY -> body(statements=null))
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:135:4: ^( CLASS_BODY (def+= classBodyDefinition )* )
					{
					match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_classBody528); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:135:20: (def+= classBodyDefinition )*
						loop12:
						do {
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==CLASS_MEMBER||LA12_0==CONSTANT_DECLARATION_LIST||LA12_0==Construct||LA12_0==METHOD_DECLARATION) ) {
								alt12=1;
							}

							switch (alt12) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:135:20: def+= classBodyDefinition
								{
								pushFollow(FOLLOW_classBodyDefinition_in_classBody532);
								def=classBodyDefinition();
								state._fsp--;
								if (state.failed) return retval;
								if (list_def==null) list_def=new ArrayList<Object>();
								list_def.add(def.getTemplate());
								}
								break;

							default :
								break loop12;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 135:44: -> body(statements=$def)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_def));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:136:4: CLASS_BODY
					{
					match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_classBody548); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 136:15: -> body(statements=null)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", null));
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:139:1: classBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| abstractConstructDeclaration -> {$abstractConstructDeclaration.st}| constructDeclaration -> {$constructDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st});
	public final PHP54TranslatorWalker.classBodyDefinition_return classBodyDefinition() throws RecognitionException {
		PHP54TranslatorWalker.classBodyDefinition_return retval = new PHP54TranslatorWalker.classBodyDefinition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope constDeclarationList17 =null;
		TreeRuleReturnScope classMemberDeclaration18 =null;
		TreeRuleReturnScope abstractConstructDeclaration19 =null;
		TreeRuleReturnScope constructDeclaration20 =null;
		TreeRuleReturnScope abstractMethodDeclaration21 =null;
		TreeRuleReturnScope methodDeclaration22 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:140:2: ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| abstractConstructDeclaration -> {$abstractConstructDeclaration.st}| constructDeclaration -> {$constructDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st})
			int alt14=6;
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
				int LA14_3 = input.LA(2);
				if ( (LA14_3==DOWN) ) {
					int LA14_5 = input.LA(3);
					if ( (LA14_5==METHOD_MODIFIER) ) {
						int LA14_7 = input.LA(4);
						if ( (LA14_7==DOWN) ) {
							switch ( input.LA(5) ) {
							case Abstract:
								{
								alt14=3;
								}
								break;
							case Private:
								{
								int LA14_12 = input.LA(6);
								if ( (LA14_12==Abstract) ) {
									alt14=3;
								}
								else if ( (LA14_12==UP||LA14_12==Final||LA14_12==Static) ) {
									alt14=4;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 12, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case Protected:
								{
								int LA14_13 = input.LA(6);
								if ( (LA14_13==Abstract) ) {
									alt14=3;
								}
								else if ( (LA14_13==UP||LA14_13==Final||LA14_13==Static) ) {
									alt14=4;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 13, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case Public:
								{
								int LA14_14 = input.LA(6);
								if ( (LA14_14==Abstract) ) {
									alt14=3;
								}
								else if ( (LA14_14==UP||LA14_14==Final||LA14_14==Static) ) {
									alt14=4;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 14, input);
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
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 14, 9, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
			case METHOD_DECLARATION:
				{
				int LA14_4 = input.LA(2);
				if ( (LA14_4==DOWN) ) {
					int LA14_6 = input.LA(3);
					if ( (LA14_6==METHOD_MODIFIER) ) {
						int LA14_8 = input.LA(4);
						if ( (LA14_8==DOWN) ) {
							switch ( input.LA(5) ) {
							case Abstract:
								{
								alt14=5;
								}
								break;
							case Private:
								{
								int LA14_17 = input.LA(6);
								if ( (LA14_17==Abstract) ) {
									alt14=5;
								}
								else if ( (LA14_17==UP||LA14_17==Final||LA14_17==Static) ) {
									alt14=6;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 17, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case Protected:
								{
								int LA14_18 = input.LA(6);
								if ( (LA14_18==Abstract) ) {
									alt14=5;
								}
								else if ( (LA14_18==UP||LA14_18==Final||LA14_18==Static) ) {
									alt14=6;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
								}
								break;
							case Public:
								{
								int LA14_19 = input.LA(6);
								if ( (LA14_19==Abstract) ) {
									alt14=5;
								}
								else if ( (LA14_19==UP||LA14_19==Final||LA14_19==Static) ) {
									alt14=6;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 14, 19, input);
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
								alt14=6;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 14, 10, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 14, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:140:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_classBodyDefinition569);
					constDeclarationList17=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 140:27: -> {$constDeclarationList.st}
					  {
					  	retval.st = (constDeclarationList17!=null?((StringTemplate)constDeclarationList17.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:141:4: classMemberDeclaration
					{
					pushFollow(FOLLOW_classMemberDeclaration_in_classBodyDefinition580);
					classMemberDeclaration18=classMemberDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 141:28: -> {$classMemberDeclaration.st}
					  {
					  	retval.st = (classMemberDeclaration18!=null?((StringTemplate)classMemberDeclaration18.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:142:4: abstractConstructDeclaration
					{
					pushFollow(FOLLOW_abstractConstructDeclaration_in_classBodyDefinition590);
					abstractConstructDeclaration19=abstractConstructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 142:34: -> {$abstractConstructDeclaration.st}
					  {
					  	retval.st = (abstractConstructDeclaration19!=null?((StringTemplate)abstractConstructDeclaration19.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:143:4: constructDeclaration
					{
					pushFollow(FOLLOW_constructDeclaration_in_classBodyDefinition600);
					constructDeclaration20=constructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 143:27: -> {$constructDeclaration.st}
					  {
					  	retval.st = (constructDeclaration20!=null?((StringTemplate)constructDeclaration20.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:144:4: abstractMethodDeclaration
					{
					pushFollow(FOLLOW_abstractMethodDeclaration_in_classBodyDefinition611);
					abstractMethodDeclaration21=abstractMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 144:31: -> {$abstractMethodDeclaration.st}
					  {
					  	retval.st = (abstractMethodDeclaration21!=null?((StringTemplate)abstractMethodDeclaration21.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:145:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBodyDefinition621);
					methodDeclaration22=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 145:24: -> {$methodDeclaration.st}
					  {
					  	retval.st = (methodDeclaration22!=null?((StringTemplate)methodDeclaration22.getTemplate()):null);
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:148:1: constDeclarationList : ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ ) -> const(identifiers=$identifiers);
	public final PHP54TranslatorWalker.constDeclarationList_return constDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.constDeclarationList_return retval = new PHP54TranslatorWalker.constDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_identifiers=null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:149:2: ( ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ ) -> const(identifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:149:4: ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ )
			{
			match(input,CONSTANT_DECLARATION_LIST,FOLLOW_CONSTANT_DECLARATION_LIST_in_constDeclarationList640); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_constDeclarationList647); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_constDeclarationList650); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,Public,FOLLOW_Public_in_constDeclarationList652); if (state.failed) return retval;
			match(input,Static,FOLLOW_Static_in_constDeclarationList654); if (state.failed) return retval;
			match(input,Final,FOLLOW_Final_in_constDeclarationList656); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_scalarTypes_in_constDeclarationList659);
			scalarTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:151:15: (identifiers+= constantAssignment )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:151:15: identifiers+= constantAssignment
					{
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList667);
					identifiers=constantAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
					list_identifiers.add(identifiers.getTemplate());
					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(15, input);
						throw eee;
				}
				cnt15++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 153:3: -> const(identifiers=$identifiers)
			  {
			  	retval.st = templateLib.getInstanceOf("const",new STAttrMap().put("identifiers", list_identifiers));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:156:1: constantAssignment : ^( Identifier v= Int ) -> assign(id=$Identifiervalue=v);
	public final PHP54TranslatorWalker.constantAssignment_return constantAssignment() throws RecognitionException {
		PHP54TranslatorWalker.constantAssignment_return retval = new PHP54TranslatorWalker.constantAssignment_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst Identifier23=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:157:2: ( ^( Identifier v= Int ) -> assign(id=$Identifiervalue=v))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:157:4: ^( Identifier v= Int )
			{
			Identifier23=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment697); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_constantAssignment701); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 158:4: -> assign(id=$Identifiervalue=v)
			  {
			  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", Identifier23).put("value", v));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:161:1: scalarTypes : ( 'bool' | 'int' | 'float' | 'string' );
	public final PHP54TranslatorWalker.scalarTypes_return scalarTypes() throws RecognitionException {
		PHP54TranslatorWalker.scalarTypes_return retval = new PHP54TranslatorWalker.scalarTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:163:2: ( 'bool' | 'int' | 'float' | 'string' )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:
			{
			if ( (input.LA(1) >= TypeBool && input.LA(1) <= TypeInt)||input.LA(1)==TypeString ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			if ( state.backtracking==0 ) {retval.st = new StringTemplate(templateLib,input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(retval.start),input.getTreeAdaptor().getTokenStopIndex(retval.start)));}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:169:1: classMemberDeclaration : ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st};
	public final PHP54TranslatorWalker.classMemberDeclaration_return classMemberDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.classMemberDeclaration_return retval = new PHP54TranslatorWalker.classMemberDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope variableDeclarationList24 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:170:2: ( ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:170:4: ^( CLASS_MEMBER variableDeclarationList )
			{
			match(input,CLASS_MEMBER,FOLLOW_CLASS_MEMBER_in_classMemberDeclaration762); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclarationList_in_classMemberDeclaration764);
			variableDeclarationList24=variableDeclarationList();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 170:44: -> {$variableDeclarationList.st}
			  {
			  	retval.st = (variableDeclarationList24!=null?((StringTemplate)variableDeclarationList24.getTemplate()):null);
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:1: variableDeclarationList : ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers);
	public final PHP54TranslatorWalker.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclarationList_return retval = new PHP54TranslatorWalker.variableDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_identifiers=null;
		TreeRuleReturnScope typeModifier25 =null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:174:2: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:174:4: ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ )
			{
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList782); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_variableDeclarationList789); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_variableDeclarationList791);
			typeModifier25=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_allTypes_in_variableDeclarationList793);
			allTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:176:15: (identifiers+= variableDeclaration )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:176:15: identifiers+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList802);
					identifiers=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
					list_identifiers.add(identifiers.getTemplate());
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(16, input);
						throw eee;
				}
				cnt16++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 178:3: -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers)
			  {
			  	retval.st = templateLib.getInstanceOf("variableDeclarationList",new STAttrMap().put("modifier", (typeModifier25!=null?((StringTemplate)typeModifier25.getTemplate()):null)).put("identifiers", list_identifiers));
			  }


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


	public static class localVariableDeclarationList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "localVariableDeclarationList"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:181:1: localVariableDeclarationList : ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= localVariableDeclaration[$typeModifier.st] )+ ) -> localVariableDeclarationList(variables=$variables);
	public final PHP54TranslatorWalker.localVariableDeclarationList_return localVariableDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.localVariableDeclarationList_return retval = new PHP54TranslatorWalker.localVariableDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_variables=null;
		TreeRuleReturnScope typeModifier26 =null;
		RuleReturnScope variables = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:2: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= localVariableDeclaration[$typeModifier.st] )+ ) -> localVariableDeclarationList(variables=$variables))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:4: ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= localVariableDeclaration[$typeModifier.st] )+ )
			{
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_localVariableDeclarationList835); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_localVariableDeclarationList842); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_localVariableDeclarationList844);
			typeModifier26=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_allTypes_in_localVariableDeclarationList846);
			allTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:184:13: (variables+= localVariableDeclaration[$typeModifier.st] )+
			int cnt17=0;
			loop17:
			do {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==VariableId) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:184:13: variables+= localVariableDeclaration[$typeModifier.st]
					{
					pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationList855);
					variables=localVariableDeclaration((typeModifier26!=null?((StringTemplate)typeModifier26.getTemplate()):null));
					state._fsp--;
					if (state.failed) return retval;
					if (list_variables==null) list_variables=new ArrayList<Object>();
					list_variables.add(variables.getTemplate());
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(17, input);
						throw eee;
				}
				cnt17++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 186:3: -> localVariableDeclarationList(variables=$variables)
			  {
			  	retval.st = templateLib.getInstanceOf("localVariableDeclarationList",new STAttrMap().put("variables", list_variables));
			  }


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
	// $ANTLR end "localVariableDeclarationList"


	public static class typeModifier_return extends TreeRuleReturnScope {
		public boolean isCast;
		public boolean isNullable;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:189:1: typeModifier returns [boolean isCast, boolean isNullable] : ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null});
	public final PHP54TranslatorWalker.typeModifier_return typeModifier() throws RecognitionException {
		PHP54TranslatorWalker.typeModifier_return retval = new PHP54TranslatorWalker.typeModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst cast=null;
		ITSPHPAst nullable=null;
		TreeRuleReturnScope variableModifier27 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:2: ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null})
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==TYPE_MODIFIER) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==DOWN) ) {
					alt21=1;
				}
				else if ( (LA21_1==TYPE_NAME||(LA21_1 >= TypeArray && LA21_1 <= TypeString)||LA21_1==Void) ) {
					alt21=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:4: ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? )
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier888); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:24: (cast= Cast )?
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==Cast) ) {
							alt18=1;
						}
						switch (alt18) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:24: cast= Cast
								{
								cast=(ITSPHPAst)match(input,Cast,FOLLOW_Cast_in_typeModifier892); if (state.failed) return retval;
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:39: (nullable= '?' )?
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==QuestionMark) ) {
							alt19=1;
						}
						switch (alt19) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:39: nullable= '?'
								{
								nullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_typeModifier897); if (state.failed) return retval;
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:45: ( variableModifier )?
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==Private||(LA20_0 >= Protected && LA20_0 <= Public)||LA20_0==Static) ) {
							alt20=1;
						}
						switch (alt20) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:45: variableModifier
								{
								pushFollow(FOLLOW_variableModifier_in_typeModifier900);
								variableModifier27=variableModifier();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					if ( state.backtracking==0 ) {retval.isCast =cast!=null; retval.isNullable =nullable!=null;}
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 190:114: -> {$variableModifier.st}
					  {
					  	retval.st = (variableModifier27!=null?((StringTemplate)variableModifier27.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:191:4: TYPE_MODIFIER
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier913); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 191:18: -> {null}
					  {
					  	retval.st = null;
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:194:1: variableModifier : (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st});
	public final PHP54TranslatorWalker.variableModifier_return variableModifier() throws RecognitionException {
		PHP54TranslatorWalker.variableModifier_return retval = new PHP54TranslatorWalker.variableModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		TreeRuleReturnScope accessModifier28 =null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:195:2: (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st})
			int alt22=3;
			switch ( input.LA(1) ) {
			case Static:
				{
				alt22=1;
				}
				break;
			case Private:
				{
				int LA22_2 = input.LA(2);
				if ( (LA22_2==Static) ) {
					alt22=2;
				}
				else if ( (LA22_2==UP) ) {
					alt22=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Protected:
				{
				int LA22_3 = input.LA(2);
				if ( (LA22_3==Static) ) {
					alt22=2;
				}
				else if ( (LA22_3==UP) ) {
					alt22=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Public:
				{
				int LA22_4 = input.LA(2);
				if ( (LA22_4==Static) ) {
					alt22=2;
				}
				else if ( (LA22_4==UP) ) {
					alt22=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:195:4: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_variableModifier931);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_variableModifier935);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 195:43: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:4: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier951);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_variableModifier955);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 196:43: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:197:4: accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier969);
					accessModifier28=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 197:19: -> {$accessModifier.st}
					  {
					  	retval.st = (accessModifier28!=null?((StringTemplate)accessModifier28.getTemplate()):null);
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:200:1: staticToken : Static -> {%{$Static.text}};
	public final PHP54TranslatorWalker.staticToken_return staticToken() throws RecognitionException {
		PHP54TranslatorWalker.staticToken_return retval = new PHP54TranslatorWalker.staticToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Static29=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:201:2: ( Static -> {%{$Static.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:201:4: Static
			{
			Static29=(ITSPHPAst)match(input,Static,FOLLOW_Static_in_staticToken985); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 201:11: -> {%{$Static.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Static29!=null?Static29.getText():null));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:204:1: accessModifier : ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}});
	public final PHP54TranslatorWalker.accessModifier_return accessModifier() throws RecognitionException {
		PHP54TranslatorWalker.accessModifier_return retval = new PHP54TranslatorWalker.accessModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst Private30=null;
		ITSPHPAst Protected31=null;
		ITSPHPAst Public32=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:205:2: ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}})
			int alt23=3;
			switch ( input.LA(1) ) {
			case Private:
				{
				alt23=1;
				}
				break;
			case Protected:
				{
				alt23=2;
				}
				break;
			case Public:
				{
				alt23=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:205:4: Private
					{
					Private30=(ITSPHPAst)match(input,Private,FOLLOW_Private_in_accessModifier1001); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 205:12: -> {%{$Private.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Private30!=null?Private30.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:206:4: Protected
					{
					Protected31=(ITSPHPAst)match(input,Protected,FOLLOW_Protected_in_accessModifier1010); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 206:14: -> {%{$Protected.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Protected31!=null?Protected31.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:207:4: Public
					{
					Public32=(ITSPHPAst)match(input,Public,FOLLOW_Public_in_accessModifier1019); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 207:11: -> {%{$Public.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Public32!=null?Public32.getText():null));
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:210:1: variableDeclaration : ( ^( VariableId expression ) -> assign(id=$VariableIdvalue=$expression.st)| VariableId -> {%{$VariableId.text}});
	public final PHP54TranslatorWalker.variableDeclaration_return variableDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclaration_return retval = new PHP54TranslatorWalker.variableDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst VariableId33=null;
		ITSPHPAst VariableId35=null;
		TreeRuleReturnScope expression34 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:211:2: ( ^( VariableId expression ) -> assign(id=$VariableIdvalue=$expression.st)| VariableId -> {%{$VariableId.text}})
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==VariableId) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==DOWN) ) {
					alt24=1;
				}
				else if ( (LA24_1==UP||LA24_1==VariableId) ) {
					alt24=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 24, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:211:4: ^( VariableId expression )
					{
					VariableId33=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1035); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_variableDeclaration1037);
					expression34=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 211:29: -> assign(id=$VariableIdvalue=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", VariableId33).put("value", (expression34!=null?((StringTemplate)expression34.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:212:4: VariableId
					{
					VariableId35=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1056); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 212:15: -> {%{$VariableId.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(VariableId35!=null?VariableId35.getText():null));
					  }


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


	public static class localVariableDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "localVariableDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:215:1: localVariableDeclaration[StringTemplate modifier] : ( ^( VariableId v= expression ) -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)| VariableId -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=null));
	public final PHP54TranslatorWalker.localVariableDeclaration_return localVariableDeclaration(StringTemplate modifier) throws RecognitionException {
		PHP54TranslatorWalker.localVariableDeclaration_return retval = new PHP54TranslatorWalker.localVariableDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst VariableId36=null;
		ITSPHPAst VariableId37=null;
		TreeRuleReturnScope v =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:2: ( ^( VariableId v= expression ) -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)| VariableId -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=null))
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==VariableId) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==DOWN) ) {
					alt25=1;
				}
				else if ( (LA25_1==UP||LA25_1==VariableId) ) {
					alt25=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:4: ^( VariableId v= expression )
					{
					VariableId36=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_localVariableDeclaration1074); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_localVariableDeclaration1078);
					v=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 216:31: -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)
					  {
					  	retval.st = templateLib.getInstanceOf("localVariableDeclaration",new STAttrMap().put("modifier", modifier).put("variableId", (VariableId36!=null?VariableId36.getText():null)).put("initValue", v));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:217:4: VariableId
					{
					VariableId37=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_localVariableDeclaration1103); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 217:15: -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=null)
					  {
					  	retval.st = templateLib.getInstanceOf("localVariableDeclaration",new STAttrMap().put("modifier", modifier).put("variableId", (VariableId37!=null?VariableId37.getText():null)).put("initValue", null));
					  }


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
	// $ANTLR end "localVariableDeclaration"


	public static class allTypes_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:220:1: allTypes : ( primitiveTypes | TYPE_NAME );
	public final PHP54TranslatorWalker.allTypes_return allTypes() throws RecognitionException {
		PHP54TranslatorWalker.allTypes_return retval = new PHP54TranslatorWalker.allTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:221:2: ( primitiveTypes | TYPE_NAME )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( ((LA26_0 >= TypeArray && LA26_0 <= TypeString)) ) {
				alt26=1;
			}
			else if ( (LA26_0==TYPE_NAME) ) {
				alt26=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:221:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_allTypes1133);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:222:4: TYPE_NAME
					{
					match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_allTypes1138); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:225:1: primitiveTypes : ( scalarTypes | TypeArray | TypeResource | TypeObject );
	public final PHP54TranslatorWalker.primitiveTypes_return primitiveTypes() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypes_return retval = new PHP54TranslatorWalker.primitiveTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:226:2: ( scalarTypes | TypeArray | TypeResource | TypeObject )
			int alt27=4;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeString:
				{
				alt27=1;
				}
				break;
			case TypeArray:
				{
				alt27=2;
				}
				break;
			case TypeResource:
				{
				alt27=3;
				}
				break;
			case TypeObject:
				{
				alt27=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:226:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypes1150);
					scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:227:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypes1156); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:228:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypes1162); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:229:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypes1168); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:232:1: primitiveTypesWithoutArray : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}});
	public final PHP54TranslatorWalker.primitiveTypesWithoutArray_return primitiveTypesWithoutArray() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypesWithoutArray_return retval = new PHP54TranslatorWalker.primitiveTypesWithoutArray_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource39=null;
		ITSPHPAst TypeObject40=null;
		TreeRuleReturnScope scalarTypes38 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:233:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}})
			int alt28=3;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeString:
				{
				alt28=1;
				}
				break;
			case TypeResource:
				{
				alt28=2;
				}
				break;
			case TypeObject:
				{
				alt28=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:233:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1181);
					scalarTypes38=scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 233:16: -> {$scalarTypes.st}
					  {
					  	retval.st = (scalarTypes38!=null?((StringTemplate)scalarTypes38.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:234:4: TypeResource
					{
					TypeResource39=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesWithoutArray1190); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 234:17: -> {%{$TypeResource.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeResource39!=null?TypeResource39.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:235:4: TypeObject
					{
					TypeObject40=(ITSPHPAst)match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypesWithoutArray1199); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 235:15: -> {%{$TypeObject.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeObject40!=null?TypeObject40.getText():null));
					  }


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


	public static class abstractConstructDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "abstractConstructDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:238:1: abstractConstructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.abstractConstructDeclaration_return abstractConstructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractConstructDeclaration_return retval = new PHP54TranslatorWalker.abstractConstructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope abstractMethodModifier41 =null;
		TreeRuleReturnScope formalParameters42 =null;
		TreeRuleReturnScope block43 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:239:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:239:4: ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_abstractConstructDeclaration1218); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractConstructDeclaration1225); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractConstructDeclaration1227);
			abstractMethodModifier41=abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_abstractConstructDeclaration1234); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_abstractConstructDeclaration1236);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_abstractConstructDeclaration1238);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_abstractConstructDeclaration1244);
			formalParameters42=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_abstractConstructDeclaration1249);
			block43=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 245:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", (abstractMethodModifier41!=null?((StringTemplate)abstractMethodModifier41.getTemplate()):null)).put("identifier", identifier).put("params", (formalParameters42!=null?((StringTemplate)formalParameters42.getTemplate()):null)).put("body", (block43!=null?((PHP54TranslatorWalker.block_return)block43).instructions:null)));
			  }


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
	// $ANTLR end "abstractConstructDeclaration"


	public static class constructDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "constructDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:253:1: constructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.constructDeclaration_return constructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.constructDeclaration_return retval = new PHP54TranslatorWalker.constructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope methodModifier44 =null;
		TreeRuleReturnScope formalParameters45 =null;
		TreeRuleReturnScope block46 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:254:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:254:4: ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_constructDeclaration1311); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_constructDeclaration1318); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_methodModifier_in_constructDeclaration1320);
			methodModifier44=methodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_constructDeclaration1327); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_constructDeclaration1329);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_constructDeclaration1331);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_constructDeclaration1337);
			formalParameters45=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_constructDeclaration1342);
			block46=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 260:3: -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier44!=null?((StringTemplate)methodModifier44.getTemplate()):null)).put("identifier", identifier).put("params", (formalParameters45!=null?((StringTemplate)formalParameters45.getTemplate()):null)).put("body", (block46!=null?((PHP54TranslatorWalker.block_return)block46).instructions:null)));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:268:1: abstractMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.abstractMethodDeclaration_return abstractMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodDeclaration_return retval = new PHP54TranslatorWalker.abstractMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope abstractMethodModifier47 =null;
		TreeRuleReturnScope formalParameters48 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:269:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:269:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1401); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1407); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1409);
			abstractMethodModifier47=abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_abstractMethodDeclaration1416); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_abstractMethodDeclaration1418);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_abstractMethodDeclaration1420);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:272:4: (identfier= Identifier |identfier= Destruct )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==Identifier) ) {
				alt29=1;
			}
			else if ( (LA29_0==Destruct) ) {
				alt29=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:272:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_abstractMethodDeclaration1429); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:272:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_abstractMethodDeclaration1433); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_abstractMethodDeclaration1439);
			formalParameters48=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input,BLOCK,FOLLOW_BLOCK_in_abstractMethodDeclaration1444); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 276:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", (abstractMethodModifier47!=null?((StringTemplate)abstractMethodModifier47.getTemplate()):null)).put("identifier", identfier).put("params", (formalParameters48!=null?((StringTemplate)formalParameters48.getTemplate()):null)));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:283:1: abstractMethodModifier : (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.abstractMethodModifier_return abstractMethodModifier() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodModifier_return retval = new PHP54TranslatorWalker.abstractMethodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:284:2: ( (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:284:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:284:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==Abstract) ) {
				alt30=1;
			}
			else if ( (LA30_0==Private||(LA30_0 >= Protected && LA30_0 <= Public)) ) {
				alt30=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:284:6: list+= abstractToken list+= accessModifier
					{
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1498);
					list=abstractToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1502);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:285:5: list+= accessModifier list+= abstractToken
					{
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1511);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1515);
					list=abstractToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 287:3: -> modifier(modifiers=$list)
			  {
			  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:290:1: abstractToken : Abstract -> {%{$Abstract.text}};
	public final PHP54TranslatorWalker.abstractToken_return abstractToken() throws RecognitionException {
		PHP54TranslatorWalker.abstractToken_return retval = new PHP54TranslatorWalker.abstractToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Abstract49=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:291:2: ( Abstract -> {%{$Abstract.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:291:4: Abstract
			{
			Abstract49=(ITSPHPAst)match(input,Abstract,FOLLOW_Abstract_in_abstractToken1541); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 291:13: -> {%{$Abstract.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Abstract49!=null?Abstract49.getText():null));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:294:1: methodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.methodDeclaration_return methodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.methodDeclaration_return retval = new PHP54TranslatorWalker.methodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope methodModifier50 =null;
		TreeRuleReturnScope formalParameters51 =null;
		TreeRuleReturnScope block52 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:295:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:295:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_methodDeclaration1557); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_methodDeclaration1563); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_methodModifier_in_methodDeclaration1565);
			methodModifier50=methodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_methodDeclaration1572); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_methodDeclaration1574);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_methodDeclaration1576);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:298:4: (identfier= Identifier |identfier= Destruct )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Identifier) ) {
				alt31=1;
			}
			else if ( (LA31_0==Destruct) ) {
				alt31=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:298:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1585); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:298:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_methodDeclaration1589); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_methodDeclaration1595);
			formalParameters51=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_methodDeclaration1600);
			block52=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 302:3: -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier50!=null?((StringTemplate)methodModifier50.getTemplate()):null)).put("identifier", identfier).put("params", (formalParameters51!=null?((StringTemplate)formalParameters51.getTemplate()):null)).put("body", (block52!=null?((PHP54TranslatorWalker.block_return)block52).instructions:null)));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:310:1: methodModifier : (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.methodModifier_return methodModifier() throws RecognitionException {
		PHP54TranslatorWalker.methodModifier_return retval = new PHP54TranslatorWalker.methodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:311:2: ( (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:311:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:311:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			int alt32=11;
			switch ( input.LA(1) ) {
			case Static:
				{
				switch ( input.LA(2) ) {
				case Final:
					{
					alt32=1;
					}
					break;
				case Private:
					{
					int LA32_7 = input.LA(3);
					if ( (LA32_7==Final) ) {
						alt32=2;
					}
					else if ( (LA32_7==UP) ) {
						alt32=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Protected:
					{
					int LA32_8 = input.LA(3);
					if ( (LA32_8==Final) ) {
						alt32=2;
					}
					else if ( (LA32_8==UP) ) {
						alt32=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Public:
					{
					int LA32_9 = input.LA(3);
					if ( (LA32_9==Final) ) {
						alt32=2;
					}
					else if ( (LA32_9==UP) ) {
						alt32=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
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
					alt32=4;
					}
					break;
				case Private:
					{
					int LA32_11 = input.LA(3);
					if ( (LA32_11==Static) ) {
						alt32=5;
					}
					else if ( (LA32_11==UP) ) {
						alt32=6;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Protected:
					{
					int LA32_12 = input.LA(3);
					if ( (LA32_12==Static) ) {
						alt32=5;
					}
					else if ( (LA32_12==UP) ) {
						alt32=6;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Public:
					{
					int LA32_13 = input.LA(3);
					if ( (LA32_13==Static) ) {
						alt32=5;
					}
					else if ( (LA32_13==UP) ) {
						alt32=6;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 13, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 2, input);
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
					int LA32_14 = input.LA(3);
					if ( (LA32_14==Static) ) {
						alt32=7;
					}
					else if ( (LA32_14==UP) ) {
						alt32=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA32_15 = input.LA(3);
					if ( (LA32_15==Final) ) {
						alt32=8;
					}
					else if ( (LA32_15==UP) ) {
						alt32=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt32=11;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 3, input);
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
					int LA32_14 = input.LA(3);
					if ( (LA32_14==Static) ) {
						alt32=7;
					}
					else if ( (LA32_14==UP) ) {
						alt32=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA32_15 = input.LA(3);
					if ( (LA32_15==Final) ) {
						alt32=8;
					}
					else if ( (LA32_15==UP) ) {
						alt32=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt32=11;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 4, input);
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
					int LA32_14 = input.LA(3);
					if ( (LA32_14==Static) ) {
						alt32=7;
					}
					else if ( (LA32_14==UP) ) {
						alt32=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA32_15 = input.LA(3);
					if ( (LA32_15==Final) ) {
						alt32=8;
					}
					else if ( (LA32_15==UP) ) {
						alt32=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 32, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt32=11;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:311:6: list+= staticToken list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1661);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1665);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1670);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:312:5: list+= staticToken list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1678);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1682);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1687);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:313:5: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1695);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1699);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:315:5: list+= finalToken list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1710);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1714);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1719);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:316:5: list+= finalToken list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1727);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1731);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1736);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:5: list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1745);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1749);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:320:5: list+= accessModifier list+= finalToken list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1763);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1767);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1772);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:321:5: list+= accessModifier list+= staticToken list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1780);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1784);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1789);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:322:5: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1797);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1801);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:323:5: list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1809);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1813);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:324:5: list+= accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1821);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;

			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 326:3: -> modifier(modifiers=$list)
			  {
			  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:329:1: finalToken : Final -> {%{$Final.text}};
	public final PHP54TranslatorWalker.finalToken_return finalToken() throws RecognitionException {
		PHP54TranslatorWalker.finalToken_return retval = new PHP54TranslatorWalker.finalToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Final53=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:330:2: ( Final -> {%{$Final.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:330:4: Final
			{
			Final53=(ITSPHPAst)match(input,Final,FOLLOW_Final_in_finalToken1848); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 330:10: -> {%{$Final.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Final53!=null?Final53.getText():null));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:333:1: returnType : ( allTypes | Void );
	public final PHP54TranslatorWalker.returnType_return returnType() throws RecognitionException {
		PHP54TranslatorWalker.returnType_return retval = new PHP54TranslatorWalker.returnType_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:334:2: ( allTypes | Void )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==TYPE_NAME||(LA33_0 >= TypeArray && LA33_0 <= TypeString)) ) {
				alt33=1;
			}
			else if ( (LA33_0==Void) ) {
				alt33=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:334:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1864);
					allTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:335:4: Void
					{
					match(input,Void,FOLLOW_Void_in_returnType1869); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:338:1: formalParameters : ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null});
	public final PHP54TranslatorWalker.formalParameters_return formalParameters() throws RecognitionException {
		PHP54TranslatorWalker.formalParameters_return retval = new PHP54TranslatorWalker.formalParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:339:2: ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null})
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==PARAMETER_LIST) ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1==DOWN) ) {
					alt35=1;
				}
				else if ( (LA35_1==BLOCK) ) {
					alt35=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 35, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:339:4: ^( PARAMETER_LIST (params+= paramDeclaration )+ )
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1883); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:339:27: (params+= paramDeclaration )+
					int cnt34=0;
					loop34:
					do {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( (LA34_0==PARAMETER_DECLARATION) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:339:27: params+= paramDeclaration
							{
							pushFollow(FOLLOW_paramDeclaration_in_formalParameters1887);
							params=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt34 >= 1 ) break loop34;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(34, input);
								throw eee;
						}
						cnt34++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 339:48: -> parameterList(declarations=$params)
					  {
					  	retval.st = templateLib.getInstanceOf("parameterList",new STAttrMap().put("declarations", list_params));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:340:4: PARAMETER_LIST
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1903); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 340:19: -> {null}
					  {
					  	retval.st = null;
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:343:1: paramDeclaration : ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue);
	public final PHP54TranslatorWalker.paramDeclaration_return paramDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.paramDeclaration_return retval = new PHP54TranslatorWalker.paramDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope typeName =null;
		TreeRuleReturnScope typeModifier54 =null;
		TreeRuleReturnScope parameterNormalOrOptional55 =null;

		String defaultValue =null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:345:2: ( ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:345:4: ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional )
			{
			match(input,PARAMETER_DECLARATION,FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1923); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_paramDeclaration1930); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_paramDeclaration1932);
			typeModifier54=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:347:5: ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType )
			int alt36=4;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeResource:
			case TypeString:
				{
				alt36=1;
				}
				break;
			case TypeArray:
				{
				alt36=2;
				}
				break;
			case TypeObject:
				{
				alt36=3;
				}
				break;
			case TYPE_NAME:
				{
				alt36=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:347:7: scalarAndResource
					{
					pushFollow(FOLLOW_scalarAndResource_in_paramDeclaration1941);
					scalarAndResource();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:348:7: typeName= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_paramDeclaration1951);
					typeName=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:349:7: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_paramDeclaration1959); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:350:7: typeName= classInterfaceType
					{
					pushFollow(FOLLOW_classInterfaceType_in_paramDeclaration1969);
					typeName=classInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_parameterNormalOrOptional_in_paramDeclaration1985);
			parameterNormalOrOptional55=parameterNormalOrOptional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==0 ) {
					    defaultValue =  (typeModifier54!=null?((PHP54TranslatorWalker.typeModifier_return)typeModifier54).isNullable:false) && typeName!=null ? "null" : (parameterNormalOrOptional55!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional55).defaultValue:null);
					}
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 358:3: -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue)
			  {
			  	retval.st = templateLib.getInstanceOf("parameter",new STAttrMap().put("type", (typeName!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(typeName.start),input.getTreeAdaptor().getTokenStopIndex(typeName.start))):null)).put("variableId", (parameterNormalOrOptional55!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional55).variableId:null)).put("defaultValue", defaultValue));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:360:1: arrayType : TypeArray -> {%{$TypeArray.text}};
	public final PHP54TranslatorWalker.arrayType_return arrayType() throws RecognitionException {
		PHP54TranslatorWalker.arrayType_return retval = new PHP54TranslatorWalker.arrayType_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeArray56=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:361:2: ( TypeArray -> {%{$TypeArray.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:361:4: TypeArray
			{
			TypeArray56=(ITSPHPAst)match(input,TypeArray,FOLLOW_TypeArray_in_arrayType2024); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 361:14: -> {%{$TypeArray.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(TypeArray56!=null?TypeArray56.getText():null));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:364:1: classInterfaceType : TYPE_NAME -> {%{$TYPE_NAME.text}};
	public final PHP54TranslatorWalker.classInterfaceType_return classInterfaceType() throws RecognitionException {
		PHP54TranslatorWalker.classInterfaceType_return retval = new PHP54TranslatorWalker.classInterfaceType_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME57=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:365:2: ( TYPE_NAME -> {%{$TYPE_NAME.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:365:4: TYPE_NAME
			{
			TYPE_NAME57=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_classInterfaceType2039); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 365:14: -> {%{$TYPE_NAME.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(TYPE_NAME57!=null?TYPE_NAME57.getText():null));
			  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:368:1: scalarAndResource : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}});
	public final PHP54TranslatorWalker.scalarAndResource_return scalarAndResource() throws RecognitionException {
		PHP54TranslatorWalker.scalarAndResource_return retval = new PHP54TranslatorWalker.scalarAndResource_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource59=null;
		TreeRuleReturnScope scalarTypes58 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:369:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}})
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( ((LA37_0 >= TypeBool && LA37_0 <= TypeInt)||LA37_0==TypeString) ) {
				alt37=1;
			}
			else if ( (LA37_0==TypeResource) ) {
				alt37=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:369:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_scalarAndResource2055);
					scalarTypes58=scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 369:16: -> {$scalarTypes.st}
					  {
					  	retval.st = (scalarTypes58!=null?((StringTemplate)scalarTypes58.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:370:4: TypeResource
					{
					TypeResource59=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_scalarAndResource2064); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 370:17: -> {%{$TypeResource.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeResource59!=null?TypeResource59.getText():null));
					  }


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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:373:1: parameterNormalOrOptional returns [String variableId,String defaultValue] : ( ^( VariableId v= Int ) | VariableId );
	public final PHP54TranslatorWalker.parameterNormalOrOptional_return parameterNormalOrOptional() throws RecognitionException {
		PHP54TranslatorWalker.parameterNormalOrOptional_return retval = new PHP54TranslatorWalker.parameterNormalOrOptional_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst VariableId60=null;
		ITSPHPAst VariableId61=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:374:2: ( ^( VariableId v= Int ) | VariableId )
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==VariableId) ) {
				int LA38_1 = input.LA(2);
				if ( (LA38_1==DOWN) ) {
					alt38=1;
				}
				else if ( (LA38_1==UP) ) {
					alt38=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:374:4: ^( VariableId v= Int )
					{
					VariableId60=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional2083); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_parameterNormalOrOptional2087); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {retval.variableId =(VariableId60!=null?VariableId60.getText():null); retval.defaultValue =(v!=null?v.getText():null);}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:375:4: VariableId
					{
					VariableId61=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional2096); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.variableId =(VariableId61!=null?VariableId61.getText():null);}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:378:1: block returns [List<Object> instructions] : ( ^( BLOCK (instr+= instruction )* ) | BLOCK );
	public final PHP54TranslatorWalker.block_return block() throws RecognitionException {
		PHP54TranslatorWalker.block_return retval = new PHP54TranslatorWalker.block_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:379:2: ( ^( BLOCK (instr+= instruction )* ) | BLOCK )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==BLOCK) ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1==DOWN) ) {
					alt40=1;
				}
				else if ( (LA40_1==UP) ) {
					alt40=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 40, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}
			switch (alt40) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:379:4: ^( BLOCK (instr+= instruction )* )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block2113); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:379:17: (instr+= instruction )*
						loop39:
						do {
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==Break||LA39_0==Continue||LA39_0==EXPRESSION||LA39_0==Echo||LA39_0==For||LA39_0==If||LA39_0==Return||LA39_0==Switch||LA39_0==Throw||LA39_0==VARIABLE_DECLARATION_LIST) ) {
								alt39=1;
							}

							switch (alt39) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:379:17: instr+= instruction
								{
								pushFollow(FOLLOW_instruction_in_block2117);
								instr=instruction();
								state._fsp--;
								if (state.failed) return retval;
								if (list_instr==null) list_instr=new ArrayList<Object>();
								list_instr.add(instr.getTemplate());
								}
								break;

							default :
								break loop39;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					if ( state.backtracking==0 ) {retval.instructions =list_instr;}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:380:4: BLOCK
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block2126); if (state.failed) return retval;
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


	public static class interfaceDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "interfaceDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:383:1: interfaceDeclaration : ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody ) -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st);
	public final PHP54TranslatorWalker.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceDeclaration_return retval = new PHP54TranslatorWalker.interfaceDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier62=null;
		TreeRuleReturnScope extendsDeclaration63 =null;
		TreeRuleReturnScope interfaceBody64 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:384:2: ( ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody ) -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:384:4: ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody )
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration2140); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_interfaceDeclaration2147); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,Abstract,FOLLOW_Abstract_in_interfaceDeclaration2149); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier62=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration2155); if (state.failed) return retval;
			pushFollow(FOLLOW_extendsDeclaration_in_interfaceDeclaration2161);
			extendsDeclaration63=extendsDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration2166);
			interfaceBody64=interfaceBody();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 390:3: -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st)
			  {
			  	retval.st = templateLib.getInstanceOf("interface",new STAttrMap().put("identifier", Identifier62).put("ext", (extendsDeclaration63!=null?((StringTemplate)extendsDeclaration63.getTemplate()):null)).put("body", (interfaceBody64!=null?((StringTemplate)interfaceBody64.getTemplate()):null)));
			  }


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
	// $ANTLR end "interfaceDeclaration"


	public static class interfaceBody_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "interfaceBody"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:397:1: interfaceBody : ( ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* ) -> body(statements=$def)| INTERFACE_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.interfaceBody_return interfaceBody() throws RecognitionException {
		PHP54TranslatorWalker.interfaceBody_return retval = new PHP54TranslatorWalker.interfaceBody_return();
		retval.start = input.LT(1);

		List<Object> list_def=null;
		RuleReturnScope def = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:398:2: ( ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* ) -> body(statements=$def)| INTERFACE_BODY -> body(statements=null))
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==INTERFACE_BODY) ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1==DOWN) ) {
					alt42=1;
				}
				else if ( (LA42_1==UP) ) {
					alt42=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 42, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:398:4: ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* )
					{
					match(input,INTERFACE_BODY,FOLLOW_INTERFACE_BODY_in_interfaceBody2218); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:398:24: (def+= interfaceBodyDefinition )*
						loop41:
						do {
							int alt41=2;
							int LA41_0 = input.LA(1);
							if ( (LA41_0==CONSTANT_DECLARATION_LIST||LA41_0==Construct||LA41_0==METHOD_DECLARATION) ) {
								alt41=1;
							}

							switch (alt41) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:398:24: def+= interfaceBodyDefinition
								{
								pushFollow(FOLLOW_interfaceBodyDefinition_in_interfaceBody2222);
								def=interfaceBodyDefinition();
								state._fsp--;
								if (state.failed) return retval;
								if (list_def==null) list_def=new ArrayList<Object>();
								list_def.add(def.getTemplate());
								}
								break;

							default :
								break loop41;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 398:52: -> body(statements=$def)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_def));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:399:4: INTERFACE_BODY
					{
					match(input,INTERFACE_BODY,FOLLOW_INTERFACE_BODY_in_interfaceBody2238); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 399:19: -> body(statements=null)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", null));
					  }


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
	// $ANTLR end "interfaceBody"


	public static class interfaceBodyDefinition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "interfaceBodyDefinition"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:402:1: interfaceBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}| interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st});
	public final PHP54TranslatorWalker.interfaceBodyDefinition_return interfaceBodyDefinition() throws RecognitionException {
		PHP54TranslatorWalker.interfaceBodyDefinition_return retval = new PHP54TranslatorWalker.interfaceBodyDefinition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope constDeclarationList65 =null;
		TreeRuleReturnScope interfaceConstructDeclaration66 =null;
		TreeRuleReturnScope interfaceMethodDeclaration67 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:403:2: ( constDeclarationList -> {$constDeclarationList.st}| interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}| interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st})
			int alt43=3;
			switch ( input.LA(1) ) {
			case CONSTANT_DECLARATION_LIST:
				{
				alt43=1;
				}
				break;
			case Construct:
				{
				alt43=2;
				}
				break;
			case METHOD_DECLARATION:
				{
				alt43=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:403:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_interfaceBodyDefinition2258);
					constDeclarationList65=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 403:25: -> {$constDeclarationList.st}
					  {
					  	retval.st = (constDeclarationList65!=null?((StringTemplate)constDeclarationList65.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:404:4: interfaceConstructDeclaration
					{
					pushFollow(FOLLOW_interfaceConstructDeclaration_in_interfaceBodyDefinition2267);
					interfaceConstructDeclaration66=interfaceConstructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 404:34: -> {$interfaceConstructDeclaration.st}
					  {
					  	retval.st = (interfaceConstructDeclaration66!=null?((StringTemplate)interfaceConstructDeclaration66.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:405:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDefinition2276);
					interfaceMethodDeclaration67=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 405:31: -> {$interfaceMethodDeclaration.st}
					  {
					  	retval.st = (interfaceMethodDeclaration67!=null?((StringTemplate)interfaceMethodDeclaration67.getTemplate()):null);
					  }


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
	// $ANTLR end "interfaceBodyDefinition"


	public static class interfaceConstructDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "interfaceConstructDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:408:1: interfaceConstructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.interfaceConstructDeclaration_return interfaceConstructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceConstructDeclaration_return retval = new PHP54TranslatorWalker.interfaceConstructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope formalParameters68 =null;
		TreeRuleReturnScope block69 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:409:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:409:4: ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_interfaceConstructDeclaration2294); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_interfaceConstructDeclaration2301); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_interfaceConstructDeclaration2303);
			abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_interfaceConstructDeclaration2310); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_interfaceConstructDeclaration2312);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_interfaceConstructDeclaration2314);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_interfaceConstructDeclaration2320);
			formalParameters68=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_interfaceConstructDeclaration2325);
			block69=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 415:3: -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", "public").put("identifier", identifier).put("params", (formalParameters68!=null?((StringTemplate)formalParameters68.getTemplate()):null)).put("body", (block69!=null?((PHP54TranslatorWalker.block_return)block69).instructions:null)));
			  }


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
	// $ANTLR end "interfaceConstructDeclaration"


	public static class interfaceMethodDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "interfaceMethodDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:423:1: interfaceMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceMethodDeclaration_return retval = new PHP54TranslatorWalker.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier70=null;
		TreeRuleReturnScope formalParameters71 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:424:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:424:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_interfaceMethodDeclaration2385); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_interfaceMethodDeclaration2391); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_interfaceMethodDeclaration2393);
			abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_interfaceMethodDeclaration2400); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_interfaceMethodDeclaration2402);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_interfaceMethodDeclaration2404);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier70=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodDeclaration2410); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaration2415);
			formalParameters71=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input,BLOCK,FOLLOW_BLOCK_in_interfaceMethodDeclaration2420); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 431:3: -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", "public").put("identifier", Identifier70).put("params", (formalParameters71!=null?((StringTemplate)formalParameters71.getTemplate()):null)));
			  }


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
	// $ANTLR end "interfaceMethodDeclaration"


	public static class functionDeclaration_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionDeclaration"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:438:1: functionDeclaration : ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.functionDeclaration_return functionDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.functionDeclaration_return retval = new PHP54TranslatorWalker.functionDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier72=null;
		TreeRuleReturnScope formalParameters73 =null;
		TreeRuleReturnScope block74 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:439:2: ( ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:439:4: ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block )
			{
			match(input,Function,FOLLOW_Function_in_functionDeclaration2471); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_functionDeclaration2477); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration2483); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_functionDeclaration2485);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclaration2487);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier72=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration2493); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameters_in_functionDeclaration2498);
			formalParameters73=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_functionDeclaration2503);
			block74=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 446:3: -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", null).put("identifier", Identifier72).put("params", (formalParameters73!=null?((StringTemplate)formalParameters73.getTemplate()):null)).put("body", (block74!=null?((PHP54TranslatorWalker.block_return)block74).instructions:null)));
			  }


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
	// $ANTLR end "functionDeclaration"


	public static class instruction_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "instruction"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:455:1: instruction : ( localVariableDeclarationList -> {$localVariableDeclarationList.st}| ifCondition -> {$ifCondition.st}| switchCondition -> {$switchCondition.st}| forLoop -> {$forLoop.st}| ^( EXPRESSION ( expression )? ) -> expression(expression=$expression.st)| ^( 'return' ( expression )? ) -> return(expression=$expression.st)| ^( 'throw' expression ) -> throw(expression=$expression.st)| ^( 'echo' (exprs+= expression )+ ) -> echo(expressions=$exprs)| ^( 'break' (index= Int )? ) -> break(index=$index.text)| 'break' -> break(index=null)| ^( 'continue' (index= Int )? ) -> continue(index=$index.text)| 'continue' -> continue(index=null));
	public final PHP54TranslatorWalker.instruction_return instruction() throws RecognitionException {
		PHP54TranslatorWalker.instruction_return retval = new PHP54TranslatorWalker.instruction_return();
		retval.start = input.LT(1);

		ITSPHPAst index=null;
		List<Object> list_exprs=null;
		TreeRuleReturnScope localVariableDeclarationList75 =null;
		TreeRuleReturnScope ifCondition76 =null;
		TreeRuleReturnScope switchCondition77 =null;
		TreeRuleReturnScope forLoop78 =null;
		TreeRuleReturnScope expression79 =null;
		TreeRuleReturnScope expression80 =null;
		TreeRuleReturnScope expression81 =null;
		RuleReturnScope exprs = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:456:2: ( localVariableDeclarationList -> {$localVariableDeclarationList.st}| ifCondition -> {$ifCondition.st}| switchCondition -> {$switchCondition.st}| forLoop -> {$forLoop.st}| ^( EXPRESSION ( expression )? ) -> expression(expression=$expression.st)| ^( 'return' ( expression )? ) -> return(expression=$expression.st)| ^( 'throw' expression ) -> throw(expression=$expression.st)| ^( 'echo' (exprs+= expression )+ ) -> echo(expressions=$exprs)| ^( 'break' (index= Int )? ) -> break(index=$index.text)| 'break' -> break(index=null)| ^( 'continue' (index= Int )? ) -> continue(index=$index.text)| 'continue' -> continue(index=null))
			int alt49=12;
			switch ( input.LA(1) ) {
			case VARIABLE_DECLARATION_LIST:
				{
				alt49=1;
				}
				break;
			case If:
				{
				alt49=2;
				}
				break;
			case Switch:
				{
				alt49=3;
				}
				break;
			case For:
				{
				alt49=4;
				}
				break;
			case EXPRESSION:
				{
				alt49=5;
				}
				break;
			case Return:
				{
				alt49=6;
				}
				break;
			case Throw:
				{
				alt49=7;
				}
				break;
			case Echo:
				{
				alt49=8;
				}
				break;
			case Break:
				{
				int LA49_9 = input.LA(2);
				if ( (LA49_9==DOWN) ) {
					alt49=9;
				}
				else if ( (LA49_9==UP||LA49_9==Break||LA49_9==CONSTANT_DECLARATION_LIST||LA49_9==Class||LA49_9==Continue||LA49_9==EXPRESSION||LA49_9==Echo||LA49_9==For||LA49_9==Function||LA49_9==If||LA49_9==Interface||LA49_9==Return||LA49_9==Switch||LA49_9==Throw||LA49_9==Use||LA49_9==VARIABLE_DECLARATION_LIST) ) {
					alt49=10;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 9, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Continue:
				{
				int LA49_10 = input.LA(2);
				if ( (LA49_10==DOWN) ) {
					alt49=11;
				}
				else if ( (LA49_10==UP||LA49_10==Break||LA49_10==CONSTANT_DECLARATION_LIST||LA49_10==Class||LA49_10==Continue||LA49_10==EXPRESSION||LA49_10==Echo||LA49_10==For||LA49_10==Function||LA49_10==If||LA49_10==Interface||LA49_10==Return||LA49_10==Switch||LA49_10==Throw||LA49_10==Use||LA49_10==VARIABLE_DECLARATION_LIST) ) {
					alt49=12;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 10, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:456:4: localVariableDeclarationList
					{
					pushFollow(FOLLOW_localVariableDeclarationList_in_instruction2562);
					localVariableDeclarationList75=localVariableDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 456:34: -> {$localVariableDeclarationList.st}
					  {
					  	retval.st = (localVariableDeclarationList75!=null?((StringTemplate)localVariableDeclarationList75.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:457:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction2572);
					ifCondition76=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 457:19: -> {$ifCondition.st}
					  {
					  	retval.st = (ifCondition76!=null?((StringTemplate)ifCondition76.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:458:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction2584);
					switchCondition77=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 458:22: -> {$switchCondition.st}
					  {
					  	retval.st = (switchCondition77!=null?((StringTemplate)switchCondition77.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:459:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction2595);
					forLoop78=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 459:15: -> {$forLoop.st}
					  {
					  	retval.st = (forLoop78!=null?((StringTemplate)forLoop78.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:464:4: ^( EXPRESSION ( expression )? )
					{
					match(input,EXPRESSION,FOLLOW_EXPRESSION_in_instruction2616); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:464:17: ( expression )?
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==ARRAY_ACCESS||(LA44_0 >= Assign && LA44_0 <= At)||(LA44_0 >= BitwiseAnd && LA44_0 <= Bool)||LA44_0==CASTING||LA44_0==CLASS_MEMBER_ACCESS||LA44_0==CLASS_STATIC_ACCESS||LA44_0==CONSTANT||LA44_0==Clone||(LA44_0 >= Divide && LA44_0 <= DivideAssign)||(LA44_0 >= Dot && LA44_0 <= DotAssign)||(LA44_0 >= Equal && LA44_0 <= Exit)||LA44_0==FUNCTION_CALL||LA44_0==Float||(LA44_0 >= GreaterEqualThan && LA44_0 <= GreaterThan)||LA44_0==Identical||(LA44_0 >= Instanceof && LA44_0 <= Int)||(LA44_0 >= LessEqualThan && LA44_0 <= METHOD_CALL_STATIC)||(LA44_0 >= Minus && LA44_0 <= MinusAssign)||(LA44_0 >= Modulo && LA44_0 <= MultiplyAssign)||(LA44_0 >= New && LA44_0 <= Null)||(LA44_0 >= POST_DECREMENT && LA44_0 <= PRE_INCREMENT)||(LA44_0 >= Plus && LA44_0 <= PlusAssign)||LA44_0==QuestionMark||(LA44_0 >= ShiftLeft && LA44_0 <= ShiftRightAssign)||LA44_0==String||LA44_0==This||LA44_0==TypeArray||LA44_0==UNARY_MINUS||LA44_0==VariableId) ) {
							alt44=1;
						}
						switch (alt44) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:464:17: expression
								{
								pushFollow(FOLLOW_expression_in_instruction2618);
								expression79=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 464:30: -> expression(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("expression", (expression79!=null?((StringTemplate)expression79.getTemplate()):null)));
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:465:4: ^( 'return' ( expression )? )
					{
					match(input,Return,FOLLOW_Return_in_instruction2635); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:465:15: ( expression )?
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==ARRAY_ACCESS||(LA45_0 >= Assign && LA45_0 <= At)||(LA45_0 >= BitwiseAnd && LA45_0 <= Bool)||LA45_0==CASTING||LA45_0==CLASS_MEMBER_ACCESS||LA45_0==CLASS_STATIC_ACCESS||LA45_0==CONSTANT||LA45_0==Clone||(LA45_0 >= Divide && LA45_0 <= DivideAssign)||(LA45_0 >= Dot && LA45_0 <= DotAssign)||(LA45_0 >= Equal && LA45_0 <= Exit)||LA45_0==FUNCTION_CALL||LA45_0==Float||(LA45_0 >= GreaterEqualThan && LA45_0 <= GreaterThan)||LA45_0==Identical||(LA45_0 >= Instanceof && LA45_0 <= Int)||(LA45_0 >= LessEqualThan && LA45_0 <= METHOD_CALL_STATIC)||(LA45_0 >= Minus && LA45_0 <= MinusAssign)||(LA45_0 >= Modulo && LA45_0 <= MultiplyAssign)||(LA45_0 >= New && LA45_0 <= Null)||(LA45_0 >= POST_DECREMENT && LA45_0 <= PRE_INCREMENT)||(LA45_0 >= Plus && LA45_0 <= PlusAssign)||LA45_0==QuestionMark||(LA45_0 >= ShiftLeft && LA45_0 <= ShiftRightAssign)||LA45_0==String||LA45_0==This||LA45_0==TypeArray||LA45_0==UNARY_MINUS||LA45_0==VariableId) ) {
							alt45=1;
						}
						switch (alt45) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:465:15: expression
								{
								pushFollow(FOLLOW_expression_in_instruction2637);
								expression80=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 465:29: -> return(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("return",new STAttrMap().put("expression", (expression80!=null?((StringTemplate)expression80.getTemplate()):null)));
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:466:4: ^( 'throw' expression )
					{
					match(input,Throw,FOLLOW_Throw_in_instruction2657); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_instruction2659);
					expression81=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 466:27: -> throw(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("throw",new STAttrMap().put("expression", (expression81!=null?((StringTemplate)expression81.getTemplate()):null)));
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:467:4: ^( 'echo' (exprs+= expression )+ )
					{
					match(input,Echo,FOLLOW_Echo_in_instruction2678); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:467:18: (exprs+= expression )+
					int cnt46=0;
					loop46:
					do {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==ARRAY_ACCESS||(LA46_0 >= Assign && LA46_0 <= At)||(LA46_0 >= BitwiseAnd && LA46_0 <= Bool)||LA46_0==CASTING||LA46_0==CLASS_MEMBER_ACCESS||LA46_0==CLASS_STATIC_ACCESS||LA46_0==CONSTANT||LA46_0==Clone||(LA46_0 >= Divide && LA46_0 <= DivideAssign)||(LA46_0 >= Dot && LA46_0 <= DotAssign)||(LA46_0 >= Equal && LA46_0 <= Exit)||LA46_0==FUNCTION_CALL||LA46_0==Float||(LA46_0 >= GreaterEqualThan && LA46_0 <= GreaterThan)||LA46_0==Identical||(LA46_0 >= Instanceof && LA46_0 <= Int)||(LA46_0 >= LessEqualThan && LA46_0 <= METHOD_CALL_STATIC)||(LA46_0 >= Minus && LA46_0 <= MinusAssign)||(LA46_0 >= Modulo && LA46_0 <= MultiplyAssign)||(LA46_0 >= New && LA46_0 <= Null)||(LA46_0 >= POST_DECREMENT && LA46_0 <= PRE_INCREMENT)||(LA46_0 >= Plus && LA46_0 <= PlusAssign)||LA46_0==QuestionMark||(LA46_0 >= ShiftLeft && LA46_0 <= ShiftRightAssign)||LA46_0==String||LA46_0==This||LA46_0==TypeArray||LA46_0==UNARY_MINUS||LA46_0==VariableId) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:467:18: exprs+= expression
							{
							pushFollow(FOLLOW_expression_in_instruction2682);
							exprs=expression();
							state._fsp--;
							if (state.failed) return retval;
							if (list_exprs==null) list_exprs=new ArrayList<Object>();
							list_exprs.add(exprs.getTemplate());
							}
							break;

						default :
							if ( cnt46 >= 1 ) break loop46;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(46, input);
								throw eee;
						}
						cnt46++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 467:33: -> echo(expressions=$exprs)
					  {
					  	retval.st = templateLib.getInstanceOf("echo",new STAttrMap().put("expressions", list_exprs));
					  }


					}

					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:468:4: ^( 'break' (index= Int )? )
					{
					match(input,Break,FOLLOW_Break_in_instruction2701); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:468:14: (index= Int )?
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==Int) ) {
							alt47=1;
						}
						switch (alt47) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:468:15: index= Int
								{
								index=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_instruction2706); if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 468:29: -> break(index=$index.text)
					  {
					  	retval.st = templateLib.getInstanceOf("break",new STAttrMap().put("index", (index!=null?index.getText():null)));
					  }


					}

					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:469:4: 'break'
					{
					match(input,Break,FOLLOW_Break_in_instruction2724); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 469:15: -> break(index=null)
					  {
					  	retval.st = templateLib.getInstanceOf("break",new STAttrMap().put("index", null));
					  }


					}

					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:470:4: ^( 'continue' (index= Int )? )
					{
					match(input,Continue,FOLLOW_Continue_in_instruction2742); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:470:17: (index= Int )?
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Int) ) {
							alt48=1;
						}
						switch (alt48) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:470:18: index= Int
								{
								index=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_instruction2747); if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 470:31: -> continue(index=$index.text)
					  {
					  	retval.st = templateLib.getInstanceOf("continue",new STAttrMap().put("index", (index!=null?index.getText():null)));
					  }


					}

					}
					break;
				case 12 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:4: 'continue'
					{
					match(input,Continue,FOLLOW_Continue_in_instruction2764); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 471:17: -> continue(index=null)
					  {
					  	retval.st = templateLib.getInstanceOf("continue",new STAttrMap().put("index", null));
					  }


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
	// $ANTLR end "instruction"


	public static class ifCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ifCondition"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:474:1: ifCondition : ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? ) -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions);
	public final PHP54TranslatorWalker.ifCondition_return ifCondition() throws RecognitionException {
		PHP54TranslatorWalker.ifCondition_return retval = new PHP54TranslatorWalker.ifCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ifBlock =null;
		TreeRuleReturnScope elseBlock =null;
		TreeRuleReturnScope expression82 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:475:2: ( ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? ) -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:475:4: ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? )
			{
			match(input,If,FOLLOW_If_in_ifCondition2787); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_ifCondition2793);
			expression82=expression();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_blockConditional_in_ifCondition2801);
			ifBlock=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:478:13: (elseBlock= blockConditional )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==BLOCK_CONDITIONAL) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:478:13: elseBlock= blockConditional
					{
					pushFollow(FOLLOW_blockConditional_in_ifCondition2808);
					elseBlock=blockConditional();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 480:3: -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("if",new STAttrMap().put("condition", (expression82!=null?((StringTemplate)expression82.getTemplate()):null)).put("ifBlock", (ifBlock!=null?((PHP54TranslatorWalker.blockConditional_return)ifBlock).instructions:null)).put("elseBlock", (elseBlock!=null?((PHP54TranslatorWalker.blockConditional_return)elseBlock).instructions:null)));
			  }


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
	// $ANTLR end "ifCondition"


	public static class blockConditional_return extends TreeRuleReturnScope {
		public List<Object> instructions;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "blockConditional"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:483:1: blockConditional returns [List<Object> instructions] : ^( BLOCK_CONDITIONAL (instr+= instruction )* ) ;
	public final PHP54TranslatorWalker.blockConditional_return blockConditional() throws RecognitionException {
		PHP54TranslatorWalker.blockConditional_return retval = new PHP54TranslatorWalker.blockConditional_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:484:2: ( ^( BLOCK_CONDITIONAL (instr+= instruction )* ) )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:484:4: ^( BLOCK_CONDITIONAL (instr+= instruction )* )
			{
			match(input,BLOCK_CONDITIONAL,FOLLOW_BLOCK_CONDITIONAL_in_blockConditional2849); if (state.failed) return retval;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:484:29: (instr+= instruction )*
				loop51:
				do {
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==Break||LA51_0==Continue||LA51_0==EXPRESSION||LA51_0==Echo||LA51_0==For||LA51_0==If||LA51_0==Return||LA51_0==Switch||LA51_0==Throw||LA51_0==VARIABLE_DECLARATION_LIST) ) {
						alt51=1;
					}

					switch (alt51) {
					case 1 :
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:484:29: instr+= instruction
						{
						pushFollow(FOLLOW_instruction_in_blockConditional2853);
						instr=instruction();
						state._fsp--;
						if (state.failed) return retval;
						if (list_instr==null) list_instr=new ArrayList<Object>();
						list_instr.add(instr.getTemplate());
						}
						break;

					default :
						break loop51;
					}
				} while (true);

				match(input, Token.UP, null); if (state.failed) return retval;
			}

			if ( state.backtracking==0 ) {retval.instructions =list_instr;}
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
	// $ANTLR end "blockConditional"


	public static class switchCondition_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "switchCondition"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:487:1: switchCondition : ^( 'switch' expression (content+= switchContent )* ) -> switch(condition=$expression.stcontent=$content);
	public final PHP54TranslatorWalker.switchCondition_return switchCondition() throws RecognitionException {
		PHP54TranslatorWalker.switchCondition_return retval = new PHP54TranslatorWalker.switchCondition_return();
		retval.start = input.LT(1);

		List<Object> list_content=null;
		TreeRuleReturnScope expression83 =null;
		RuleReturnScope content = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:488:2: ( ^( 'switch' expression (content+= switchContent )* ) -> switch(condition=$expression.stcontent=$content))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:488:4: ^( 'switch' expression (content+= switchContent )* )
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition2869); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_switchCondition2871);
			expression83=expression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:488:33: (content+= switchContent )*
			loop52:
			do {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==SWITCH_CASES) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:488:33: content+= switchContent
					{
					pushFollow(FOLLOW_switchContent_in_switchCondition2875);
					content=switchContent();
					state._fsp--;
					if (state.failed) return retval;
					if (list_content==null) list_content=new ArrayList<Object>();
					list_content.add(content.getTemplate());
					}
					break;

				default :
					break loop52;
				}
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 488:51: -> switch(condition=$expression.stcontent=$content)
			  {
			  	retval.st = templateLib.getInstanceOf("switch",new STAttrMap().put("condition", (expression83!=null?((StringTemplate)expression83.getTemplate()):null)).put("content", list_content));
			  }


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
	// $ANTLR end "switchCondition"


	public static class switchContent_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "switchContent"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:491:1: switchContent : ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional -> switchContent(labels=$labelsblock=$blockConditional.instructions);
	public final PHP54TranslatorWalker.switchContent_return switchContent() throws RecognitionException {
		PHP54TranslatorWalker.switchContent_return retval = new PHP54TranslatorWalker.switchContent_return();
		retval.start = input.LT(1);

		List<Object> list_labels=null;
		TreeRuleReturnScope blockConditional84 =null;
		RuleReturnScope labels = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:492:2: ( ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional -> switchContent(labels=$labelsblock=$blockConditional.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:492:4: ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional
			{
			match(input,SWITCH_CASES,FOLLOW_SWITCH_CASES_in_switchContent2903); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:492:25: (labels+= caseLabel )+
			int cnt53=0;
			loop53:
			do {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==ARRAY_ACCESS||(LA53_0 >= Assign && LA53_0 <= At)||(LA53_0 >= BitwiseAnd && LA53_0 <= Bool)||LA53_0==CASTING||LA53_0==CLASS_MEMBER_ACCESS||LA53_0==CLASS_STATIC_ACCESS||LA53_0==CONSTANT||LA53_0==Clone||LA53_0==Default||(LA53_0 >= Divide && LA53_0 <= DivideAssign)||(LA53_0 >= Dot && LA53_0 <= DotAssign)||(LA53_0 >= Equal && LA53_0 <= Exit)||LA53_0==FUNCTION_CALL||LA53_0==Float||(LA53_0 >= GreaterEqualThan && LA53_0 <= GreaterThan)||LA53_0==Identical||(LA53_0 >= Instanceof && LA53_0 <= Int)||(LA53_0 >= LessEqualThan && LA53_0 <= METHOD_CALL_STATIC)||(LA53_0 >= Minus && LA53_0 <= MinusAssign)||(LA53_0 >= Modulo && LA53_0 <= MultiplyAssign)||(LA53_0 >= New && LA53_0 <= Null)||(LA53_0 >= POST_DECREMENT && LA53_0 <= PRE_INCREMENT)||(LA53_0 >= Plus && LA53_0 <= PlusAssign)||LA53_0==QuestionMark||(LA53_0 >= ShiftLeft && LA53_0 <= ShiftRightAssign)||LA53_0==String||LA53_0==This||LA53_0==TypeArray||LA53_0==UNARY_MINUS||LA53_0==VariableId) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:492:25: labels+= caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_switchContent2907);
					labels=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if (list_labels==null) list_labels=new ArrayList<Object>();
					list_labels.add(labels.getTemplate());
					}
					break;

				default :
					if ( cnt53 >= 1 ) break loop53;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(53, input);
						throw eee;
				}
				cnt53++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_blockConditional_in_switchContent2911);
			blockConditional84=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 493:3: -> switchContent(labels=$labelsblock=$blockConditional.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("switchContent",new STAttrMap().put("labels", list_labels).put("block", (blockConditional84!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional84).instructions:null)));
			  }


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
	// $ANTLR end "switchContent"


	public static class caseLabel_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "caseLabel"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:496:1: caseLabel : ( expression -> caseLabel(label=$expression.st)| Default -> {%{$Default.text+\":\"}});
	public final PHP54TranslatorWalker.caseLabel_return caseLabel() throws RecognitionException {
		PHP54TranslatorWalker.caseLabel_return retval = new PHP54TranslatorWalker.caseLabel_return();
		retval.start = input.LT(1);

		ITSPHPAst Default86=null;
		TreeRuleReturnScope expression85 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:497:2: ( expression -> caseLabel(label=$expression.st)| Default -> {%{$Default.text+\":\"}})
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==ARRAY_ACCESS||(LA54_0 >= Assign && LA54_0 <= At)||(LA54_0 >= BitwiseAnd && LA54_0 <= Bool)||LA54_0==CASTING||LA54_0==CLASS_MEMBER_ACCESS||LA54_0==CLASS_STATIC_ACCESS||LA54_0==CONSTANT||LA54_0==Clone||(LA54_0 >= Divide && LA54_0 <= DivideAssign)||(LA54_0 >= Dot && LA54_0 <= DotAssign)||(LA54_0 >= Equal && LA54_0 <= Exit)||LA54_0==FUNCTION_CALL||LA54_0==Float||(LA54_0 >= GreaterEqualThan && LA54_0 <= GreaterThan)||LA54_0==Identical||(LA54_0 >= Instanceof && LA54_0 <= Int)||(LA54_0 >= LessEqualThan && LA54_0 <= METHOD_CALL_STATIC)||(LA54_0 >= Minus && LA54_0 <= MinusAssign)||(LA54_0 >= Modulo && LA54_0 <= MultiplyAssign)||(LA54_0 >= New && LA54_0 <= Null)||(LA54_0 >= POST_DECREMENT && LA54_0 <= PRE_INCREMENT)||(LA54_0 >= Plus && LA54_0 <= PlusAssign)||LA54_0==QuestionMark||(LA54_0 >= ShiftLeft && LA54_0 <= ShiftRightAssign)||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==UNARY_MINUS||LA54_0==VariableId) ) {
				alt54=1;
			}
			else if ( (LA54_0==Default) ) {
				alt54=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:497:4: expression
					{
					pushFollow(FOLLOW_expression_in_caseLabel2939);
					expression85=expression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 497:16: -> caseLabel(label=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("caseLabel",new STAttrMap().put("label", (expression85!=null?((StringTemplate)expression85.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:498:4: Default
					{
					Default86=(ITSPHPAst)match(input,Default,FOLLOW_Default_in_caseLabel2954); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 498:13: -> {%{$Default.text+\":\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Default86!=null?Default86.getText():null)+":");
					  }


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
	// $ANTLR end "caseLabel"


	public static class forLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "forLoop"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:501:1: forLoop : ^( 'for' (init= variableDeclarationList |init= expressionList[true] ) condition= expressionList[true] update= expressionList[false] blockConditional ) -> for(init=$init.stcondition=$condition.stupdate=$update.stblock=$blockConditional.instructions);
	public final PHP54TranslatorWalker.forLoop_return forLoop() throws RecognitionException {
		PHP54TranslatorWalker.forLoop_return retval = new PHP54TranslatorWalker.forLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope init =null;
		TreeRuleReturnScope condition =null;
		TreeRuleReturnScope update =null;
		TreeRuleReturnScope blockConditional87 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:502:2: ( ^( 'for' (init= variableDeclarationList |init= expressionList[true] ) condition= expressionList[true] update= expressionList[false] blockConditional ) -> for(init=$init.stcondition=$condition.stupdate=$update.stblock=$blockConditional.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:502:4: ^( 'for' (init= variableDeclarationList |init= expressionList[true] ) condition= expressionList[true] update= expressionList[false] blockConditional )
			{
			match(input,For,FOLLOW_For_in_forLoop2971); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:4: (init= variableDeclarationList |init= expressionList[true] )
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==VARIABLE_DECLARATION_LIST) ) {
				alt55=1;
			}
			else if ( (LA55_0==EXPRESSION_LIST) ) {
				alt55=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:5: init= variableDeclarationList
					{
					pushFollow(FOLLOW_variableDeclarationList_in_forLoop2980);
					init=variableDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:34: init= expressionList[true]
					{
					pushFollow(FOLLOW_expressionList_in_forLoop2984);
					init=expressionList(true);
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_expressionList_in_forLoop2993);
			condition=expressionList(true);
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_expressionList_in_forLoop3001);
			update=expressionList(false);
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_blockConditional_in_forLoop3007);
			blockConditional87=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 508:3: -> for(init=$init.stcondition=$condition.stupdate=$update.stblock=$blockConditional.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("for",new STAttrMap().put("init", (init!=null?((StringTemplate)init.getTemplate()):null)).put("condition", (condition!=null?((StringTemplate)condition.getTemplate()):null)).put("update", (update!=null?((StringTemplate)update.getTemplate()):null)).put("block", (blockConditional87!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional87).instructions:null)));
			  }


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
	// $ANTLR end "forLoop"


	public static class expressionList_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expressionList"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:511:1: expressionList[boolean semicolonAtTheEnd] : ( ^( EXPRESSION_LIST (expr+= expression )* ) -> expressionList(expressions=$exprsemicolonAtTheEnd=semicolonAtTheEnd)| EXPRESSION_LIST -> expressionList(expressions=nullsemicolonAtTheEnd=semicolonAtTheEnd));
	public final PHP54TranslatorWalker.expressionList_return expressionList(boolean semicolonAtTheEnd) throws RecognitionException {
		PHP54TranslatorWalker.expressionList_return retval = new PHP54TranslatorWalker.expressionList_return();
		retval.start = input.LT(1);

		List<Object> list_expr=null;
		RuleReturnScope expr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:512:2: ( ^( EXPRESSION_LIST (expr+= expression )* ) -> expressionList(expressions=$exprsemicolonAtTheEnd=semicolonAtTheEnd)| EXPRESSION_LIST -> expressionList(expressions=nullsemicolonAtTheEnd=semicolonAtTheEnd))
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==EXPRESSION_LIST) ) {
				int LA57_1 = input.LA(2);
				if ( (LA57_1==DOWN) ) {
					alt57=1;
				}
				else if ( (LA57_1==BLOCK_CONDITIONAL||LA57_1==EXPRESSION_LIST) ) {
					alt57=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:512:4: ^( EXPRESSION_LIST (expr+= expression )* )
					{
					match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList3051); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:512:26: (expr+= expression )*
						loop56:
						do {
							int alt56=2;
							int LA56_0 = input.LA(1);
							if ( (LA56_0==ARRAY_ACCESS||(LA56_0 >= Assign && LA56_0 <= At)||(LA56_0 >= BitwiseAnd && LA56_0 <= Bool)||LA56_0==CASTING||LA56_0==CLASS_MEMBER_ACCESS||LA56_0==CLASS_STATIC_ACCESS||LA56_0==CONSTANT||LA56_0==Clone||(LA56_0 >= Divide && LA56_0 <= DivideAssign)||(LA56_0 >= Dot && LA56_0 <= DotAssign)||(LA56_0 >= Equal && LA56_0 <= Exit)||LA56_0==FUNCTION_CALL||LA56_0==Float||(LA56_0 >= GreaterEqualThan && LA56_0 <= GreaterThan)||LA56_0==Identical||(LA56_0 >= Instanceof && LA56_0 <= Int)||(LA56_0 >= LessEqualThan && LA56_0 <= METHOD_CALL_STATIC)||(LA56_0 >= Minus && LA56_0 <= MinusAssign)||(LA56_0 >= Modulo && LA56_0 <= MultiplyAssign)||(LA56_0 >= New && LA56_0 <= Null)||(LA56_0 >= POST_DECREMENT && LA56_0 <= PRE_INCREMENT)||(LA56_0 >= Plus && LA56_0 <= PlusAssign)||LA56_0==QuestionMark||(LA56_0 >= ShiftLeft && LA56_0 <= ShiftRightAssign)||LA56_0==String||LA56_0==This||LA56_0==TypeArray||LA56_0==UNARY_MINUS||LA56_0==VariableId) ) {
								alt56=1;
							}

							switch (alt56) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:512:26: expr+= expression
								{
								pushFollow(FOLLOW_expression_in_expressionList3055);
								expr=expression();
								state._fsp--;
								if (state.failed) return retval;
								if (list_expr==null) list_expr=new ArrayList<Object>();
								list_expr.add(expr.getTemplate());
								}
								break;

							default :
								break loop56;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 512:41: -> expressionList(expressions=$exprsemicolonAtTheEnd=semicolonAtTheEnd)
					  {
					  	retval.st = templateLib.getInstanceOf("expressionList",new STAttrMap().put("expressions", list_expr).put("semicolonAtTheEnd", semicolonAtTheEnd));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:513:4: EXPRESSION_LIST
					{
					match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList3076); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 513:20: -> expressionList(expressions=nullsemicolonAtTheEnd=semicolonAtTheEnd)
					  {
					  	retval.st = templateLib.getInstanceOf("expressionList",new STAttrMap().put("expressions", null).put("semicolonAtTheEnd", semicolonAtTheEnd));
					  }


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
	// $ANTLR end "expressionList"


	public static class expression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:516:1: expression options {backtrack=true; } : ( atom -> {$atom.st}| operator -> {$operator.st}| functionCall -> {$functionCall.st}| methodCall -> {$methodCall.st}| methodCallSelfOrParent -> {$methodCallSelfOrParent.st}| methodCallStatic -> {$methodCallStatic.st}| classStaticAccess -> {$classStaticAccess.st}| postFixExpression -> {$postFixExpression.st}| exit -> {$exit.st});
	public final PHP54TranslatorWalker.expression_return expression() throws RecognitionException {
		PHP54TranslatorWalker.expression_return retval = new PHP54TranslatorWalker.expression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope atom88 =null;
		TreeRuleReturnScope operator89 =null;
		TreeRuleReturnScope functionCall90 =null;
		TreeRuleReturnScope methodCall91 =null;
		TreeRuleReturnScope methodCallSelfOrParent92 =null;
		TreeRuleReturnScope methodCallStatic93 =null;
		TreeRuleReturnScope classStaticAccess94 =null;
		TreeRuleReturnScope postFixExpression95 =null;
		TreeRuleReturnScope exit96 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:518:2: ( atom -> {$atom.st}| operator -> {$operator.st}| functionCall -> {$functionCall.st}| methodCall -> {$methodCall.st}| methodCallSelfOrParent -> {$methodCallSelfOrParent.st}| methodCallStatic -> {$methodCallStatic.st}| classStaticAccess -> {$classStaticAccess.st}| postFixExpression -> {$postFixExpression.st}| exit -> {$exit.st})
			int alt58=9;
			switch ( input.LA(1) ) {
			case Bool:
			case CONSTANT:
			case Float:
			case Int:
			case Null:
			case String:
			case This:
			case TypeArray:
			case VariableId:
				{
				alt58=1;
				}
				break;
			case CLASS_STATIC_ACCESS:
				{
				int LA58_2 = input.LA(2);
				if ( (LA58_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case TYPE_NAME:
						{
						int LA58_11 = input.LA(4);
						if ( (LA58_11==CONSTANT) ) {
							int LA58_16 = input.LA(5);
							if ( (LA58_16==UP) ) {
								int LA58_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt58=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt58=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 58, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 58, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA58_11==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt58=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 58, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case Self:
						{
						int LA58_12 = input.LA(4);
						if ( (LA58_12==CONSTANT) ) {
							int LA58_16 = input.LA(5);
							if ( (LA58_16==UP) ) {
								int LA58_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt58=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt58=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 58, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 58, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA58_12==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt58=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 58, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case Parent:
						{
						int LA58_13 = input.LA(4);
						if ( (LA58_13==CONSTANT) ) {
							int LA58_16 = input.LA(5);
							if ( (LA58_16==UP) ) {
								int LA58_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt58=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt58=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 58, 18, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 58, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA58_13==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt58=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 58, 13, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 58, 9, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Assign:
			case At:
			case BitwiseAnd:
			case BitwiseAndAssign:
			case BitwiseNot:
			case BitwiseOr:
			case BitwiseOrAssign:
			case BitwiseXor:
			case BitwiseXorAssign:
			case CASTING:
			case Clone:
			case Divide:
			case DivideAssign:
			case Dot:
			case DotAssign:
			case Equal:
			case GreaterEqualThan:
			case GreaterThan:
			case Identical:
			case Instanceof:
			case LessEqualThan:
			case LessThan:
			case LogicAnd:
			case LogicAndWeak:
			case LogicNot:
			case LogicOr:
			case LogicOrWeak:
			case LogicXorWeak:
			case Minus:
			case MinusAssign:
			case Modulo:
			case ModuloAssign:
			case Multiply:
			case MultiplyAssign:
			case New:
			case NotEqual:
			case NotEqualAlternative:
			case NotIdentical:
			case POST_DECREMENT:
			case POST_INCREMENT:
			case PRE_DECREMENT:
			case PRE_INCREMENT:
			case Plus:
			case PlusAssign:
			case QuestionMark:
			case ShiftLeft:
			case ShiftLeftAssign:
			case ShiftRight:
			case ShiftRightAssign:
			case UNARY_MINUS:
				{
				alt58=2;
				}
				break;
			case FUNCTION_CALL:
				{
				alt58=3;
				}
				break;
			case METHOD_CALL:
				{
				int LA58_5 = input.LA(2);
				if ( (LA58_5==DOWN) ) {
					int LA58_10 = input.LA(3);
					if ( (LA58_10==This||LA58_10==VariableId) ) {
						alt58=4;
					}
					else if ( (LA58_10==Parent||LA58_10==Self) ) {
						alt58=5;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 58, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case METHOD_CALL_STATIC:
				{
				alt58=6;
				}
				break;
			case ARRAY_ACCESS:
			case CLASS_MEMBER_ACCESS:
			case METHOD_CALL_POSTFIX:
				{
				alt58=8;
				}
				break;
			case Exit:
				{
				alt58=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:518:7: atom
					{
					pushFollow(FOLLOW_atom_in_expression3111);
					atom88=atom();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 518:15: -> {$atom.st}
					  {
					  	retval.st = (atom88!=null?((StringTemplate)atom88.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:519:4: operator
					{
					pushFollow(FOLLOW_operator_in_expression3123);
					operator89=operator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 519:14: -> {$operator.st}
					  {
					  	retval.st = (operator89!=null?((StringTemplate)operator89.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:520:8: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_expression3137);
					functionCall90=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 520:23: -> {$functionCall.st}
					  {
					  	retval.st = (functionCall90!=null?((StringTemplate)functionCall90.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:521:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_expression3148);
					methodCall91=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 521:17: -> {$methodCall.st}
					  {
					  	retval.st = (methodCall91!=null?((StringTemplate)methodCall91.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:522:4: methodCallSelfOrParent
					{
					pushFollow(FOLLOW_methodCallSelfOrParent_in_expression3159);
					methodCallSelfOrParent92=methodCallSelfOrParent();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 522:28: -> {$methodCallSelfOrParent.st}
					  {
					  	retval.st = (methodCallSelfOrParent92!=null?((StringTemplate)methodCallSelfOrParent92.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:523:4: methodCallStatic
					{
					pushFollow(FOLLOW_methodCallStatic_in_expression3169);
					methodCallStatic93=methodCallStatic();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 523:22: -> {$methodCallStatic.st}
					  {
					  	retval.st = (methodCallStatic93!=null?((StringTemplate)methodCallStatic93.getTemplate()):null);
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:524:4: classStaticAccess
					{
					pushFollow(FOLLOW_classStaticAccess_in_expression3179);
					classStaticAccess94=classStaticAccess();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 524:22: -> {$classStaticAccess.st}
					  {
					  	retval.st = (classStaticAccess94!=null?((StringTemplate)classStaticAccess94.getTemplate()):null);
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:525:4: postFixExpression
					{
					pushFollow(FOLLOW_postFixExpression_in_expression3188);
					postFixExpression95=postFixExpression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 525:22: -> {$postFixExpression.st}
					  {
					  	retval.st = (postFixExpression95!=null?((StringTemplate)postFixExpression95.getTemplate()):null);
					  }


					}

					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:526:4: exit
					{
					pushFollow(FOLLOW_exit_in_expression3197);
					exit96=exit();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 526:11: -> {$exit.st}
					  {
					  	retval.st = (exit96!=null?((StringTemplate)exit96.getTemplate()):null);
					  }


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
	// $ANTLR end "expression"


	public static class atom_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atom"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:529:1: atom : ( primitiveAtom -> {$primitiveAtom.st}| ^( TypeArray (keyValuePairs+= arrayKeyValue )* ) -> array(content=$keyValuePairs)| VariableId -> {%{$VariableId.text}}| This -> {%{$This.text}}| CONSTANT -> {%{$CONSTANT.text}}| ^( CLASS_STATIC_ACCESS staticAccess CONSTANT ) -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text));
	public final PHP54TranslatorWalker.atom_return atom() throws RecognitionException {
		PHP54TranslatorWalker.atom_return retval = new PHP54TranslatorWalker.atom_return();
		retval.start = input.LT(1);

		ITSPHPAst VariableId98=null;
		ITSPHPAst This99=null;
		ITSPHPAst CONSTANT100=null;
		ITSPHPAst CONSTANT102=null;
		List<Object> list_keyValuePairs=null;
		TreeRuleReturnScope primitiveAtom97 =null;
		TreeRuleReturnScope staticAccess101 =null;
		RuleReturnScope keyValuePairs = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:530:2: ( primitiveAtom -> {$primitiveAtom.st}| ^( TypeArray (keyValuePairs+= arrayKeyValue )* ) -> array(content=$keyValuePairs)| VariableId -> {%{$VariableId.text}}| This -> {%{$This.text}}| CONSTANT -> {%{$CONSTANT.text}}| ^( CLASS_STATIC_ACCESS staticAccess CONSTANT ) -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text))
			int alt60=6;
			switch ( input.LA(1) ) {
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt60=1;
				}
				break;
			case TypeArray:
				{
				alt60=2;
				}
				break;
			case VariableId:
				{
				alt60=3;
				}
				break;
			case This:
				{
				alt60=4;
				}
				break;
			case CONSTANT:
				{
				alt60=5;
				}
				break;
			case CLASS_STATIC_ACCESS:
				{
				alt60=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:530:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom3220);
					primitiveAtom97=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 530:23: -> {$primitiveAtom.st}
					  {
					  	retval.st = (primitiveAtom97!=null?((StringTemplate)primitiveAtom97.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:531:4: ^( TypeArray (keyValuePairs+= arrayKeyValue )* )
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_atom3235); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:531:29: (keyValuePairs+= arrayKeyValue )*
						loop59:
						do {
							int alt59=2;
							int LA59_0 = input.LA(1);
							if ( (LA59_0==ARRAY_ACCESS||LA59_0==Arrow||(LA59_0 >= Assign && LA59_0 <= At)||(LA59_0 >= BitwiseAnd && LA59_0 <= Bool)||LA59_0==CASTING||LA59_0==CLASS_MEMBER_ACCESS||LA59_0==CLASS_STATIC_ACCESS||LA59_0==CONSTANT||LA59_0==Clone||(LA59_0 >= Divide && LA59_0 <= DivideAssign)||(LA59_0 >= Dot && LA59_0 <= DotAssign)||(LA59_0 >= Equal && LA59_0 <= Exit)||LA59_0==FUNCTION_CALL||LA59_0==Float||(LA59_0 >= GreaterEqualThan && LA59_0 <= GreaterThan)||LA59_0==Identical||(LA59_0 >= Instanceof && LA59_0 <= Int)||(LA59_0 >= LessEqualThan && LA59_0 <= METHOD_CALL_STATIC)||(LA59_0 >= Minus && LA59_0 <= MinusAssign)||(LA59_0 >= Modulo && LA59_0 <= MultiplyAssign)||(LA59_0 >= New && LA59_0 <= Null)||(LA59_0 >= POST_DECREMENT && LA59_0 <= PRE_INCREMENT)||(LA59_0 >= Plus && LA59_0 <= PlusAssign)||LA59_0==QuestionMark||(LA59_0 >= ShiftLeft && LA59_0 <= ShiftRightAssign)||LA59_0==String||LA59_0==This||LA59_0==TypeArray||LA59_0==UNARY_MINUS||LA59_0==VariableId) ) {
								alt59=1;
							}

							switch (alt59) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:531:29: keyValuePairs+= arrayKeyValue
								{
								pushFollow(FOLLOW_arrayKeyValue_in_atom3239);
								keyValuePairs=arrayKeyValue();
								state._fsp--;
								if (state.failed) return retval;
								if (list_keyValuePairs==null) list_keyValuePairs=new ArrayList<Object>();
								list_keyValuePairs.add(keyValuePairs.getTemplate());
								}
								break;

							default :
								break loop59;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 531:47: -> array(content=$keyValuePairs)
					  {
					  	retval.st = templateLib.getInstanceOf("array",new STAttrMap().put("content", list_keyValuePairs));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:532:4: VariableId
					{
					VariableId98=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_atom3256); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 532:20: -> {%{$VariableId.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(VariableId98!=null?VariableId98.getText():null));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:533:4: This
					{
					This99=(ITSPHPAst)match(input,This,FOLLOW_This_in_atom3270); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 533:14: -> {%{$This.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(This99!=null?This99.getText():null));
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:534:4: CONSTANT
					{
					CONSTANT100=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_atom3284); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 534:17: -> {%{$CONSTANT.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(CONSTANT100!=null?CONSTANT100.getText():null));
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:535:4: ^( CLASS_STATIC_ACCESS staticAccess CONSTANT )
					{
					match(input,CLASS_STATIC_ACCESS,FOLLOW_CLASS_STATIC_ACCESS_in_atom3298); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_staticAccess_in_atom3300);
					staticAccess101=staticAccess();
					state._fsp--;
					if (state.failed) return retval;
					CONSTANT102=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_atom3302); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 535:52: -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text)
					  {
					  	retval.st = templateLib.getInstanceOf("classConstant",new STAttrMap().put("accessor", (staticAccess101!=null?((StringTemplate)staticAccess101.getTemplate()):null)).put("constant", (CONSTANT102!=null?CONSTANT102.getText():null)));
					  }


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
	// $ANTLR end "atom"


	public static class primitiveAtom_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "primitiveAtom"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:538:1: primitiveAtom : ( Bool | Int | Float | String | Null );
	public final PHP54TranslatorWalker.primitiveAtom_return primitiveAtom() throws RecognitionException {
		PHP54TranslatorWalker.primitiveAtom_return retval = new PHP54TranslatorWalker.primitiveAtom_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:540:2: ( Bool | Int | Float | String | Null )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:
			{
			if ( input.LA(1)==Bool||input.LA(1)==Float||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			if ( state.backtracking==0 ) {retval.st = new StringTemplate(templateLib,((ITSPHPAst)retval.start).getText());}
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
	// $ANTLR end "primitiveAtom"


	public static class arrayKeyValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayKeyValue"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:547:1: arrayKeyValue : ( ^( '=>' key= expression value= expression ) -> keyValue(key=$key.stvalue=$value.st)| expression -> {$expression.st});
	public final PHP54TranslatorWalker.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		PHP54TranslatorWalker.arrayKeyValue_return retval = new PHP54TranslatorWalker.arrayKeyValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope key =null;
		TreeRuleReturnScope value =null;
		TreeRuleReturnScope expression103 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:548:2: ( ^( '=>' key= expression value= expression ) -> keyValue(key=$key.stvalue=$value.st)| expression -> {$expression.st})
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==Arrow) ) {
				alt61=1;
			}
			else if ( (LA61_0==ARRAY_ACCESS||(LA61_0 >= Assign && LA61_0 <= At)||(LA61_0 >= BitwiseAnd && LA61_0 <= Bool)||LA61_0==CASTING||LA61_0==CLASS_MEMBER_ACCESS||LA61_0==CLASS_STATIC_ACCESS||LA61_0==CONSTANT||LA61_0==Clone||(LA61_0 >= Divide && LA61_0 <= DivideAssign)||(LA61_0 >= Dot && LA61_0 <= DotAssign)||(LA61_0 >= Equal && LA61_0 <= Exit)||LA61_0==FUNCTION_CALL||LA61_0==Float||(LA61_0 >= GreaterEqualThan && LA61_0 <= GreaterThan)||LA61_0==Identical||(LA61_0 >= Instanceof && LA61_0 <= Int)||(LA61_0 >= LessEqualThan && LA61_0 <= METHOD_CALL_STATIC)||(LA61_0 >= Minus && LA61_0 <= MinusAssign)||(LA61_0 >= Modulo && LA61_0 <= MultiplyAssign)||(LA61_0 >= New && LA61_0 <= Null)||(LA61_0 >= POST_DECREMENT && LA61_0 <= PRE_INCREMENT)||(LA61_0 >= Plus && LA61_0 <= PlusAssign)||LA61_0==QuestionMark||(LA61_0 >= ShiftLeft && LA61_0 <= ShiftRightAssign)||LA61_0==String||LA61_0==This||LA61_0==TypeArray||LA61_0==UNARY_MINUS||LA61_0==VariableId) ) {
				alt61=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:548:4: ^( '=>' key= expression value= expression )
					{
					match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue3373); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_arrayKeyValue3377);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_arrayKeyValue3381);
					value=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 548:44: -> keyValue(key=$key.stvalue=$value.st)
					  {
					  	retval.st = templateLib.getInstanceOf("keyValue",new STAttrMap().put("key", (key!=null?((StringTemplate)key.getTemplate()):null)).put("value", (value!=null?((StringTemplate)value.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:549:4: expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue3401);
					expression103=expression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 549:15: -> {$expression.st}
					  {
					  	retval.st = (expression103!=null?((StringTemplate)expression103.getTemplate()):null);
					  }


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
	// $ANTLR end "arrayKeyValue"


	public static class staticAccess_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "staticAccess"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:552:1: staticAccess : ( TYPE_NAME -> {%{$TYPE_NAME.text}}| Self -> {%{$Self.text}}| Parent -> {%{$Parent.text}});
	public final PHP54TranslatorWalker.staticAccess_return staticAccess() throws RecognitionException {
		PHP54TranslatorWalker.staticAccess_return retval = new PHP54TranslatorWalker.staticAccess_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME104=null;
		ITSPHPAst Self105=null;
		ITSPHPAst Parent106=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:553:3: ( TYPE_NAME -> {%{$TYPE_NAME.text}}| Self -> {%{$Self.text}}| Parent -> {%{$Parent.text}})
			int alt62=3;
			switch ( input.LA(1) ) {
			case TYPE_NAME:
				{
				alt62=1;
				}
				break;
			case Self:
				{
				alt62=2;
				}
				break;
			case Parent:
				{
				alt62=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:553:5: TYPE_NAME
					{
					TYPE_NAME104=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_staticAccess3418); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 553:15: -> {%{$TYPE_NAME.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TYPE_NAME104!=null?TYPE_NAME104.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:554:5: Self
					{
					Self105=(ITSPHPAst)match(input,Self,FOLLOW_Self_in_staticAccess3428); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 554:10: -> {%{$Self.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Self105!=null?Self105.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:555:5: Parent
					{
					Parent106=(ITSPHPAst)match(input,Parent,FOLLOW_Parent_in_staticAccess3438); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 555:12: -> {%{$Parent.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Parent106!=null?Parent106.getText():null));
					  }


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
	// $ANTLR end "staticAccess"


	public static class operator_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "operator"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:558:1: operator : ( ^( unaryPreOperator expr= expression ) -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)| ^( unaryPostOperator expr= expression ) -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)| ^( binaryOperator left= expression right= expression ) -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)| ^( QuestionMark cond= expression ifCase= expression elseCase= expression ) -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))| castingOperator -> {$castingOperator.st}| ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) ) -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))| newOperator -> {$newOperator.st}| ^( 'clone' expr= expression ) -> clone(expression=$expr.st));
	public final PHP54TranslatorWalker.operator_return operator() throws RecognitionException {
		PHP54TranslatorWalker.operator_return retval = new PHP54TranslatorWalker.operator_return();
		retval.start = input.LT(1);

		ITSPHPAst type=null;
		ITSPHPAst QuestionMark110=null;
		ITSPHPAst Instanceof112=null;
		TreeRuleReturnScope expr =null;
		TreeRuleReturnScope left =null;
		TreeRuleReturnScope right =null;
		TreeRuleReturnScope cond =null;
		TreeRuleReturnScope ifCase =null;
		TreeRuleReturnScope elseCase =null;
		TreeRuleReturnScope unaryPreOperator107 =null;
		TreeRuleReturnScope unaryPostOperator108 =null;
		TreeRuleReturnScope binaryOperator109 =null;
		TreeRuleReturnScope castingOperator111 =null;
		TreeRuleReturnScope newOperator113 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:559:3: ( ^( unaryPreOperator expr= expression ) -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)| ^( unaryPostOperator expr= expression ) -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)| ^( binaryOperator left= expression right= expression ) -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)| ^( QuestionMark cond= expression ifCase= expression elseCase= expression ) -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))| castingOperator -> {$castingOperator.st}| ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) ) -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))| newOperator -> {$newOperator.st}| ^( 'clone' expr= expression ) -> clone(expression=$expr.st))
			int alt64=8;
			switch ( input.LA(1) ) {
			case At:
			case BitwiseNot:
			case LogicNot:
			case PRE_DECREMENT:
			case PRE_INCREMENT:
			case UNARY_MINUS:
				{
				alt64=1;
				}
				break;
			case POST_DECREMENT:
			case POST_INCREMENT:
				{
				alt64=2;
				}
				break;
			case Assign:
			case BitwiseAnd:
			case BitwiseAndAssign:
			case BitwiseOr:
			case BitwiseOrAssign:
			case BitwiseXor:
			case BitwiseXorAssign:
			case Divide:
			case DivideAssign:
			case Dot:
			case DotAssign:
			case Equal:
			case GreaterEqualThan:
			case GreaterThan:
			case Identical:
			case LessEqualThan:
			case LessThan:
			case LogicAnd:
			case LogicAndWeak:
			case LogicOr:
			case LogicOrWeak:
			case LogicXorWeak:
			case Minus:
			case MinusAssign:
			case Modulo:
			case ModuloAssign:
			case Multiply:
			case MultiplyAssign:
			case NotEqual:
			case NotEqualAlternative:
			case NotIdentical:
			case Plus:
			case PlusAssign:
			case ShiftLeft:
			case ShiftLeftAssign:
			case ShiftRight:
			case ShiftRightAssign:
				{
				alt64=3;
				}
				break;
			case QuestionMark:
				{
				alt64=4;
				}
				break;
			case CASTING:
				{
				alt64=5;
				}
				break;
			case Instanceof:
				{
				alt64=6;
				}
				break;
			case New:
				{
				alt64=7;
				}
				break;
			case Clone:
				{
				alt64=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:559:5: ^( unaryPreOperator expr= expression )
					{
					pushFollow(FOLLOW_unaryPreOperator_in_operator3457);
					unaryPreOperator107=unaryPreOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3461);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 559:46: -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPreOperator",new STAttrMap().put("operator", (unaryPreOperator107!=null?((StringTemplate)unaryPreOperator107.getTemplate()):null)).put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:560:4: ^( unaryPostOperator expr= expression )
					{
					pushFollow(FOLLOW_unaryPostOperator_in_operator3490);
					unaryPostOperator108=unaryPostOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3494);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 560:45: -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPostOperator",new STAttrMap().put("operator", (unaryPostOperator108!=null?((StringTemplate)unaryPostOperator108.getTemplate()):null)).put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:561:4: ^( binaryOperator left= expression right= expression )
					{
					pushFollow(FOLLOW_binaryOperator_in_operator3523);
					binaryOperator109=binaryOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3527);
					left=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3531);
					right=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 561:58: -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)
					  {
					  	retval.st = templateLib.getInstanceOf("binaryOperator",new STAttrMap().put("operator", (binaryOperator109!=null?((StringTemplate)binaryOperator109.getTemplate()):null)).put("left", (left!=null?((StringTemplate)left.getTemplate()):null)).put("right", (right!=null?((StringTemplate)right.getTemplate()):null)).put("needParentheses", (binaryOperator109!=null?((PHP54TranslatorWalker.binaryOperator_return)binaryOperator109).needParentheses:false)));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:562:4: ^( QuestionMark cond= expression ifCase= expression elseCase= expression )
					{
					QuestionMark110=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_operator3565); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3569);
					cond=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3573);
					ifCase=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3577);
					elseCase=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 562:75: -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))
					  {
					  	retval.st = templateLib.getInstanceOf("ternaryOperator",new STAttrMap().put("cond", (cond!=null?((StringTemplate)cond.getTemplate()):null)).put("ifCase", (ifCase!=null?((StringTemplate)ifCase.getTemplate()):null)).put("elseCase", (elseCase!=null?((StringTemplate)elseCase.getTemplate()):null)).put("needParentheses", precedenceHelper.needParentheses(QuestionMark110)));
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:563:4: castingOperator
					{
					pushFollow(FOLLOW_castingOperator_in_operator3608);
					castingOperator111=castingOperator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 563:27: -> {$castingOperator.st}
					  {
					  	retval.st = (castingOperator111!=null?((StringTemplate)castingOperator111.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:564:4: ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) )
					{
					Instanceof112=(ITSPHPAst)match(input,Instanceof,FOLLOW_Instanceof_in_operator3625); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3629);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:564:33: (type= TYPE_NAME |type= VariableId )
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==TYPE_NAME) ) {
						alt63=1;
					}
					else if ( (LA63_0==VariableId) ) {
						alt63=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 63, 0, input);
						throw nvae;
					}
					switch (alt63) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:564:34: type= TYPE_NAME
							{
							type=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_operator3634); if (state.failed) return retval;
							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:564:49: type= VariableId
							{
							type=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_operator3638); if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 564:69: -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))
					  {
					  	retval.st = templateLib.getInstanceOf("instanceof",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)).put("type", (type!=null?type.getText():null)).put("needParentheses", precedenceHelper.needParentheses(Instanceof112)));
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:565:4: newOperator
					{
					pushFollow(FOLLOW_newOperator_in_operator3666);
					newOperator113=newOperator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 565:23: -> {$newOperator.st}
					  {
					  	retval.st = (newOperator113!=null?((StringTemplate)newOperator113.getTemplate()):null);
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:566:8: ^( 'clone' expr= expression )
					{
					match(input,Clone,FOLLOW_Clone_in_operator3687); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3691);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 566:40: -> clone(expression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("clone",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


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
	// $ANTLR end "operator"


	public static class unaryPreOperator_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unaryPreOperator"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:569:1: unaryPreOperator : ( PRE_INCREMENT -> {%{\"++\"}}| PRE_DECREMENT -> {%{\"--\"}}| '@' -> {%{\"@\"}}| '~' -> {%{\"~\"}}| '!' -> {%{\"!\"}}| UNARY_MINUS -> {%{\"-\"}});
	public final PHP54TranslatorWalker.unaryPreOperator_return unaryPreOperator() throws RecognitionException {
		PHP54TranslatorWalker.unaryPreOperator_return retval = new PHP54TranslatorWalker.unaryPreOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:570:2: ( PRE_INCREMENT -> {%{\"++\"}}| PRE_DECREMENT -> {%{\"--\"}}| '@' -> {%{\"@\"}}| '~' -> {%{\"~\"}}| '!' -> {%{\"!\"}}| UNARY_MINUS -> {%{\"-\"}})
			int alt65=6;
			switch ( input.LA(1) ) {
			case PRE_INCREMENT:
				{
				alt65=1;
				}
				break;
			case PRE_DECREMENT:
				{
				alt65=2;
				}
				break;
			case At:
				{
				alt65=3;
				}
				break;
			case BitwiseNot:
				{
				alt65=4;
				}
				break;
			case LogicNot:
				{
				alt65=5;
				}
				break;
			case UNARY_MINUS:
				{
				alt65=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 65, 0, input);
				throw nvae;
			}
			switch (alt65) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:570:4: PRE_INCREMENT
					{
					match(input,PRE_INCREMENT,FOLLOW_PRE_INCREMENT_in_unaryPreOperator3722); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 570:18: -> {%{\"++\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"++");
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:571:8: PRE_DECREMENT
					{
					match(input,PRE_DECREMENT,FOLLOW_PRE_DECREMENT_in_unaryPreOperator3735); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 571:23: -> {%{\"--\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"--");
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:572:8: '@'
					{
					match(input,At,FOLLOW_At_in_unaryPreOperator3749); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 572:14: -> {%{\"@\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"@");
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:573:8: '~'
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_unaryPreOperator3764); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 573:14: -> {%{\"~\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"~");
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:574:8: '!'
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_unaryPreOperator3779); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 574:14: -> {%{\"!\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"!");
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:575:8: UNARY_MINUS
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unaryPreOperator3794); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 575:20: -> {%{\"-\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"-");
					  }


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
	// $ANTLR end "unaryPreOperator"


	public static class unaryPostOperator_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unaryPostOperator"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:578:1: unaryPostOperator : ( POST_INCREMENT -> {%{\"++\"}}| POST_DECREMENT -> {%{\"--\"}});
	public final PHP54TranslatorWalker.unaryPostOperator_return unaryPostOperator() throws RecognitionException {
		PHP54TranslatorWalker.unaryPostOperator_return retval = new PHP54TranslatorWalker.unaryPostOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:579:2: ( POST_INCREMENT -> {%{\"++\"}}| POST_DECREMENT -> {%{\"--\"}})
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==POST_INCREMENT) ) {
				alt66=1;
			}
			else if ( (LA66_0==POST_DECREMENT) ) {
				alt66=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:579:4: POST_INCREMENT
					{
					match(input,POST_INCREMENT,FOLLOW_POST_INCREMENT_in_unaryPostOperator3818); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 579:19: -> {%{\"++\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"++");
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:580:8: POST_DECREMENT
					{
					match(input,POST_DECREMENT,FOLLOW_POST_DECREMENT_in_unaryPostOperator3831); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 580:23: -> {%{\"--\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"--");
					  }


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
	// $ANTLR end "unaryPostOperator"


	public static class binaryOperator_return extends TreeRuleReturnScope {
		public boolean needParentheses;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "binaryOperator"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:583:1: binaryOperator returns [boolean needParentheses] : ( 'or' | 'xor' | 'and' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' | '||' | '&&' | '|' | '^' | '&' | '==' | '!=' | '<>' | '===' | '!==' | '<' | '<=' | '>' | '>=' | '<<' | '>>' | '+' | '-' | '.' | '*' | '/' | '%' );
	public final PHP54TranslatorWalker.binaryOperator_return binaryOperator() throws RecognitionException {
		PHP54TranslatorWalker.binaryOperator_return retval = new PHP54TranslatorWalker.binaryOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:588:2: ( 'or' | 'xor' | 'and' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' | '||' | '&&' | '|' | '^' | '&' | '==' | '!=' | '<>' | '===' | '!==' | '<' | '<=' | '>' | '>=' | '<<' | '>>' | '+' | '-' | '.' | '*' | '/' | '%' )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:
			{
			if ( input.LA(1)==Assign||(input.LA(1) >= BitwiseAnd && input.LA(1) <= BitwiseAndAssign)||(input.LA(1) >= BitwiseOr && input.LA(1) <= BitwiseXorAssign)||(input.LA(1) >= Divide && input.LA(1) <= DivideAssign)||(input.LA(1) >= Dot && input.LA(1) <= DotAssign)||input.LA(1)==Equal||(input.LA(1) >= GreaterEqualThan && input.LA(1) <= GreaterThan)||input.LA(1)==Identical||(input.LA(1) >= LessEqualThan && input.LA(1) <= LogicAndWeak)||(input.LA(1) >= LogicOr && input.LA(1) <= LogicXorWeak)||(input.LA(1) >= Minus && input.LA(1) <= MinusAssign)||(input.LA(1) >= Modulo && input.LA(1) <= MultiplyAssign)||(input.LA(1) >= NotEqual && input.LA(1) <= NotIdentical)||(input.LA(1) >= Plus && input.LA(1) <= PlusAssign)||(input.LA(1) >= ShiftLeft && input.LA(1) <= ShiftRightAssign) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			if ( state.backtracking==0 ) {
			    retval.st = templateLib.getInstanceOf("operator",new STAttrMap().put("o", ((ITSPHPAst)retval.start).getText()));
			    retval.needParentheses = precedenceHelper.needParentheses(((ITSPHPAst)retval.start));
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
	// $ANTLR end "binaryOperator"


	public static class castingOperator_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "castingOperator"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:635:1: castingOperator : ( ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression ) -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)| ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression ) -> cast(type=$TYPE_NAME.textexpression=$expression.st));
	public final PHP54TranslatorWalker.castingOperator_return castingOperator() throws RecognitionException {
		PHP54TranslatorWalker.castingOperator_return retval = new PHP54TranslatorWalker.castingOperator_return();
		retval.start = input.LT(1);

		ITSPHPAst isNullable=null;
		ITSPHPAst TYPE_NAME115=null;
		TreeRuleReturnScope type =null;
		TreeRuleReturnScope expression114 =null;
		TreeRuleReturnScope expression116 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:636:2: ( ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression ) -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)| ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression ) -> cast(type=$TYPE_NAME.textexpression=$expression.st))
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==CASTING) ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1==DOWN) ) {
					int LA74_2 = input.LA(3);
					if ( (LA74_2==TYPE) ) {
						int LA74_3 = input.LA(4);
						if ( (LA74_3==DOWN) ) {
							int LA74_4 = input.LA(5);
							if ( (LA74_4==TYPE_MODIFIER) ) {
								switch ( input.LA(6) ) {
								case DOWN:
									{
									switch ( input.LA(7) ) {
									case Cast:
										{
										int LA74_9 = input.LA(8);
										if ( (LA74_9==QuestionMark) ) {
											int LA74_10 = input.LA(9);
											if ( (LA74_10==UP) ) {
												int LA74_11 = input.LA(10);
												if ( ((LA74_11 >= TypeArray && LA74_11 <= TypeInt)||LA74_11==TypeString) ) {
													alt74=1;
												}
												else if ( (LA74_11==TYPE_NAME) ) {
													alt74=2;
												}
												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 74, 11, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 74, 10, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else if ( (LA74_9==UP) ) {
											int LA74_11 = input.LA(9);
											if ( ((LA74_11 >= TypeArray && LA74_11 <= TypeInt)||LA74_11==TypeString) ) {
												alt74=1;
											}
											else if ( (LA74_11==TYPE_NAME) ) {
												alt74=2;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 74, 11, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 74, 9, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case QuestionMark:
										{
										int LA74_10 = input.LA(8);
										if ( (LA74_10==UP) ) {
											int LA74_11 = input.LA(9);
											if ( ((LA74_11 >= TypeArray && LA74_11 <= TypeInt)||LA74_11==TypeString) ) {
												alt74=1;
											}
											else if ( (LA74_11==TYPE_NAME) ) {
												alt74=2;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 74, 11, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 74, 10, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case UP:
										{
										int LA74_11 = input.LA(8);
										if ( ((LA74_11 >= TypeArray && LA74_11 <= TypeInt)||LA74_11==TypeString) ) {
											alt74=1;
										}
										else if ( (LA74_11==TYPE_NAME) ) {
											alt74=2;
										}
										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 74, 11, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									default:
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++)
												input.consume();
											NoViableAltException nvae =
												new NoViableAltException("", 74, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}
									}
									break;
								case TypeArray:
								case TypeBool:
								case TypeFloat:
								case TypeInt:
								case TypeString:
									{
									alt74=1;
									}
									break;
								case TYPE_NAME:
									{
									alt74=2;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 74, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++)
										input.consume();
									NoViableAltException nvae =
										new NoViableAltException("", 74, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 74, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 74, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:636:4: ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression )
					{
					match(input,CASTING,FOLLOW_CASTING_in_castingOperator4095); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_castingOperator4101); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:638:5: ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER )
					int alt69=2;
					int LA69_0 = input.LA(1);
					if ( (LA69_0==TYPE_MODIFIER) ) {
						int LA69_1 = input.LA(2);
						if ( (LA69_1==DOWN) ) {
							alt69=1;
						}
						else if ( ((LA69_1 >= TypeArray && LA69_1 <= TypeInt)||LA69_1==TypeString) ) {
							alt69=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 69, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 69, 0, input);
						throw nvae;
					}
					switch (alt69) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:638:7: ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? )
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator4111); if (state.failed) return retval;
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:638:23: ( Cast )?
								int alt67=2;
								int LA67_0 = input.LA(1);
								if ( (LA67_0==Cast) ) {
									alt67=1;
								}
								switch (alt67) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:638:23: Cast
										{
										match(input,Cast,FOLLOW_Cast_in_castingOperator4113); if (state.failed) return retval;
										}
										break;

								}

								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:638:29: (isNullable= '?' )?
								int alt68=2;
								int LA68_0 = input.LA(1);
								if ( (LA68_0==QuestionMark) ) {
									alt68=1;
								}
								switch (alt68) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:638:30: isNullable= '?'
										{
										isNullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_castingOperator4119); if (state.failed) return retval;
										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:639:7: TYPE_MODIFIER
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator4130); if (state.failed) return retval;
							}
							break;

					}

					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:641:5: (type= scalarTypes |type= arrayType )
					int alt70=2;
					int LA70_0 = input.LA(1);
					if ( ((LA70_0 >= TypeBool && LA70_0 <= TypeInt)||LA70_0==TypeString) ) {
						alt70=1;
					}
					else if ( (LA70_0==TypeArray) ) {
						alt70=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 70, 0, input);
						throw nvae;
					}
					switch (alt70) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:641:6: type= scalarTypes
							{
							pushFollow(FOLLOW_scalarTypes_in_castingOperator4145);
							type=scalarTypes();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:641:23: type= arrayType
							{
							pushFollow(FOLLOW_arrayType_in_castingOperator4149);
							type=arrayType();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					pushFollow(FOLLOW_expression_in_castingOperator4160);
					expression114=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 645:3: -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("primitiveCast",new STAttrMap().put("isNotNullable", isNullable!=null).put("type", (type!=null?((StringTemplate)type.getTemplate()):null)).put("expression", (expression114!=null?((StringTemplate)expression114.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:647:4: ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression )
					{
					match(input,CASTING,FOLLOW_CASTING_in_castingOperator4196); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_castingOperator4202); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:649:5: ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER )
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==TYPE_MODIFIER) ) {
						int LA73_1 = input.LA(2);
						if ( (LA73_1==DOWN) ) {
							alt73=1;
						}
						else if ( (LA73_1==TYPE_NAME) ) {
							alt73=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 73, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 73, 0, input);
						throw nvae;
					}
					switch (alt73) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:649:7: ^( TYPE_MODIFIER ( Cast )? ( '?' )? )
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator4212); if (state.failed) return retval;
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:649:23: ( Cast )?
								int alt71=2;
								int LA71_0 = input.LA(1);
								if ( (LA71_0==Cast) ) {
									alt71=1;
								}
								switch (alt71) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:649:23: Cast
										{
										match(input,Cast,FOLLOW_Cast_in_castingOperator4214); if (state.failed) return retval;
										}
										break;

								}

								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:649:29: ( '?' )?
								int alt72=2;
								int LA72_0 = input.LA(1);
								if ( (LA72_0==QuestionMark) ) {
									alt72=1;
								}
								switch (alt72) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:649:29: '?'
										{
										match(input,QuestionMark,FOLLOW_QuestionMark_in_castingOperator4217); if (state.failed) return retval;
										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:650:7: TYPE_MODIFIER
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator4227); if (state.failed) return retval;
							}
							break;

					}

					TYPE_NAME115=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_castingOperator4239); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					pushFollow(FOLLOW_expression_in_castingOperator4249);
					expression116=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 656:3: -> cast(type=$TYPE_NAME.textexpression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("cast",new STAttrMap().put("type", (TYPE_NAME115!=null?TYPE_NAME115.getText():null)).put("expression", (expression116!=null?((StringTemplate)expression116.getTemplate()):null)));
					  }


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
	// $ANTLR end "castingOperator"


	public static class newOperator_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "newOperator"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:659:1: newOperator : ^( 'new' type= TYPE_NAME actualParameters ) -> new(type=$type.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.newOperator_return newOperator() throws RecognitionException {
		PHP54TranslatorWalker.newOperator_return retval = new PHP54TranslatorWalker.newOperator_return();
		retval.start = input.LT(1);

		ITSPHPAst type=null;
		TreeRuleReturnScope actualParameters117 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:660:2: ( ^( 'new' type= TYPE_NAME actualParameters ) -> new(type=$type.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:660:4: ^( 'new' type= TYPE_NAME actualParameters )
			{
			match(input,New,FOLLOW_New_in_newOperator4282); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			type=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_newOperator4290); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_newOperator4296);
			actualParameters117=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 664:3: -> new(type=$type.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("new",new STAttrMap().put("type", (type!=null?type.getText():null)).put("parameters", (actualParameters117!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters117).parameters:null)));
			  }


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
	// $ANTLR end "newOperator"


	public static class actualParameters_return extends TreeRuleReturnScope {
		public List<Object> parameters;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "actualParameters"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:667:1: actualParameters returns [List<Object> parameters] : ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS ) ;
	public final PHP54TranslatorWalker.actualParameters_return actualParameters() throws RecognitionException {
		PHP54TranslatorWalker.actualParameters_return retval = new PHP54TranslatorWalker.actualParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:668:2: ( ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS ) )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:668:4: ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:668:4: ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS )
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==ACTUAL_PARAMETERS) ) {
				int LA76_1 = input.LA(2);
				if ( (LA76_1==DOWN) ) {
					alt76=1;
				}
				else if ( (LA76_1==UP) ) {
					alt76=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 76, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}
			switch (alt76) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:668:6: ^( ACTUAL_PARAMETERS (params+= expression )+ )
					{
					match(input,ACTUAL_PARAMETERS,FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4334); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:668:32: (params+= expression )+
					int cnt75=0;
					loop75:
					do {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==ARRAY_ACCESS||(LA75_0 >= Assign && LA75_0 <= At)||(LA75_0 >= BitwiseAnd && LA75_0 <= Bool)||LA75_0==CASTING||LA75_0==CLASS_MEMBER_ACCESS||LA75_0==CLASS_STATIC_ACCESS||LA75_0==CONSTANT||LA75_0==Clone||(LA75_0 >= Divide && LA75_0 <= DivideAssign)||(LA75_0 >= Dot && LA75_0 <= DotAssign)||(LA75_0 >= Equal && LA75_0 <= Exit)||LA75_0==FUNCTION_CALL||LA75_0==Float||(LA75_0 >= GreaterEqualThan && LA75_0 <= GreaterThan)||LA75_0==Identical||(LA75_0 >= Instanceof && LA75_0 <= Int)||(LA75_0 >= LessEqualThan && LA75_0 <= METHOD_CALL_STATIC)||(LA75_0 >= Minus && LA75_0 <= MinusAssign)||(LA75_0 >= Modulo && LA75_0 <= MultiplyAssign)||(LA75_0 >= New && LA75_0 <= Null)||(LA75_0 >= POST_DECREMENT && LA75_0 <= PRE_INCREMENT)||(LA75_0 >= Plus && LA75_0 <= PlusAssign)||LA75_0==QuestionMark||(LA75_0 >= ShiftLeft && LA75_0 <= ShiftRightAssign)||LA75_0==String||LA75_0==This||LA75_0==TypeArray||LA75_0==UNARY_MINUS||LA75_0==VariableId) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:668:32: params+= expression
							{
							pushFollow(FOLLOW_expression_in_actualParameters4338);
							params=expression();
							state._fsp--;
							if (state.failed) return retval;
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt75 >= 1 ) break loop75;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(75, input);
								throw eee;
						}
						cnt75++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {retval.parameters =list_params;}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:669:5: ACTUAL_PARAMETERS
					{
					match(input,ACTUAL_PARAMETERS,FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4348); if (state.failed) return retval;
					}
					break;

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
	// $ANTLR end "actualParameters"


	public static class functionCall_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionCall"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:673:1: functionCall : ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters ) -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.functionCall_return functionCall() throws RecognitionException {
		PHP54TranslatorWalker.functionCall_return retval = new PHP54TranslatorWalker.functionCall_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters118 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:674:2: ( ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters ) -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:674:4: ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters )
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_functionCall4365); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			identifier=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_functionCall4369); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_functionCall4371);
			actualParameters118=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 675:3: -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("functionCall",new STAttrMap().put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters118!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters118).parameters:null)));
			  }


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
	// $ANTLR end "functionCall"


	public static class methodCall_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "methodCall"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:678:1: methodCall : ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters ) -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCall_return methodCall() throws RecognitionException {
		PHP54TranslatorWalker.methodCall_return retval = new PHP54TranslatorWalker.methodCall_return();
		retval.start = input.LT(1);

		ITSPHPAst callee=null;
		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters119 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:679:2: ( ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters ) -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:679:4: ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCall4401); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:679:18: (callee= This |callee= VariableId )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==This) ) {
				alt77=1;
			}
			else if ( (LA77_0==VariableId) ) {
				alt77=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:679:19: callee= This
					{
					callee=(ITSPHPAst)match(input,This,FOLLOW_This_in_methodCall4406); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:679:31: callee= VariableId
					{
					callee=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_methodCall4410); if (state.failed) return retval;
					}
					break;

			}

			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCall4415); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCall4417);
			actualParameters119=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 680:3: -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCall",new STAttrMap().put("callee", (callee!=null?callee.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters119!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters119).parameters:null)));
			  }


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
	// $ANTLR end "methodCall"


	public static class methodCallSelfOrParent_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "methodCallSelfOrParent"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:683:1: methodCallSelfOrParent : ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters ) -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCallSelfOrParent_return methodCallSelfOrParent() throws RecognitionException {
		PHP54TranslatorWalker.methodCallSelfOrParent_return retval = new PHP54TranslatorWalker.methodCallSelfOrParent_return();
		retval.start = input.LT(1);

		ITSPHPAst callee=null;
		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters120 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:684:2: ( ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters ) -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:684:4: ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCallSelfOrParent4451); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:684:18: (callee= Self |callee= Parent )
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==Self) ) {
				alt78=1;
			}
			else if ( (LA78_0==Parent) ) {
				alt78=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:684:19: callee= Self
					{
					callee=(ITSPHPAst)match(input,Self,FOLLOW_Self_in_methodCallSelfOrParent4456); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:684:31: callee= Parent
					{
					callee=(ITSPHPAst)match(input,Parent,FOLLOW_Parent_in_methodCallSelfOrParent4460); if (state.failed) return retval;
					}
					break;

			}

			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCallSelfOrParent4465); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCallSelfOrParent4467);
			actualParameters120=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 685:3: -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCallStatic",new STAttrMap().put("callee", (callee!=null?callee.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters120!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters120).parameters:null)));
			  }


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
	// $ANTLR end "methodCallSelfOrParent"


	public static class methodCallStatic_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "methodCallStatic"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:688:1: methodCallStatic : ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters ) -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCallStatic_return methodCallStatic() throws RecognitionException {
		PHP54TranslatorWalker.methodCallStatic_return retval = new PHP54TranslatorWalker.methodCallStatic_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		ITSPHPAst TYPE_NAME121=null;
		TreeRuleReturnScope actualParameters122 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:689:2: ( ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters ) -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:689:4: ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL_STATIC,FOLLOW_METHOD_CALL_STATIC_in_methodCallStatic4501); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			TYPE_NAME121=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_methodCallStatic4503); if (state.failed) return retval;
			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCallStatic4507); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCallStatic4509);
			actualParameters122=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 690:3: -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCallStatic",new STAttrMap().put("callee", (TYPE_NAME121!=null?TYPE_NAME121.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters122!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters122).parameters:null)));
			  }


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
	// $ANTLR end "methodCallStatic"


	public static class classStaticAccess_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "classStaticAccess"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:693:1: classStaticAccess : ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) ) -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text);
	public final PHP54TranslatorWalker.classStaticAccess_return classStaticAccess() throws RecognitionException {
		PHP54TranslatorWalker.classStaticAccess_return retval = new PHP54TranslatorWalker.classStaticAccess_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope staticAccess123 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:694:2: ( ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) ) -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:694:4: ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) )
			{
			match(input,CLASS_STATIC_ACCESS,FOLLOW_CLASS_STATIC_ACCESS_in_classStaticAccess4544); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_staticAccess_in_classStaticAccess4546);
			staticAccess123=staticAccess();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:694:39: (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
				alt79=1;
			}
			else if ( (LA79_0==CONSTANT) ) {
				alt79=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}
			switch (alt79) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:694:40: identifier= CLASS_STATIC_ACCESS_VARIABLE_ID
					{
					identifier=(ITSPHPAst)match(input,CLASS_STATIC_ACCESS_VARIABLE_ID,FOLLOW_CLASS_STATIC_ACCESS_VARIABLE_ID_in_classStaticAccess4551); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:694:83: identifier= CONSTANT
					{
					identifier=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_classStaticAccess4555); if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 695:3: -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text)
			  {
			  	retval.st = templateLib.getInstanceOf("classMemberAccessStatic",new STAttrMap().put("accessor", (staticAccess123!=null?((StringTemplate)staticAccess123.getTemplate()):null)).put("identifier", (identifier!=null?identifier.getText():null)));
			  }


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
	// $ANTLR end "classStaticAccess"


	public static class postFixExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "postFixExpression"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:698:1: postFixExpression : ( ^( CLASS_MEMBER_ACCESS expression Identifier ) -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)| ^( ARRAY_ACCESS expr= expression index= expression ) -> arrayAccess(expression=$expr.stindex=$index.st)| ^( METHOD_CALL_POSTFIX expression Identifier actualParameters ) -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters));
	public final PHP54TranslatorWalker.postFixExpression_return postFixExpression() throws RecognitionException {
		PHP54TranslatorWalker.postFixExpression_return retval = new PHP54TranslatorWalker.postFixExpression_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier125=null;
		ITSPHPAst Identifier127=null;
		TreeRuleReturnScope expr =null;
		TreeRuleReturnScope index =null;
		TreeRuleReturnScope expression124 =null;
		TreeRuleReturnScope expression126 =null;
		TreeRuleReturnScope actualParameters128 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:699:2: ( ^( CLASS_MEMBER_ACCESS expression Identifier ) -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)| ^( ARRAY_ACCESS expr= expression index= expression ) -> arrayAccess(expression=$expr.stindex=$index.st)| ^( METHOD_CALL_POSTFIX expression Identifier actualParameters ) -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters))
			int alt80=3;
			switch ( input.LA(1) ) {
			case CLASS_MEMBER_ACCESS:
				{
				alt80=1;
				}
				break;
			case ARRAY_ACCESS:
				{
				alt80=2;
				}
				break;
			case METHOD_CALL_POSTFIX:
				{
				alt80=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}
			switch (alt80) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:699:4: ^( CLASS_MEMBER_ACCESS expression Identifier )
					{
					match(input,CLASS_MEMBER_ACCESS,FOLLOW_CLASS_MEMBER_ACCESS_in_postFixExpression4586); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression4588);
					expression124=expression();
					state._fsp--;
					if (state.failed) return retval;
					Identifier125=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_postFixExpression4590); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 699:52: -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)
					  {
					  	retval.st = templateLib.getInstanceOf("classMemberAccess",new STAttrMap().put("expression", (expression124!=null?((StringTemplate)expression124.getTemplate()):null)).put("identifier", (Identifier125!=null?Identifier125.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:700:4: ^( ARRAY_ACCESS expr= expression index= expression )
					{
					match(input,ARRAY_ACCESS,FOLLOW_ARRAY_ACCESS_in_postFixExpression4614); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression4618);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression4622);
					index=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 700:54: -> arrayAccess(expression=$expr.stindex=$index.st)
					  {
					  	retval.st = templateLib.getInstanceOf("arrayAccess",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)).put("index", (index!=null?((StringTemplate)index.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:701:4: ^( METHOD_CALL_POSTFIX expression Identifier actualParameters )
					{
					match(input,METHOD_CALL_POSTFIX,FOLLOW_METHOD_CALL_POSTFIX_in_postFixExpression4644); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression4646);
					expression126=expression();
					state._fsp--;
					if (state.failed) return retval;
					Identifier127=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_postFixExpression4648); if (state.failed) return retval;
					pushFollow(FOLLOW_actualParameters_in_postFixExpression4650);
					actualParameters128=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 701:66: -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters)
					  {
					  	retval.st = templateLib.getInstanceOf("postFixCall",new STAttrMap().put("expression", (expression126!=null?((StringTemplate)expression126.getTemplate()):null)).put("identifier", (Identifier127!=null?Identifier127.getText():null)).put("parameters", (actualParameters128!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters128).parameters:null)));
					  }


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
	// $ANTLR end "postFixExpression"


	public static class exit_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "exit"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:704:1: exit : ( ^( 'exit' ( expression )? ) -> exit(expression=$expression.st)| Exit -> exit(expression=null));
	public final PHP54TranslatorWalker.exit_return exit() throws RecognitionException {
		PHP54TranslatorWalker.exit_return retval = new PHP54TranslatorWalker.exit_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression129 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:705:2: ( ^( 'exit' ( expression )? ) -> exit(expression=$expression.st)| Exit -> exit(expression=null))
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==Exit) ) {
				int LA82_1 = input.LA(2);
				if ( (LA82_1==DOWN) ) {
					alt82=1;
				}
				else if ( (LA82_1==UP||LA82_1==ARRAY_ACCESS||LA82_1==Arrow||(LA82_1 >= Assign && LA82_1 <= At)||LA82_1==BLOCK_CONDITIONAL||(LA82_1 >= BitwiseAnd && LA82_1 <= Bool)||LA82_1==CASTING||LA82_1==CLASS_MEMBER_ACCESS||LA82_1==CLASS_STATIC_ACCESS||LA82_1==CONSTANT||LA82_1==Clone||LA82_1==Default||(LA82_1 >= Divide && LA82_1 <= DivideAssign)||(LA82_1 >= Dot && LA82_1 <= DotAssign)||(LA82_1 >= Equal && LA82_1 <= Exit)||LA82_1==FUNCTION_CALL||LA82_1==Float||(LA82_1 >= GreaterEqualThan && LA82_1 <= GreaterThan)||(LA82_1 >= Identical && LA82_1 <= Identifier)||(LA82_1 >= Instanceof && LA82_1 <= Int)||(LA82_1 >= LessEqualThan && LA82_1 <= METHOD_CALL_STATIC)||(LA82_1 >= Minus && LA82_1 <= MinusAssign)||(LA82_1 >= Modulo && LA82_1 <= MultiplyAssign)||(LA82_1 >= New && LA82_1 <= Null)||(LA82_1 >= POST_DECREMENT && LA82_1 <= PRE_INCREMENT)||(LA82_1 >= Plus && LA82_1 <= PlusAssign)||LA82_1==QuestionMark||LA82_1==SWITCH_CASES||(LA82_1 >= ShiftLeft && LA82_1 <= ShiftRightAssign)||LA82_1==String||(LA82_1 >= TYPE_NAME && LA82_1 <= This)||LA82_1==TypeArray||LA82_1==UNARY_MINUS||LA82_1==VariableId) ) {
					alt82=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 82, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:705:4: ^( 'exit' ( expression )? )
					{
					match(input,Exit,FOLLOW_Exit_in_exit4682); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:705:13: ( expression )?
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==ARRAY_ACCESS||(LA81_0 >= Assign && LA81_0 <= At)||(LA81_0 >= BitwiseAnd && LA81_0 <= Bool)||LA81_0==CASTING||LA81_0==CLASS_MEMBER_ACCESS||LA81_0==CLASS_STATIC_ACCESS||LA81_0==CONSTANT||LA81_0==Clone||(LA81_0 >= Divide && LA81_0 <= DivideAssign)||(LA81_0 >= Dot && LA81_0 <= DotAssign)||(LA81_0 >= Equal && LA81_0 <= Exit)||LA81_0==FUNCTION_CALL||LA81_0==Float||(LA81_0 >= GreaterEqualThan && LA81_0 <= GreaterThan)||LA81_0==Identical||(LA81_0 >= Instanceof && LA81_0 <= Int)||(LA81_0 >= LessEqualThan && LA81_0 <= METHOD_CALL_STATIC)||(LA81_0 >= Minus && LA81_0 <= MinusAssign)||(LA81_0 >= Modulo && LA81_0 <= MultiplyAssign)||(LA81_0 >= New && LA81_0 <= Null)||(LA81_0 >= POST_DECREMENT && LA81_0 <= PRE_INCREMENT)||(LA81_0 >= Plus && LA81_0 <= PlusAssign)||LA81_0==QuestionMark||(LA81_0 >= ShiftLeft && LA81_0 <= ShiftRightAssign)||LA81_0==String||LA81_0==This||LA81_0==TypeArray||LA81_0==UNARY_MINUS||LA81_0==VariableId) ) {
							alt81=1;
						}
						switch (alt81) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:705:13: expression
								{
								pushFollow(FOLLOW_expression_in_exit4684);
								expression129=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 705:26: -> exit(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("exit",new STAttrMap().put("expression", (expression129!=null?((StringTemplate)expression129.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:706:4: Exit
					{
					match(input,Exit,FOLLOW_Exit_in_exit4700); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 706:12: -> exit(expression=null)
					  {
					  	retval.st = templateLib.getInstanceOf("exit",new STAttrMap().put("expression", null));
					  }


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
	// $ANTLR end "exit"

	// $ANTLR start synpred1_PHP54TranslatorWalker
	public final void synpred1_PHP54TranslatorWalker_fragment() throws RecognitionException {
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:518:7: ( atom )
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:518:7: atom
		{
		pushFollow(FOLLOW_atom_in_synpred1_PHP54TranslatorWalker3111);
		atom();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred1_PHP54TranslatorWalker

	// $ANTLR start synpred7_PHP54TranslatorWalker
	public final void synpred7_PHP54TranslatorWalker_fragment() throws RecognitionException {
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:524:4: ( classStaticAccess )
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:524:4: classStaticAccess
		{
		pushFollow(FOLLOW_classStaticAccess_in_synpred7_PHP54TranslatorWalker3179);
		classStaticAccess();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred7_PHP54TranslatorWalker

	// Delegated rules

	public final boolean synpred1_PHP54TranslatorWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_PHP54TranslatorWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_PHP54TranslatorWalker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_PHP54TranslatorWalker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_namespace_in_compilationUnit58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespace85 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_namespace90 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_DEFAULT_NAMESPACE_in_namespace92 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_namespaceBody_in_namespace95 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NAMESPACE_BODY_in_namespaceBody130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_namespaceBody134 = new BitSet(new long[]{0x2800408800800008L,0x0000000000088140L,0x0000050004200020L});
	public static final BitSet FOLLOW_NAMESPACE_BODY_in_namespaceBody150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_statement188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList205 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList207 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_USE_DECLARATION_in_useDeclaration233 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_useDeclaration235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classDeclaration_in_definition266 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration314 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classModifier_in_classDeclaration316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration322 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration324 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_classModifier388 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classModifierNames_in_classModifier392 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_classModifier407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_extendsDeclaration450 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_implementsDeclaration491 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_BODY_in_classBody528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classBodyDefinition_in_classBody532 = new BitSet(new long[]{0x0000200808000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_CLASS_BODY_in_classBody548 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBodyDefinition569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classMemberDeclaration_in_classBodyDefinition580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstractConstructDeclaration_in_classBodyDefinition590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructDeclaration_in_classBodyDefinition600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstractMethodDeclaration_in_classBodyDefinition611 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBodyDefinition621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_DECLARATION_LIST_in_constDeclarationList640 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_constDeclarationList647 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_constDeclarationList650 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Public_in_constDeclarationList652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_Static_in_constDeclarationList654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_Final_in_constDeclarationList656 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_scalarTypes_in_constDeclarationList659 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList667 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment697 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_constantAssignment701 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_in_classMemberDeclaration762 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclarationList_in_classMemberDeclaration764 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList782 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_variableDeclarationList789 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_variableDeclarationList791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclarationList793 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList802 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_localVariableDeclarationList835 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_localVariableDeclarationList842 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_localVariableDeclarationList844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_localVariableDeclarationList846 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationList855 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier888 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_typeModifier892 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008001DL});
	public static final BitSet FOLLOW_QuestionMark_in_typeModifier897 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008000DL});
	public static final BitSet FOLLOW_variableModifier_in_typeModifier900 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier913 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier935 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier969 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_staticToken985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessModifier1001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Protected_in_accessModifier1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_accessModifier1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1035 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration1037 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1056 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_localVariableDeclaration1074 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_localVariableDeclaration1078 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_localVariableDeclaration1103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_allTypes1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_allTypes1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypes1150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypes1156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypes1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypes1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesWithoutArray1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypesWithoutArray1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_abstractConstructDeclaration1218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractConstructDeclaration1225 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractConstructDeclaration1227 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractConstructDeclaration1234 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractConstructDeclaration1236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractConstructDeclaration1238 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_abstractConstructDeclaration1244 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_abstractConstructDeclaration1249 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Construct_in_constructDeclaration1311 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_constructDeclaration1318 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_constructDeclaration1320 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_constructDeclaration1327 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_constructDeclaration1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_constructDeclaration1331 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_constructDeclaration1337 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_constructDeclaration1342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1401 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1407 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1409 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractMethodDeclaration1416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractMethodDeclaration1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractMethodDeclaration1420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_abstractMethodDeclaration1429 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_abstractMethodDeclaration1433 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_abstractMethodDeclaration1439 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_abstractMethodDeclaration1444 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1511 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Abstract_in_abstractToken1541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_methodDeclaration1557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_methodDeclaration1563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_methodDeclaration1565 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_methodDeclaration1572 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_methodDeclaration1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_methodDeclaration1576 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1585 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_methodDeclaration1589 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration1595 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_methodDeclaration1600 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1719 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1813 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1821 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Final_in_finalToken1848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramDeclaration_in_formalParameters1887 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1923 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_paramDeclaration1930 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_paramDeclaration1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_scalarAndResource_in_paramDeclaration1941 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_paramDeclaration1951 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeObject_in_paramDeclaration1959 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceType_in_paramDeclaration1969 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_parameterNormalOrOptional_in_paramDeclaration1985 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeArray_in_arrayType2024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_classInterfaceType2039 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_scalarAndResource2055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_scalarAndResource2064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional2083 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_parameterNormalOrOptional2087 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional2096 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block2113 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_block2117 = new BitSet(new long[]{0x2800400000800008L,0x0000000000008040L,0x0000040004200020L});
	public static final BitSet FOLLOW_BLOCK_in_block2126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration2140 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_interfaceDeclaration2147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Abstract_in_interfaceDeclaration2149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration2155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extendsDeclaration_in_interfaceDeclaration2161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration2166 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTERFACE_BODY_in_interfaceBody2218 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_interfaceBodyDefinition_in_interfaceBody2222 = new BitSet(new long[]{0x0000200800000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_INTERFACE_BODY_in_interfaceBody2238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBodyDefinition2258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceConstructDeclaration_in_interfaceBodyDefinition2267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDefinition2276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_interfaceConstructDeclaration2294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_interfaceConstructDeclaration2301 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_interfaceConstructDeclaration2303 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_interfaceConstructDeclaration2310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_interfaceConstructDeclaration2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_interfaceConstructDeclaration2314 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceConstructDeclaration2320 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_interfaceConstructDeclaration2325 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_interfaceMethodDeclaration2385 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_interfaceMethodDeclaration2391 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_interfaceMethodDeclaration2393 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_interfaceMethodDeclaration2400 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_interfaceMethodDeclaration2402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_interfaceMethodDeclaration2404 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodDeclaration2410 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaration2415 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_interfaceMethodDeclaration2420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Function_in_functionDeclaration2471 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FUNCTION_MODIFIER_in_functionDeclaration2477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_TYPE_in_functionDeclaration2483 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_functionDeclaration2485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclaration2487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclaration2493 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclaration2498 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_functionDeclaration2503 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_localVariableDeclarationList_in_instruction2562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPRESSION_in_instruction2616 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2618 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Return_in_instruction2635 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2637 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Throw_in_instruction2657 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2659 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Echo_in_instruction2678 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2682 = new BitSet(new long[]{0x81980102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_Break_in_instruction2701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_instruction2706 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Break_in_instruction2724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Continue_in_instruction2742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_instruction2747 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Continue_in_instruction2764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition2787 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifCondition2793 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_blockConditional_in_ifCondition2801 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_blockConditional_in_ifCondition2808 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_CONDITIONAL_in_blockConditional2849 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_blockConditional2853 = new BitSet(new long[]{0x2800400000800008L,0x0000000000008040L,0x0000040004200020L});
	public static final BitSet FOLLOW_Switch_in_switchCondition2869 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_switchCondition2871 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition2875 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SWITCH_CASES_in_switchContent2903 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseLabel_in_switchContent2907 = new BitSet(new long[]{0x819A0102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_blockConditional_in_switchContent2911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_caseLabel2939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_caseLabel2954 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop2971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclarationList_in_forLoop2980 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_expressionList_in_forLoop2984 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_expressionList_in_forLoop2993 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3001 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_blockConditional_in_forLoop3007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList3051 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expressionList3055 = new BitSet(new long[]{0x81980102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList3076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_expression3111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_in_expression3123 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expression3137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_expression3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallSelfOrParent_in_expression3159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallStatic_in_expression3169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classStaticAccess_in_expression3179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixExpression_in_expression3188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exit_in_expression3197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom3220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_atom3235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayKeyValue_in_atom3239 = new BitSet(new long[]{0x81980102917F86A8L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_VariableId_in_atom3256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_atom3270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_atom3284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_in_atom3298 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_staticAccess_in_atom3300 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_CONSTANT_in_atom3302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue3373 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3377 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3381 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_staticAccess3418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccess3428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccess3438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPreOperator_in_operator3457 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3461 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unaryPostOperator_in_operator3490 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3494 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_binaryOperator_in_operator3523 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3527 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator3531 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QuestionMark_in_operator3565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3569 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator3573 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator3577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_castingOperator_in_operator3608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_operator3625 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_operator3634 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_operator3638 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_newOperator_in_operator3666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_operator3687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3691 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRE_INCREMENT_in_unaryPreOperator3722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRE_DECREMENT_in_unaryPreOperator3735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_unaryPreOperator3749 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_unaryPreOperator3764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicNot_in_unaryPreOperator3779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unaryPreOperator3794 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_INCREMENT_in_unaryPostOperator3818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_DECREMENT_in_unaryPostOperator3831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTING_in_castingOperator4095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_castingOperator4101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator4111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_castingOperator4113 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QuestionMark_in_castingOperator4119 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator4130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002780000000L});
	public static final BitSet FOLLOW_scalarTypes_in_castingOperator4145 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_castingOperator4149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_castingOperator4160 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CASTING_in_castingOperator4196 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_castingOperator4202 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator4212 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_castingOperator4214 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QuestionMark_in_castingOperator4217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator4227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_castingOperator4239 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_castingOperator4249 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_New_in_newOperator4282 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_newOperator4290 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_newOperator4296 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4334 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_actualParameters4338 = new BitSet(new long[]{0x81980102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_functionCall4365 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_functionCall4369 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall4371 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_methodCall4401 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_This_in_methodCall4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_methodCall4410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall4415 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall4417 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_methodCallSelfOrParent4451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Self_in_methodCallSelfOrParent4456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Parent_in_methodCallSelfOrParent4460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCallSelfOrParent4465 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCallSelfOrParent4467 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_STATIC_in_methodCallStatic4501 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_methodCallStatic4503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCallStatic4507 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCallStatic4509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_in_classStaticAccess4544 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_staticAccess_in_classStaticAccess4546 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_VARIABLE_ID_in_classStaticAccess4551 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTANT_in_classStaticAccess4555 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_ACCESS_in_postFixExpression4586 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression4588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_postFixExpression4590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_ACCESS_in_postFixExpression4614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression4618 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_postFixExpression4622 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_POSTFIX_in_postFixExpression4644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression4646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_postFixExpression4648 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_postFixExpression4650 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Exit_in_exit4682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exit4684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Exit_in_exit4700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_synpred1_PHP54TranslatorWalker3111 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classStaticAccess_in_synpred7_PHP54TranslatorWalker3179 = new BitSet(new long[]{0x0000000000000002L});
}
