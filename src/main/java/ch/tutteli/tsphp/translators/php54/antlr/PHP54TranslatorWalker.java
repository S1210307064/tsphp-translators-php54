// $ANTLR 3.x D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g 2013-03-06 23:52:10

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
							if ( (LA2_0==Break||LA2_0==CONSTANT_DECLARATION_LIST||LA2_0==Class||LA2_0==Continue||LA2_0==EXPRESSION||LA2_0==Echo||LA2_0==Function||LA2_0==If||LA2_0==Interface||LA2_0==Return||LA2_0==Switch||LA2_0==Throw||LA2_0==Use||LA2_0==VARIABLE_DECLARATION_LIST) ) {
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:1: variableDeclarationList : ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= variableDeclaration[$typeModifier.st] )+ ) -> variableDeclarationList(variables=$variables);
	public final PHP54TranslatorWalker.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclarationList_return retval = new PHP54TranslatorWalker.variableDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_variables=null;
		TreeRuleReturnScope typeModifier25 =null;
		RuleReturnScope variables = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:174:2: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= variableDeclaration[$typeModifier.st] )+ ) -> variableDeclarationList(variables=$variables))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:174:4: ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= variableDeclaration[$typeModifier.st] )+ )
			{
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList781); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_variableDeclarationList788); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_variableDeclarationList790);
			typeModifier25=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_allTypes_in_variableDeclarationList792);
			allTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:176:13: (variables+= variableDeclaration[$typeModifier.st] )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:176:13: variables+= variableDeclaration[$typeModifier.st]
					{
					pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList801);
					variables=variableDeclaration((typeModifier25!=null?((StringTemplate)typeModifier25.getTemplate()):null));
					state._fsp--;
					if (state.failed) return retval;
					if (list_variables==null) list_variables=new ArrayList<Object>();
					list_variables.add(variables.getTemplate());
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
			  // 178:3: -> variableDeclarationList(variables=$variables)
			  {
			  	retval.st = templateLib.getInstanceOf("variableDeclarationList",new STAttrMap().put("variables", list_variables));
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


	public static class typeModifier_return extends TreeRuleReturnScope {
		public boolean isCast;
		public boolean isNullable;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:181:1: typeModifier returns [boolean isCast, boolean isNullable] : ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null});
	public final PHP54TranslatorWalker.typeModifier_return typeModifier() throws RecognitionException {
		PHP54TranslatorWalker.typeModifier_return retval = new PHP54TranslatorWalker.typeModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst cast=null;
		ITSPHPAst nullable=null;
		TreeRuleReturnScope variableModifier26 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:2: ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null})
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:4: ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? )
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier834); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:24: (cast= Cast )?
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==Cast) ) {
							alt17=1;
						}
						switch (alt17) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:24: cast= Cast
								{
								cast=(ITSPHPAst)match(input,Cast,FOLLOW_Cast_in_typeModifier838); if (state.failed) return retval;
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:39: (nullable= '?' )?
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==QuestionMark) ) {
							alt18=1;
						}
						switch (alt18) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:39: nullable= '?'
								{
								nullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_typeModifier843); if (state.failed) return retval;
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:45: ( variableModifier )?
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==Private||(LA19_0 >= Protected && LA19_0 <= Public)||LA19_0==Static) ) {
							alt19=1;
						}
						switch (alt19) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:45: variableModifier
								{
								pushFollow(FOLLOW_variableModifier_in_typeModifier846);
								variableModifier26=variableModifier();
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
					  // 182:114: -> {$variableModifier.st}
					  {
					  	retval.st = (variableModifier26!=null?((StringTemplate)variableModifier26.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:183:4: TYPE_MODIFIER
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier859); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 183:18: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:186:1: variableModifier : (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st});
	public final PHP54TranslatorWalker.variableModifier_return variableModifier() throws RecognitionException {
		PHP54TranslatorWalker.variableModifier_return retval = new PHP54TranslatorWalker.variableModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		TreeRuleReturnScope accessModifier27 =null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:187:2: (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st})
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:187:4: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_variableModifier877);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_variableModifier881);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 187:43: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:188:4: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier897);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_variableModifier901);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 188:43: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:189:4: accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier915);
					accessModifier27=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 189:19: -> {$accessModifier.st}
					  {
					  	retval.st = (accessModifier27!=null?((StringTemplate)accessModifier27.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:192:1: staticToken : Static -> {%{$Static.text}};
	public final PHP54TranslatorWalker.staticToken_return staticToken() throws RecognitionException {
		PHP54TranslatorWalker.staticToken_return retval = new PHP54TranslatorWalker.staticToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Static28=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:193:2: ( Static -> {%{$Static.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:193:4: Static
			{
			Static28=(ITSPHPAst)match(input,Static,FOLLOW_Static_in_staticToken931); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 193:11: -> {%{$Static.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Static28!=null?Static28.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:1: accessModifier : ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}});
	public final PHP54TranslatorWalker.accessModifier_return accessModifier() throws RecognitionException {
		PHP54TranslatorWalker.accessModifier_return retval = new PHP54TranslatorWalker.accessModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst Private29=null;
		ITSPHPAst Protected30=null;
		ITSPHPAst Public31=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:197:2: ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}})
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:197:4: Private
					{
					Private29=(ITSPHPAst)match(input,Private,FOLLOW_Private_in_accessModifier947); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 197:12: -> {%{$Private.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Private29!=null?Private29.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:198:4: Protected
					{
					Protected30=(ITSPHPAst)match(input,Protected,FOLLOW_Protected_in_accessModifier956); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 198:14: -> {%{$Protected.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Protected30!=null?Protected30.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:199:4: Public
					{
					Public31=(ITSPHPAst)match(input,Public,FOLLOW_Public_in_accessModifier965); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 199:11: -> {%{$Public.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Public31!=null?Public31.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:202:1: variableDeclaration[StringTemplate modifier] : ( ^( VariableId v= expression ) -> variableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)| VariableId -> variableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v));
	public final PHP54TranslatorWalker.variableDeclaration_return variableDeclaration(StringTemplate modifier) throws RecognitionException {
		PHP54TranslatorWalker.variableDeclaration_return retval = new PHP54TranslatorWalker.variableDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst VariableId32=null;
		ITSPHPAst VariableId33=null;
		TreeRuleReturnScope v =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:203:2: ( ^( VariableId v= expression ) -> variableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)| VariableId -> variableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v))
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:203:4: ^( VariableId v= expression )
					{
					VariableId32=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration983); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_variableDeclaration987);
					v=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 203:31: -> variableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)
					  {
					  	retval.st = templateLib.getInstanceOf("variableDeclaration",new STAttrMap().put("modifier", modifier).put("variableId", (VariableId32!=null?VariableId32.getText():null)).put("initValue", v));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:204:4: VariableId
					{
					VariableId33=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1012); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 204:15: -> variableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)
					  {
					  	retval.st = templateLib.getInstanceOf("variableDeclaration",new STAttrMap().put("modifier", modifier).put("variableId", (VariableId33!=null?VariableId33.getText():null)).put("initValue", v));
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


	public static class allTypes_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "allTypes"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:207:1: allTypes : ( primitiveTypes | TYPE_NAME );
	public final PHP54TranslatorWalker.allTypes_return allTypes() throws RecognitionException {
		PHP54TranslatorWalker.allTypes_return retval = new PHP54TranslatorWalker.allTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:208:2: ( primitiveTypes | TYPE_NAME )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( ((LA24_0 >= TypeArray && LA24_0 <= TypeString)) ) {
				alt24=1;
			}
			else if ( (LA24_0==TYPE_NAME) ) {
				alt24=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:208:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_allTypes1042);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:209:4: TYPE_NAME
					{
					match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_allTypes1047); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:212:1: primitiveTypes : ( scalarTypes | TypeArray | TypeResource | TypeObject );
	public final PHP54TranslatorWalker.primitiveTypes_return primitiveTypes() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypes_return retval = new PHP54TranslatorWalker.primitiveTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:213:2: ( scalarTypes | TypeArray | TypeResource | TypeObject )
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:213:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypes1059);
					scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:214:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypes1065); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:215:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypes1071); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypes1077); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:219:1: primitiveTypesWithoutArray : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}});
	public final PHP54TranslatorWalker.primitiveTypesWithoutArray_return primitiveTypesWithoutArray() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypesWithoutArray_return retval = new PHP54TranslatorWalker.primitiveTypesWithoutArray_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource35=null;
		ITSPHPAst TypeObject36=null;
		TreeRuleReturnScope scalarTypes34 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:220:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}})
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:220:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1090);
					scalarTypes34=scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 220:16: -> {$scalarTypes.st}
					  {
					  	retval.st = (scalarTypes34!=null?((StringTemplate)scalarTypes34.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:221:4: TypeResource
					{
					TypeResource35=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesWithoutArray1099); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 221:17: -> {%{$TypeResource.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeResource35!=null?TypeResource35.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:222:4: TypeObject
					{
					TypeObject36=(ITSPHPAst)match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypesWithoutArray1108); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 222:15: -> {%{$TypeObject.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeObject36!=null?TypeObject36.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:225:1: abstractConstructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.abstractConstructDeclaration_return abstractConstructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractConstructDeclaration_return retval = new PHP54TranslatorWalker.abstractConstructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope abstractMethodModifier37 =null;
		TreeRuleReturnScope formalParameters38 =null;
		TreeRuleReturnScope block39 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:226:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:226:4: ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_abstractConstructDeclaration1127); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractConstructDeclaration1134); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractConstructDeclaration1136);
			abstractMethodModifier37=abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_abstractConstructDeclaration1143); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_abstractConstructDeclaration1145);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_abstractConstructDeclaration1147);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_abstractConstructDeclaration1153);
			formalParameters38=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_abstractConstructDeclaration1158);
			block39=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 232:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", (abstractMethodModifier37!=null?((StringTemplate)abstractMethodModifier37.getTemplate()):null)).put("identifier", identifier).put("params", (formalParameters38!=null?((StringTemplate)formalParameters38.getTemplate()):null)).put("body", (block39!=null?((PHP54TranslatorWalker.block_return)block39).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:240:1: constructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.constructDeclaration_return constructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.constructDeclaration_return retval = new PHP54TranslatorWalker.constructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope methodModifier40 =null;
		TreeRuleReturnScope formalParameters41 =null;
		TreeRuleReturnScope block42 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:241:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:241:4: ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_constructDeclaration1220); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_constructDeclaration1227); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_methodModifier_in_constructDeclaration1229);
			methodModifier40=methodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_constructDeclaration1236); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_constructDeclaration1238);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_constructDeclaration1240);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_constructDeclaration1246);
			formalParameters41=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_constructDeclaration1251);
			block42=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 247:3: -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier40!=null?((StringTemplate)methodModifier40.getTemplate()):null)).put("identifier", identifier).put("params", (formalParameters41!=null?((StringTemplate)formalParameters41.getTemplate()):null)).put("body", (block42!=null?((PHP54TranslatorWalker.block_return)block42).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:255:1: abstractMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.abstractMethodDeclaration_return abstractMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodDeclaration_return retval = new PHP54TranslatorWalker.abstractMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope abstractMethodModifier43 =null;
		TreeRuleReturnScope formalParameters44 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:256:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:256:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1310); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1316); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1318);
			abstractMethodModifier43=abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_abstractMethodDeclaration1325); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_abstractMethodDeclaration1327);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_abstractMethodDeclaration1329);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:259:4: (identfier= Identifier |identfier= Destruct )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==Identifier) ) {
				alt27=1;
			}
			else if ( (LA27_0==Destruct) ) {
				alt27=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:259:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_abstractMethodDeclaration1338); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:259:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_abstractMethodDeclaration1342); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_abstractMethodDeclaration1348);
			formalParameters44=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input,BLOCK,FOLLOW_BLOCK_in_abstractMethodDeclaration1353); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 263:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", (abstractMethodModifier43!=null?((StringTemplate)abstractMethodModifier43.getTemplate()):null)).put("identifier", identfier).put("params", (formalParameters44!=null?((StringTemplate)formalParameters44.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:270:1: abstractMethodModifier : (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.abstractMethodModifier_return abstractMethodModifier() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodModifier_return retval = new PHP54TranslatorWalker.abstractMethodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:271:2: ( (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:271:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:271:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Abstract) ) {
				alt28=1;
			}
			else if ( (LA28_0==Private||(LA28_0 >= Protected && LA28_0 <= Public)) ) {
				alt28=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:271:6: list+= abstractToken list+= accessModifier
					{
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1407);
					list=abstractToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1411);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:272:5: list+= accessModifier list+= abstractToken
					{
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1420);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1424);
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
			  // 274:3: -> modifier(modifiers=$list)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:277:1: abstractToken : Abstract -> {%{$Abstract.text}};
	public final PHP54TranslatorWalker.abstractToken_return abstractToken() throws RecognitionException {
		PHP54TranslatorWalker.abstractToken_return retval = new PHP54TranslatorWalker.abstractToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Abstract45=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:278:2: ( Abstract -> {%{$Abstract.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:278:4: Abstract
			{
			Abstract45=(ITSPHPAst)match(input,Abstract,FOLLOW_Abstract_in_abstractToken1450); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 278:13: -> {%{$Abstract.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Abstract45!=null?Abstract45.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:281:1: methodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.methodDeclaration_return methodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.methodDeclaration_return retval = new PHP54TranslatorWalker.methodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope methodModifier46 =null;
		TreeRuleReturnScope formalParameters47 =null;
		TreeRuleReturnScope block48 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:282:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:282:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_methodDeclaration1466); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_methodDeclaration1472); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_methodModifier_in_methodDeclaration1474);
			methodModifier46=methodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_methodDeclaration1481); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_methodDeclaration1483);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_methodDeclaration1485);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:285:4: (identfier= Identifier |identfier= Destruct )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:285:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1494); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:285:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_methodDeclaration1498); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_methodDeclaration1504);
			formalParameters47=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_methodDeclaration1509);
			block48=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 289:3: -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier46!=null?((StringTemplate)methodModifier46.getTemplate()):null)).put("identifier", identfier).put("params", (formalParameters47!=null?((StringTemplate)formalParameters47.getTemplate()):null)).put("body", (block48!=null?((PHP54TranslatorWalker.block_return)block48).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:297:1: methodModifier : (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.methodModifier_return methodModifier() throws RecognitionException {
		PHP54TranslatorWalker.methodModifier_return retval = new PHP54TranslatorWalker.methodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:298:2: ( (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:298:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:298:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
						if (state.backtracking>0) {state.failed=true; return retval;}
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}
			switch (alt30) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:298:6: list+= staticToken list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1570);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1574);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1579);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:299:5: list+= staticToken list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1587);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1591);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1596);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:300:5: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1604);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1608);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:302:5: list+= finalToken list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1619);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1623);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1628);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:303:5: list+= finalToken list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1636);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1640);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1645);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:304:5: list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1654);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1658);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:307:5: list+= accessModifier list+= finalToken list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1672);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1676);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1681);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:308:5: list+= accessModifier list+= staticToken list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1689);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1693);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1698);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:309:5: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1706);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1710);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:310:5: list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1718);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1722);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:311:5: list+= accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1730);
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
			  // 313:3: -> modifier(modifiers=$list)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:316:1: finalToken : Final -> {%{$Final.text}};
	public final PHP54TranslatorWalker.finalToken_return finalToken() throws RecognitionException {
		PHP54TranslatorWalker.finalToken_return retval = new PHP54TranslatorWalker.finalToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Final49=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:2: ( Final -> {%{$Final.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:4: Final
			{
			Final49=(ITSPHPAst)match(input,Final,FOLLOW_Final_in_finalToken1757); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 317:10: -> {%{$Final.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Final49!=null?Final49.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:320:1: returnType : ( allTypes | Void );
	public final PHP54TranslatorWalker.returnType_return returnType() throws RecognitionException {
		PHP54TranslatorWalker.returnType_return retval = new PHP54TranslatorWalker.returnType_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:321:2: ( allTypes | Void )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==TYPE_NAME||(LA31_0 >= TypeArray && LA31_0 <= TypeString)) ) {
				alt31=1;
			}
			else if ( (LA31_0==Void) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:321:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1773);
					allTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:322:4: Void
					{
					match(input,Void,FOLLOW_Void_in_returnType1778); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:325:1: formalParameters : ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null});
	public final PHP54TranslatorWalker.formalParameters_return formalParameters() throws RecognitionException {
		PHP54TranslatorWalker.formalParameters_return retval = new PHP54TranslatorWalker.formalParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:326:2: ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null})
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:326:4: ^( PARAMETER_LIST (params+= paramDeclaration )+ )
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1792); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:326:27: (params+= paramDeclaration )+
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:326:27: params+= paramDeclaration
							{
							pushFollow(FOLLOW_paramDeclaration_in_formalParameters1796);
							params=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt32 >= 1 ) break loop32;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(32, input);
								throw eee;
						}
						cnt32++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 326:48: -> parameterList(declarations=$params)
					  {
					  	retval.st = templateLib.getInstanceOf("parameterList",new STAttrMap().put("declarations", list_params));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:327:4: PARAMETER_LIST
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1812); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 327:19: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:330:1: paramDeclaration : ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue);
	public final PHP54TranslatorWalker.paramDeclaration_return paramDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.paramDeclaration_return retval = new PHP54TranslatorWalker.paramDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope typeName =null;
		TreeRuleReturnScope typeModifier50 =null;
		TreeRuleReturnScope parameterNormalOrOptional51 =null;

		String defaultValue =null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:332:2: ( ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:332:4: ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional )
			{
			match(input,PARAMETER_DECLARATION,FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1832); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_paramDeclaration1839); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_paramDeclaration1841);
			typeModifier50=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:334:5: ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType )
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:334:7: scalarAndResource
					{
					pushFollow(FOLLOW_scalarAndResource_in_paramDeclaration1850);
					scalarAndResource();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:335:7: typeName= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_paramDeclaration1860);
					typeName=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:336:7: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_paramDeclaration1868); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:337:7: typeName= classInterfaceType
					{
					pushFollow(FOLLOW_classInterfaceType_in_paramDeclaration1878);
					typeName=classInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_parameterNormalOrOptional_in_paramDeclaration1894);
			parameterNormalOrOptional51=parameterNormalOrOptional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==0 ) {
					    defaultValue =  (typeModifier50!=null?((PHP54TranslatorWalker.typeModifier_return)typeModifier50).isNullable:false) && typeName!=null ? "null" : (parameterNormalOrOptional51!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional51).defaultValue:null);
					}
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 345:3: -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue)
			  {
			  	retval.st = templateLib.getInstanceOf("parameter",new STAttrMap().put("type", (typeName!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(typeName.start),input.getTreeAdaptor().getTokenStopIndex(typeName.start))):null)).put("variableId", (parameterNormalOrOptional51!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional51).variableId:null)).put("defaultValue", defaultValue));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:347:1: arrayType : TypeArray -> {%{$TypeArray.text}};
	public final PHP54TranslatorWalker.arrayType_return arrayType() throws RecognitionException {
		PHP54TranslatorWalker.arrayType_return retval = new PHP54TranslatorWalker.arrayType_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeArray52=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:348:2: ( TypeArray -> {%{$TypeArray.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:348:4: TypeArray
			{
			TypeArray52=(ITSPHPAst)match(input,TypeArray,FOLLOW_TypeArray_in_arrayType1933); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 348:14: -> {%{$TypeArray.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(TypeArray52!=null?TypeArray52.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:351:1: classInterfaceType : TYPE_NAME -> {%{$TYPE_NAME.text}};
	public final PHP54TranslatorWalker.classInterfaceType_return classInterfaceType() throws RecognitionException {
		PHP54TranslatorWalker.classInterfaceType_return retval = new PHP54TranslatorWalker.classInterfaceType_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME53=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:352:2: ( TYPE_NAME -> {%{$TYPE_NAME.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:352:4: TYPE_NAME
			{
			TYPE_NAME53=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_classInterfaceType1948); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 352:14: -> {%{$TYPE_NAME.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(TYPE_NAME53!=null?TYPE_NAME53.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:355:1: scalarAndResource : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}});
	public final PHP54TranslatorWalker.scalarAndResource_return scalarAndResource() throws RecognitionException {
		PHP54TranslatorWalker.scalarAndResource_return retval = new PHP54TranslatorWalker.scalarAndResource_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource55=null;
		TreeRuleReturnScope scalarTypes54 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:356:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}})
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( ((LA35_0 >= TypeBool && LA35_0 <= TypeInt)||LA35_0==TypeString) ) {
				alt35=1;
			}
			else if ( (LA35_0==TypeResource) ) {
				alt35=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:356:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_scalarAndResource1964);
					scalarTypes54=scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 356:16: -> {$scalarTypes.st}
					  {
					  	retval.st = (scalarTypes54!=null?((StringTemplate)scalarTypes54.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:357:4: TypeResource
					{
					TypeResource55=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_scalarAndResource1973); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 357:17: -> {%{$TypeResource.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeResource55!=null?TypeResource55.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:360:1: parameterNormalOrOptional returns [String variableId,String defaultValue] : ( ^( VariableId v= Int ) | VariableId );
	public final PHP54TranslatorWalker.parameterNormalOrOptional_return parameterNormalOrOptional() throws RecognitionException {
		PHP54TranslatorWalker.parameterNormalOrOptional_return retval = new PHP54TranslatorWalker.parameterNormalOrOptional_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst VariableId56=null;
		ITSPHPAst VariableId57=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:361:2: ( ^( VariableId v= Int ) | VariableId )
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
					if (state.backtracking>0) {state.failed=true; return retval;}
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
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:361:4: ^( VariableId v= Int )
					{
					VariableId56=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional1992); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_parameterNormalOrOptional1996); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {retval.variableId =(VariableId56!=null?VariableId56.getText():null); retval.defaultValue =(v!=null?v.getText():null);}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:362:4: VariableId
					{
					VariableId57=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional2005); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.variableId =(VariableId57!=null?VariableId57.getText():null);}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:365:1: block returns [List<Object> instructions] : ( ^( BLOCK (instr+= instruction )* ) | BLOCK );
	public final PHP54TranslatorWalker.block_return block() throws RecognitionException {
		PHP54TranslatorWalker.block_return retval = new PHP54TranslatorWalker.block_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:366:2: ( ^( BLOCK (instr+= instruction )* ) | BLOCK )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:366:4: ^( BLOCK (instr+= instruction )* )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block2022); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:366:17: (instr+= instruction )*
						loop37:
						do {
							int alt37=2;
							int LA37_0 = input.LA(1);
							if ( (LA37_0==Break||LA37_0==Continue||LA37_0==EXPRESSION||LA37_0==Echo||LA37_0==If||LA37_0==Return||LA37_0==Switch||LA37_0==Throw||LA37_0==VARIABLE_DECLARATION_LIST) ) {
								alt37=1;
							}

							switch (alt37) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:366:17: instr+= instruction
								{
								pushFollow(FOLLOW_instruction_in_block2026);
								instr=instruction();
								state._fsp--;
								if (state.failed) return retval;
								if (list_instr==null) list_instr=new ArrayList<Object>();
								list_instr.add(instr.getTemplate());
								}
								break;

							default :
								break loop37;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					if ( state.backtracking==0 ) {retval.instructions =list_instr;}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:367:4: BLOCK
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block2035); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:370:1: interfaceDeclaration : ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody ) -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st);
	public final PHP54TranslatorWalker.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceDeclaration_return retval = new PHP54TranslatorWalker.interfaceDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier58=null;
		TreeRuleReturnScope extendsDeclaration59 =null;
		TreeRuleReturnScope interfaceBody60 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:371:2: ( ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody ) -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:371:4: ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody )
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration2049); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_interfaceDeclaration2056); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,Abstract,FOLLOW_Abstract_in_interfaceDeclaration2058); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier58=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration2064); if (state.failed) return retval;
			pushFollow(FOLLOW_extendsDeclaration_in_interfaceDeclaration2070);
			extendsDeclaration59=extendsDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration2075);
			interfaceBody60=interfaceBody();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 377:3: -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st)
			  {
			  	retval.st = templateLib.getInstanceOf("interface",new STAttrMap().put("identifier", Identifier58).put("ext", (extendsDeclaration59!=null?((StringTemplate)extendsDeclaration59.getTemplate()):null)).put("body", (interfaceBody60!=null?((StringTemplate)interfaceBody60.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:384:1: interfaceBody : ( ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* ) -> body(statements=$def)| INTERFACE_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.interfaceBody_return interfaceBody() throws RecognitionException {
		PHP54TranslatorWalker.interfaceBody_return retval = new PHP54TranslatorWalker.interfaceBody_return();
		retval.start = input.LT(1);

		List<Object> list_def=null;
		RuleReturnScope def = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:385:2: ( ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* ) -> body(statements=$def)| INTERFACE_BODY -> body(statements=null))
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==INTERFACE_BODY) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:385:4: ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* )
					{
					match(input,INTERFACE_BODY,FOLLOW_INTERFACE_BODY_in_interfaceBody2127); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:385:24: (def+= interfaceBodyDefinition )*
						loop39:
						do {
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==CONSTANT_DECLARATION_LIST||LA39_0==Construct||LA39_0==METHOD_DECLARATION) ) {
								alt39=1;
							}

							switch (alt39) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:385:24: def+= interfaceBodyDefinition
								{
								pushFollow(FOLLOW_interfaceBodyDefinition_in_interfaceBody2131);
								def=interfaceBodyDefinition();
								state._fsp--;
								if (state.failed) return retval;
								if (list_def==null) list_def=new ArrayList<Object>();
								list_def.add(def.getTemplate());
								}
								break;

							default :
								break loop39;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 385:52: -> body(statements=$def)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_def));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:386:4: INTERFACE_BODY
					{
					match(input,INTERFACE_BODY,FOLLOW_INTERFACE_BODY_in_interfaceBody2147); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 386:19: -> body(statements=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:389:1: interfaceBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}| interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st});
	public final PHP54TranslatorWalker.interfaceBodyDefinition_return interfaceBodyDefinition() throws RecognitionException {
		PHP54TranslatorWalker.interfaceBodyDefinition_return retval = new PHP54TranslatorWalker.interfaceBodyDefinition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope constDeclarationList61 =null;
		TreeRuleReturnScope interfaceConstructDeclaration62 =null;
		TreeRuleReturnScope interfaceMethodDeclaration63 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:390:2: ( constDeclarationList -> {$constDeclarationList.st}| interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}| interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st})
			int alt41=3;
			switch ( input.LA(1) ) {
			case CONSTANT_DECLARATION_LIST:
				{
				alt41=1;
				}
				break;
			case Construct:
				{
				alt41=2;
				}
				break;
			case METHOD_DECLARATION:
				{
				alt41=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:390:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_interfaceBodyDefinition2167);
					constDeclarationList61=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 390:25: -> {$constDeclarationList.st}
					  {
					  	retval.st = (constDeclarationList61!=null?((StringTemplate)constDeclarationList61.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:391:4: interfaceConstructDeclaration
					{
					pushFollow(FOLLOW_interfaceConstructDeclaration_in_interfaceBodyDefinition2176);
					interfaceConstructDeclaration62=interfaceConstructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 391:34: -> {$interfaceConstructDeclaration.st}
					  {
					  	retval.st = (interfaceConstructDeclaration62!=null?((StringTemplate)interfaceConstructDeclaration62.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:392:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDefinition2185);
					interfaceMethodDeclaration63=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 392:31: -> {$interfaceMethodDeclaration.st}
					  {
					  	retval.st = (interfaceMethodDeclaration63!=null?((StringTemplate)interfaceMethodDeclaration63.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:395:1: interfaceConstructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.interfaceConstructDeclaration_return interfaceConstructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceConstructDeclaration_return retval = new PHP54TranslatorWalker.interfaceConstructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope formalParameters64 =null;
		TreeRuleReturnScope block65 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:396:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:396:4: ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_interfaceConstructDeclaration2203); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_interfaceConstructDeclaration2210); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_interfaceConstructDeclaration2212);
			abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_interfaceConstructDeclaration2219); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_interfaceConstructDeclaration2221);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_interfaceConstructDeclaration2223);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_interfaceConstructDeclaration2229);
			formalParameters64=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_interfaceConstructDeclaration2234);
			block65=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 402:3: -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", "public").put("identifier", identifier).put("params", (formalParameters64!=null?((StringTemplate)formalParameters64.getTemplate()):null)).put("body", (block65!=null?((PHP54TranslatorWalker.block_return)block65).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:410:1: interfaceMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceMethodDeclaration_return retval = new PHP54TranslatorWalker.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier66=null;
		TreeRuleReturnScope formalParameters67 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:411:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:411:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_interfaceMethodDeclaration2294); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_interfaceMethodDeclaration2300); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_interfaceMethodDeclaration2302);
			abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_interfaceMethodDeclaration2309); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_interfaceMethodDeclaration2311);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_interfaceMethodDeclaration2313);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier66=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodDeclaration2319); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaration2324);
			formalParameters67=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input,BLOCK,FOLLOW_BLOCK_in_interfaceMethodDeclaration2329); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 418:3: -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", "public").put("identifier", Identifier66).put("params", (formalParameters67!=null?((StringTemplate)formalParameters67.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:425:1: functionDeclaration : ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.functionDeclaration_return functionDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.functionDeclaration_return retval = new PHP54TranslatorWalker.functionDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier68=null;
		TreeRuleReturnScope formalParameters69 =null;
		TreeRuleReturnScope block70 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:426:2: ( ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:426:4: ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block )
			{
			match(input,Function,FOLLOW_Function_in_functionDeclaration2380); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_functionDeclaration2386); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration2392); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_functionDeclaration2394);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclaration2396);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier68=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration2402); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameters_in_functionDeclaration2407);
			formalParameters69=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_functionDeclaration2412);
			block70=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 433:3: -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", null).put("identifier", Identifier68).put("params", (formalParameters69!=null?((StringTemplate)formalParameters69.getTemplate()):null)).put("body", (block70!=null?((PHP54TranslatorWalker.block_return)block70).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:442:1: instruction : ( variableDeclarationList -> {$variableDeclarationList.st}| ifCondition -> {$ifCondition.st}| switchCondition -> {$switchCondition.st}| ^( EXPRESSION ( expression )? ) -> expression(expression=$expression.st)| ^( 'return' ( expression )? ) -> return(expression=$expression.st)| ^( 'throw' expression ) -> throw(expression=$expression.st)| ^( 'echo' (exprs+= expression )+ ) -> echo(expressions=$exprs)| ^( 'break' (index= Int )? ) -> break(index=$index.text)| 'break' -> break(index=null)| ^( 'continue' (index= Int )? ) -> continue(index=$index.text)| 'continue' -> continue(index=null));
	public final PHP54TranslatorWalker.instruction_return instruction() throws RecognitionException {
		PHP54TranslatorWalker.instruction_return retval = new PHP54TranslatorWalker.instruction_return();
		retval.start = input.LT(1);

		ITSPHPAst index=null;
		List<Object> list_exprs=null;
		TreeRuleReturnScope variableDeclarationList71 =null;
		TreeRuleReturnScope ifCondition72 =null;
		TreeRuleReturnScope switchCondition73 =null;
		TreeRuleReturnScope expression74 =null;
		TreeRuleReturnScope expression75 =null;
		TreeRuleReturnScope expression76 =null;
		RuleReturnScope exprs = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:443:2: ( variableDeclarationList -> {$variableDeclarationList.st}| ifCondition -> {$ifCondition.st}| switchCondition -> {$switchCondition.st}| ^( EXPRESSION ( expression )? ) -> expression(expression=$expression.st)| ^( 'return' ( expression )? ) -> return(expression=$expression.st)| ^( 'throw' expression ) -> throw(expression=$expression.st)| ^( 'echo' (exprs+= expression )+ ) -> echo(expressions=$exprs)| ^( 'break' (index= Int )? ) -> break(index=$index.text)| 'break' -> break(index=null)| ^( 'continue' (index= Int )? ) -> continue(index=$index.text)| 'continue' -> continue(index=null))
			int alt47=11;
			switch ( input.LA(1) ) {
			case VARIABLE_DECLARATION_LIST:
				{
				alt47=1;
				}
				break;
			case If:
				{
				alt47=2;
				}
				break;
			case Switch:
				{
				alt47=3;
				}
				break;
			case EXPRESSION:
				{
				alt47=4;
				}
				break;
			case Return:
				{
				alt47=5;
				}
				break;
			case Throw:
				{
				alt47=6;
				}
				break;
			case Echo:
				{
				alt47=7;
				}
				break;
			case Break:
				{
				int LA47_8 = input.LA(2);
				if ( (LA47_8==DOWN) ) {
					alt47=8;
				}
				else if ( (LA47_8==UP||LA47_8==Break||LA47_8==CONSTANT_DECLARATION_LIST||LA47_8==Class||LA47_8==Continue||LA47_8==EXPRESSION||LA47_8==Echo||LA47_8==Function||LA47_8==If||LA47_8==Interface||LA47_8==Return||LA47_8==Switch||LA47_8==Throw||LA47_8==Use||LA47_8==VARIABLE_DECLARATION_LIST) ) {
					alt47=9;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Continue:
				{
				int LA47_9 = input.LA(2);
				if ( (LA47_9==DOWN) ) {
					alt47=10;
				}
				else if ( (LA47_9==UP||LA47_9==Break||LA47_9==CONSTANT_DECLARATION_LIST||LA47_9==Class||LA47_9==Continue||LA47_9==EXPRESSION||LA47_9==Echo||LA47_9==Function||LA47_9==If||LA47_9==Interface||LA47_9==Return||LA47_9==Switch||LA47_9==Throw||LA47_9==Use||LA47_9==VARIABLE_DECLARATION_LIST) ) {
					alt47=11;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 9, input);
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
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:443:4: variableDeclarationList
					{
					pushFollow(FOLLOW_variableDeclarationList_in_instruction2471);
					variableDeclarationList71=variableDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 443:29: -> {$variableDeclarationList.st}
					  {
					  	retval.st = (variableDeclarationList71!=null?((StringTemplate)variableDeclarationList71.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:444:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction2481);
					ifCondition72=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 444:19: -> {$ifCondition.st}
					  {
					  	retval.st = (ifCondition72!=null?((StringTemplate)ifCondition72.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:445:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction2493);
					switchCondition73=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 445:22: -> {$switchCondition.st}
					  {
					  	retval.st = (switchCondition73!=null?((StringTemplate)switchCondition73.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:451:4: ^( EXPRESSION ( expression )? )
					{
					match(input,EXPRESSION,FOLLOW_EXPRESSION_in_instruction2515); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:451:17: ( expression )?
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==ARRAY_ACCESS||(LA42_0 >= Assign && LA42_0 <= At)||(LA42_0 >= BitwiseAnd && LA42_0 <= Bool)||LA42_0==CASTING||LA42_0==CLASS_MEMBER_ACCESS||LA42_0==CLASS_STATIC_ACCESS||LA42_0==CONSTANT||LA42_0==Clone||(LA42_0 >= Divide && LA42_0 <= DivideAssign)||(LA42_0 >= Dot && LA42_0 <= DotAssign)||(LA42_0 >= Equal && LA42_0 <= Exit)||LA42_0==FUNCTION_CALL||LA42_0==Float||(LA42_0 >= GreaterEqualThan && LA42_0 <= GreaterThan)||LA42_0==Identical||(LA42_0 >= Instanceof && LA42_0 <= Int)||(LA42_0 >= LessEqualThan && LA42_0 <= METHOD_CALL_STATIC)||(LA42_0 >= Minus && LA42_0 <= MinusAssign)||(LA42_0 >= Modulo && LA42_0 <= MultiplyAssign)||(LA42_0 >= New && LA42_0 <= Null)||(LA42_0 >= POST_DECREMENT && LA42_0 <= PRE_INCREMENT)||(LA42_0 >= Plus && LA42_0 <= PlusAssign)||LA42_0==QuestionMark||(LA42_0 >= ShiftLeft && LA42_0 <= ShiftRightAssign)||LA42_0==String||LA42_0==This||LA42_0==TypeArray||LA42_0==UNARY_MINUS||LA42_0==VariableId) ) {
							alt42=1;
						}
						switch (alt42) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:451:17: expression
								{
								pushFollow(FOLLOW_expression_in_instruction2517);
								expression74=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 451:30: -> expression(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("expression", (expression74!=null?((StringTemplate)expression74.getTemplate()):null)));
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:452:4: ^( 'return' ( expression )? )
					{
					match(input,Return,FOLLOW_Return_in_instruction2534); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:452:15: ( expression )?
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( (LA43_0==ARRAY_ACCESS||(LA43_0 >= Assign && LA43_0 <= At)||(LA43_0 >= BitwiseAnd && LA43_0 <= Bool)||LA43_0==CASTING||LA43_0==CLASS_MEMBER_ACCESS||LA43_0==CLASS_STATIC_ACCESS||LA43_0==CONSTANT||LA43_0==Clone||(LA43_0 >= Divide && LA43_0 <= DivideAssign)||(LA43_0 >= Dot && LA43_0 <= DotAssign)||(LA43_0 >= Equal && LA43_0 <= Exit)||LA43_0==FUNCTION_CALL||LA43_0==Float||(LA43_0 >= GreaterEqualThan && LA43_0 <= GreaterThan)||LA43_0==Identical||(LA43_0 >= Instanceof && LA43_0 <= Int)||(LA43_0 >= LessEqualThan && LA43_0 <= METHOD_CALL_STATIC)||(LA43_0 >= Minus && LA43_0 <= MinusAssign)||(LA43_0 >= Modulo && LA43_0 <= MultiplyAssign)||(LA43_0 >= New && LA43_0 <= Null)||(LA43_0 >= POST_DECREMENT && LA43_0 <= PRE_INCREMENT)||(LA43_0 >= Plus && LA43_0 <= PlusAssign)||LA43_0==QuestionMark||(LA43_0 >= ShiftLeft && LA43_0 <= ShiftRightAssign)||LA43_0==String||LA43_0==This||LA43_0==TypeArray||LA43_0==UNARY_MINUS||LA43_0==VariableId) ) {
							alt43=1;
						}
						switch (alt43) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:452:15: expression
								{
								pushFollow(FOLLOW_expression_in_instruction2536);
								expression75=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 452:29: -> return(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("return",new STAttrMap().put("expression", (expression75!=null?((StringTemplate)expression75.getTemplate()):null)));
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:453:4: ^( 'throw' expression )
					{
					match(input,Throw,FOLLOW_Throw_in_instruction2556); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_instruction2558);
					expression76=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 453:27: -> throw(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("throw",new STAttrMap().put("expression", (expression76!=null?((StringTemplate)expression76.getTemplate()):null)));
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:454:4: ^( 'echo' (exprs+= expression )+ )
					{
					match(input,Echo,FOLLOW_Echo_in_instruction2577); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:454:18: (exprs+= expression )+
					int cnt44=0;
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==ARRAY_ACCESS||(LA44_0 >= Assign && LA44_0 <= At)||(LA44_0 >= BitwiseAnd && LA44_0 <= Bool)||LA44_0==CASTING||LA44_0==CLASS_MEMBER_ACCESS||LA44_0==CLASS_STATIC_ACCESS||LA44_0==CONSTANT||LA44_0==Clone||(LA44_0 >= Divide && LA44_0 <= DivideAssign)||(LA44_0 >= Dot && LA44_0 <= DotAssign)||(LA44_0 >= Equal && LA44_0 <= Exit)||LA44_0==FUNCTION_CALL||LA44_0==Float||(LA44_0 >= GreaterEqualThan && LA44_0 <= GreaterThan)||LA44_0==Identical||(LA44_0 >= Instanceof && LA44_0 <= Int)||(LA44_0 >= LessEqualThan && LA44_0 <= METHOD_CALL_STATIC)||(LA44_0 >= Minus && LA44_0 <= MinusAssign)||(LA44_0 >= Modulo && LA44_0 <= MultiplyAssign)||(LA44_0 >= New && LA44_0 <= Null)||(LA44_0 >= POST_DECREMENT && LA44_0 <= PRE_INCREMENT)||(LA44_0 >= Plus && LA44_0 <= PlusAssign)||LA44_0==QuestionMark||(LA44_0 >= ShiftLeft && LA44_0 <= ShiftRightAssign)||LA44_0==String||LA44_0==This||LA44_0==TypeArray||LA44_0==UNARY_MINUS||LA44_0==VariableId) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:454:18: exprs+= expression
							{
							pushFollow(FOLLOW_expression_in_instruction2581);
							exprs=expression();
							state._fsp--;
							if (state.failed) return retval;
							if (list_exprs==null) list_exprs=new ArrayList<Object>();
							list_exprs.add(exprs.getTemplate());
							}
							break;

						default :
							if ( cnt44 >= 1 ) break loop44;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(44, input);
								throw eee;
						}
						cnt44++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 454:33: -> echo(expressions=$exprs)
					  {
					  	retval.st = templateLib.getInstanceOf("echo",new STAttrMap().put("expressions", list_exprs));
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:455:4: ^( 'break' (index= Int )? )
					{
					match(input,Break,FOLLOW_Break_in_instruction2600); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:455:14: (index= Int )?
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==Int) ) {
							alt45=1;
						}
						switch (alt45) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:455:15: index= Int
								{
								index=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_instruction2605); if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 455:29: -> break(index=$index.text)
					  {
					  	retval.st = templateLib.getInstanceOf("break",new STAttrMap().put("index", (index!=null?index.getText():null)));
					  }


					}

					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:456:4: 'break'
					{
					match(input,Break,FOLLOW_Break_in_instruction2623); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 456:15: -> break(index=null)
					  {
					  	retval.st = templateLib.getInstanceOf("break",new STAttrMap().put("index", null));
					  }


					}

					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:457:4: ^( 'continue' (index= Int )? )
					{
					match(input,Continue,FOLLOW_Continue_in_instruction2641); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:457:17: (index= Int )?
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==Int) ) {
							alt46=1;
						}
						switch (alt46) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:457:18: index= Int
								{
								index=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_instruction2646); if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 457:31: -> continue(index=$index.text)
					  {
					  	retval.st = templateLib.getInstanceOf("continue",new STAttrMap().put("index", (index!=null?index.getText():null)));
					  }


					}

					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:458:4: 'continue'
					{
					match(input,Continue,FOLLOW_Continue_in_instruction2663); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 458:17: -> continue(index=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:461:1: ifCondition : ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? ) -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions);
	public final PHP54TranslatorWalker.ifCondition_return ifCondition() throws RecognitionException {
		PHP54TranslatorWalker.ifCondition_return retval = new PHP54TranslatorWalker.ifCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ifBlock =null;
		TreeRuleReturnScope elseBlock =null;
		TreeRuleReturnScope expression77 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:462:2: ( ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? ) -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:462:4: ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? )
			{
			match(input,If,FOLLOW_If_in_ifCondition2686); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_ifCondition2692);
			expression77=expression();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_blockConditional_in_ifCondition2700);
			ifBlock=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:465:13: (elseBlock= blockConditional )?
			int alt48=2;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==BLOCK_CONDITIONAL) ) {
				alt48=1;
			}
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:465:13: elseBlock= blockConditional
					{
					pushFollow(FOLLOW_blockConditional_in_ifCondition2707);
					elseBlock=blockConditional();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 467:3: -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("if",new STAttrMap().put("condition", (expression77!=null?((StringTemplate)expression77.getTemplate()):null)).put("ifBlock", (ifBlock!=null?((PHP54TranslatorWalker.blockConditional_return)ifBlock).instructions:null)).put("elseBlock", (elseBlock!=null?((PHP54TranslatorWalker.blockConditional_return)elseBlock).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:470:1: blockConditional returns [List<Object> instructions] : ^( BLOCK_CONDITIONAL (instr+= instruction )* ) ;
	public final PHP54TranslatorWalker.blockConditional_return blockConditional() throws RecognitionException {
		PHP54TranslatorWalker.blockConditional_return retval = new PHP54TranslatorWalker.blockConditional_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:2: ( ^( BLOCK_CONDITIONAL (instr+= instruction )* ) )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:4: ^( BLOCK_CONDITIONAL (instr+= instruction )* )
			{
			match(input,BLOCK_CONDITIONAL,FOLLOW_BLOCK_CONDITIONAL_in_blockConditional2748); if (state.failed) return retval;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:29: (instr+= instruction )*
				loop49:
				do {
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==Break||LA49_0==Continue||LA49_0==EXPRESSION||LA49_0==Echo||LA49_0==If||LA49_0==Return||LA49_0==Switch||LA49_0==Throw||LA49_0==VARIABLE_DECLARATION_LIST) ) {
						alt49=1;
					}

					switch (alt49) {
					case 1 :
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:29: instr+= instruction
						{
						pushFollow(FOLLOW_instruction_in_blockConditional2752);
						instr=instruction();
						state._fsp--;
						if (state.failed) return retval;
						if (list_instr==null) list_instr=new ArrayList<Object>();
						list_instr.add(instr.getTemplate());
						}
						break;

					default :
						break loop49;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:474:1: switchCondition : ^( 'switch' expression (content+= switchContent )* ) -> switch(condition=$expression.stcontent=$content);
	public final PHP54TranslatorWalker.switchCondition_return switchCondition() throws RecognitionException {
		PHP54TranslatorWalker.switchCondition_return retval = new PHP54TranslatorWalker.switchCondition_return();
		retval.start = input.LT(1);

		List<Object> list_content=null;
		TreeRuleReturnScope expression78 =null;
		RuleReturnScope content = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:475:2: ( ^( 'switch' expression (content+= switchContent )* ) -> switch(condition=$expression.stcontent=$content))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:475:4: ^( 'switch' expression (content+= switchContent )* )
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition2768); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_switchCondition2770);
			expression78=expression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:475:33: (content+= switchContent )*
			loop50:
			do {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==SWITCH_CASES) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:475:33: content+= switchContent
					{
					pushFollow(FOLLOW_switchContent_in_switchCondition2774);
					content=switchContent();
					state._fsp--;
					if (state.failed) return retval;
					if (list_content==null) list_content=new ArrayList<Object>();
					list_content.add(content.getTemplate());
					}
					break;

				default :
					break loop50;
				}
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 475:51: -> switch(condition=$expression.stcontent=$content)
			  {
			  	retval.st = templateLib.getInstanceOf("switch",new STAttrMap().put("condition", (expression78!=null?((StringTemplate)expression78.getTemplate()):null)).put("content", list_content));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:478:1: switchContent : ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional -> switchContent(labels=$labelsblock=$blockConditional.instructions);
	public final PHP54TranslatorWalker.switchContent_return switchContent() throws RecognitionException {
		PHP54TranslatorWalker.switchContent_return retval = new PHP54TranslatorWalker.switchContent_return();
		retval.start = input.LT(1);

		List<Object> list_labels=null;
		TreeRuleReturnScope blockConditional79 =null;
		RuleReturnScope labels = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:479:2: ( ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional -> switchContent(labels=$labelsblock=$blockConditional.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:479:4: ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional
			{
			match(input,SWITCH_CASES,FOLLOW_SWITCH_CASES_in_switchContent2802); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:479:25: (labels+= caseLabel )+
			int cnt51=0;
			loop51:
			do {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==ARRAY_ACCESS||(LA51_0 >= Assign && LA51_0 <= At)||(LA51_0 >= BitwiseAnd && LA51_0 <= Bool)||LA51_0==CASTING||LA51_0==CLASS_MEMBER_ACCESS||LA51_0==CLASS_STATIC_ACCESS||LA51_0==CONSTANT||LA51_0==Clone||LA51_0==Default||(LA51_0 >= Divide && LA51_0 <= DivideAssign)||(LA51_0 >= Dot && LA51_0 <= DotAssign)||(LA51_0 >= Equal && LA51_0 <= Exit)||LA51_0==FUNCTION_CALL||LA51_0==Float||(LA51_0 >= GreaterEqualThan && LA51_0 <= GreaterThan)||LA51_0==Identical||(LA51_0 >= Instanceof && LA51_0 <= Int)||(LA51_0 >= LessEqualThan && LA51_0 <= METHOD_CALL_STATIC)||(LA51_0 >= Minus && LA51_0 <= MinusAssign)||(LA51_0 >= Modulo && LA51_0 <= MultiplyAssign)||(LA51_0 >= New && LA51_0 <= Null)||(LA51_0 >= POST_DECREMENT && LA51_0 <= PRE_INCREMENT)||(LA51_0 >= Plus && LA51_0 <= PlusAssign)||LA51_0==QuestionMark||(LA51_0 >= ShiftLeft && LA51_0 <= ShiftRightAssign)||LA51_0==String||LA51_0==This||LA51_0==TypeArray||LA51_0==UNARY_MINUS||LA51_0==VariableId) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:479:25: labels+= caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_switchContent2806);
					labels=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if (list_labels==null) list_labels=new ArrayList<Object>();
					list_labels.add(labels.getTemplate());
					}
					break;

				default :
					if ( cnt51 >= 1 ) break loop51;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(51, input);
						throw eee;
				}
				cnt51++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_blockConditional_in_switchContent2810);
			blockConditional79=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 480:3: -> switchContent(labels=$labelsblock=$blockConditional.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("switchContent",new STAttrMap().put("labels", list_labels).put("block", (blockConditional79!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional79).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:483:1: caseLabel : ( expression -> caseLabel(label=$expression.st)| Default -> {%{$Default.text+\":\"}});
	public final PHP54TranslatorWalker.caseLabel_return caseLabel() throws RecognitionException {
		PHP54TranslatorWalker.caseLabel_return retval = new PHP54TranslatorWalker.caseLabel_return();
		retval.start = input.LT(1);

		ITSPHPAst Default81=null;
		TreeRuleReturnScope expression80 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:484:2: ( expression -> caseLabel(label=$expression.st)| Default -> {%{$Default.text+\":\"}})
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==ARRAY_ACCESS||(LA52_0 >= Assign && LA52_0 <= At)||(LA52_0 >= BitwiseAnd && LA52_0 <= Bool)||LA52_0==CASTING||LA52_0==CLASS_MEMBER_ACCESS||LA52_0==CLASS_STATIC_ACCESS||LA52_0==CONSTANT||LA52_0==Clone||(LA52_0 >= Divide && LA52_0 <= DivideAssign)||(LA52_0 >= Dot && LA52_0 <= DotAssign)||(LA52_0 >= Equal && LA52_0 <= Exit)||LA52_0==FUNCTION_CALL||LA52_0==Float||(LA52_0 >= GreaterEqualThan && LA52_0 <= GreaterThan)||LA52_0==Identical||(LA52_0 >= Instanceof && LA52_0 <= Int)||(LA52_0 >= LessEqualThan && LA52_0 <= METHOD_CALL_STATIC)||(LA52_0 >= Minus && LA52_0 <= MinusAssign)||(LA52_0 >= Modulo && LA52_0 <= MultiplyAssign)||(LA52_0 >= New && LA52_0 <= Null)||(LA52_0 >= POST_DECREMENT && LA52_0 <= PRE_INCREMENT)||(LA52_0 >= Plus && LA52_0 <= PlusAssign)||LA52_0==QuestionMark||(LA52_0 >= ShiftLeft && LA52_0 <= ShiftRightAssign)||LA52_0==String||LA52_0==This||LA52_0==TypeArray||LA52_0==UNARY_MINUS||LA52_0==VariableId) ) {
				alt52=1;
			}
			else if ( (LA52_0==Default) ) {
				alt52=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}
			switch (alt52) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:484:4: expression
					{
					pushFollow(FOLLOW_expression_in_caseLabel2838);
					expression80=expression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 484:16: -> caseLabel(label=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("caseLabel",new STAttrMap().put("label", (expression80!=null?((StringTemplate)expression80.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:485:4: Default
					{
					Default81=(ITSPHPAst)match(input,Default,FOLLOW_Default_in_caseLabel2853); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 485:13: -> {%{$Default.text+\":\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Default81!=null?Default81.getText():null)+":");
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


	public static class expression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:488:1: expression options {backtrack=true; } : ( atom -> {$atom.st}| operator -> {$operator.st}| functionCall -> {$functionCall.st}| methodCall -> {$methodCall.st}| methodCallSelfOrParent -> {$methodCallSelfOrParent.st}| methodCallStatic -> {$methodCallStatic.st}| classStaticAccess -> {$classStaticAccess.st}| postFixExpression -> {$postFixExpression.st}| exit -> {$exit.st});
	public final PHP54TranslatorWalker.expression_return expression() throws RecognitionException {
		PHP54TranslatorWalker.expression_return retval = new PHP54TranslatorWalker.expression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope atom82 =null;
		TreeRuleReturnScope operator83 =null;
		TreeRuleReturnScope functionCall84 =null;
		TreeRuleReturnScope methodCall85 =null;
		TreeRuleReturnScope methodCallSelfOrParent86 =null;
		TreeRuleReturnScope methodCallStatic87 =null;
		TreeRuleReturnScope classStaticAccess88 =null;
		TreeRuleReturnScope postFixExpression89 =null;
		TreeRuleReturnScope exit90 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:490:2: ( atom -> {$atom.st}| operator -> {$operator.st}| functionCall -> {$functionCall.st}| methodCall -> {$methodCall.st}| methodCallSelfOrParent -> {$methodCallSelfOrParent.st}| methodCallStatic -> {$methodCallStatic.st}| classStaticAccess -> {$classStaticAccess.st}| postFixExpression -> {$postFixExpression.st}| exit -> {$exit.st})
			int alt53=9;
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
				alt53=1;
				}
				break;
			case CLASS_STATIC_ACCESS:
				{
				int LA53_2 = input.LA(2);
				if ( (LA53_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case TYPE_NAME:
						{
						int LA53_11 = input.LA(4);
						if ( (LA53_11==CONSTANT) ) {
							int LA53_16 = input.LA(5);
							if ( (LA53_16==UP) ) {
								int LA53_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt53=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt53=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 53, 18, input);
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
										new NoViableAltException("", 53, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA53_11==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt53=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 53, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case Self:
						{
						int LA53_12 = input.LA(4);
						if ( (LA53_12==CONSTANT) ) {
							int LA53_16 = input.LA(5);
							if ( (LA53_16==UP) ) {
								int LA53_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt53=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt53=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 53, 18, input);
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
										new NoViableAltException("", 53, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA53_12==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt53=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 53, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case Parent:
						{
						int LA53_13 = input.LA(4);
						if ( (LA53_13==CONSTANT) ) {
							int LA53_16 = input.LA(5);
							if ( (LA53_16==UP) ) {
								int LA53_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt53=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt53=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 53, 18, input);
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
										new NoViableAltException("", 53, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA53_13==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt53=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 53, 13, input);
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
								new NoViableAltException("", 53, 9, input);
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
							new NoViableAltException("", 53, 2, input);
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
				alt53=2;
				}
				break;
			case FUNCTION_CALL:
				{
				alt53=3;
				}
				break;
			case METHOD_CALL:
				{
				int LA53_5 = input.LA(2);
				if ( (LA53_5==DOWN) ) {
					int LA53_10 = input.LA(3);
					if ( (LA53_10==This||LA53_10==VariableId) ) {
						alt53=4;
					}
					else if ( (LA53_10==Parent||LA53_10==Self) ) {
						alt53=5;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 53, 10, input);
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
							new NoViableAltException("", 53, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case METHOD_CALL_STATIC:
				{
				alt53=6;
				}
				break;
			case ARRAY_ACCESS:
			case CLASS_MEMBER_ACCESS:
			case METHOD_CALL_POSTFIX:
				{
				alt53=8;
				}
				break;
			case Exit:
				{
				alt53=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:490:7: atom
					{
					pushFollow(FOLLOW_atom_in_expression2879);
					atom82=atom();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 490:15: -> {$atom.st}
					  {
					  	retval.st = (atom82!=null?((StringTemplate)atom82.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:491:4: operator
					{
					pushFollow(FOLLOW_operator_in_expression2891);
					operator83=operator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 491:14: -> {$operator.st}
					  {
					  	retval.st = (operator83!=null?((StringTemplate)operator83.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:492:8: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_expression2905);
					functionCall84=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 492:23: -> {$functionCall.st}
					  {
					  	retval.st = (functionCall84!=null?((StringTemplate)functionCall84.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:493:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_expression2916);
					methodCall85=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 493:17: -> {$methodCall.st}
					  {
					  	retval.st = (methodCall85!=null?((StringTemplate)methodCall85.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:494:4: methodCallSelfOrParent
					{
					pushFollow(FOLLOW_methodCallSelfOrParent_in_expression2927);
					methodCallSelfOrParent86=methodCallSelfOrParent();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 494:28: -> {$methodCallSelfOrParent.st}
					  {
					  	retval.st = (methodCallSelfOrParent86!=null?((StringTemplate)methodCallSelfOrParent86.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:495:4: methodCallStatic
					{
					pushFollow(FOLLOW_methodCallStatic_in_expression2937);
					methodCallStatic87=methodCallStatic();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 495:22: -> {$methodCallStatic.st}
					  {
					  	retval.st = (methodCallStatic87!=null?((StringTemplate)methodCallStatic87.getTemplate()):null);
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:496:4: classStaticAccess
					{
					pushFollow(FOLLOW_classStaticAccess_in_expression2947);
					classStaticAccess88=classStaticAccess();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 496:22: -> {$classStaticAccess.st}
					  {
					  	retval.st = (classStaticAccess88!=null?((StringTemplate)classStaticAccess88.getTemplate()):null);
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:497:4: postFixExpression
					{
					pushFollow(FOLLOW_postFixExpression_in_expression2956);
					postFixExpression89=postFixExpression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 497:22: -> {$postFixExpression.st}
					  {
					  	retval.st = (postFixExpression89!=null?((StringTemplate)postFixExpression89.getTemplate()):null);
					  }


					}

					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:498:4: exit
					{
					pushFollow(FOLLOW_exit_in_expression2965);
					exit90=exit();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 498:11: -> {$exit.st}
					  {
					  	retval.st = (exit90!=null?((StringTemplate)exit90.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:501:1: atom : ( primitiveAtom -> {$primitiveAtom.st}| ^( TypeArray (keyValuePairs+= arrayKeyValue )* ) -> array(content=$keyValuePairs)| VariableId -> {%{$VariableId.text}}| This -> {%{$This.text}}| CONSTANT -> {%{$CONSTANT.text}}| ^( CLASS_STATIC_ACCESS staticAccess CONSTANT ) -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text));
	public final PHP54TranslatorWalker.atom_return atom() throws RecognitionException {
		PHP54TranslatorWalker.atom_return retval = new PHP54TranslatorWalker.atom_return();
		retval.start = input.LT(1);

		ITSPHPAst VariableId92=null;
		ITSPHPAst This93=null;
		ITSPHPAst CONSTANT94=null;
		ITSPHPAst CONSTANT96=null;
		List<Object> list_keyValuePairs=null;
		TreeRuleReturnScope primitiveAtom91 =null;
		TreeRuleReturnScope staticAccess95 =null;
		RuleReturnScope keyValuePairs = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:502:2: ( primitiveAtom -> {$primitiveAtom.st}| ^( TypeArray (keyValuePairs+= arrayKeyValue )* ) -> array(content=$keyValuePairs)| VariableId -> {%{$VariableId.text}}| This -> {%{$This.text}}| CONSTANT -> {%{$CONSTANT.text}}| ^( CLASS_STATIC_ACCESS staticAccess CONSTANT ) -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text))
			int alt55=6;
			switch ( input.LA(1) ) {
			case Bool:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt55=1;
				}
				break;
			case TypeArray:
				{
				alt55=2;
				}
				break;
			case VariableId:
				{
				alt55=3;
				}
				break;
			case This:
				{
				alt55=4;
				}
				break;
			case CONSTANT:
				{
				alt55=5;
				}
				break;
			case CLASS_STATIC_ACCESS:
				{
				alt55=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:502:4: primitiveAtom
					{
					pushFollow(FOLLOW_primitiveAtom_in_atom2988);
					primitiveAtom91=primitiveAtom();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 502:23: -> {$primitiveAtom.st}
					  {
					  	retval.st = (primitiveAtom91!=null?((StringTemplate)primitiveAtom91.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:4: ^( TypeArray (keyValuePairs+= arrayKeyValue )* )
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_atom3003); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:29: (keyValuePairs+= arrayKeyValue )*
						loop54:
						do {
							int alt54=2;
							int LA54_0 = input.LA(1);
							if ( (LA54_0==ARRAY_ACCESS||LA54_0==Arrow||(LA54_0 >= Assign && LA54_0 <= At)||(LA54_0 >= BitwiseAnd && LA54_0 <= Bool)||LA54_0==CASTING||LA54_0==CLASS_MEMBER_ACCESS||LA54_0==CLASS_STATIC_ACCESS||LA54_0==CONSTANT||LA54_0==Clone||(LA54_0 >= Divide && LA54_0 <= DivideAssign)||(LA54_0 >= Dot && LA54_0 <= DotAssign)||(LA54_0 >= Equal && LA54_0 <= Exit)||LA54_0==FUNCTION_CALL||LA54_0==Float||(LA54_0 >= GreaterEqualThan && LA54_0 <= GreaterThan)||LA54_0==Identical||(LA54_0 >= Instanceof && LA54_0 <= Int)||(LA54_0 >= LessEqualThan && LA54_0 <= METHOD_CALL_STATIC)||(LA54_0 >= Minus && LA54_0 <= MinusAssign)||(LA54_0 >= Modulo && LA54_0 <= MultiplyAssign)||(LA54_0 >= New && LA54_0 <= Null)||(LA54_0 >= POST_DECREMENT && LA54_0 <= PRE_INCREMENT)||(LA54_0 >= Plus && LA54_0 <= PlusAssign)||LA54_0==QuestionMark||(LA54_0 >= ShiftLeft && LA54_0 <= ShiftRightAssign)||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==UNARY_MINUS||LA54_0==VariableId) ) {
								alt54=1;
							}

							switch (alt54) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:29: keyValuePairs+= arrayKeyValue
								{
								pushFollow(FOLLOW_arrayKeyValue_in_atom3007);
								keyValuePairs=arrayKeyValue();
								state._fsp--;
								if (state.failed) return retval;
								if (list_keyValuePairs==null) list_keyValuePairs=new ArrayList<Object>();
								list_keyValuePairs.add(keyValuePairs.getTemplate());
								}
								break;

							default :
								break loop54;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 503:47: -> array(content=$keyValuePairs)
					  {
					  	retval.st = templateLib.getInstanceOf("array",new STAttrMap().put("content", list_keyValuePairs));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:504:4: VariableId
					{
					VariableId92=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_atom3024); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 504:20: -> {%{$VariableId.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(VariableId92!=null?VariableId92.getText():null));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:505:4: This
					{
					This93=(ITSPHPAst)match(input,This,FOLLOW_This_in_atom3038); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 505:14: -> {%{$This.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(This93!=null?This93.getText():null));
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:506:4: CONSTANT
					{
					CONSTANT94=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_atom3052); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 506:17: -> {%{$CONSTANT.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(CONSTANT94!=null?CONSTANT94.getText():null));
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:507:4: ^( CLASS_STATIC_ACCESS staticAccess CONSTANT )
					{
					match(input,CLASS_STATIC_ACCESS,FOLLOW_CLASS_STATIC_ACCESS_in_atom3066); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_staticAccess_in_atom3068);
					staticAccess95=staticAccess();
					state._fsp--;
					if (state.failed) return retval;
					CONSTANT96=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_atom3070); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 507:52: -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text)
					  {
					  	retval.st = templateLib.getInstanceOf("classConstant",new STAttrMap().put("accessor", (staticAccess95!=null?((StringTemplate)staticAccess95.getTemplate()):null)).put("constant", (CONSTANT96!=null?CONSTANT96.getText():null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:510:1: primitiveAtom : ( Bool | Int | Float | String | Null );
	public final PHP54TranslatorWalker.primitiveAtom_return primitiveAtom() throws RecognitionException {
		PHP54TranslatorWalker.primitiveAtom_return retval = new PHP54TranslatorWalker.primitiveAtom_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:512:2: ( Bool | Int | Float | String | Null )
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:519:1: arrayKeyValue : ( ^( '=>' key= expression value= expression ) -> keyValue(key=$key.stvalue=$value.st)| expression -> {$expression.st});
	public final PHP54TranslatorWalker.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		PHP54TranslatorWalker.arrayKeyValue_return retval = new PHP54TranslatorWalker.arrayKeyValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope key =null;
		TreeRuleReturnScope value =null;
		TreeRuleReturnScope expression97 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:520:2: ( ^( '=>' key= expression value= expression ) -> keyValue(key=$key.stvalue=$value.st)| expression -> {$expression.st})
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==Arrow) ) {
				alt56=1;
			}
			else if ( (LA56_0==ARRAY_ACCESS||(LA56_0 >= Assign && LA56_0 <= At)||(LA56_0 >= BitwiseAnd && LA56_0 <= Bool)||LA56_0==CASTING||LA56_0==CLASS_MEMBER_ACCESS||LA56_0==CLASS_STATIC_ACCESS||LA56_0==CONSTANT||LA56_0==Clone||(LA56_0 >= Divide && LA56_0 <= DivideAssign)||(LA56_0 >= Dot && LA56_0 <= DotAssign)||(LA56_0 >= Equal && LA56_0 <= Exit)||LA56_0==FUNCTION_CALL||LA56_0==Float||(LA56_0 >= GreaterEqualThan && LA56_0 <= GreaterThan)||LA56_0==Identical||(LA56_0 >= Instanceof && LA56_0 <= Int)||(LA56_0 >= LessEqualThan && LA56_0 <= METHOD_CALL_STATIC)||(LA56_0 >= Minus && LA56_0 <= MinusAssign)||(LA56_0 >= Modulo && LA56_0 <= MultiplyAssign)||(LA56_0 >= New && LA56_0 <= Null)||(LA56_0 >= POST_DECREMENT && LA56_0 <= PRE_INCREMENT)||(LA56_0 >= Plus && LA56_0 <= PlusAssign)||LA56_0==QuestionMark||(LA56_0 >= ShiftLeft && LA56_0 <= ShiftRightAssign)||LA56_0==String||LA56_0==This||LA56_0==TypeArray||LA56_0==UNARY_MINUS||LA56_0==VariableId) ) {
				alt56=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:520:4: ^( '=>' key= expression value= expression )
					{
					match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue3141); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_arrayKeyValue3145);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_arrayKeyValue3149);
					value=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 520:44: -> keyValue(key=$key.stvalue=$value.st)
					  {
					  	retval.st = templateLib.getInstanceOf("keyValue",new STAttrMap().put("key", (key!=null?((StringTemplate)key.getTemplate()):null)).put("value", (value!=null?((StringTemplate)value.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:521:4: expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue3169);
					expression97=expression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 521:15: -> {$expression.st}
					  {
					  	retval.st = (expression97!=null?((StringTemplate)expression97.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:524:1: staticAccess : ( TYPE_NAME -> {%{$TYPE_NAME.text}}| Self -> {%{$Self.text}}| Parent -> {%{$Parent.text}});
	public final PHP54TranslatorWalker.staticAccess_return staticAccess() throws RecognitionException {
		PHP54TranslatorWalker.staticAccess_return retval = new PHP54TranslatorWalker.staticAccess_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME98=null;
		ITSPHPAst Self99=null;
		ITSPHPAst Parent100=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:525:3: ( TYPE_NAME -> {%{$TYPE_NAME.text}}| Self -> {%{$Self.text}}| Parent -> {%{$Parent.text}})
			int alt57=3;
			switch ( input.LA(1) ) {
			case TYPE_NAME:
				{
				alt57=1;
				}
				break;
			case Self:
				{
				alt57=2;
				}
				break;
			case Parent:
				{
				alt57=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:525:5: TYPE_NAME
					{
					TYPE_NAME98=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_staticAccess3186); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 525:15: -> {%{$TYPE_NAME.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TYPE_NAME98!=null?TYPE_NAME98.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:526:5: Self
					{
					Self99=(ITSPHPAst)match(input,Self,FOLLOW_Self_in_staticAccess3196); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 526:10: -> {%{$Self.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Self99!=null?Self99.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:527:5: Parent
					{
					Parent100=(ITSPHPAst)match(input,Parent,FOLLOW_Parent_in_staticAccess3206); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 527:12: -> {%{$Parent.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Parent100!=null?Parent100.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:530:1: operator : ( ^( unaryPreOperator expr= expression ) -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)| ^( unaryPostOperator expr= expression ) -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)| ^( binaryOperator left= expression right= expression ) -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)| ^( QuestionMark cond= expression ifCase= expression elseCase= expression ) -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))| castingOperator -> {$castingOperator.st}| ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) ) -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))| newOperator -> {$newOperator.st}| ^( 'clone' expr= expression ) -> clone(expression=$expr.st));
	public final PHP54TranslatorWalker.operator_return operator() throws RecognitionException {
		PHP54TranslatorWalker.operator_return retval = new PHP54TranslatorWalker.operator_return();
		retval.start = input.LT(1);

		ITSPHPAst type=null;
		ITSPHPAst QuestionMark104=null;
		ITSPHPAst Instanceof106=null;
		TreeRuleReturnScope expr =null;
		TreeRuleReturnScope left =null;
		TreeRuleReturnScope right =null;
		TreeRuleReturnScope cond =null;
		TreeRuleReturnScope ifCase =null;
		TreeRuleReturnScope elseCase =null;
		TreeRuleReturnScope unaryPreOperator101 =null;
		TreeRuleReturnScope unaryPostOperator102 =null;
		TreeRuleReturnScope binaryOperator103 =null;
		TreeRuleReturnScope castingOperator105 =null;
		TreeRuleReturnScope newOperator107 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:531:3: ( ^( unaryPreOperator expr= expression ) -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)| ^( unaryPostOperator expr= expression ) -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)| ^( binaryOperator left= expression right= expression ) -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)| ^( QuestionMark cond= expression ifCase= expression elseCase= expression ) -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))| castingOperator -> {$castingOperator.st}| ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) ) -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))| newOperator -> {$newOperator.st}| ^( 'clone' expr= expression ) -> clone(expression=$expr.st))
			int alt59=8;
			switch ( input.LA(1) ) {
			case At:
			case BitwiseNot:
			case LogicNot:
			case PRE_DECREMENT:
			case PRE_INCREMENT:
			case UNARY_MINUS:
				{
				alt59=1;
				}
				break;
			case POST_DECREMENT:
			case POST_INCREMENT:
				{
				alt59=2;
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
				alt59=3;
				}
				break;
			case QuestionMark:
				{
				alt59=4;
				}
				break;
			case CASTING:
				{
				alt59=5;
				}
				break;
			case Instanceof:
				{
				alt59=6;
				}
				break;
			case New:
				{
				alt59=7;
				}
				break;
			case Clone:
				{
				alt59=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 59, 0, input);
				throw nvae;
			}
			switch (alt59) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:531:5: ^( unaryPreOperator expr= expression )
					{
					pushFollow(FOLLOW_unaryPreOperator_in_operator3225);
					unaryPreOperator101=unaryPreOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3229);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 531:46: -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPreOperator",new STAttrMap().put("operator", (unaryPreOperator101!=null?((StringTemplate)unaryPreOperator101.getTemplate()):null)).put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:532:4: ^( unaryPostOperator expr= expression )
					{
					pushFollow(FOLLOW_unaryPostOperator_in_operator3258);
					unaryPostOperator102=unaryPostOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3262);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 532:45: -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPostOperator",new STAttrMap().put("operator", (unaryPostOperator102!=null?((StringTemplate)unaryPostOperator102.getTemplate()):null)).put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:533:4: ^( binaryOperator left= expression right= expression )
					{
					pushFollow(FOLLOW_binaryOperator_in_operator3291);
					binaryOperator103=binaryOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3295);
					left=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3299);
					right=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 533:58: -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)
					  {
					  	retval.st = templateLib.getInstanceOf("binaryOperator",new STAttrMap().put("operator", (binaryOperator103!=null?((StringTemplate)binaryOperator103.getTemplate()):null)).put("left", (left!=null?((StringTemplate)left.getTemplate()):null)).put("right", (right!=null?((StringTemplate)right.getTemplate()):null)).put("needParentheses", (binaryOperator103!=null?((PHP54TranslatorWalker.binaryOperator_return)binaryOperator103).needParentheses:false)));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:534:4: ^( QuestionMark cond= expression ifCase= expression elseCase= expression )
					{
					QuestionMark104=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_operator3333); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3337);
					cond=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3341);
					ifCase=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3345);
					elseCase=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 534:75: -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))
					  {
					  	retval.st = templateLib.getInstanceOf("ternaryOperator",new STAttrMap().put("cond", (cond!=null?((StringTemplate)cond.getTemplate()):null)).put("ifCase", (ifCase!=null?((StringTemplate)ifCase.getTemplate()):null)).put("elseCase", (elseCase!=null?((StringTemplate)elseCase.getTemplate()):null)).put("needParentheses", precedenceHelper.needParentheses(QuestionMark104)));
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:535:4: castingOperator
					{
					pushFollow(FOLLOW_castingOperator_in_operator3376);
					castingOperator105=castingOperator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 535:27: -> {$castingOperator.st}
					  {
					  	retval.st = (castingOperator105!=null?((StringTemplate)castingOperator105.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:536:4: ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) )
					{
					Instanceof106=(ITSPHPAst)match(input,Instanceof,FOLLOW_Instanceof_in_operator3393); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3397);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:536:33: (type= TYPE_NAME |type= VariableId )
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==TYPE_NAME) ) {
						alt58=1;
					}
					else if ( (LA58_0==VariableId) ) {
						alt58=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 58, 0, input);
						throw nvae;
					}
					switch (alt58) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:536:34: type= TYPE_NAME
							{
							type=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_operator3402); if (state.failed) return retval;
							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:536:49: type= VariableId
							{
							type=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_operator3406); if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 536:69: -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))
					  {
					  	retval.st = templateLib.getInstanceOf("instanceof",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)).put("type", (type!=null?type.getText():null)).put("needParentheses", precedenceHelper.needParentheses(Instanceof106)));
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:537:4: newOperator
					{
					pushFollow(FOLLOW_newOperator_in_operator3434);
					newOperator107=newOperator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 537:23: -> {$newOperator.st}
					  {
					  	retval.st = (newOperator107!=null?((StringTemplate)newOperator107.getTemplate()):null);
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:538:8: ^( 'clone' expr= expression )
					{
					match(input,Clone,FOLLOW_Clone_in_operator3455); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3459);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 538:40: -> clone(expression=$expr.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:541:1: unaryPreOperator : ( PRE_INCREMENT -> {%{\"++\"}}| PRE_DECREMENT -> {%{\"--\"}}| '@' -> {%{\"@\"}}| '~' -> {%{\"~\"}}| '!' -> {%{\"!\"}}| UNARY_MINUS -> {%{\"-\"}});
	public final PHP54TranslatorWalker.unaryPreOperator_return unaryPreOperator() throws RecognitionException {
		PHP54TranslatorWalker.unaryPreOperator_return retval = new PHP54TranslatorWalker.unaryPreOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:542:2: ( PRE_INCREMENT -> {%{\"++\"}}| PRE_DECREMENT -> {%{\"--\"}}| '@' -> {%{\"@\"}}| '~' -> {%{\"~\"}}| '!' -> {%{\"!\"}}| UNARY_MINUS -> {%{\"-\"}})
			int alt60=6;
			switch ( input.LA(1) ) {
			case PRE_INCREMENT:
				{
				alt60=1;
				}
				break;
			case PRE_DECREMENT:
				{
				alt60=2;
				}
				break;
			case At:
				{
				alt60=3;
				}
				break;
			case BitwiseNot:
				{
				alt60=4;
				}
				break;
			case LogicNot:
				{
				alt60=5;
				}
				break;
			case UNARY_MINUS:
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:542:4: PRE_INCREMENT
					{
					match(input,PRE_INCREMENT,FOLLOW_PRE_INCREMENT_in_unaryPreOperator3490); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 542:18: -> {%{\"++\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"++");
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:543:8: PRE_DECREMENT
					{
					match(input,PRE_DECREMENT,FOLLOW_PRE_DECREMENT_in_unaryPreOperator3503); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 543:23: -> {%{\"--\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"--");
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:544:8: '@'
					{
					match(input,At,FOLLOW_At_in_unaryPreOperator3517); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 544:14: -> {%{\"@\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"@");
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:545:8: '~'
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_unaryPreOperator3532); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 545:14: -> {%{\"~\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"~");
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:546:8: '!'
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_unaryPreOperator3547); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 546:14: -> {%{\"!\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"!");
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:547:8: UNARY_MINUS
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unaryPreOperator3562); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 547:20: -> {%{\"-\"}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:550:1: unaryPostOperator : ( POST_INCREMENT -> {%{\"++\"}}| POST_DECREMENT -> {%{\"--\"}});
	public final PHP54TranslatorWalker.unaryPostOperator_return unaryPostOperator() throws RecognitionException {
		PHP54TranslatorWalker.unaryPostOperator_return retval = new PHP54TranslatorWalker.unaryPostOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:551:2: ( POST_INCREMENT -> {%{\"++\"}}| POST_DECREMENT -> {%{\"--\"}})
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==POST_INCREMENT) ) {
				alt61=1;
			}
			else if ( (LA61_0==POST_DECREMENT) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:551:4: POST_INCREMENT
					{
					match(input,POST_INCREMENT,FOLLOW_POST_INCREMENT_in_unaryPostOperator3586); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 551:19: -> {%{\"++\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"++");
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:552:8: POST_DECREMENT
					{
					match(input,POST_DECREMENT,FOLLOW_POST_DECREMENT_in_unaryPostOperator3599); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 552:23: -> {%{\"--\"}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:555:1: binaryOperator returns [boolean needParentheses] : ( 'or' | 'xor' | 'and' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' | '||' | '&&' | '|' | '^' | '&' | '==' | '!=' | '<>' | '===' | '!==' | '<' | '<=' | '>' | '>=' | '<<' | '>>' | '+' | '-' | '.' | '*' | '/' | '%' );
	public final PHP54TranslatorWalker.binaryOperator_return binaryOperator() throws RecognitionException {
		PHP54TranslatorWalker.binaryOperator_return retval = new PHP54TranslatorWalker.binaryOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:560:2: ( 'or' | 'xor' | 'and' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' | '||' | '&&' | '|' | '^' | '&' | '==' | '!=' | '<>' | '===' | '!==' | '<' | '<=' | '>' | '>=' | '<<' | '>>' | '+' | '-' | '.' | '*' | '/' | '%' )
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:607:1: castingOperator : ( ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression ) -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)| ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression ) -> cast(type=$TYPE_NAME.textexpression=$expression.st));
	public final PHP54TranslatorWalker.castingOperator_return castingOperator() throws RecognitionException {
		PHP54TranslatorWalker.castingOperator_return retval = new PHP54TranslatorWalker.castingOperator_return();
		retval.start = input.LT(1);

		ITSPHPAst isNullable=null;
		ITSPHPAst TYPE_NAME109=null;
		TreeRuleReturnScope type =null;
		TreeRuleReturnScope expression108 =null;
		TreeRuleReturnScope expression110 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:608:2: ( ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression ) -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)| ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression ) -> cast(type=$TYPE_NAME.textexpression=$expression.st))
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==CASTING) ) {
				int LA69_1 = input.LA(2);
				if ( (LA69_1==DOWN) ) {
					int LA69_2 = input.LA(3);
					if ( (LA69_2==TYPE) ) {
						int LA69_3 = input.LA(4);
						if ( (LA69_3==DOWN) ) {
							int LA69_4 = input.LA(5);
							if ( (LA69_4==TYPE_MODIFIER) ) {
								switch ( input.LA(6) ) {
								case DOWN:
									{
									switch ( input.LA(7) ) {
									case Cast:
										{
										int LA69_9 = input.LA(8);
										if ( (LA69_9==QuestionMark) ) {
											int LA69_10 = input.LA(9);
											if ( (LA69_10==UP) ) {
												int LA69_11 = input.LA(10);
												if ( ((LA69_11 >= TypeArray && LA69_11 <= TypeInt)||LA69_11==TypeString) ) {
													alt69=1;
												}
												else if ( (LA69_11==TYPE_NAME) ) {
													alt69=2;
												}
												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 69, 11, input);
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
														new NoViableAltException("", 69, 10, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else if ( (LA69_9==UP) ) {
											int LA69_11 = input.LA(9);
											if ( ((LA69_11 >= TypeArray && LA69_11 <= TypeInt)||LA69_11==TypeString) ) {
												alt69=1;
											}
											else if ( (LA69_11==TYPE_NAME) ) {
												alt69=2;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 69, 11, input);
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
													new NoViableAltException("", 69, 9, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case QuestionMark:
										{
										int LA69_10 = input.LA(8);
										if ( (LA69_10==UP) ) {
											int LA69_11 = input.LA(9);
											if ( ((LA69_11 >= TypeArray && LA69_11 <= TypeInt)||LA69_11==TypeString) ) {
												alt69=1;
											}
											else if ( (LA69_11==TYPE_NAME) ) {
												alt69=2;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 69, 11, input);
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
													new NoViableAltException("", 69, 10, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case UP:
										{
										int LA69_11 = input.LA(8);
										if ( ((LA69_11 >= TypeArray && LA69_11 <= TypeInt)||LA69_11==TypeString) ) {
											alt69=1;
										}
										else if ( (LA69_11==TYPE_NAME) ) {
											alt69=2;
										}
										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 69, 11, input);
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
												new NoViableAltException("", 69, 6, input);
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
									alt69=1;
									}
									break;
								case TYPE_NAME:
									{
									alt69=2;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 69, 5, input);
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
										new NoViableAltException("", 69, 4, input);
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
									new NoViableAltException("", 69, 3, input);
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
								new NoViableAltException("", 69, 2, input);
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:608:4: ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression )
					{
					match(input,CASTING,FOLLOW_CASTING_in_castingOperator3863); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_castingOperator3869); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:610:5: ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER )
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==TYPE_MODIFIER) ) {
						int LA64_1 = input.LA(2);
						if ( (LA64_1==DOWN) ) {
							alt64=1;
						}
						else if ( ((LA64_1 >= TypeArray && LA64_1 <= TypeInt)||LA64_1==TypeString) ) {
							alt64=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 64, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 64, 0, input);
						throw nvae;
					}
					switch (alt64) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:610:7: ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? )
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator3879); if (state.failed) return retval;
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:610:23: ( Cast )?
								int alt62=2;
								int LA62_0 = input.LA(1);
								if ( (LA62_0==Cast) ) {
									alt62=1;
								}
								switch (alt62) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:610:23: Cast
										{
										match(input,Cast,FOLLOW_Cast_in_castingOperator3881); if (state.failed) return retval;
										}
										break;

								}

								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:610:29: (isNullable= '?' )?
								int alt63=2;
								int LA63_0 = input.LA(1);
								if ( (LA63_0==QuestionMark) ) {
									alt63=1;
								}
								switch (alt63) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:610:30: isNullable= '?'
										{
										isNullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_castingOperator3887); if (state.failed) return retval;
										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:611:7: TYPE_MODIFIER
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator3898); if (state.failed) return retval;
							}
							break;

					}

					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:613:5: (type= scalarTypes |type= arrayType )
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( ((LA65_0 >= TypeBool && LA65_0 <= TypeInt)||LA65_0==TypeString) ) {
						alt65=1;
					}
					else if ( (LA65_0==TypeArray) ) {
						alt65=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 65, 0, input);
						throw nvae;
					}
					switch (alt65) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:613:6: type= scalarTypes
							{
							pushFollow(FOLLOW_scalarTypes_in_castingOperator3913);
							type=scalarTypes();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:613:23: type= arrayType
							{
							pushFollow(FOLLOW_arrayType_in_castingOperator3917);
							type=arrayType();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					pushFollow(FOLLOW_expression_in_castingOperator3928);
					expression108=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 617:3: -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("primitiveCast",new STAttrMap().put("isNotNullable", isNullable!=null).put("type", (type!=null?((StringTemplate)type.getTemplate()):null)).put("expression", (expression108!=null?((StringTemplate)expression108.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:619:4: ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression )
					{
					match(input,CASTING,FOLLOW_CASTING_in_castingOperator3964); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_castingOperator3970); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:621:5: ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER )
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==TYPE_MODIFIER) ) {
						int LA68_1 = input.LA(2);
						if ( (LA68_1==DOWN) ) {
							alt68=1;
						}
						else if ( (LA68_1==TYPE_NAME) ) {
							alt68=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 68, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 68, 0, input);
						throw nvae;
					}
					switch (alt68) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:621:7: ^( TYPE_MODIFIER ( Cast )? ( '?' )? )
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator3980); if (state.failed) return retval;
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:621:23: ( Cast )?
								int alt66=2;
								int LA66_0 = input.LA(1);
								if ( (LA66_0==Cast) ) {
									alt66=1;
								}
								switch (alt66) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:621:23: Cast
										{
										match(input,Cast,FOLLOW_Cast_in_castingOperator3982); if (state.failed) return retval;
										}
										break;

								}

								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:621:29: ( '?' )?
								int alt67=2;
								int LA67_0 = input.LA(1);
								if ( (LA67_0==QuestionMark) ) {
									alt67=1;
								}
								switch (alt67) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:621:29: '?'
										{
										match(input,QuestionMark,FOLLOW_QuestionMark_in_castingOperator3985); if (state.failed) return retval;
										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:622:7: TYPE_MODIFIER
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator3995); if (state.failed) return retval;
							}
							break;

					}

					TYPE_NAME109=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_castingOperator4007); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					pushFollow(FOLLOW_expression_in_castingOperator4017);
					expression110=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 628:3: -> cast(type=$TYPE_NAME.textexpression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("cast",new STAttrMap().put("type", (TYPE_NAME109!=null?TYPE_NAME109.getText():null)).put("expression", (expression110!=null?((StringTemplate)expression110.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:631:1: newOperator : ^( 'new' type= TYPE_NAME actualParameters ) -> new(type=$type.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.newOperator_return newOperator() throws RecognitionException {
		PHP54TranslatorWalker.newOperator_return retval = new PHP54TranslatorWalker.newOperator_return();
		retval.start = input.LT(1);

		ITSPHPAst type=null;
		TreeRuleReturnScope actualParameters111 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:632:2: ( ^( 'new' type= TYPE_NAME actualParameters ) -> new(type=$type.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:632:4: ^( 'new' type= TYPE_NAME actualParameters )
			{
			match(input,New,FOLLOW_New_in_newOperator4050); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			type=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_newOperator4058); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_newOperator4064);
			actualParameters111=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 636:3: -> new(type=$type.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("new",new STAttrMap().put("type", (type!=null?type.getText():null)).put("parameters", (actualParameters111!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters111).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:639:1: actualParameters returns [List<Object> parameters] : ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS ) ;
	public final PHP54TranslatorWalker.actualParameters_return actualParameters() throws RecognitionException {
		PHP54TranslatorWalker.actualParameters_return retval = new PHP54TranslatorWalker.actualParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:640:2: ( ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS ) )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:640:4: ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:640:4: ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS )
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==ACTUAL_PARAMETERS) ) {
				int LA71_1 = input.LA(2);
				if ( (LA71_1==DOWN) ) {
					alt71=1;
				}
				else if ( (LA71_1==UP) ) {
					alt71=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 71, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 71, 0, input);
				throw nvae;
			}
			switch (alt71) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:640:6: ^( ACTUAL_PARAMETERS (params+= expression )+ )
					{
					match(input,ACTUAL_PARAMETERS,FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4102); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:640:32: (params+= expression )+
					int cnt70=0;
					loop70:
					do {
						int alt70=2;
						int LA70_0 = input.LA(1);
						if ( (LA70_0==ARRAY_ACCESS||(LA70_0 >= Assign && LA70_0 <= At)||(LA70_0 >= BitwiseAnd && LA70_0 <= Bool)||LA70_0==CASTING||LA70_0==CLASS_MEMBER_ACCESS||LA70_0==CLASS_STATIC_ACCESS||LA70_0==CONSTANT||LA70_0==Clone||(LA70_0 >= Divide && LA70_0 <= DivideAssign)||(LA70_0 >= Dot && LA70_0 <= DotAssign)||(LA70_0 >= Equal && LA70_0 <= Exit)||LA70_0==FUNCTION_CALL||LA70_0==Float||(LA70_0 >= GreaterEqualThan && LA70_0 <= GreaterThan)||LA70_0==Identical||(LA70_0 >= Instanceof && LA70_0 <= Int)||(LA70_0 >= LessEqualThan && LA70_0 <= METHOD_CALL_STATIC)||(LA70_0 >= Minus && LA70_0 <= MinusAssign)||(LA70_0 >= Modulo && LA70_0 <= MultiplyAssign)||(LA70_0 >= New && LA70_0 <= Null)||(LA70_0 >= POST_DECREMENT && LA70_0 <= PRE_INCREMENT)||(LA70_0 >= Plus && LA70_0 <= PlusAssign)||LA70_0==QuestionMark||(LA70_0 >= ShiftLeft && LA70_0 <= ShiftRightAssign)||LA70_0==String||LA70_0==This||LA70_0==TypeArray||LA70_0==UNARY_MINUS||LA70_0==VariableId) ) {
							alt70=1;
						}

						switch (alt70) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:640:32: params+= expression
							{
							pushFollow(FOLLOW_expression_in_actualParameters4106);
							params=expression();
							state._fsp--;
							if (state.failed) return retval;
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt70 >= 1 ) break loop70;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(70, input);
								throw eee;
						}
						cnt70++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {retval.parameters =list_params;}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:641:5: ACTUAL_PARAMETERS
					{
					match(input,ACTUAL_PARAMETERS,FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4116); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:645:1: functionCall : ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters ) -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.functionCall_return functionCall() throws RecognitionException {
		PHP54TranslatorWalker.functionCall_return retval = new PHP54TranslatorWalker.functionCall_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters112 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:646:2: ( ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters ) -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:646:4: ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters )
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_functionCall4133); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			identifier=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_functionCall4137); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_functionCall4139);
			actualParameters112=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 647:3: -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("functionCall",new STAttrMap().put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters112!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters112).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:650:1: methodCall : ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters ) -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCall_return methodCall() throws RecognitionException {
		PHP54TranslatorWalker.methodCall_return retval = new PHP54TranslatorWalker.methodCall_return();
		retval.start = input.LT(1);

		ITSPHPAst callee=null;
		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters113 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:651:2: ( ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters ) -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:651:4: ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCall4169); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:651:18: (callee= This |callee= VariableId )
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==This) ) {
				alt72=1;
			}
			else if ( (LA72_0==VariableId) ) {
				alt72=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 72, 0, input);
				throw nvae;
			}
			switch (alt72) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:651:19: callee= This
					{
					callee=(ITSPHPAst)match(input,This,FOLLOW_This_in_methodCall4174); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:651:31: callee= VariableId
					{
					callee=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_methodCall4178); if (state.failed) return retval;
					}
					break;

			}

			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCall4183); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCall4185);
			actualParameters113=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 652:3: -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCall",new STAttrMap().put("callee", (callee!=null?callee.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters113!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters113).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:655:1: methodCallSelfOrParent : ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters ) -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCallSelfOrParent_return methodCallSelfOrParent() throws RecognitionException {
		PHP54TranslatorWalker.methodCallSelfOrParent_return retval = new PHP54TranslatorWalker.methodCallSelfOrParent_return();
		retval.start = input.LT(1);

		ITSPHPAst callee=null;
		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters114 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:656:2: ( ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters ) -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:656:4: ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCallSelfOrParent4219); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:656:18: (callee= Self |callee= Parent )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==Self) ) {
				alt73=1;
			}
			else if ( (LA73_0==Parent) ) {
				alt73=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}
			switch (alt73) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:656:19: callee= Self
					{
					callee=(ITSPHPAst)match(input,Self,FOLLOW_Self_in_methodCallSelfOrParent4224); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:656:31: callee= Parent
					{
					callee=(ITSPHPAst)match(input,Parent,FOLLOW_Parent_in_methodCallSelfOrParent4228); if (state.failed) return retval;
					}
					break;

			}

			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCallSelfOrParent4233); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCallSelfOrParent4235);
			actualParameters114=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 657:3: -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCallStatic",new STAttrMap().put("callee", (callee!=null?callee.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters114!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters114).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:660:1: methodCallStatic : ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters ) -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCallStatic_return methodCallStatic() throws RecognitionException {
		PHP54TranslatorWalker.methodCallStatic_return retval = new PHP54TranslatorWalker.methodCallStatic_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		ITSPHPAst TYPE_NAME115=null;
		TreeRuleReturnScope actualParameters116 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:661:2: ( ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters ) -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:661:4: ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL_STATIC,FOLLOW_METHOD_CALL_STATIC_in_methodCallStatic4269); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			TYPE_NAME115=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_methodCallStatic4271); if (state.failed) return retval;
			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCallStatic4275); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCallStatic4277);
			actualParameters116=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 662:3: -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCallStatic",new STAttrMap().put("callee", (TYPE_NAME115!=null?TYPE_NAME115.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters116!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters116).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:665:1: classStaticAccess : ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) ) -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text);
	public final PHP54TranslatorWalker.classStaticAccess_return classStaticAccess() throws RecognitionException {
		PHP54TranslatorWalker.classStaticAccess_return retval = new PHP54TranslatorWalker.classStaticAccess_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope staticAccess117 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:666:2: ( ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) ) -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:666:4: ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) )
			{
			match(input,CLASS_STATIC_ACCESS,FOLLOW_CLASS_STATIC_ACCESS_in_classStaticAccess4312); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_staticAccess_in_classStaticAccess4314);
			staticAccess117=staticAccess();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:666:39: (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
				alt74=1;
			}
			else if ( (LA74_0==CONSTANT) ) {
				alt74=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}
			switch (alt74) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:666:40: identifier= CLASS_STATIC_ACCESS_VARIABLE_ID
					{
					identifier=(ITSPHPAst)match(input,CLASS_STATIC_ACCESS_VARIABLE_ID,FOLLOW_CLASS_STATIC_ACCESS_VARIABLE_ID_in_classStaticAccess4319); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:666:83: identifier= CONSTANT
					{
					identifier=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_classStaticAccess4323); if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 667:3: -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text)
			  {
			  	retval.st = templateLib.getInstanceOf("classMemberAccessStatic",new STAttrMap().put("accessor", (staticAccess117!=null?((StringTemplate)staticAccess117.getTemplate()):null)).put("identifier", (identifier!=null?identifier.getText():null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:670:1: postFixExpression : ( ^( CLASS_MEMBER_ACCESS expression Identifier ) -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)| ^( ARRAY_ACCESS expr= expression index= expression ) -> arrayAccess(expression=$expr.stindex=$index.st)| ^( METHOD_CALL_POSTFIX expression Identifier actualParameters ) -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters));
	public final PHP54TranslatorWalker.postFixExpression_return postFixExpression() throws RecognitionException {
		PHP54TranslatorWalker.postFixExpression_return retval = new PHP54TranslatorWalker.postFixExpression_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier119=null;
		ITSPHPAst Identifier121=null;
		TreeRuleReturnScope expr =null;
		TreeRuleReturnScope index =null;
		TreeRuleReturnScope expression118 =null;
		TreeRuleReturnScope expression120 =null;
		TreeRuleReturnScope actualParameters122 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:671:2: ( ^( CLASS_MEMBER_ACCESS expression Identifier ) -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)| ^( ARRAY_ACCESS expr= expression index= expression ) -> arrayAccess(expression=$expr.stindex=$index.st)| ^( METHOD_CALL_POSTFIX expression Identifier actualParameters ) -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters))
			int alt75=3;
			switch ( input.LA(1) ) {
			case CLASS_MEMBER_ACCESS:
				{
				alt75=1;
				}
				break;
			case ARRAY_ACCESS:
				{
				alt75=2;
				}
				break;
			case METHOD_CALL_POSTFIX:
				{
				alt75=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}
			switch (alt75) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:671:4: ^( CLASS_MEMBER_ACCESS expression Identifier )
					{
					match(input,CLASS_MEMBER_ACCESS,FOLLOW_CLASS_MEMBER_ACCESS_in_postFixExpression4354); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression4356);
					expression118=expression();
					state._fsp--;
					if (state.failed) return retval;
					Identifier119=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_postFixExpression4358); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 671:52: -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)
					  {
					  	retval.st = templateLib.getInstanceOf("classMemberAccess",new STAttrMap().put("expression", (expression118!=null?((StringTemplate)expression118.getTemplate()):null)).put("identifier", (Identifier119!=null?Identifier119.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:672:4: ^( ARRAY_ACCESS expr= expression index= expression )
					{
					match(input,ARRAY_ACCESS,FOLLOW_ARRAY_ACCESS_in_postFixExpression4382); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression4386);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression4390);
					index=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 672:54: -> arrayAccess(expression=$expr.stindex=$index.st)
					  {
					  	retval.st = templateLib.getInstanceOf("arrayAccess",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)).put("index", (index!=null?((StringTemplate)index.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:673:4: ^( METHOD_CALL_POSTFIX expression Identifier actualParameters )
					{
					match(input,METHOD_CALL_POSTFIX,FOLLOW_METHOD_CALL_POSTFIX_in_postFixExpression4412); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression4414);
					expression120=expression();
					state._fsp--;
					if (state.failed) return retval;
					Identifier121=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_postFixExpression4416); if (state.failed) return retval;
					pushFollow(FOLLOW_actualParameters_in_postFixExpression4418);
					actualParameters122=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 673:66: -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters)
					  {
					  	retval.st = templateLib.getInstanceOf("postFixCall",new STAttrMap().put("expression", (expression120!=null?((StringTemplate)expression120.getTemplate()):null)).put("identifier", (Identifier121!=null?Identifier121.getText():null)).put("parameters", (actualParameters122!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters122).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:676:1: exit : ( ^( 'exit' ( expression )? ) -> exit(expression=$expression.st)| Exit -> exit(expression=null));
	public final PHP54TranslatorWalker.exit_return exit() throws RecognitionException {
		PHP54TranslatorWalker.exit_return retval = new PHP54TranslatorWalker.exit_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression123 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:677:2: ( ^( 'exit' ( expression )? ) -> exit(expression=$expression.st)| Exit -> exit(expression=null))
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==Exit) ) {
				int LA77_1 = input.LA(2);
				if ( (LA77_1==DOWN) ) {
					alt77=1;
				}
				else if ( (LA77_1==UP||LA77_1==ARRAY_ACCESS||LA77_1==Arrow||(LA77_1 >= Assign && LA77_1 <= At)||LA77_1==BLOCK_CONDITIONAL||(LA77_1 >= BitwiseAnd && LA77_1 <= Bool)||LA77_1==CASTING||LA77_1==CLASS_MEMBER_ACCESS||LA77_1==CLASS_STATIC_ACCESS||LA77_1==CONSTANT||LA77_1==Clone||LA77_1==Default||(LA77_1 >= Divide && LA77_1 <= DivideAssign)||(LA77_1 >= Dot && LA77_1 <= DotAssign)||(LA77_1 >= Equal && LA77_1 <= Exit)||LA77_1==FUNCTION_CALL||LA77_1==Float||(LA77_1 >= GreaterEqualThan && LA77_1 <= GreaterThan)||(LA77_1 >= Identical && LA77_1 <= Identifier)||(LA77_1 >= Instanceof && LA77_1 <= Int)||(LA77_1 >= LessEqualThan && LA77_1 <= METHOD_CALL_STATIC)||(LA77_1 >= Minus && LA77_1 <= MinusAssign)||(LA77_1 >= Modulo && LA77_1 <= MultiplyAssign)||(LA77_1 >= New && LA77_1 <= Null)||(LA77_1 >= POST_DECREMENT && LA77_1 <= PRE_INCREMENT)||(LA77_1 >= Plus && LA77_1 <= PlusAssign)||LA77_1==QuestionMark||LA77_1==SWITCH_CASES||(LA77_1 >= ShiftLeft && LA77_1 <= ShiftRightAssign)||LA77_1==String||(LA77_1 >= TYPE_NAME && LA77_1 <= This)||LA77_1==TypeArray||LA77_1==UNARY_MINUS||LA77_1==VariableId) ) {
					alt77=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 77, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}
			switch (alt77) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:677:4: ^( 'exit' ( expression )? )
					{
					match(input,Exit,FOLLOW_Exit_in_exit4450); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:677:13: ( expression )?
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==ARRAY_ACCESS||(LA76_0 >= Assign && LA76_0 <= At)||(LA76_0 >= BitwiseAnd && LA76_0 <= Bool)||LA76_0==CASTING||LA76_0==CLASS_MEMBER_ACCESS||LA76_0==CLASS_STATIC_ACCESS||LA76_0==CONSTANT||LA76_0==Clone||(LA76_0 >= Divide && LA76_0 <= DivideAssign)||(LA76_0 >= Dot && LA76_0 <= DotAssign)||(LA76_0 >= Equal && LA76_0 <= Exit)||LA76_0==FUNCTION_CALL||LA76_0==Float||(LA76_0 >= GreaterEqualThan && LA76_0 <= GreaterThan)||LA76_0==Identical||(LA76_0 >= Instanceof && LA76_0 <= Int)||(LA76_0 >= LessEqualThan && LA76_0 <= METHOD_CALL_STATIC)||(LA76_0 >= Minus && LA76_0 <= MinusAssign)||(LA76_0 >= Modulo && LA76_0 <= MultiplyAssign)||(LA76_0 >= New && LA76_0 <= Null)||(LA76_0 >= POST_DECREMENT && LA76_0 <= PRE_INCREMENT)||(LA76_0 >= Plus && LA76_0 <= PlusAssign)||LA76_0==QuestionMark||(LA76_0 >= ShiftLeft && LA76_0 <= ShiftRightAssign)||LA76_0==String||LA76_0==This||LA76_0==TypeArray||LA76_0==UNARY_MINUS||LA76_0==VariableId) ) {
							alt76=1;
						}
						switch (alt76) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:677:13: expression
								{
								pushFollow(FOLLOW_expression_in_exit4452);
								expression123=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 677:26: -> exit(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("exit",new STAttrMap().put("expression", (expression123!=null?((StringTemplate)expression123.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:678:4: Exit
					{
					match(input,Exit,FOLLOW_Exit_in_exit4468); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 678:12: -> exit(expression=null)
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
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:490:7: ( atom )
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:490:7: atom
		{
		pushFollow(FOLLOW_atom_in_synpred1_PHP54TranslatorWalker2879);
		atom();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred1_PHP54TranslatorWalker

	// $ANTLR start synpred7_PHP54TranslatorWalker
	public final void synpred7_PHP54TranslatorWalker_fragment() throws RecognitionException {
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:496:4: ( classStaticAccess )
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:496:4: classStaticAccess
		{
		pushFollow(FOLLOW_classStaticAccess_in_synpred7_PHP54TranslatorWalker2947);
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
	public static final BitSet FOLLOW_statement_in_namespaceBody134 = new BitSet(new long[]{0x2800408800800008L,0x0000000000088100L,0x0000050004200020L});
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
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList781 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_variableDeclarationList788 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_variableDeclarationList790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclarationList792 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList801 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier834 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_typeModifier838 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008001DL});
	public static final BitSet FOLLOW_QuestionMark_in_typeModifier843 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008000DL});
	public static final BitSet FOLLOW_variableModifier_in_typeModifier846 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier859 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_staticToken931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessModifier947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Protected_in_accessModifier956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_accessModifier965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration983 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration987 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_allTypes1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_allTypes1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypes1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypes1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypes1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypes1077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesWithoutArray1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypesWithoutArray1108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_abstractConstructDeclaration1127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractConstructDeclaration1134 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractConstructDeclaration1136 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractConstructDeclaration1143 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractConstructDeclaration1145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractConstructDeclaration1147 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_abstractConstructDeclaration1153 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_abstractConstructDeclaration1158 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Construct_in_constructDeclaration1220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_constructDeclaration1227 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_constructDeclaration1229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_constructDeclaration1236 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_constructDeclaration1238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_constructDeclaration1240 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_constructDeclaration1246 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_constructDeclaration1251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1316 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1318 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractMethodDeclaration1325 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractMethodDeclaration1327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractMethodDeclaration1329 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_abstractMethodDeclaration1338 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_abstractMethodDeclaration1342 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_abstractMethodDeclaration1348 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_abstractMethodDeclaration1353 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1420 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Abstract_in_abstractToken1450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_methodDeclaration1466 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_methodDeclaration1472 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_methodDeclaration1474 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_methodDeclaration1481 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_methodDeclaration1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_methodDeclaration1485 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1494 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_methodDeclaration1498 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration1504 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_methodDeclaration1509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1645 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1698 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1706 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Final_in_finalToken1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramDeclaration_in_formalParameters1796 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_paramDeclaration1839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_paramDeclaration1841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_scalarAndResource_in_paramDeclaration1850 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_paramDeclaration1860 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeObject_in_paramDeclaration1868 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceType_in_paramDeclaration1878 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_parameterNormalOrOptional_in_paramDeclaration1894 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeArray_in_arrayType1933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_classInterfaceType1948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_scalarAndResource1964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_scalarAndResource1973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional1992 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_parameterNormalOrOptional1996 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional2005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block2022 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_block2026 = new BitSet(new long[]{0x2800400000800008L,0x0000000000008000L,0x0000040004200020L});
	public static final BitSet FOLLOW_BLOCK_in_block2035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration2049 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_interfaceDeclaration2056 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Abstract_in_interfaceDeclaration2058 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration2064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extendsDeclaration_in_interfaceDeclaration2070 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration2075 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTERFACE_BODY_in_interfaceBody2127 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_interfaceBodyDefinition_in_interfaceBody2131 = new BitSet(new long[]{0x0000200800000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_INTERFACE_BODY_in_interfaceBody2147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBodyDefinition2167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceConstructDeclaration_in_interfaceBodyDefinition2176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDefinition2185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_interfaceConstructDeclaration2203 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_interfaceConstructDeclaration2210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_interfaceConstructDeclaration2212 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_interfaceConstructDeclaration2219 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_interfaceConstructDeclaration2221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_interfaceConstructDeclaration2223 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceConstructDeclaration2229 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_interfaceConstructDeclaration2234 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_interfaceMethodDeclaration2294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_interfaceMethodDeclaration2300 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_interfaceMethodDeclaration2302 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_interfaceMethodDeclaration2309 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_interfaceMethodDeclaration2311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_interfaceMethodDeclaration2313 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodDeclaration2319 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaration2324 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_interfaceMethodDeclaration2329 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Function_in_functionDeclaration2380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FUNCTION_MODIFIER_in_functionDeclaration2386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_TYPE_in_functionDeclaration2392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_functionDeclaration2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclaration2396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclaration2402 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclaration2407 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_functionDeclaration2412 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variableDeclarationList_in_instruction2471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPRESSION_in_instruction2515 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2517 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Return_in_instruction2534 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Throw_in_instruction2556 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Echo_in_instruction2577 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2581 = new BitSet(new long[]{0x81980102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_Break_in_instruction2600 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_instruction2605 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Break_in_instruction2623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Continue_in_instruction2641 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_instruction2646 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Continue_in_instruction2663 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition2686 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifCondition2692 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_blockConditional_in_ifCondition2700 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_blockConditional_in_ifCondition2707 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_CONDITIONAL_in_blockConditional2748 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_blockConditional2752 = new BitSet(new long[]{0x2800400000800008L,0x0000000000008000L,0x0000040004200020L});
	public static final BitSet FOLLOW_Switch_in_switchCondition2768 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_switchCondition2770 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition2774 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SWITCH_CASES_in_switchContent2802 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseLabel_in_switchContent2806 = new BitSet(new long[]{0x819A0102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_blockConditional_in_switchContent2810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_caseLabel2838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_caseLabel2853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_expression2879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_in_expression2891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expression2905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_expression2916 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallSelfOrParent_in_expression2927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallStatic_in_expression2937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classStaticAccess_in_expression2947 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixExpression_in_expression2956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exit_in_expression2965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtom_in_atom2988 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_atom3003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayKeyValue_in_atom3007 = new BitSet(new long[]{0x81980102917F86A8L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_VariableId_in_atom3024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_atom3038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_atom3052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_in_atom3066 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_staticAccess_in_atom3068 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_CONSTANT_in_atom3070 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue3141 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3145 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3149 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_staticAccess3186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccess3196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccess3206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPreOperator_in_operator3225 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3229 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unaryPostOperator_in_operator3258 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3262 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_binaryOperator_in_operator3291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3295 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator3299 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QuestionMark_in_operator3333 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3337 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator3341 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator3345 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_castingOperator_in_operator3376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_operator3393 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_operator3402 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_operator3406 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_newOperator_in_operator3434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_operator3455 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3459 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRE_INCREMENT_in_unaryPreOperator3490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRE_DECREMENT_in_unaryPreOperator3503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_unaryPreOperator3517 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_unaryPreOperator3532 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicNot_in_unaryPreOperator3547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unaryPreOperator3562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_INCREMENT_in_unaryPostOperator3586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_DECREMENT_in_unaryPostOperator3599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTING_in_castingOperator3863 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_castingOperator3869 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator3879 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_castingOperator3881 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QuestionMark_in_castingOperator3887 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator3898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002780000000L});
	public static final BitSet FOLLOW_scalarTypes_in_castingOperator3913 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_castingOperator3917 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_castingOperator3928 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CASTING_in_castingOperator3964 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_castingOperator3970 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator3980 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_castingOperator3982 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QuestionMark_in_castingOperator3985 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator3995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_castingOperator4007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_castingOperator4017 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_New_in_newOperator4050 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_newOperator4058 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_newOperator4064 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4102 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_actualParameters4106 = new BitSet(new long[]{0x81980102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_functionCall4133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_functionCall4137 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall4139 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_methodCall4169 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_This_in_methodCall4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_methodCall4178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall4183 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall4185 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_methodCallSelfOrParent4219 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Self_in_methodCallSelfOrParent4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Parent_in_methodCallSelfOrParent4228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCallSelfOrParent4233 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCallSelfOrParent4235 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_STATIC_in_methodCallStatic4269 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_methodCallStatic4271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCallStatic4275 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCallStatic4277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_in_classStaticAccess4312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_staticAccess_in_classStaticAccess4314 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_VARIABLE_ID_in_classStaticAccess4319 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTANT_in_classStaticAccess4323 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_ACCESS_in_postFixExpression4354 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression4356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_postFixExpression4358 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_ACCESS_in_postFixExpression4382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression4386 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_postFixExpression4390 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_POSTFIX_in_postFixExpression4412 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression4414 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_postFixExpression4416 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_postFixExpression4418 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Exit_in_exit4450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exit4452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Exit_in_exit4468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_synpred1_PHP54TranslatorWalker2879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classStaticAccess_in_synpred7_PHP54TranslatorWalker2947 = new BitSet(new long[]{0x0000000000000002L});
}
