// $ANTLR 3.x D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g 2013-03-09 16:23:11

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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:59:1: compilationUnit : (n+= namespace ) -> file(namespaces=$n);
	public final PHP54TranslatorWalker.compilationUnit_return compilationUnit() throws RecognitionException {
		PHP54TranslatorWalker.compilationUnit_return retval = new PHP54TranslatorWalker.compilationUnit_return();
		retval.start = input.LT(1);

		List<Object> list_n=null;
		RuleReturnScope n = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:60:2: ( (n+= namespace ) -> file(namespaces=$n))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:60:4: (n+= namespace )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:60:4: (n+= namespace )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:60:5: n+= namespace
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
			  // 60:19: -> file(namespaces=$n)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:63:1: namespace : ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody ) -> namespace(name=namespaceNamebody=$namespaceBody.st);
	public final PHP54TranslatorWalker.namespace_return namespace() throws RecognitionException {
		PHP54TranslatorWalker.namespace_return retval = new PHP54TranslatorWalker.namespace_return();
		retval.start = input.LT(1);

		ITSPHPAst name=null;
		TreeRuleReturnScope namespaceBody1 =null;

		String namespaceName = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:65:2: ( ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody ) -> namespace(name=namespaceNamebody=$namespaceBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:65:4: ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody )
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespace85); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:65:18: (name= TYPE_NAME | DEFAULT_NAMESPACE )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:65:19: name= TYPE_NAME
					{
					name=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_namespace90); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:65:34: DEFAULT_NAMESPACE
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
			  // 72:4: -> namespace(name=namespaceNamebody=$namespaceBody.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:75:1: namespaceBody : ( ^( NAMESPACE_BODY (statements+= statement )* ) -> body(statements=$statements)| NAMESPACE_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.namespaceBody_return namespaceBody() throws RecognitionException {
		PHP54TranslatorWalker.namespaceBody_return retval = new PHP54TranslatorWalker.namespaceBody_return();
		retval.start = input.LT(1);

		List<Object> list_statements=null;
		RuleReturnScope statements = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:2: ( ^( NAMESPACE_BODY (statements+= statement )* ) -> body(statements=$statements)| NAMESPACE_BODY -> body(statements=null))
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:4: ^( NAMESPACE_BODY (statements+= statement )* )
					{
					match(input,NAMESPACE_BODY,FOLLOW_NAMESPACE_BODY_in_namespaceBody130); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:31: (statements+= statement )*
						loop2:
						do {
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==Break||LA2_0==CONSTANT_DECLARATION_LIST||LA2_0==Class||LA2_0==Continue||LA2_0==Do||LA2_0==EXPRESSION||LA2_0==Echo||(LA2_0 >= For && LA2_0 <= Function)||LA2_0==If||LA2_0==Interface||LA2_0==Return||LA2_0==Switch||(LA2_0 >= Throw && LA2_0 <= Try)||LA2_0==Use||LA2_0==VARIABLE_DECLARATION_LIST||LA2_0==While) ) {
								alt2=1;
							}

							switch (alt2) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:31: statements+= statement
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
					  // 76:45: -> body(statements=$statements)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_statements));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:77:4: NAMESPACE_BODY
					{
					match(input,NAMESPACE_BODY,FOLLOW_NAMESPACE_BODY_in_namespaceBody150); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 77:19: -> body(statements=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:80:1: statement : ( useDeclarationList -> {$useDeclarationList.st}| definition -> {$definition.st}| instruction -> {$instruction.st});
	public final PHP54TranslatorWalker.statement_return statement() throws RecognitionException {
		PHP54TranslatorWalker.statement_return retval = new PHP54TranslatorWalker.statement_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope useDeclarationList2 =null;
		TreeRuleReturnScope definition3 =null;
		TreeRuleReturnScope instruction4 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:81:2: ( useDeclarationList -> {$useDeclarationList.st}| definition -> {$definition.st}| instruction -> {$instruction.st})
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
			case Do:
			case EXPRESSION:
			case Echo:
			case For:
			case Foreach:
			case If:
			case Return:
			case Switch:
			case Throw:
			case Try:
			case VARIABLE_DECLARATION_LIST:
			case While:
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:81:4: useDeclarationList
					{
					pushFollow(FOLLOW_useDeclarationList_in_statement170);
					useDeclarationList2=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 81:23: -> {$useDeclarationList.st}
					  {
					  	retval.st = (useDeclarationList2!=null?((StringTemplate)useDeclarationList2.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:82:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement179);
					definition3=definition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 82:15: -> {$definition.st}
					  {
					  	retval.st = (definition3!=null?((StringTemplate)definition3.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:83:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_statement188);
					instruction4=instruction();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 83:16: -> {$instruction.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:86:1: useDeclarationList : ^( 'use' ( useDeclaration )+ ) -> useDeclarationList(useDeclarations=$useDeclaration.st);
	public final PHP54TranslatorWalker.useDeclarationList_return useDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.useDeclarationList_return retval = new PHP54TranslatorWalker.useDeclarationList_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope useDeclaration5 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:87:2: ( ^( 'use' ( useDeclaration )+ ) -> useDeclarationList(useDeclarations=$useDeclaration.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:87:4: ^( 'use' ( useDeclaration )+ )
			{
			match(input,Use,FOLLOW_Use_in_useDeclarationList205); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:87:12: ( useDeclaration )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:87:12: useDeclaration
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
			  // 88:3: -> useDeclarationList(useDeclarations=$useDeclaration.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:91:1: useDeclaration : ^( USE_DECLARATION TYPE_NAME Identifier ) -> useDeclaration(type=$TYPE_NAMEalias=$Identifier);
	public final PHP54TranslatorWalker.useDeclaration_return useDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.useDeclaration_return retval = new PHP54TranslatorWalker.useDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME6=null;
		ITSPHPAst Identifier7=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:92:2: ( ^( USE_DECLARATION TYPE_NAME Identifier ) -> useDeclaration(type=$TYPE_NAMEalias=$Identifier))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:92:4: ^( USE_DECLARATION TYPE_NAME Identifier )
			{
			match(input,USE_DECLARATION,FOLLOW_USE_DECLARATION_in_useDeclaration233); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			TYPE_NAME6=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_useDeclaration235); if (state.failed) return retval;
			Identifier7=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration237); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 93:3: -> useDeclaration(type=$TYPE_NAMEalias=$Identifier)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:96:1: definition : ( classDeclaration -> {$classDeclaration.st}| interfaceDeclaration -> {$interfaceDeclaration.st}| functionDeclaration -> {$functionDeclaration.st}| constDeclarationList -> {$constDeclarationList.st});
	public final PHP54TranslatorWalker.definition_return definition() throws RecognitionException {
		PHP54TranslatorWalker.definition_return retval = new PHP54TranslatorWalker.definition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope classDeclaration8 =null;
		TreeRuleReturnScope interfaceDeclaration9 =null;
		TreeRuleReturnScope functionDeclaration10 =null;
		TreeRuleReturnScope constDeclarationList11 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:97:2: ( classDeclaration -> {$classDeclaration.st}| interfaceDeclaration -> {$interfaceDeclaration.st}| functionDeclaration -> {$functionDeclaration.st}| constDeclarationList -> {$constDeclarationList.st})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:97:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition266);
					classDeclaration8=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 97:22: -> {$classDeclaration.st}
					  {
					  	retval.st = (classDeclaration8!=null?((StringTemplate)classDeclaration8.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:98:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition276);
					interfaceDeclaration9=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 98:26: -> {$interfaceDeclaration.st}
					  {
					  	retval.st = (interfaceDeclaration9!=null?((StringTemplate)interfaceDeclaration9.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:99:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition286);
					functionDeclaration10=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 99:25: -> {$functionDeclaration.st}
					  {
					  	retval.st = (functionDeclaration10!=null?((StringTemplate)functionDeclaration10.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:100:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_definition296);
					constDeclarationList11=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 100:26: -> {$constDeclarationList.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:103:1: classDeclaration : ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody ) -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st);
	public final PHP54TranslatorWalker.classDeclaration_return classDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.classDeclaration_return retval = new PHP54TranslatorWalker.classDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier13=null;
		TreeRuleReturnScope classModifier12 =null;
		TreeRuleReturnScope extendsDeclaration14 =null;
		TreeRuleReturnScope implementsDeclaration15 =null;
		TreeRuleReturnScope classBody16 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:104:2: ( ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody ) -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:104:4: ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody )
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
			  // 105:3: -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:113:1: classModifier : ( ^( CLASS_MODIFIER list+= classModifierNames ) -> modifier(modifiers=$list)| CLASS_MODIFIER -> {null});
	public final PHP54TranslatorWalker.classModifier_return classModifier() throws RecognitionException {
		PHP54TranslatorWalker.classModifier_return retval = new PHP54TranslatorWalker.classModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:114:2: ( ^( CLASS_MODIFIER list+= classModifierNames ) -> modifier(modifiers=$list)| CLASS_MODIFIER -> {null})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:114:4: ^( CLASS_MODIFIER list+= classModifierNames )
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
					  // 114:47: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:115:4: CLASS_MODIFIER
					{
					match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_classModifier407); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 115:19: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:118:1: classModifierNames : ( Final | Abstract );
	public final PHP54TranslatorWalker.classModifierNames_return classModifierNames() throws RecognitionException {
		PHP54TranslatorWalker.classModifierNames_return retval = new PHP54TranslatorWalker.classModifierNames_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:120:2: ( Final | Abstract )
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:124:1: extendsDeclaration : ( ^( 'extends' (identifiers+= TYPE_NAME )+ ) -> extends(identifiers=$identifiers)| 'extends' -> {null});
	public final PHP54TranslatorWalker.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.extendsDeclaration_return retval = new PHP54TranslatorWalker.extendsDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifiers=null;
		List<Object> list_identifiers=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:2: ( ^( 'extends' (identifiers+= TYPE_NAME )+ ) -> extends(identifiers=$identifiers)| 'extends' -> {null})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:4: ^( 'extends' (identifiers+= TYPE_NAME )+ )
					{
					match(input,Extends,FOLLOW_Extends_in_extendsDeclaration446); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:27: (identifiers+= TYPE_NAME )+
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:27: identifiers+= TYPE_NAME
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
					  // 125:41: -> extends(identifiers=$identifiers)
					  {
					  	retval.st = templateLib.getInstanceOf("extends",new STAttrMap().put("identifiers", list_identifiers));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:126:4: 'extends'
					{
					match(input,Extends,FOLLOW_Extends_in_extendsDeclaration466); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 126:18: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:1: implementsDeclaration : ( ^( 'implements' (identifiers+= TYPE_NAME )+ ) -> impl(identifiers=$identifiers)| 'implements' -> {null});
	public final PHP54TranslatorWalker.implementsDeclaration_return implementsDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.implementsDeclaration_return retval = new PHP54TranslatorWalker.implementsDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifiers=null;
		List<Object> list_identifiers=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:131:2: ( ^( 'implements' (identifiers+= TYPE_NAME )+ ) -> impl(identifiers=$identifiers)| 'implements' -> {null})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:131:4: ^( 'implements' (identifiers+= TYPE_NAME )+ )
					{
					match(input,Implements,FOLLOW_Implements_in_implementsDeclaration487); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:131:30: (identifiers+= TYPE_NAME )+
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:131:30: identifiers+= TYPE_NAME
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
					  // 131:44: -> impl(identifiers=$identifiers)
					  {
					  	retval.st = templateLib.getInstanceOf("impl",new STAttrMap().put("identifiers", list_identifiers));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:132:4: 'implements'
					{
					match(input,Implements,FOLLOW_Implements_in_implementsDeclaration507); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 132:21: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:135:1: classBody : ( ^( CLASS_BODY (def+= classBodyDefinition )* ) -> body(statements=$def)| CLASS_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.classBody_return classBody() throws RecognitionException {
		PHP54TranslatorWalker.classBody_return retval = new PHP54TranslatorWalker.classBody_return();
		retval.start = input.LT(1);

		List<Object> list_def=null;
		RuleReturnScope def = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:136:2: ( ^( CLASS_BODY (def+= classBodyDefinition )* ) -> body(statements=$def)| CLASS_BODY -> body(statements=null))
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:136:4: ^( CLASS_BODY (def+= classBodyDefinition )* )
					{
					match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_classBody528); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:136:20: (def+= classBodyDefinition )*
						loop12:
						do {
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==CLASS_MEMBER||LA12_0==CONSTANT_DECLARATION_LIST||LA12_0==Construct||LA12_0==METHOD_DECLARATION) ) {
								alt12=1;
							}

							switch (alt12) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:136:20: def+= classBodyDefinition
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
					  // 136:44: -> body(statements=$def)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_def));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:137:4: CLASS_BODY
					{
					match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_classBody548); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 137:15: -> body(statements=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:140:1: classBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| abstractConstructDeclaration -> {$abstractConstructDeclaration.st}| constructDeclaration -> {$constructDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st});
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
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:141:2: ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| abstractConstructDeclaration -> {$abstractConstructDeclaration.st}| constructDeclaration -> {$constructDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:141:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_classBodyDefinition569);
					constDeclarationList17=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 141:27: -> {$constDeclarationList.st}
					  {
					  	retval.st = (constDeclarationList17!=null?((StringTemplate)constDeclarationList17.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:142:4: classMemberDeclaration
					{
					pushFollow(FOLLOW_classMemberDeclaration_in_classBodyDefinition580);
					classMemberDeclaration18=classMemberDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 142:28: -> {$classMemberDeclaration.st}
					  {
					  	retval.st = (classMemberDeclaration18!=null?((StringTemplate)classMemberDeclaration18.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:143:4: abstractConstructDeclaration
					{
					pushFollow(FOLLOW_abstractConstructDeclaration_in_classBodyDefinition590);
					abstractConstructDeclaration19=abstractConstructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 143:34: -> {$abstractConstructDeclaration.st}
					  {
					  	retval.st = (abstractConstructDeclaration19!=null?((StringTemplate)abstractConstructDeclaration19.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:144:4: constructDeclaration
					{
					pushFollow(FOLLOW_constructDeclaration_in_classBodyDefinition600);
					constructDeclaration20=constructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 144:27: -> {$constructDeclaration.st}
					  {
					  	retval.st = (constructDeclaration20!=null?((StringTemplate)constructDeclaration20.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:145:4: abstractMethodDeclaration
					{
					pushFollow(FOLLOW_abstractMethodDeclaration_in_classBodyDefinition611);
					abstractMethodDeclaration21=abstractMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 145:31: -> {$abstractMethodDeclaration.st}
					  {
					  	retval.st = (abstractMethodDeclaration21!=null?((StringTemplate)abstractMethodDeclaration21.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:146:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBodyDefinition621);
					methodDeclaration22=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 146:24: -> {$methodDeclaration.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:149:1: constDeclarationList : ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ ) -> const(identifiers=$identifiers);
	public final PHP54TranslatorWalker.constDeclarationList_return constDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.constDeclarationList_return retval = new PHP54TranslatorWalker.constDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_identifiers=null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:150:2: ( ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ ) -> const(identifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:150:4: ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ )
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

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:152:15: (identifiers+= constantAssignment )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:152:15: identifiers+= constantAssignment
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
			  // 154:3: -> const(identifiers=$identifiers)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:157:1: constantAssignment : ^( Identifier v= unaryPrimitiveAtom ) -> assign(id=$Identifiervalue=$unaryPrimitiveAtom.st);
	public final PHP54TranslatorWalker.constantAssignment_return constantAssignment() throws RecognitionException {
		PHP54TranslatorWalker.constantAssignment_return retval = new PHP54TranslatorWalker.constantAssignment_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier23=null;
		TreeRuleReturnScope v =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:158:2: ( ^( Identifier v= unaryPrimitiveAtom ) -> assign(id=$Identifiervalue=$unaryPrimitiveAtom.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:158:4: ^( Identifier v= unaryPrimitiveAtom )
			{
			Identifier23=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment697); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_unaryPrimitiveAtom_in_constantAssignment701);
			v=unaryPrimitiveAtom();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 159:4: -> assign(id=$Identifiervalue=$unaryPrimitiveAtom.st)
			  {
			  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", Identifier23).put("value", (v!=null?((StringTemplate)v.getTemplate()):null)));
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


	public static class unaryPrimitiveAtom_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unaryPrimitiveAtom"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:162:1: unaryPrimitiveAtom : ( primitiveAtomWithConstant -> {$primitiveAtomWithConstant.st}| ^( UNARY_MINUS primitiveAtomWithConstant ) -> unaryPostOperator(operator=$UNARY_MINUS.textexpression=$primitiveAtomWithConstant.st));
	public final PHP54TranslatorWalker.unaryPrimitiveAtom_return unaryPrimitiveAtom() throws RecognitionException {
		PHP54TranslatorWalker.unaryPrimitiveAtom_return retval = new PHP54TranslatorWalker.unaryPrimitiveAtom_return();
		retval.start = input.LT(1);

		ITSPHPAst UNARY_MINUS25=null;
		TreeRuleReturnScope primitiveAtomWithConstant24 =null;
		TreeRuleReturnScope primitiveAtomWithConstant26 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:163:2: ( primitiveAtomWithConstant -> {$primitiveAtomWithConstant.st}| ^( UNARY_MINUS primitiveAtomWithConstant ) -> unaryPostOperator(operator=$UNARY_MINUS.textexpression=$primitiveAtomWithConstant.st))
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==Bool||LA16_0==CLASS_STATIC_ACCESS||LA16_0==CONSTANT||LA16_0==Float||LA16_0==Int||LA16_0==Null||LA16_0==String) ) {
				alt16=1;
			}
			else if ( (LA16_0==UNARY_MINUS) ) {
				alt16=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:163:4: primitiveAtomWithConstant
					{
					pushFollow(FOLLOW_primitiveAtomWithConstant_in_unaryPrimitiveAtom731);
					primitiveAtomWithConstant24=primitiveAtomWithConstant();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 163:30: -> {$primitiveAtomWithConstant.st}
					  {
					  	retval.st = (primitiveAtomWithConstant24!=null?((StringTemplate)primitiveAtomWithConstant24.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:164:4: ^( UNARY_MINUS primitiveAtomWithConstant )
					{
					UNARY_MINUS25=(ITSPHPAst)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unaryPrimitiveAtom741); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_primitiveAtomWithConstant_in_unaryPrimitiveAtom743);
					primitiveAtomWithConstant26=primitiveAtomWithConstant();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 164:45: -> unaryPostOperator(operator=$UNARY_MINUS.textexpression=$primitiveAtomWithConstant.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPostOperator",new STAttrMap().put("operator", (UNARY_MINUS25!=null?UNARY_MINUS25.getText():null)).put("expression", (primitiveAtomWithConstant26!=null?((StringTemplate)primitiveAtomWithConstant26.getTemplate()):null)));
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
	// $ANTLR end "unaryPrimitiveAtom"


	public static class scalarTypes_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "scalarTypes"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:167:1: scalarTypes : ( 'bool' | 'int' | 'float' | 'string' );
	public final PHP54TranslatorWalker.scalarTypes_return scalarTypes() throws RecognitionException {
		PHP54TranslatorWalker.scalarTypes_return retval = new PHP54TranslatorWalker.scalarTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:169:2: ( 'bool' | 'int' | 'float' | 'string' )
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:175:1: classMemberDeclaration : ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st};
	public final PHP54TranslatorWalker.classMemberDeclaration_return classMemberDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.classMemberDeclaration_return retval = new PHP54TranslatorWalker.classMemberDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope variableDeclarationList27 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:176:2: ( ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:176:4: ^( CLASS_MEMBER variableDeclarationList )
			{
			match(input,CLASS_MEMBER,FOLLOW_CLASS_MEMBER_in_classMemberDeclaration805); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclarationList_in_classMemberDeclaration807);
			variableDeclarationList27=variableDeclarationList();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 176:44: -> {$variableDeclarationList.st}
			  {
			  	retval.st = (variableDeclarationList27!=null?((StringTemplate)variableDeclarationList27.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:179:1: variableDeclarationList : ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers);
	public final PHP54TranslatorWalker.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclarationList_return retval = new PHP54TranslatorWalker.variableDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_identifiers=null;
		TreeRuleReturnScope typeModifier28 =null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:180:2: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:180:4: ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ )
			{
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList825); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_variableDeclarationList832); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_variableDeclarationList834);
			typeModifier28=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_allTypes_in_variableDeclarationList836);
			allTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:15: (identifiers+= variableDeclaration )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:182:15: identifiers+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList845);
					identifiers=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if (list_identifiers==null) list_identifiers=new ArrayList<Object>();
					list_identifiers.add(identifiers.getTemplate());
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
			  // 184:3: -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers)
			  {
			  	retval.st = templateLib.getInstanceOf("variableDeclarationList",new STAttrMap().put("modifier", (typeModifier28!=null?((StringTemplate)typeModifier28.getTemplate()):null)).put("identifiers", list_identifiers));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:187:1: localVariableDeclarationList : ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= localVariableDeclaration[$typeModifier.st] )+ ) -> localVariableDeclarationList(variables=$variables);
	public final PHP54TranslatorWalker.localVariableDeclarationList_return localVariableDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.localVariableDeclarationList_return retval = new PHP54TranslatorWalker.localVariableDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_variables=null;
		TreeRuleReturnScope typeModifier29 =null;
		RuleReturnScope variables = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:188:2: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= localVariableDeclaration[$typeModifier.st] )+ ) -> localVariableDeclarationList(variables=$variables))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:188:4: ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (variables+= localVariableDeclaration[$typeModifier.st] )+ )
			{
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_localVariableDeclarationList878); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_localVariableDeclarationList885); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_localVariableDeclarationList887);
			typeModifier29=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_allTypes_in_localVariableDeclarationList889);
			allTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:13: (variables+= localVariableDeclaration[$typeModifier.st] )+
			int cnt18=0;
			loop18:
			do {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==VariableId) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:13: variables+= localVariableDeclaration[$typeModifier.st]
					{
					pushFollow(FOLLOW_localVariableDeclaration_in_localVariableDeclarationList898);
					variables=localVariableDeclaration((typeModifier29!=null?((StringTemplate)typeModifier29.getTemplate()):null));
					state._fsp--;
					if (state.failed) return retval;
					if (list_variables==null) list_variables=new ArrayList<Object>();
					list_variables.add(variables.getTemplate());
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(18, input);
						throw eee;
				}
				cnt18++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 192:3: -> localVariableDeclarationList(variables=$variables)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:195:1: typeModifier returns [boolean isCast, boolean isNullable] : ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null});
	public final PHP54TranslatorWalker.typeModifier_return typeModifier() throws RecognitionException {
		PHP54TranslatorWalker.typeModifier_return retval = new PHP54TranslatorWalker.typeModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst cast=null;
		ITSPHPAst nullable=null;
		TreeRuleReturnScope variableModifier30 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:2: ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null})
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==TYPE_MODIFIER) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==DOWN) ) {
					alt22=1;
				}
				else if ( (LA22_1==TYPE_NAME||(LA22_1 >= TypeArray && LA22_1 <= TypeString)||LA22_1==Void) ) {
					alt22=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:4: ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? )
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier931); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:24: (cast= Cast )?
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==Cast) ) {
							alt19=1;
						}
						switch (alt19) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:24: cast= Cast
								{
								cast=(ITSPHPAst)match(input,Cast,FOLLOW_Cast_in_typeModifier935); if (state.failed) return retval;
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:39: (nullable= '?' )?
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==QuestionMark) ) {
							alt20=1;
						}
						switch (alt20) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:39: nullable= '?'
								{
								nullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_typeModifier940); if (state.failed) return retval;
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:45: ( variableModifier )?
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==Private||(LA21_0 >= Protected && LA21_0 <= Public)||LA21_0==Static) ) {
							alt21=1;
						}
						switch (alt21) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:196:45: variableModifier
								{
								pushFollow(FOLLOW_variableModifier_in_typeModifier943);
								variableModifier30=variableModifier();
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
					  // 196:114: -> {$variableModifier.st}
					  {
					  	retval.st = (variableModifier30!=null?((StringTemplate)variableModifier30.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:197:4: TYPE_MODIFIER
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier956); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 197:18: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:200:1: variableModifier : (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st});
	public final PHP54TranslatorWalker.variableModifier_return variableModifier() throws RecognitionException {
		PHP54TranslatorWalker.variableModifier_return retval = new PHP54TranslatorWalker.variableModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		TreeRuleReturnScope accessModifier31 =null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:201:2: (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st})
			int alt23=3;
			switch ( input.LA(1) ) {
			case Static:
				{
				alt23=1;
				}
				break;
			case Private:
				{
				int LA23_2 = input.LA(2);
				if ( (LA23_2==Static) ) {
					alt23=2;
				}
				else if ( (LA23_2==UP) ) {
					alt23=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Protected:
				{
				int LA23_3 = input.LA(2);
				if ( (LA23_3==Static) ) {
					alt23=2;
				}
				else if ( (LA23_3==UP) ) {
					alt23=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Public:
				{
				int LA23_4 = input.LA(2);
				if ( (LA23_4==Static) ) {
					alt23=2;
				}
				else if ( (LA23_4==UP) ) {
					alt23=3;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 4, input);
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
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:201:4: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_variableModifier974);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_variableModifier978);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 201:43: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:202:4: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier994);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_variableModifier998);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 202:43: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:203:4: accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier1012);
					accessModifier31=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 203:19: -> {$accessModifier.st}
					  {
					  	retval.st = (accessModifier31!=null?((StringTemplate)accessModifier31.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:206:1: staticToken : Static -> {%{$Static.text}};
	public final PHP54TranslatorWalker.staticToken_return staticToken() throws RecognitionException {
		PHP54TranslatorWalker.staticToken_return retval = new PHP54TranslatorWalker.staticToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Static32=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:207:2: ( Static -> {%{$Static.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:207:4: Static
			{
			Static32=(ITSPHPAst)match(input,Static,FOLLOW_Static_in_staticToken1028); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 207:11: -> {%{$Static.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Static32!=null?Static32.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:210:1: accessModifier : ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}});
	public final PHP54TranslatorWalker.accessModifier_return accessModifier() throws RecognitionException {
		PHP54TranslatorWalker.accessModifier_return retval = new PHP54TranslatorWalker.accessModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst Private33=null;
		ITSPHPAst Protected34=null;
		ITSPHPAst Public35=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:211:2: ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}})
			int alt24=3;
			switch ( input.LA(1) ) {
			case Private:
				{
				alt24=1;
				}
				break;
			case Protected:
				{
				alt24=2;
				}
				break;
			case Public:
				{
				alt24=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:211:4: Private
					{
					Private33=(ITSPHPAst)match(input,Private,FOLLOW_Private_in_accessModifier1044); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 211:12: -> {%{$Private.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Private33!=null?Private33.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:212:4: Protected
					{
					Protected34=(ITSPHPAst)match(input,Protected,FOLLOW_Protected_in_accessModifier1053); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 212:14: -> {%{$Protected.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Protected34!=null?Protected34.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:213:4: Public
					{
					Public35=(ITSPHPAst)match(input,Public,FOLLOW_Public_in_accessModifier1062); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 213:11: -> {%{$Public.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Public35!=null?Public35.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:1: variableDeclaration : ( ^( VariableId expression ) -> assign(id=$VariableIdvalue=$expression.st)| VariableId -> {%{$VariableId.text}});
	public final PHP54TranslatorWalker.variableDeclaration_return variableDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclaration_return retval = new PHP54TranslatorWalker.variableDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst VariableId36=null;
		ITSPHPAst VariableId38=null;
		TreeRuleReturnScope expression37 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:217:2: ( ^( VariableId expression ) -> assign(id=$VariableIdvalue=$expression.st)| VariableId -> {%{$VariableId.text}})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:217:4: ^( VariableId expression )
					{
					VariableId36=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1078); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_variableDeclaration1080);
					expression37=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 217:29: -> assign(id=$VariableIdvalue=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", VariableId36).put("value", (expression37!=null?((StringTemplate)expression37.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:218:4: VariableId
					{
					VariableId38=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1099); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 218:15: -> {%{$VariableId.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(VariableId38!=null?VariableId38.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:221:1: localVariableDeclaration[StringTemplate modifier] : ( ^( VariableId v= expression ) -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)| VariableId -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=null));
	public final PHP54TranslatorWalker.localVariableDeclaration_return localVariableDeclaration(StringTemplate modifier) throws RecognitionException {
		PHP54TranslatorWalker.localVariableDeclaration_return retval = new PHP54TranslatorWalker.localVariableDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst VariableId39=null;
		ITSPHPAst VariableId40=null;
		TreeRuleReturnScope v =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:222:2: ( ^( VariableId v= expression ) -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)| VariableId -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=null))
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==VariableId) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==DOWN) ) {
					alt26=1;
				}
				else if ( (LA26_1==UP||LA26_1==VariableId) ) {
					alt26=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:222:4: ^( VariableId v= expression )
					{
					VariableId39=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_localVariableDeclaration1117); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_localVariableDeclaration1121);
					v=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 222:31: -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=v)
					  {
					  	retval.st = templateLib.getInstanceOf("localVariableDeclaration",new STAttrMap().put("modifier", modifier).put("variableId", (VariableId39!=null?VariableId39.getText():null)).put("initValue", v));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:223:4: VariableId
					{
					VariableId40=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_localVariableDeclaration1146); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 223:15: -> localVariableDeclaration(modifier=modifiervariableId=$VariableId.textinitValue=null)
					  {
					  	retval.st = templateLib.getInstanceOf("localVariableDeclaration",new STAttrMap().put("modifier", modifier).put("variableId", (VariableId40!=null?VariableId40.getText():null)).put("initValue", null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:226:1: allTypes : ( primitiveTypes | TYPE_NAME );
	public final PHP54TranslatorWalker.allTypes_return allTypes() throws RecognitionException {
		PHP54TranslatorWalker.allTypes_return retval = new PHP54TranslatorWalker.allTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:227:2: ( primitiveTypes | TYPE_NAME )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( ((LA27_0 >= TypeArray && LA27_0 <= TypeString)) ) {
				alt27=1;
			}
			else if ( (LA27_0==TYPE_NAME) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:227:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_allTypes1176);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:228:4: TYPE_NAME
					{
					match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_allTypes1181); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:231:1: primitiveTypes : ( scalarTypes | TypeArray | TypeResource | TypeObject );
	public final PHP54TranslatorWalker.primitiveTypes_return primitiveTypes() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypes_return retval = new PHP54TranslatorWalker.primitiveTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:232:2: ( scalarTypes | TypeArray | TypeResource | TypeObject )
			int alt28=4;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeString:
				{
				alt28=1;
				}
				break;
			case TypeArray:
				{
				alt28=2;
				}
				break;
			case TypeResource:
				{
				alt28=3;
				}
				break;
			case TypeObject:
				{
				alt28=4;
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:232:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypes1193);
					scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:233:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypes1199); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:234:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypes1205); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:235:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypes1211); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:238:1: primitiveTypesWithoutArray : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}});
	public final PHP54TranslatorWalker.primitiveTypesWithoutArray_return primitiveTypesWithoutArray() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypesWithoutArray_return retval = new PHP54TranslatorWalker.primitiveTypesWithoutArray_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource42=null;
		ITSPHPAst TypeObject43=null;
		TreeRuleReturnScope scalarTypes41 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:239:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}})
			int alt29=3;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeString:
				{
				alt29=1;
				}
				break;
			case TypeResource:
				{
				alt29=2;
				}
				break;
			case TypeObject:
				{
				alt29=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:239:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1224);
					scalarTypes41=scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 239:16: -> {$scalarTypes.st}
					  {
					  	retval.st = (scalarTypes41!=null?((StringTemplate)scalarTypes41.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:240:4: TypeResource
					{
					TypeResource42=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesWithoutArray1233); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 240:17: -> {%{$TypeResource.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeResource42!=null?TypeResource42.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:241:4: TypeObject
					{
					TypeObject43=(ITSPHPAst)match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypesWithoutArray1242); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 241:15: -> {%{$TypeObject.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeObject43!=null?TypeObject43.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:244:1: abstractConstructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.abstractConstructDeclaration_return abstractConstructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractConstructDeclaration_return retval = new PHP54TranslatorWalker.abstractConstructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope abstractMethodModifier44 =null;
		TreeRuleReturnScope formalParameters45 =null;
		TreeRuleReturnScope block46 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:245:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:245:4: ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_abstractConstructDeclaration1261); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractConstructDeclaration1268); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractConstructDeclaration1270);
			abstractMethodModifier44=abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_abstractConstructDeclaration1277); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_abstractConstructDeclaration1279);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_abstractConstructDeclaration1281);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_abstractConstructDeclaration1287);
			formalParameters45=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_abstractConstructDeclaration1292);
			block46=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 251:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", (abstractMethodModifier44!=null?((StringTemplate)abstractMethodModifier44.getTemplate()):null)).put("identifier", identifier).put("params", (formalParameters45!=null?((StringTemplate)formalParameters45.getTemplate()):null)).put("body", (block46!=null?((PHP54TranslatorWalker.block_return)block46).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:259:1: constructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.constructDeclaration_return constructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.constructDeclaration_return retval = new PHP54TranslatorWalker.constructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope methodModifier47 =null;
		TreeRuleReturnScope formalParameters48 =null;
		TreeRuleReturnScope block49 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:260:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:260:4: ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_constructDeclaration1354); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_constructDeclaration1361); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_methodModifier_in_constructDeclaration1363);
			methodModifier47=methodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_constructDeclaration1370); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_constructDeclaration1372);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_constructDeclaration1374);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_constructDeclaration1380);
			formalParameters48=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_constructDeclaration1385);
			block49=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 266:3: -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier47!=null?((StringTemplate)methodModifier47.getTemplate()):null)).put("identifier", identifier).put("params", (formalParameters48!=null?((StringTemplate)formalParameters48.getTemplate()):null)).put("body", (block49!=null?((PHP54TranslatorWalker.block_return)block49).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:274:1: abstractMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.abstractMethodDeclaration_return abstractMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodDeclaration_return retval = new PHP54TranslatorWalker.abstractMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope abstractMethodModifier50 =null;
		TreeRuleReturnScope formalParameters51 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:275:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:275:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1444); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1450); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1452);
			abstractMethodModifier50=abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_abstractMethodDeclaration1459); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_abstractMethodDeclaration1461);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_abstractMethodDeclaration1463);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:278:4: (identfier= Identifier |identfier= Destruct )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==Identifier) ) {
				alt30=1;
			}
			else if ( (LA30_0==Destruct) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:278:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_abstractMethodDeclaration1472); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:278:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_abstractMethodDeclaration1476); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_abstractMethodDeclaration1482);
			formalParameters51=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input,BLOCK,FOLLOW_BLOCK_in_abstractMethodDeclaration1487); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 282:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", (abstractMethodModifier50!=null?((StringTemplate)abstractMethodModifier50.getTemplate()):null)).put("identifier", identfier).put("params", (formalParameters51!=null?((StringTemplate)formalParameters51.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:289:1: abstractMethodModifier : (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.abstractMethodModifier_return abstractMethodModifier() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodModifier_return retval = new PHP54TranslatorWalker.abstractMethodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:290:2: ( (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:290:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:290:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Abstract) ) {
				alt31=1;
			}
			else if ( (LA31_0==Private||(LA31_0 >= Protected && LA31_0 <= Public)) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:290:6: list+= abstractToken list+= accessModifier
					{
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1541);
					list=abstractToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1545);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:291:5: list+= accessModifier list+= abstractToken
					{
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1554);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1558);
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
			  // 293:3: -> modifier(modifiers=$list)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:296:1: abstractToken : Abstract -> {%{$Abstract.text}};
	public final PHP54TranslatorWalker.abstractToken_return abstractToken() throws RecognitionException {
		PHP54TranslatorWalker.abstractToken_return retval = new PHP54TranslatorWalker.abstractToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Abstract52=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:297:2: ( Abstract -> {%{$Abstract.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:297:4: Abstract
			{
			Abstract52=(ITSPHPAst)match(input,Abstract,FOLLOW_Abstract_in_abstractToken1584); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 297:13: -> {%{$Abstract.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Abstract52!=null?Abstract52.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:300:1: methodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.methodDeclaration_return methodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.methodDeclaration_return retval = new PHP54TranslatorWalker.methodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope methodModifier53 =null;
		TreeRuleReturnScope formalParameters54 =null;
		TreeRuleReturnScope block55 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:301:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:301:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_methodDeclaration1600); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_methodDeclaration1606); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_methodModifier_in_methodDeclaration1608);
			methodModifier53=methodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_methodDeclaration1615); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_methodDeclaration1617);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_methodDeclaration1619);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:304:4: (identfier= Identifier |identfier= Destruct )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Identifier) ) {
				alt32=1;
			}
			else if ( (LA32_0==Destruct) ) {
				alt32=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:304:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1628); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:304:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_methodDeclaration1632); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_methodDeclaration1638);
			formalParameters54=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_methodDeclaration1643);
			block55=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 308:3: -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", (methodModifier53!=null?((StringTemplate)methodModifier53.getTemplate()):null)).put("identifier", identfier).put("params", (formalParameters54!=null?((StringTemplate)formalParameters54.getTemplate()):null)).put("body", (block55!=null?((PHP54TranslatorWalker.block_return)block55).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:316:1: methodModifier : (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.methodModifier_return methodModifier() throws RecognitionException {
		PHP54TranslatorWalker.methodModifier_return retval = new PHP54TranslatorWalker.methodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:2: ( (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			int alt33=11;
			switch ( input.LA(1) ) {
			case Static:
				{
				switch ( input.LA(2) ) {
				case Final:
					{
					alt33=1;
					}
					break;
				case Private:
					{
					int LA33_7 = input.LA(3);
					if ( (LA33_7==Final) ) {
						alt33=2;
					}
					else if ( (LA33_7==UP) ) {
						alt33=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 7, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Protected:
					{
					int LA33_8 = input.LA(3);
					if ( (LA33_8==Final) ) {
						alt33=2;
					}
					else if ( (LA33_8==UP) ) {
						alt33=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 8, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Public:
					{
					int LA33_9 = input.LA(3);
					if ( (LA33_9==Final) ) {
						alt33=2;
					}
					else if ( (LA33_9==UP) ) {
						alt33=3;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 9, input);
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
							new NoViableAltException("", 33, 1, input);
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
					alt33=4;
					}
					break;
				case Private:
					{
					int LA33_11 = input.LA(3);
					if ( (LA33_11==Static) ) {
						alt33=5;
					}
					else if ( (LA33_11==UP) ) {
						alt33=6;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 11, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Protected:
					{
					int LA33_12 = input.LA(3);
					if ( (LA33_12==Static) ) {
						alt33=5;
					}
					else if ( (LA33_12==UP) ) {
						alt33=6;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 12, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Public:
					{
					int LA33_13 = input.LA(3);
					if ( (LA33_13==Static) ) {
						alt33=5;
					}
					else if ( (LA33_13==UP) ) {
						alt33=6;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 13, input);
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
							new NoViableAltException("", 33, 2, input);
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
					int LA33_14 = input.LA(3);
					if ( (LA33_14==Static) ) {
						alt33=7;
					}
					else if ( (LA33_14==UP) ) {
						alt33=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA33_15 = input.LA(3);
					if ( (LA33_15==Final) ) {
						alt33=8;
					}
					else if ( (LA33_15==UP) ) {
						alt33=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt33=11;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 3, input);
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
					int LA33_14 = input.LA(3);
					if ( (LA33_14==Static) ) {
						alt33=7;
					}
					else if ( (LA33_14==UP) ) {
						alt33=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA33_15 = input.LA(3);
					if ( (LA33_15==Final) ) {
						alt33=8;
					}
					else if ( (LA33_15==UP) ) {
						alt33=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt33=11;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 4, input);
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
					int LA33_14 = input.LA(3);
					if ( (LA33_14==Static) ) {
						alt33=7;
					}
					else if ( (LA33_14==UP) ) {
						alt33=10;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 14, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case Static:
					{
					int LA33_15 = input.LA(3);
					if ( (LA33_15==Final) ) {
						alt33=8;
					}
					else if ( (LA33_15==UP) ) {
						alt33=9;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 33, 15, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
					}
					break;
				case UP:
					{
					alt33=11;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 5, input);
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
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:6: list+= staticToken list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1704);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1708);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1713);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:318:5: list+= staticToken list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1721);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1725);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1730);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:319:5: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1738);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1742);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:321:5: list+= finalToken list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1753);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1757);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1762);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:322:5: list+= finalToken list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1770);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1774);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1779);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:323:5: list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1788);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1792);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:326:5: list+= accessModifier list+= finalToken list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1806);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1810);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1815);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:327:5: list+= accessModifier list+= staticToken list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1823);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1827);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1832);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:328:5: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1840);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1844);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:329:5: list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1852);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1856);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:330:5: list+= accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1864);
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
			  // 332:3: -> modifier(modifiers=$list)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:335:1: finalToken : Final -> {%{$Final.text}};
	public final PHP54TranslatorWalker.finalToken_return finalToken() throws RecognitionException {
		PHP54TranslatorWalker.finalToken_return retval = new PHP54TranslatorWalker.finalToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Final56=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:336:2: ( Final -> {%{$Final.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:336:4: Final
			{
			Final56=(ITSPHPAst)match(input,Final,FOLLOW_Final_in_finalToken1891); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 336:10: -> {%{$Final.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(Final56!=null?Final56.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:339:1: returnType : ( allTypes | Void );
	public final PHP54TranslatorWalker.returnType_return returnType() throws RecognitionException {
		PHP54TranslatorWalker.returnType_return retval = new PHP54TranslatorWalker.returnType_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:340:2: ( allTypes | Void )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==TYPE_NAME||(LA34_0 >= TypeArray && LA34_0 <= TypeString)) ) {
				alt34=1;
			}
			else if ( (LA34_0==Void) ) {
				alt34=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:340:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1907);
					allTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:341:4: Void
					{
					match(input,Void,FOLLOW_Void_in_returnType1912); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:344:1: formalParameters : ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null});
	public final PHP54TranslatorWalker.formalParameters_return formalParameters() throws RecognitionException {
		PHP54TranslatorWalker.formalParameters_return retval = new PHP54TranslatorWalker.formalParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:345:2: ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null})
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==PARAMETER_LIST) ) {
				int LA36_1 = input.LA(2);
				if ( (LA36_1==DOWN) ) {
					alt36=1;
				}
				else if ( (LA36_1==BLOCK) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:345:4: ^( PARAMETER_LIST (params+= paramDeclaration )+ )
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1926); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:345:27: (params+= paramDeclaration )+
					int cnt35=0;
					loop35:
					do {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==PARAMETER_DECLARATION) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:345:27: params+= paramDeclaration
							{
							pushFollow(FOLLOW_paramDeclaration_in_formalParameters1930);
							params=paramDeclaration();
							state._fsp--;
							if (state.failed) return retval;
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt35 >= 1 ) break loop35;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(35, input);
								throw eee;
						}
						cnt35++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 345:48: -> parameterList(declarations=$params)
					  {
					  	retval.st = templateLib.getInstanceOf("parameterList",new STAttrMap().put("declarations", list_params));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:346:4: PARAMETER_LIST
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1946); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 346:19: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:349:1: paramDeclaration : ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue);
	public final PHP54TranslatorWalker.paramDeclaration_return paramDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.paramDeclaration_return retval = new PHP54TranslatorWalker.paramDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope typeName =null;
		TreeRuleReturnScope typeModifier57 =null;
		TreeRuleReturnScope parameterNormalOrOptional58 =null;

		String defaultValue =null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:351:2: ( ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:351:4: ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional )
			{
			match(input,PARAMETER_DECLARATION,FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1966); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_paramDeclaration1973); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_paramDeclaration1975);
			typeModifier57=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:353:5: ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType )
			int alt37=4;
			switch ( input.LA(1) ) {
			case TypeBool:
			case TypeFloat:
			case TypeInt:
			case TypeResource:
			case TypeString:
				{
				alt37=1;
				}
				break;
			case TypeArray:
				{
				alt37=2;
				}
				break;
			case TypeObject:
				{
				alt37=3;
				}
				break;
			case TYPE_NAME:
				{
				alt37=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:353:7: scalarAndResource
					{
					pushFollow(FOLLOW_scalarAndResource_in_paramDeclaration1984);
					scalarAndResource();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:354:7: typeName= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_paramDeclaration1994);
					typeName=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:355:7: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_paramDeclaration2002); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:356:7: typeName= classInterfaceType
					{
					pushFollow(FOLLOW_classInterfaceType_in_paramDeclaration2012);
					typeName=classInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_parameterNormalOrOptional_in_paramDeclaration2028);
			parameterNormalOrOptional58=parameterNormalOrOptional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==0 ) {
					    defaultValue =  (typeModifier57!=null?((PHP54TranslatorWalker.typeModifier_return)typeModifier57).isNullable:false) && typeName!=null ? "null" : (parameterNormalOrOptional58!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional58).defaultValue:null);
					}
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 364:3: -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue)
			  {
			  	retval.st = templateLib.getInstanceOf("parameter",new STAttrMap().put("type", (typeName!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(typeName.start),input.getTreeAdaptor().getTokenStopIndex(typeName.start))):null)).put("variableId", (parameterNormalOrOptional58!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional58).variableId:null)).put("defaultValue", defaultValue));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:366:1: arrayType : TypeArray -> {%{$TypeArray.text}};
	public final PHP54TranslatorWalker.arrayType_return arrayType() throws RecognitionException {
		PHP54TranslatorWalker.arrayType_return retval = new PHP54TranslatorWalker.arrayType_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeArray59=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:367:2: ( TypeArray -> {%{$TypeArray.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:367:4: TypeArray
			{
			TypeArray59=(ITSPHPAst)match(input,TypeArray,FOLLOW_TypeArray_in_arrayType2067); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 367:14: -> {%{$TypeArray.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(TypeArray59!=null?TypeArray59.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:370:1: classInterfaceType : TYPE_NAME -> {%{$TYPE_NAME.text}};
	public final PHP54TranslatorWalker.classInterfaceType_return classInterfaceType() throws RecognitionException {
		PHP54TranslatorWalker.classInterfaceType_return retval = new PHP54TranslatorWalker.classInterfaceType_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME60=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:371:2: ( TYPE_NAME -> {%{$TYPE_NAME.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:371:4: TYPE_NAME
			{
			TYPE_NAME60=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_classInterfaceType2082); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 371:14: -> {%{$TYPE_NAME.text}}
			  {
			  	retval.st = new StringTemplate(templateLib,(TYPE_NAME60!=null?TYPE_NAME60.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:374:1: scalarAndResource : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}});
	public final PHP54TranslatorWalker.scalarAndResource_return scalarAndResource() throws RecognitionException {
		PHP54TranslatorWalker.scalarAndResource_return retval = new PHP54TranslatorWalker.scalarAndResource_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource62=null;
		TreeRuleReturnScope scalarTypes61 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:375:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}})
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= TypeBool && LA38_0 <= TypeInt)||LA38_0==TypeString) ) {
				alt38=1;
			}
			else if ( (LA38_0==TypeResource) ) {
				alt38=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:375:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_scalarAndResource2098);
					scalarTypes61=scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 375:16: -> {$scalarTypes.st}
					  {
					  	retval.st = (scalarTypes61!=null?((StringTemplate)scalarTypes61.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:376:4: TypeResource
					{
					TypeResource62=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_scalarAndResource2107); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 376:17: -> {%{$TypeResource.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeResource62!=null?TypeResource62.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:379:1: parameterNormalOrOptional returns [String variableId,String defaultValue] : ( ^( VariableId v= Int ) | VariableId );
	public final PHP54TranslatorWalker.parameterNormalOrOptional_return parameterNormalOrOptional() throws RecognitionException {
		PHP54TranslatorWalker.parameterNormalOrOptional_return retval = new PHP54TranslatorWalker.parameterNormalOrOptional_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst VariableId63=null;
		ITSPHPAst VariableId64=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:380:2: ( ^( VariableId v= Int ) | VariableId )
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==VariableId) ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1==DOWN) ) {
					alt39=1;
				}
				else if ( (LA39_1==UP) ) {
					alt39=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 39, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:380:4: ^( VariableId v= Int )
					{
					VariableId63=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional2126); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_parameterNormalOrOptional2130); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {retval.variableId =(VariableId63!=null?VariableId63.getText():null); retval.defaultValue =(v!=null?v.getText():null);}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:381:4: VariableId
					{
					VariableId64=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional2139); if (state.failed) return retval;
					if ( state.backtracking==0 ) {retval.variableId =(VariableId64!=null?VariableId64.getText():null);}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:384:1: block returns [List<Object> instructions] : ( ^( BLOCK (instr+= instruction )* ) | BLOCK );
	public final PHP54TranslatorWalker.block_return block() throws RecognitionException {
		PHP54TranslatorWalker.block_return retval = new PHP54TranslatorWalker.block_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:385:2: ( ^( BLOCK (instr+= instruction )* ) | BLOCK )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==BLOCK) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==DOWN) ) {
					alt41=1;
				}
				else if ( (LA41_1==UP) ) {
					alt41=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 41, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}
			switch (alt41) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:385:4: ^( BLOCK (instr+= instruction )* )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block2156); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:385:17: (instr+= instruction )*
						loop40:
						do {
							int alt40=2;
							int LA40_0 = input.LA(1);
							if ( (LA40_0==Break||LA40_0==Continue||LA40_0==Do||LA40_0==EXPRESSION||LA40_0==Echo||(LA40_0 >= For && LA40_0 <= Foreach)||LA40_0==If||LA40_0==Return||LA40_0==Switch||(LA40_0 >= Throw && LA40_0 <= Try)||LA40_0==VARIABLE_DECLARATION_LIST||LA40_0==While) ) {
								alt40=1;
							}

							switch (alt40) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:385:17: instr+= instruction
								{
								pushFollow(FOLLOW_instruction_in_block2160);
								instr=instruction();
								state._fsp--;
								if (state.failed) return retval;
								if (list_instr==null) list_instr=new ArrayList<Object>();
								list_instr.add(instr.getTemplate());
								}
								break;

							default :
								break loop40;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					if ( state.backtracking==0 ) {retval.instructions =list_instr;}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:386:4: BLOCK
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block2169); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:389:1: interfaceDeclaration : ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody ) -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st);
	public final PHP54TranslatorWalker.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceDeclaration_return retval = new PHP54TranslatorWalker.interfaceDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier65=null;
		TreeRuleReturnScope extendsDeclaration66 =null;
		TreeRuleReturnScope interfaceBody67 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:390:2: ( ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody ) -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:390:4: ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody )
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration2183); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_interfaceDeclaration2190); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,Abstract,FOLLOW_Abstract_in_interfaceDeclaration2192); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier65=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration2198); if (state.failed) return retval;
			pushFollow(FOLLOW_extendsDeclaration_in_interfaceDeclaration2204);
			extendsDeclaration66=extendsDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration2209);
			interfaceBody67=interfaceBody();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 396:3: -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st)
			  {
			  	retval.st = templateLib.getInstanceOf("interface",new STAttrMap().put("identifier", Identifier65).put("ext", (extendsDeclaration66!=null?((StringTemplate)extendsDeclaration66.getTemplate()):null)).put("body", (interfaceBody67!=null?((StringTemplate)interfaceBody67.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:403:1: interfaceBody : ( ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* ) -> body(statements=$def)| INTERFACE_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.interfaceBody_return interfaceBody() throws RecognitionException {
		PHP54TranslatorWalker.interfaceBody_return retval = new PHP54TranslatorWalker.interfaceBody_return();
		retval.start = input.LT(1);

		List<Object> list_def=null;
		RuleReturnScope def = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:404:2: ( ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* ) -> body(statements=$def)| INTERFACE_BODY -> body(statements=null))
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==INTERFACE_BODY) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==DOWN) ) {
					alt43=1;
				}
				else if ( (LA43_1==UP) ) {
					alt43=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 43, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:404:4: ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* )
					{
					match(input,INTERFACE_BODY,FOLLOW_INTERFACE_BODY_in_interfaceBody2261); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:404:24: (def+= interfaceBodyDefinition )*
						loop42:
						do {
							int alt42=2;
							int LA42_0 = input.LA(1);
							if ( (LA42_0==CONSTANT_DECLARATION_LIST||LA42_0==Construct||LA42_0==METHOD_DECLARATION) ) {
								alt42=1;
							}

							switch (alt42) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:404:24: def+= interfaceBodyDefinition
								{
								pushFollow(FOLLOW_interfaceBodyDefinition_in_interfaceBody2265);
								def=interfaceBodyDefinition();
								state._fsp--;
								if (state.failed) return retval;
								if (list_def==null) list_def=new ArrayList<Object>();
								list_def.add(def.getTemplate());
								}
								break;

							default :
								break loop42;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 404:52: -> body(statements=$def)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_def));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:405:4: INTERFACE_BODY
					{
					match(input,INTERFACE_BODY,FOLLOW_INTERFACE_BODY_in_interfaceBody2281); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 405:19: -> body(statements=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:408:1: interfaceBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}| interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st});
	public final PHP54TranslatorWalker.interfaceBodyDefinition_return interfaceBodyDefinition() throws RecognitionException {
		PHP54TranslatorWalker.interfaceBodyDefinition_return retval = new PHP54TranslatorWalker.interfaceBodyDefinition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope constDeclarationList68 =null;
		TreeRuleReturnScope interfaceConstructDeclaration69 =null;
		TreeRuleReturnScope interfaceMethodDeclaration70 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:409:2: ( constDeclarationList -> {$constDeclarationList.st}| interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}| interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st})
			int alt44=3;
			switch ( input.LA(1) ) {
			case CONSTANT_DECLARATION_LIST:
				{
				alt44=1;
				}
				break;
			case Construct:
				{
				alt44=2;
				}
				break;
			case METHOD_DECLARATION:
				{
				alt44=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:409:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_interfaceBodyDefinition2301);
					constDeclarationList68=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 409:25: -> {$constDeclarationList.st}
					  {
					  	retval.st = (constDeclarationList68!=null?((StringTemplate)constDeclarationList68.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:410:4: interfaceConstructDeclaration
					{
					pushFollow(FOLLOW_interfaceConstructDeclaration_in_interfaceBodyDefinition2310);
					interfaceConstructDeclaration69=interfaceConstructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 410:34: -> {$interfaceConstructDeclaration.st}
					  {
					  	retval.st = (interfaceConstructDeclaration69!=null?((StringTemplate)interfaceConstructDeclaration69.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:411:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDefinition2319);
					interfaceMethodDeclaration70=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 411:31: -> {$interfaceMethodDeclaration.st}
					  {
					  	retval.st = (interfaceMethodDeclaration70!=null?((StringTemplate)interfaceMethodDeclaration70.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:414:1: interfaceConstructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.interfaceConstructDeclaration_return interfaceConstructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceConstructDeclaration_return retval = new PHP54TranslatorWalker.interfaceConstructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope formalParameters71 =null;
		TreeRuleReturnScope block72 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:415:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:415:4: ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_interfaceConstructDeclaration2337); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_interfaceConstructDeclaration2344); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_interfaceConstructDeclaration2346);
			abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_interfaceConstructDeclaration2353); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_interfaceConstructDeclaration2355);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_interfaceConstructDeclaration2357);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_interfaceConstructDeclaration2363);
			formalParameters71=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_interfaceConstructDeclaration2368);
			block72=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 421:3: -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", "public").put("identifier", identifier).put("params", (formalParameters71!=null?((StringTemplate)formalParameters71.getTemplate()):null)).put("body", (block72!=null?((PHP54TranslatorWalker.block_return)block72).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:429:1: interfaceMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceMethodDeclaration_return retval = new PHP54TranslatorWalker.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier73=null;
		TreeRuleReturnScope formalParameters74 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:430:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:430:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_interfaceMethodDeclaration2428); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_interfaceMethodDeclaration2434); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_interfaceMethodDeclaration2436);
			abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_interfaceMethodDeclaration2443); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_interfaceMethodDeclaration2445);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_interfaceMethodDeclaration2447);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier73=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodDeclaration2453); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaration2458);
			formalParameters74=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input,BLOCK,FOLLOW_BLOCK_in_interfaceMethodDeclaration2463); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 437:3: -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st)
			  {
			  	retval.st = templateLib.getInstanceOf("abstractMethod",new STAttrMap().put("modifier", "public").put("identifier", Identifier73).put("params", (formalParameters74!=null?((StringTemplate)formalParameters74.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:444:1: functionDeclaration : ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.functionDeclaration_return functionDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.functionDeclaration_return retval = new PHP54TranslatorWalker.functionDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier75=null;
		TreeRuleReturnScope formalParameters76 =null;
		TreeRuleReturnScope block77 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:445:2: ( ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:445:4: ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block )
			{
			match(input,Function,FOLLOW_Function_in_functionDeclaration2514); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_functionDeclaration2520); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration2526); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_functionDeclaration2528);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclaration2530);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier75=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration2536); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameters_in_functionDeclaration2541);
			formalParameters76=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_functionDeclaration2546);
			block77=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 452:3: -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("method",new STAttrMap().put("modifier", null).put("identifier", Identifier75).put("params", (formalParameters76!=null?((StringTemplate)formalParameters76.getTemplate()):null)).put("body", (block77!=null?((PHP54TranslatorWalker.block_return)block77).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:461:1: instruction : ( localVariableDeclarationList -> {$localVariableDeclarationList.st}| ifCondition -> {$ifCondition.st}| switchCondition -> {$switchCondition.st}| forLoop -> {$forLoop.st}| foreachLoop -> {$foreachLoop.st}| whileLoop -> {$whileLoop.st}| doWhileLoop -> {$doWhileLoop.st}| tryCatch -> {$tryCatch.st}| ^( EXPRESSION ( expression )? ) -> expression(expression=$expression.st)| ^( 'return' ( expression )? ) -> return(expression=$expression.st)| ^( 'throw' expression ) -> throw(expression=$expression.st)| ^( 'echo' (exprs+= expression )+ ) -> echo(expressions=$exprs)| ^( 'break' (index= Int )? ) -> break(index=$index.text)| 'break' -> break(index=null)| ^( 'continue' (index= Int )? ) -> continue(index=$index.text)| 'continue' -> continue(index=null));
	public final PHP54TranslatorWalker.instruction_return instruction() throws RecognitionException {
		PHP54TranslatorWalker.instruction_return retval = new PHP54TranslatorWalker.instruction_return();
		retval.start = input.LT(1);

		ITSPHPAst index=null;
		List<Object> list_exprs=null;
		TreeRuleReturnScope localVariableDeclarationList78 =null;
		TreeRuleReturnScope ifCondition79 =null;
		TreeRuleReturnScope switchCondition80 =null;
		TreeRuleReturnScope forLoop81 =null;
		TreeRuleReturnScope foreachLoop82 =null;
		TreeRuleReturnScope whileLoop83 =null;
		TreeRuleReturnScope doWhileLoop84 =null;
		TreeRuleReturnScope tryCatch85 =null;
		TreeRuleReturnScope expression86 =null;
		TreeRuleReturnScope expression87 =null;
		TreeRuleReturnScope expression88 =null;
		RuleReturnScope exprs = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:462:2: ( localVariableDeclarationList -> {$localVariableDeclarationList.st}| ifCondition -> {$ifCondition.st}| switchCondition -> {$switchCondition.st}| forLoop -> {$forLoop.st}| foreachLoop -> {$foreachLoop.st}| whileLoop -> {$whileLoop.st}| doWhileLoop -> {$doWhileLoop.st}| tryCatch -> {$tryCatch.st}| ^( EXPRESSION ( expression )? ) -> expression(expression=$expression.st)| ^( 'return' ( expression )? ) -> return(expression=$expression.st)| ^( 'throw' expression ) -> throw(expression=$expression.st)| ^( 'echo' (exprs+= expression )+ ) -> echo(expressions=$exprs)| ^( 'break' (index= Int )? ) -> break(index=$index.text)| 'break' -> break(index=null)| ^( 'continue' (index= Int )? ) -> continue(index=$index.text)| 'continue' -> continue(index=null))
			int alt50=16;
			switch ( input.LA(1) ) {
			case VARIABLE_DECLARATION_LIST:
				{
				alt50=1;
				}
				break;
			case If:
				{
				alt50=2;
				}
				break;
			case Switch:
				{
				alt50=3;
				}
				break;
			case For:
				{
				alt50=4;
				}
				break;
			case Foreach:
				{
				alt50=5;
				}
				break;
			case While:
				{
				alt50=6;
				}
				break;
			case Do:
				{
				alt50=7;
				}
				break;
			case Try:
				{
				alt50=8;
				}
				break;
			case EXPRESSION:
				{
				alt50=9;
				}
				break;
			case Return:
				{
				alt50=10;
				}
				break;
			case Throw:
				{
				alt50=11;
				}
				break;
			case Echo:
				{
				alt50=12;
				}
				break;
			case Break:
				{
				int LA50_13 = input.LA(2);
				if ( (LA50_13==DOWN) ) {
					alt50=13;
				}
				else if ( (LA50_13==UP||LA50_13==Break||LA50_13==CONSTANT_DECLARATION_LIST||LA50_13==Class||LA50_13==Continue||LA50_13==Do||LA50_13==EXPRESSION||LA50_13==Echo||(LA50_13 >= For && LA50_13 <= Function)||LA50_13==If||LA50_13==Interface||LA50_13==Return||LA50_13==Switch||(LA50_13 >= Throw && LA50_13 <= Try)||LA50_13==Use||LA50_13==VARIABLE_DECLARATION_LIST||LA50_13==While) ) {
					alt50=14;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 50, 13, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case Continue:
				{
				int LA50_14 = input.LA(2);
				if ( (LA50_14==DOWN) ) {
					alt50=15;
				}
				else if ( (LA50_14==UP||LA50_14==Break||LA50_14==CONSTANT_DECLARATION_LIST||LA50_14==Class||LA50_14==Continue||LA50_14==Do||LA50_14==EXPRESSION||LA50_14==Echo||(LA50_14 >= For && LA50_14 <= Function)||LA50_14==If||LA50_14==Interface||LA50_14==Return||LA50_14==Switch||(LA50_14 >= Throw && LA50_14 <= Try)||LA50_14==Use||LA50_14==VARIABLE_DECLARATION_LIST||LA50_14==While) ) {
					alt50=16;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 50, 14, input);
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
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:462:4: localVariableDeclarationList
					{
					pushFollow(FOLLOW_localVariableDeclarationList_in_instruction2605);
					localVariableDeclarationList78=localVariableDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 462:34: -> {$localVariableDeclarationList.st}
					  {
					  	retval.st = (localVariableDeclarationList78!=null?((StringTemplate)localVariableDeclarationList78.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:463:4: ifCondition
					{
					pushFollow(FOLLOW_ifCondition_in_instruction2615);
					ifCondition79=ifCondition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 463:19: -> {$ifCondition.st}
					  {
					  	retval.st = (ifCondition79!=null?((StringTemplate)ifCondition79.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:464:4: switchCondition
					{
					pushFollow(FOLLOW_switchCondition_in_instruction2627);
					switchCondition80=switchCondition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 464:22: -> {$switchCondition.st}
					  {
					  	retval.st = (switchCondition80!=null?((StringTemplate)switchCondition80.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:465:4: forLoop
					{
					pushFollow(FOLLOW_forLoop_in_instruction2638);
					forLoop81=forLoop();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 465:15: -> {$forLoop.st}
					  {
					  	retval.st = (forLoop81!=null?((StringTemplate)forLoop81.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:466:4: foreachLoop
					{
					pushFollow(FOLLOW_foreachLoop_in_instruction2650);
					foreachLoop82=foreachLoop();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 466:19: -> {$foreachLoop.st}
					  {
					  	retval.st = (foreachLoop82!=null?((StringTemplate)foreachLoop82.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:467:4: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_instruction2662);
					whileLoop83=whileLoop();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 467:17: -> {$whileLoop.st}
					  {
					  	retval.st = (whileLoop83!=null?((StringTemplate)whileLoop83.getTemplate()):null);
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:468:4: doWhileLoop
					{
					pushFollow(FOLLOW_doWhileLoop_in_instruction2674);
					doWhileLoop84=doWhileLoop();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 468:19: -> {$doWhileLoop.st}
					  {
					  	retval.st = (doWhileLoop84!=null?((StringTemplate)doWhileLoop84.getTemplate()):null);
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:469:4: tryCatch
					{
					pushFollow(FOLLOW_tryCatch_in_instruction2686);
					tryCatch85=tryCatch();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 469:16: -> {$tryCatch.st}
					  {
					  	retval.st = (tryCatch85!=null?((StringTemplate)tryCatch85.getTemplate()):null);
					  }


					}

					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:470:4: ^( EXPRESSION ( expression )? )
					{
					match(input,EXPRESSION,FOLLOW_EXPRESSION_in_instruction2699); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:470:17: ( expression )?
						int alt45=2;
						int LA45_0 = input.LA(1);
						if ( (LA45_0==ARRAY_ACCESS||(LA45_0 >= Assign && LA45_0 <= At)||(LA45_0 >= BitwiseAnd && LA45_0 <= Bool)||LA45_0==CASTING||LA45_0==CLASS_MEMBER_ACCESS||LA45_0==CLASS_STATIC_ACCESS||LA45_0==CONSTANT||LA45_0==Clone||(LA45_0 >= Divide && LA45_0 <= DivideAssign)||(LA45_0 >= Dot && LA45_0 <= DotAssign)||(LA45_0 >= Equal && LA45_0 <= Exit)||LA45_0==FUNCTION_CALL||LA45_0==Float||(LA45_0 >= GreaterEqualThan && LA45_0 <= GreaterThan)||LA45_0==Identical||(LA45_0 >= Instanceof && LA45_0 <= Int)||(LA45_0 >= LessEqualThan && LA45_0 <= METHOD_CALL_STATIC)||(LA45_0 >= Minus && LA45_0 <= MinusAssign)||(LA45_0 >= Modulo && LA45_0 <= MultiplyAssign)||(LA45_0 >= New && LA45_0 <= Null)||(LA45_0 >= POST_DECREMENT && LA45_0 <= PRE_INCREMENT)||(LA45_0 >= Plus && LA45_0 <= PlusAssign)||LA45_0==QuestionMark||(LA45_0 >= ShiftLeft && LA45_0 <= ShiftRightAssign)||LA45_0==String||LA45_0==This||LA45_0==TypeArray||LA45_0==UNARY_MINUS||LA45_0==VariableId) ) {
							alt45=1;
						}
						switch (alt45) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:470:17: expression
								{
								pushFollow(FOLLOW_expression_in_instruction2701);
								expression86=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 470:30: -> expression(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("expression", (expression86!=null?((StringTemplate)expression86.getTemplate()):null)));
					  }


					}

					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:4: ^( 'return' ( expression )? )
					{
					match(input,Return,FOLLOW_Return_in_instruction2718); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:15: ( expression )?
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==ARRAY_ACCESS||(LA46_0 >= Assign && LA46_0 <= At)||(LA46_0 >= BitwiseAnd && LA46_0 <= Bool)||LA46_0==CASTING||LA46_0==CLASS_MEMBER_ACCESS||LA46_0==CLASS_STATIC_ACCESS||LA46_0==CONSTANT||LA46_0==Clone||(LA46_0 >= Divide && LA46_0 <= DivideAssign)||(LA46_0 >= Dot && LA46_0 <= DotAssign)||(LA46_0 >= Equal && LA46_0 <= Exit)||LA46_0==FUNCTION_CALL||LA46_0==Float||(LA46_0 >= GreaterEqualThan && LA46_0 <= GreaterThan)||LA46_0==Identical||(LA46_0 >= Instanceof && LA46_0 <= Int)||(LA46_0 >= LessEqualThan && LA46_0 <= METHOD_CALL_STATIC)||(LA46_0 >= Minus && LA46_0 <= MinusAssign)||(LA46_0 >= Modulo && LA46_0 <= MultiplyAssign)||(LA46_0 >= New && LA46_0 <= Null)||(LA46_0 >= POST_DECREMENT && LA46_0 <= PRE_INCREMENT)||(LA46_0 >= Plus && LA46_0 <= PlusAssign)||LA46_0==QuestionMark||(LA46_0 >= ShiftLeft && LA46_0 <= ShiftRightAssign)||LA46_0==String||LA46_0==This||LA46_0==TypeArray||LA46_0==UNARY_MINUS||LA46_0==VariableId) ) {
							alt46=1;
						}
						switch (alt46) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:15: expression
								{
								pushFollow(FOLLOW_expression_in_instruction2720);
								expression87=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 471:29: -> return(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("return",new STAttrMap().put("expression", (expression87!=null?((StringTemplate)expression87.getTemplate()):null)));
					  }


					}

					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:472:4: ^( 'throw' expression )
					{
					match(input,Throw,FOLLOW_Throw_in_instruction2740); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_instruction2742);
					expression88=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 472:27: -> throw(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("throw",new STAttrMap().put("expression", (expression88!=null?((StringTemplate)expression88.getTemplate()):null)));
					  }


					}

					}
					break;
				case 12 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:473:4: ^( 'echo' (exprs+= expression )+ )
					{
					match(input,Echo,FOLLOW_Echo_in_instruction2761); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:473:18: (exprs+= expression )+
					int cnt47=0;
					loop47:
					do {
						int alt47=2;
						int LA47_0 = input.LA(1);
						if ( (LA47_0==ARRAY_ACCESS||(LA47_0 >= Assign && LA47_0 <= At)||(LA47_0 >= BitwiseAnd && LA47_0 <= Bool)||LA47_0==CASTING||LA47_0==CLASS_MEMBER_ACCESS||LA47_0==CLASS_STATIC_ACCESS||LA47_0==CONSTANT||LA47_0==Clone||(LA47_0 >= Divide && LA47_0 <= DivideAssign)||(LA47_0 >= Dot && LA47_0 <= DotAssign)||(LA47_0 >= Equal && LA47_0 <= Exit)||LA47_0==FUNCTION_CALL||LA47_0==Float||(LA47_0 >= GreaterEqualThan && LA47_0 <= GreaterThan)||LA47_0==Identical||(LA47_0 >= Instanceof && LA47_0 <= Int)||(LA47_0 >= LessEqualThan && LA47_0 <= METHOD_CALL_STATIC)||(LA47_0 >= Minus && LA47_0 <= MinusAssign)||(LA47_0 >= Modulo && LA47_0 <= MultiplyAssign)||(LA47_0 >= New && LA47_0 <= Null)||(LA47_0 >= POST_DECREMENT && LA47_0 <= PRE_INCREMENT)||(LA47_0 >= Plus && LA47_0 <= PlusAssign)||LA47_0==QuestionMark||(LA47_0 >= ShiftLeft && LA47_0 <= ShiftRightAssign)||LA47_0==String||LA47_0==This||LA47_0==TypeArray||LA47_0==UNARY_MINUS||LA47_0==VariableId) ) {
							alt47=1;
						}

						switch (alt47) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:473:18: exprs+= expression
							{
							pushFollow(FOLLOW_expression_in_instruction2765);
							exprs=expression();
							state._fsp--;
							if (state.failed) return retval;
							if (list_exprs==null) list_exprs=new ArrayList<Object>();
							list_exprs.add(exprs.getTemplate());
							}
							break;

						default :
							if ( cnt47 >= 1 ) break loop47;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(47, input);
								throw eee;
						}
						cnt47++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 473:33: -> echo(expressions=$exprs)
					  {
					  	retval.st = templateLib.getInstanceOf("echo",new STAttrMap().put("expressions", list_exprs));
					  }


					}

					}
					break;
				case 13 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:474:4: ^( 'break' (index= Int )? )
					{
					match(input,Break,FOLLOW_Break_in_instruction2784); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:474:14: (index= Int )?
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==Int) ) {
							alt48=1;
						}
						switch (alt48) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:474:15: index= Int
								{
								index=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_instruction2789); if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 474:29: -> break(index=$index.text)
					  {
					  	retval.st = templateLib.getInstanceOf("break",new STAttrMap().put("index", (index!=null?index.getText():null)));
					  }


					}

					}
					break;
				case 14 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:475:4: 'break'
					{
					match(input,Break,FOLLOW_Break_in_instruction2807); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 475:15: -> break(index=null)
					  {
					  	retval.st = templateLib.getInstanceOf("break",new STAttrMap().put("index", null));
					  }


					}

					}
					break;
				case 15 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:476:4: ^( 'continue' (index= Int )? )
					{
					match(input,Continue,FOLLOW_Continue_in_instruction2825); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:476:17: (index= Int )?
						int alt49=2;
						int LA49_0 = input.LA(1);
						if ( (LA49_0==Int) ) {
							alt49=1;
						}
						switch (alt49) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:476:18: index= Int
								{
								index=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_instruction2830); if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 476:31: -> continue(index=$index.text)
					  {
					  	retval.st = templateLib.getInstanceOf("continue",new STAttrMap().put("index", (index!=null?index.getText():null)));
					  }


					}

					}
					break;
				case 16 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:477:4: 'continue'
					{
					match(input,Continue,FOLLOW_Continue_in_instruction2847); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 477:17: -> continue(index=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:480:1: ifCondition : ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? ) -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions);
	public final PHP54TranslatorWalker.ifCondition_return ifCondition() throws RecognitionException {
		PHP54TranslatorWalker.ifCondition_return retval = new PHP54TranslatorWalker.ifCondition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope ifBlock =null;
		TreeRuleReturnScope elseBlock =null;
		TreeRuleReturnScope expression89 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:481:2: ( ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? ) -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:481:4: ^( 'if' expression ifBlock= blockConditional (elseBlock= blockConditional )? )
			{
			match(input,If,FOLLOW_If_in_ifCondition2870); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_ifCondition2876);
			expression89=expression();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_blockConditional_in_ifCondition2884);
			ifBlock=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:484:13: (elseBlock= blockConditional )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==BLOCK_CONDITIONAL) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:484:13: elseBlock= blockConditional
					{
					pushFollow(FOLLOW_blockConditional_in_ifCondition2891);
					elseBlock=blockConditional();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 486:3: -> if(condition=$expression.stifBlock=$ifBlock.instructionselseBlock=$elseBlock.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("if",new STAttrMap().put("condition", (expression89!=null?((StringTemplate)expression89.getTemplate()):null)).put("ifBlock", (ifBlock!=null?((PHP54TranslatorWalker.blockConditional_return)ifBlock).instructions:null)).put("elseBlock", (elseBlock!=null?((PHP54TranslatorWalker.blockConditional_return)elseBlock).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:489:1: blockConditional returns [List<Object> instructions] : ^( BLOCK_CONDITIONAL (instr+= instruction )* ) ;
	public final PHP54TranslatorWalker.blockConditional_return blockConditional() throws RecognitionException {
		PHP54TranslatorWalker.blockConditional_return retval = new PHP54TranslatorWalker.blockConditional_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:490:2: ( ^( BLOCK_CONDITIONAL (instr+= instruction )* ) )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:490:4: ^( BLOCK_CONDITIONAL (instr+= instruction )* )
			{
			match(input,BLOCK_CONDITIONAL,FOLLOW_BLOCK_CONDITIONAL_in_blockConditional2932); if (state.failed) return retval;
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); if (state.failed) return retval;
				// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:490:29: (instr+= instruction )*
				loop52:
				do {
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==Break||LA52_0==Continue||LA52_0==Do||LA52_0==EXPRESSION||LA52_0==Echo||(LA52_0 >= For && LA52_0 <= Foreach)||LA52_0==If||LA52_0==Return||LA52_0==Switch||(LA52_0 >= Throw && LA52_0 <= Try)||LA52_0==VARIABLE_DECLARATION_LIST||LA52_0==While) ) {
						alt52=1;
					}

					switch (alt52) {
					case 1 :
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:490:29: instr+= instruction
						{
						pushFollow(FOLLOW_instruction_in_blockConditional2936);
						instr=instruction();
						state._fsp--;
						if (state.failed) return retval;
						if (list_instr==null) list_instr=new ArrayList<Object>();
						list_instr.add(instr.getTemplate());
						}
						break;

					default :
						break loop52;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:493:1: switchCondition : ^( 'switch' expression (content+= switchContent )* ) -> switch(condition=$expression.stcontent=$content);
	public final PHP54TranslatorWalker.switchCondition_return switchCondition() throws RecognitionException {
		PHP54TranslatorWalker.switchCondition_return retval = new PHP54TranslatorWalker.switchCondition_return();
		retval.start = input.LT(1);

		List<Object> list_content=null;
		TreeRuleReturnScope expression90 =null;
		RuleReturnScope content = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:494:2: ( ^( 'switch' expression (content+= switchContent )* ) -> switch(condition=$expression.stcontent=$content))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:494:4: ^( 'switch' expression (content+= switchContent )* )
			{
			match(input,Switch,FOLLOW_Switch_in_switchCondition2952); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_switchCondition2954);
			expression90=expression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:494:33: (content+= switchContent )*
			loop53:
			do {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==SWITCH_CASES) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:494:33: content+= switchContent
					{
					pushFollow(FOLLOW_switchContent_in_switchCondition2958);
					content=switchContent();
					state._fsp--;
					if (state.failed) return retval;
					if (list_content==null) list_content=new ArrayList<Object>();
					list_content.add(content.getTemplate());
					}
					break;

				default :
					break loop53;
				}
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 494:51: -> switch(condition=$expression.stcontent=$content)
			  {
			  	retval.st = templateLib.getInstanceOf("switch",new STAttrMap().put("condition", (expression90!=null?((StringTemplate)expression90.getTemplate()):null)).put("content", list_content));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:497:1: switchContent : ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional -> switchContent(labels=$labelsblock=$blockConditional.instructions);
	public final PHP54TranslatorWalker.switchContent_return switchContent() throws RecognitionException {
		PHP54TranslatorWalker.switchContent_return retval = new PHP54TranslatorWalker.switchContent_return();
		retval.start = input.LT(1);

		List<Object> list_labels=null;
		TreeRuleReturnScope blockConditional91 =null;
		RuleReturnScope labels = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:498:2: ( ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional -> switchContent(labels=$labelsblock=$blockConditional.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:498:4: ^( SWITCH_CASES (labels+= caseLabel )+ ) blockConditional
			{
			match(input,SWITCH_CASES,FOLLOW_SWITCH_CASES_in_switchContent2986); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:498:25: (labels+= caseLabel )+
			int cnt54=0;
			loop54:
			do {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==ARRAY_ACCESS||(LA54_0 >= Assign && LA54_0 <= At)||(LA54_0 >= BitwiseAnd && LA54_0 <= Bool)||LA54_0==CASTING||LA54_0==CLASS_MEMBER_ACCESS||LA54_0==CLASS_STATIC_ACCESS||LA54_0==CONSTANT||LA54_0==Clone||LA54_0==Default||(LA54_0 >= Divide && LA54_0 <= DivideAssign)||(LA54_0 >= Dot && LA54_0 <= DotAssign)||(LA54_0 >= Equal && LA54_0 <= Exit)||LA54_0==FUNCTION_CALL||LA54_0==Float||(LA54_0 >= GreaterEqualThan && LA54_0 <= GreaterThan)||LA54_0==Identical||(LA54_0 >= Instanceof && LA54_0 <= Int)||(LA54_0 >= LessEqualThan && LA54_0 <= METHOD_CALL_STATIC)||(LA54_0 >= Minus && LA54_0 <= MinusAssign)||(LA54_0 >= Modulo && LA54_0 <= MultiplyAssign)||(LA54_0 >= New && LA54_0 <= Null)||(LA54_0 >= POST_DECREMENT && LA54_0 <= PRE_INCREMENT)||(LA54_0 >= Plus && LA54_0 <= PlusAssign)||LA54_0==QuestionMark||(LA54_0 >= ShiftLeft && LA54_0 <= ShiftRightAssign)||LA54_0==String||LA54_0==This||LA54_0==TypeArray||LA54_0==UNARY_MINUS||LA54_0==VariableId) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:498:25: labels+= caseLabel
					{
					pushFollow(FOLLOW_caseLabel_in_switchContent2990);
					labels=caseLabel();
					state._fsp--;
					if (state.failed) return retval;
					if (list_labels==null) list_labels=new ArrayList<Object>();
					list_labels.add(labels.getTemplate());
					}
					break;

				default :
					if ( cnt54 >= 1 ) break loop54;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(54, input);
						throw eee;
				}
				cnt54++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_blockConditional_in_switchContent2994);
			blockConditional91=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 499:3: -> switchContent(labels=$labelsblock=$blockConditional.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("switchContent",new STAttrMap().put("labels", list_labels).put("block", (blockConditional91!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional91).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:502:1: caseLabel : ( expression -> caseLabel(label=$expression.st)| Default -> {%{$Default.text+\":\"}});
	public final PHP54TranslatorWalker.caseLabel_return caseLabel() throws RecognitionException {
		PHP54TranslatorWalker.caseLabel_return retval = new PHP54TranslatorWalker.caseLabel_return();
		retval.start = input.LT(1);

		ITSPHPAst Default93=null;
		TreeRuleReturnScope expression92 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:2: ( expression -> caseLabel(label=$expression.st)| Default -> {%{$Default.text+\":\"}})
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==ARRAY_ACCESS||(LA55_0 >= Assign && LA55_0 <= At)||(LA55_0 >= BitwiseAnd && LA55_0 <= Bool)||LA55_0==CASTING||LA55_0==CLASS_MEMBER_ACCESS||LA55_0==CLASS_STATIC_ACCESS||LA55_0==CONSTANT||LA55_0==Clone||(LA55_0 >= Divide && LA55_0 <= DivideAssign)||(LA55_0 >= Dot && LA55_0 <= DotAssign)||(LA55_0 >= Equal && LA55_0 <= Exit)||LA55_0==FUNCTION_CALL||LA55_0==Float||(LA55_0 >= GreaterEqualThan && LA55_0 <= GreaterThan)||LA55_0==Identical||(LA55_0 >= Instanceof && LA55_0 <= Int)||(LA55_0 >= LessEqualThan && LA55_0 <= METHOD_CALL_STATIC)||(LA55_0 >= Minus && LA55_0 <= MinusAssign)||(LA55_0 >= Modulo && LA55_0 <= MultiplyAssign)||(LA55_0 >= New && LA55_0 <= Null)||(LA55_0 >= POST_DECREMENT && LA55_0 <= PRE_INCREMENT)||(LA55_0 >= Plus && LA55_0 <= PlusAssign)||LA55_0==QuestionMark||(LA55_0 >= ShiftLeft && LA55_0 <= ShiftRightAssign)||LA55_0==String||LA55_0==This||LA55_0==TypeArray||LA55_0==UNARY_MINUS||LA55_0==VariableId) ) {
				alt55=1;
			}
			else if ( (LA55_0==Default) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:4: expression
					{
					pushFollow(FOLLOW_expression_in_caseLabel3022);
					expression92=expression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 503:16: -> caseLabel(label=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("caseLabel",new STAttrMap().put("label", (expression92!=null?((StringTemplate)expression92.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:504:4: Default
					{
					Default93=(ITSPHPAst)match(input,Default,FOLLOW_Default_in_caseLabel3037); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 504:13: -> {%{$Default.text+\":\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Default93!=null?Default93.getText():null)+":");
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:507:1: forLoop : ^( 'for' (init= variableDeclarationList |init= expressionList[true] ) condition= expressionList[true] update= expressionList[false] blockConditional ) -> for(init=$init.stcondition=$condition.stupdate=$update.stblock=$blockConditional.instructions);
	public final PHP54TranslatorWalker.forLoop_return forLoop() throws RecognitionException {
		PHP54TranslatorWalker.forLoop_return retval = new PHP54TranslatorWalker.forLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope init =null;
		TreeRuleReturnScope condition =null;
		TreeRuleReturnScope update =null;
		TreeRuleReturnScope blockConditional94 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:508:2: ( ^( 'for' (init= variableDeclarationList |init= expressionList[true] ) condition= expressionList[true] update= expressionList[false] blockConditional ) -> for(init=$init.stcondition=$condition.stupdate=$update.stblock=$blockConditional.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:508:4: ^( 'for' (init= variableDeclarationList |init= expressionList[true] ) condition= expressionList[true] update= expressionList[false] blockConditional )
			{
			match(input,For,FOLLOW_For_in_forLoop3054); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:509:4: (init= variableDeclarationList |init= expressionList[true] )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==VARIABLE_DECLARATION_LIST) ) {
				alt56=1;
			}
			else if ( (LA56_0==EXPRESSION_LIST) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:509:5: init= variableDeclarationList
					{
					pushFollow(FOLLOW_variableDeclarationList_in_forLoop3063);
					init=variableDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:509:34: init= expressionList[true]
					{
					pushFollow(FOLLOW_expressionList_in_forLoop3067);
					init=expressionList(true);
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_expressionList_in_forLoop3076);
			condition=expressionList(true);
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_expressionList_in_forLoop3084);
			update=expressionList(false);
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_blockConditional_in_forLoop3090);
			blockConditional94=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 514:3: -> for(init=$init.stcondition=$condition.stupdate=$update.stblock=$blockConditional.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("for",new STAttrMap().put("init", (init!=null?((StringTemplate)init.getTemplate()):null)).put("condition", (condition!=null?((StringTemplate)condition.getTemplate()):null)).put("update", (update!=null?((StringTemplate)update.getTemplate()):null)).put("block", (blockConditional94!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional94).instructions:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:517:1: expressionList[boolean semicolonAtTheEnd] : ( ^( EXPRESSION_LIST (expr+= expression )* ) -> expressionList(expressions=$exprsemicolonAtTheEnd=semicolonAtTheEnd)| EXPRESSION_LIST -> expressionList(expressions=nullsemicolonAtTheEnd=semicolonAtTheEnd));
	public final PHP54TranslatorWalker.expressionList_return expressionList(boolean semicolonAtTheEnd) throws RecognitionException {
		PHP54TranslatorWalker.expressionList_return retval = new PHP54TranslatorWalker.expressionList_return();
		retval.start = input.LT(1);

		List<Object> list_expr=null;
		RuleReturnScope expr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:518:2: ( ^( EXPRESSION_LIST (expr+= expression )* ) -> expressionList(expressions=$exprsemicolonAtTheEnd=semicolonAtTheEnd)| EXPRESSION_LIST -> expressionList(expressions=nullsemicolonAtTheEnd=semicolonAtTheEnd))
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==EXPRESSION_LIST) ) {
				int LA58_1 = input.LA(2);
				if ( (LA58_1==DOWN) ) {
					alt58=1;
				}
				else if ( (LA58_1==BLOCK_CONDITIONAL||LA58_1==EXPRESSION_LIST) ) {
					alt58=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 58, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 58, 0, input);
				throw nvae;
			}
			switch (alt58) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:518:4: ^( EXPRESSION_LIST (expr+= expression )* )
					{
					match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList3134); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:518:26: (expr+= expression )*
						loop57:
						do {
							int alt57=2;
							int LA57_0 = input.LA(1);
							if ( (LA57_0==ARRAY_ACCESS||(LA57_0 >= Assign && LA57_0 <= At)||(LA57_0 >= BitwiseAnd && LA57_0 <= Bool)||LA57_0==CASTING||LA57_0==CLASS_MEMBER_ACCESS||LA57_0==CLASS_STATIC_ACCESS||LA57_0==CONSTANT||LA57_0==Clone||(LA57_0 >= Divide && LA57_0 <= DivideAssign)||(LA57_0 >= Dot && LA57_0 <= DotAssign)||(LA57_0 >= Equal && LA57_0 <= Exit)||LA57_0==FUNCTION_CALL||LA57_0==Float||(LA57_0 >= GreaterEqualThan && LA57_0 <= GreaterThan)||LA57_0==Identical||(LA57_0 >= Instanceof && LA57_0 <= Int)||(LA57_0 >= LessEqualThan && LA57_0 <= METHOD_CALL_STATIC)||(LA57_0 >= Minus && LA57_0 <= MinusAssign)||(LA57_0 >= Modulo && LA57_0 <= MultiplyAssign)||(LA57_0 >= New && LA57_0 <= Null)||(LA57_0 >= POST_DECREMENT && LA57_0 <= PRE_INCREMENT)||(LA57_0 >= Plus && LA57_0 <= PlusAssign)||LA57_0==QuestionMark||(LA57_0 >= ShiftLeft && LA57_0 <= ShiftRightAssign)||LA57_0==String||LA57_0==This||LA57_0==TypeArray||LA57_0==UNARY_MINUS||LA57_0==VariableId) ) {
								alt57=1;
							}

							switch (alt57) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:518:26: expr+= expression
								{
								pushFollow(FOLLOW_expression_in_expressionList3138);
								expr=expression();
								state._fsp--;
								if (state.failed) return retval;
								if (list_expr==null) list_expr=new ArrayList<Object>();
								list_expr.add(expr.getTemplate());
								}
								break;

							default :
								break loop57;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 518:41: -> expressionList(expressions=$exprsemicolonAtTheEnd=semicolonAtTheEnd)
					  {
					  	retval.st = templateLib.getInstanceOf("expressionList",new STAttrMap().put("expressions", list_expr).put("semicolonAtTheEnd", semicolonAtTheEnd));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:519:4: EXPRESSION_LIST
					{
					match(input,EXPRESSION_LIST,FOLLOW_EXPRESSION_LIST_in_expressionList3159); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 519:20: -> expressionList(expressions=nullsemicolonAtTheEnd=semicolonAtTheEnd)
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


	public static class foreachLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "foreachLoop"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:522:1: foreachLoop : ^( 'foreach' expression ( ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER scalarTypes ) keyVariableId= VariableId ) )? ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER allTypes ) valueVariableId= VariableId ) blockConditional ) -> foreach(array=$expression.stkeyVariableId=$keyVariableId.textvalueVariableId=$valueVariableId.textblock=$blockConditional.instructions);
	public final PHP54TranslatorWalker.foreachLoop_return foreachLoop() throws RecognitionException {
		PHP54TranslatorWalker.foreachLoop_return retval = new PHP54TranslatorWalker.foreachLoop_return();
		retval.start = input.LT(1);

		ITSPHPAst keyVariableId=null;
		ITSPHPAst valueVariableId=null;
		TreeRuleReturnScope expression95 =null;
		TreeRuleReturnScope blockConditional96 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:523:2: ( ^( 'foreach' expression ( ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER scalarTypes ) keyVariableId= VariableId ) )? ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER allTypes ) valueVariableId= VariableId ) blockConditional ) -> foreach(array=$expression.stkeyVariableId=$keyVariableId.textvalueVariableId=$valueVariableId.textblock=$blockConditional.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:523:4: ^( 'foreach' expression ( ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER scalarTypes ) keyVariableId= VariableId ) )? ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER allTypes ) valueVariableId= VariableId ) blockConditional )
			{
			match(input,Foreach,FOLLOW_Foreach_in_foreachLoop3186); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_foreachLoop3192);
			expression95=expression();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:528:4: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER scalarTypes ) keyVariableId= VariableId ) )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==VARIABLE_DECLARATION_LIST) ) {
				int LA59_1 = input.LA(2);
				if ( (LA59_1==DOWN) ) {
					int LA59_2 = input.LA(3);
					if ( (LA59_2==TYPE) ) {
						int LA59_3 = input.LA(4);
						if ( (LA59_3==DOWN) ) {
							int LA59_4 = input.LA(5);
							if ( (LA59_4==TYPE_MODIFIER) ) {
								int LA59_5 = input.LA(6);
								if ( ((LA59_5 >= TypeBool && LA59_5 <= TypeInt)||LA59_5==TypeString) ) {
									int LA59_6 = input.LA(7);
									if ( (LA59_6==UP) ) {
										int LA59_8 = input.LA(8);
										if ( (LA59_8==VariableId) ) {
											int LA59_9 = input.LA(9);
											if ( (LA59_9==UP) ) {
												int LA59_10 = input.LA(10);
												if ( (LA59_10==VARIABLE_DECLARATION_LIST) ) {
													alt59=1;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			switch (alt59) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:528:6: ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER scalarTypes ) keyVariableId= VariableId )
					{
					match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_foreachLoop3212); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_foreachLoop3220); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_foreachLoop3222); if (state.failed) return retval;
					pushFollow(FOLLOW_scalarTypes_in_foreachLoop3224);
					scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					keyVariableId=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3235); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					}
					break;

			}

			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_foreachLoop3258); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_foreachLoop3261); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_foreachLoop3263); if (state.failed) return retval;
			pushFollow(FOLLOW_allTypes_in_foreachLoop3265);
			allTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			valueVariableId=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_foreachLoop3270); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_blockConditional_in_foreachLoop3277);
			blockConditional96=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 537:3: -> foreach(array=$expression.stkeyVariableId=$keyVariableId.textvalueVariableId=$valueVariableId.textblock=$blockConditional.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("foreach",new STAttrMap().put("array", (expression95!=null?((StringTemplate)expression95.getTemplate()):null)).put("keyVariableId", (keyVariableId!=null?keyVariableId.getText():null)).put("valueVariableId", (valueVariableId!=null?valueVariableId.getText():null)).put("block", (blockConditional96!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional96).instructions:null)));
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
	// $ANTLR end "foreachLoop"


	public static class whileLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whileLoop"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:540:1: whileLoop : ^( 'while' expression blockConditional ) -> while(condition=$expression.stblock=$blockConditional.instructions);
	public final PHP54TranslatorWalker.whileLoop_return whileLoop() throws RecognitionException {
		PHP54TranslatorWalker.whileLoop_return retval = new PHP54TranslatorWalker.whileLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression97 =null;
		TreeRuleReturnScope blockConditional98 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:541:2: ( ^( 'while' expression blockConditional ) -> while(condition=$expression.stblock=$blockConditional.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:541:4: ^( 'while' expression blockConditional )
			{
			match(input,While,FOLLOW_While_in_whileLoop3319); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_whileLoop3321);
			expression97=expression();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_blockConditional_in_whileLoop3323);
			blockConditional98=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 541:43: -> while(condition=$expression.stblock=$blockConditional.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("while",new STAttrMap().put("condition", (expression97!=null?((StringTemplate)expression97.getTemplate()):null)).put("block", (blockConditional98!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional98).instructions:null)));
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
	// $ANTLR end "whileLoop"


	public static class doWhileLoop_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "doWhileLoop"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:544:1: doWhileLoop : ^( 'do' blockConditional expression ) -> doWhile(block=$blockConditional.instructionscondition=$expression.st);
	public final PHP54TranslatorWalker.doWhileLoop_return doWhileLoop() throws RecognitionException {
		PHP54TranslatorWalker.doWhileLoop_return retval = new PHP54TranslatorWalker.doWhileLoop_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope blockConditional99 =null;
		TreeRuleReturnScope expression100 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:545:2: ( ^( 'do' blockConditional expression ) -> doWhile(block=$blockConditional.instructionscondition=$expression.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:545:4: ^( 'do' blockConditional expression )
			{
			match(input,Do,FOLLOW_Do_in_doWhileLoop3350); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_blockConditional_in_doWhileLoop3352);
			blockConditional99=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_doWhileLoop3354);
			expression100=expression();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 545:40: -> doWhile(block=$blockConditional.instructionscondition=$expression.st)
			  {
			  	retval.st = templateLib.getInstanceOf("doWhile",new STAttrMap().put("block", (blockConditional99!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional99).instructions:null)).put("condition", (expression100!=null?((StringTemplate)expression100.getTemplate()):null)));
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
	// $ANTLR end "doWhileLoop"


	public static class tryCatch_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "tryCatch"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:548:1: tryCatch : ^( 'try' blockConditional (catchBlocks+= catchBlock )+ ) -> tryCatch(tryBlock=$blockConditional.instructionscatchBlocks=$catchBlocks);
	public final PHP54TranslatorWalker.tryCatch_return tryCatch() throws RecognitionException {
		PHP54TranslatorWalker.tryCatch_return retval = new PHP54TranslatorWalker.tryCatch_return();
		retval.start = input.LT(1);

		List<Object> list_catchBlocks=null;
		TreeRuleReturnScope blockConditional101 =null;
		RuleReturnScope catchBlocks = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:549:2: ( ^( 'try' blockConditional (catchBlocks+= catchBlock )+ ) -> tryCatch(tryBlock=$blockConditional.instructionscatchBlocks=$catchBlocks))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:549:4: ^( 'try' blockConditional (catchBlocks+= catchBlock )+ )
			{
			match(input,Try,FOLLOW_Try_in_tryCatch3381); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_blockConditional_in_tryCatch3383);
			blockConditional101=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:549:40: (catchBlocks+= catchBlock )+
			int cnt60=0;
			loop60:
			do {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==Catch) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:549:40: catchBlocks+= catchBlock
					{
					pushFollow(FOLLOW_catchBlock_in_tryCatch3387);
					catchBlocks=catchBlock();
					state._fsp--;
					if (state.failed) return retval;
					if (list_catchBlocks==null) list_catchBlocks=new ArrayList<Object>();
					list_catchBlocks.add(catchBlocks.getTemplate());
					}
					break;

				default :
					if ( cnt60 >= 1 ) break loop60;
					if (state.backtracking>0) {state.failed=true; return retval;}
						EarlyExitException eee =
							new EarlyExitException(60, input);
						throw eee;
				}
				cnt60++;
			} while (true);

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 550:3: -> tryCatch(tryBlock=$blockConditional.instructionscatchBlocks=$catchBlocks)
			  {
			  	retval.st = templateLib.getInstanceOf("tryCatch",new STAttrMap().put("tryBlock", (blockConditional101!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional101).instructions:null)).put("catchBlocks", list_catchBlocks));
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
	// $ANTLR end "tryCatch"


	public static class catchBlock_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "catchBlock"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:553:1: catchBlock : ^( 'catch' ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER TYPE_NAME ) VariableId ) blockConditional ) -> catchBlock(type=$TYPE_NAME.textvariableId=$VariableId.textblock=$blockConditional.instructions);
	public final PHP54TranslatorWalker.catchBlock_return catchBlock() throws RecognitionException {
		PHP54TranslatorWalker.catchBlock_return retval = new PHP54TranslatorWalker.catchBlock_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME102=null;
		ITSPHPAst VariableId103=null;
		TreeRuleReturnScope blockConditional104 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:554:2: ( ^( 'catch' ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER TYPE_NAME ) VariableId ) blockConditional ) -> catchBlock(type=$TYPE_NAME.textvariableId=$VariableId.textblock=$blockConditional.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:554:4: ^( 'catch' ^( VARIABLE_DECLARATION_LIST ^( TYPE TYPE_MODIFIER TYPE_NAME ) VariableId ) blockConditional )
			{
			match(input,Catch,FOLLOW_Catch_in_catchBlock3419); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_catchBlock3425); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_catchBlock3432); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_catchBlock3434); if (state.failed) return retval;
			TYPE_NAME102=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_catchBlock3436); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			VariableId103=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_catchBlock3443); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_blockConditional_in_catchBlock3453);
			blockConditional104=blockConditional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 561:3: -> catchBlock(type=$TYPE_NAME.textvariableId=$VariableId.textblock=$blockConditional.instructions)
			  {
			  	retval.st = templateLib.getInstanceOf("catchBlock",new STAttrMap().put("type", (TYPE_NAME102!=null?TYPE_NAME102.getText():null)).put("variableId", (VariableId103!=null?VariableId103.getText():null)).put("block", (blockConditional104!=null?((PHP54TranslatorWalker.blockConditional_return)blockConditional104).instructions:null)));
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
	// $ANTLR end "catchBlock"


	public static class expression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:564:1: expression options {backtrack=true; } : ( atom -> {$atom.st}| operator -> {$operator.st}| functionCall -> {$functionCall.st}| methodCall -> {$methodCall.st}| methodCallSelfOrParent -> {$methodCallSelfOrParent.st}| methodCallStatic -> {$methodCallStatic.st}| classStaticAccess -> {$classStaticAccess.st}| postFixExpression -> {$postFixExpression.st}| exit -> {$exit.st});
	public final PHP54TranslatorWalker.expression_return expression() throws RecognitionException {
		PHP54TranslatorWalker.expression_return retval = new PHP54TranslatorWalker.expression_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope atom105 =null;
		TreeRuleReturnScope operator106 =null;
		TreeRuleReturnScope functionCall107 =null;
		TreeRuleReturnScope methodCall108 =null;
		TreeRuleReturnScope methodCallSelfOrParent109 =null;
		TreeRuleReturnScope methodCallStatic110 =null;
		TreeRuleReturnScope classStaticAccess111 =null;
		TreeRuleReturnScope postFixExpression112 =null;
		TreeRuleReturnScope exit113 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:566:2: ( atom -> {$atom.st}| operator -> {$operator.st}| functionCall -> {$functionCall.st}| methodCall -> {$methodCall.st}| methodCallSelfOrParent -> {$methodCallSelfOrParent.st}| methodCallStatic -> {$methodCallStatic.st}| classStaticAccess -> {$classStaticAccess.st}| postFixExpression -> {$postFixExpression.st}| exit -> {$exit.st})
			int alt61=9;
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
				alt61=1;
				}
				break;
			case CLASS_STATIC_ACCESS:
				{
				int LA61_2 = input.LA(2);
				if ( (LA61_2==DOWN) ) {
					switch ( input.LA(3) ) {
					case TYPE_NAME:
						{
						int LA61_11 = input.LA(4);
						if ( (LA61_11==CONSTANT) ) {
							int LA61_16 = input.LA(5);
							if ( (LA61_16==UP) ) {
								int LA61_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt61=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt61=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 61, 18, input);
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
										new NoViableAltException("", 61, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA61_11==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt61=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 61, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case Self:
						{
						int LA61_12 = input.LA(4);
						if ( (LA61_12==CONSTANT) ) {
							int LA61_16 = input.LA(5);
							if ( (LA61_16==UP) ) {
								int LA61_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt61=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt61=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 61, 18, input);
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
										new NoViableAltException("", 61, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA61_12==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt61=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 61, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
						}
						break;
					case Parent:
						{
						int LA61_13 = input.LA(4);
						if ( (LA61_13==CONSTANT) ) {
							int LA61_16 = input.LA(5);
							if ( (LA61_16==UP) ) {
								int LA61_18 = input.LA(6);
								if ( (synpred1_PHP54TranslatorWalker()) ) {
									alt61=1;
								}
								else if ( (synpred7_PHP54TranslatorWalker()) ) {
									alt61=7;
								}
								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 61, 18, input);
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
										new NoViableAltException("", 61, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}
						}
						else if ( (LA61_13==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
							alt61=7;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++)
									input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 61, 13, input);
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
								new NoViableAltException("", 61, 9, input);
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
							new NoViableAltException("", 61, 2, input);
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
				alt61=2;
				}
				break;
			case FUNCTION_CALL:
				{
				alt61=3;
				}
				break;
			case METHOD_CALL:
				{
				int LA61_5 = input.LA(2);
				if ( (LA61_5==DOWN) ) {
					int LA61_10 = input.LA(3);
					if ( (LA61_10==This||LA61_10==VariableId) ) {
						alt61=4;
					}
					else if ( (LA61_10==Parent||LA61_10==Self) ) {
						alt61=5;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 61, 10, input);
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
							new NoViableAltException("", 61, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case METHOD_CALL_STATIC:
				{
				alt61=6;
				}
				break;
			case ARRAY_ACCESS:
			case CLASS_MEMBER_ACCESS:
			case METHOD_CALL_POSTFIX:
				{
				alt61=8;
				}
				break;
			case Exit:
				{
				alt61=9;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 61, 0, input);
				throw nvae;
			}
			switch (alt61) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:566:7: atom
					{
					pushFollow(FOLLOW_atom_in_expression3499);
					atom105=atom();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 566:15: -> {$atom.st}
					  {
					  	retval.st = (atom105!=null?((StringTemplate)atom105.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:567:4: operator
					{
					pushFollow(FOLLOW_operator_in_expression3511);
					operator106=operator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 567:14: -> {$operator.st}
					  {
					  	retval.st = (operator106!=null?((StringTemplate)operator106.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:568:8: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_expression3525);
					functionCall107=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 568:23: -> {$functionCall.st}
					  {
					  	retval.st = (functionCall107!=null?((StringTemplate)functionCall107.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:569:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_expression3536);
					methodCall108=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 569:17: -> {$methodCall.st}
					  {
					  	retval.st = (methodCall108!=null?((StringTemplate)methodCall108.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:570:4: methodCallSelfOrParent
					{
					pushFollow(FOLLOW_methodCallSelfOrParent_in_expression3547);
					methodCallSelfOrParent109=methodCallSelfOrParent();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 570:28: -> {$methodCallSelfOrParent.st}
					  {
					  	retval.st = (methodCallSelfOrParent109!=null?((StringTemplate)methodCallSelfOrParent109.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:571:4: methodCallStatic
					{
					pushFollow(FOLLOW_methodCallStatic_in_expression3557);
					methodCallStatic110=methodCallStatic();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 571:22: -> {$methodCallStatic.st}
					  {
					  	retval.st = (methodCallStatic110!=null?((StringTemplate)methodCallStatic110.getTemplate()):null);
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:572:4: classStaticAccess
					{
					pushFollow(FOLLOW_classStaticAccess_in_expression3567);
					classStaticAccess111=classStaticAccess();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 572:22: -> {$classStaticAccess.st}
					  {
					  	retval.st = (classStaticAccess111!=null?((StringTemplate)classStaticAccess111.getTemplate()):null);
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:573:4: postFixExpression
					{
					pushFollow(FOLLOW_postFixExpression_in_expression3576);
					postFixExpression112=postFixExpression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 573:22: -> {$postFixExpression.st}
					  {
					  	retval.st = (postFixExpression112!=null?((StringTemplate)postFixExpression112.getTemplate()):null);
					  }


					}

					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:574:4: exit
					{
					pushFollow(FOLLOW_exit_in_expression3585);
					exit113=exit();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 574:11: -> {$exit.st}
					  {
					  	retval.st = (exit113!=null?((StringTemplate)exit113.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:577:1: atom : ( primitiveAtomWithConstant -> {$primitiveAtomWithConstant.st}| ^( TypeArray (keyValuePairs+= arrayKeyValue )* ) -> array(content=$keyValuePairs)| VariableId -> {%{$VariableId.text}}| This -> {%{$This.text}});
	public final PHP54TranslatorWalker.atom_return atom() throws RecognitionException {
		PHP54TranslatorWalker.atom_return retval = new PHP54TranslatorWalker.atom_return();
		retval.start = input.LT(1);

		ITSPHPAst VariableId115=null;
		ITSPHPAst This116=null;
		List<Object> list_keyValuePairs=null;
		TreeRuleReturnScope primitiveAtomWithConstant114 =null;
		RuleReturnScope keyValuePairs = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:578:2: ( primitiveAtomWithConstant -> {$primitiveAtomWithConstant.st}| ^( TypeArray (keyValuePairs+= arrayKeyValue )* ) -> array(content=$keyValuePairs)| VariableId -> {%{$VariableId.text}}| This -> {%{$This.text}})
			int alt63=4;
			switch ( input.LA(1) ) {
			case Bool:
			case CLASS_STATIC_ACCESS:
			case CONSTANT:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt63=1;
				}
				break;
			case TypeArray:
				{
				alt63=2;
				}
				break;
			case VariableId:
				{
				alt63=3;
				}
				break;
			case This:
				{
				alt63=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}
			switch (alt63) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:578:4: primitiveAtomWithConstant
					{
					pushFollow(FOLLOW_primitiveAtomWithConstant_in_atom3608);
					primitiveAtomWithConstant114=primitiveAtomWithConstant();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 578:33: -> {$primitiveAtomWithConstant.st}
					  {
					  	retval.st = (primitiveAtomWithConstant114!=null?((StringTemplate)primitiveAtomWithConstant114.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:579:4: ^( TypeArray (keyValuePairs+= arrayKeyValue )* )
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_atom3621); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:579:29: (keyValuePairs+= arrayKeyValue )*
						loop62:
						do {
							int alt62=2;
							int LA62_0 = input.LA(1);
							if ( (LA62_0==ARRAY_ACCESS||LA62_0==Arrow||(LA62_0 >= Assign && LA62_0 <= At)||(LA62_0 >= BitwiseAnd && LA62_0 <= Bool)||LA62_0==CASTING||LA62_0==CLASS_MEMBER_ACCESS||LA62_0==CLASS_STATIC_ACCESS||LA62_0==CONSTANT||LA62_0==Clone||(LA62_0 >= Divide && LA62_0 <= DivideAssign)||(LA62_0 >= Dot && LA62_0 <= DotAssign)||(LA62_0 >= Equal && LA62_0 <= Exit)||LA62_0==FUNCTION_CALL||LA62_0==Float||(LA62_0 >= GreaterEqualThan && LA62_0 <= GreaterThan)||LA62_0==Identical||(LA62_0 >= Instanceof && LA62_0 <= Int)||(LA62_0 >= LessEqualThan && LA62_0 <= METHOD_CALL_STATIC)||(LA62_0 >= Minus && LA62_0 <= MinusAssign)||(LA62_0 >= Modulo && LA62_0 <= MultiplyAssign)||(LA62_0 >= New && LA62_0 <= Null)||(LA62_0 >= POST_DECREMENT && LA62_0 <= PRE_INCREMENT)||(LA62_0 >= Plus && LA62_0 <= PlusAssign)||LA62_0==QuestionMark||(LA62_0 >= ShiftLeft && LA62_0 <= ShiftRightAssign)||LA62_0==String||LA62_0==This||LA62_0==TypeArray||LA62_0==UNARY_MINUS||LA62_0==VariableId) ) {
								alt62=1;
							}

							switch (alt62) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:579:29: keyValuePairs+= arrayKeyValue
								{
								pushFollow(FOLLOW_arrayKeyValue_in_atom3625);
								keyValuePairs=arrayKeyValue();
								state._fsp--;
								if (state.failed) return retval;
								if (list_keyValuePairs==null) list_keyValuePairs=new ArrayList<Object>();
								list_keyValuePairs.add(keyValuePairs.getTemplate());
								}
								break;

							default :
								break loop62;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 579:47: -> array(content=$keyValuePairs)
					  {
					  	retval.st = templateLib.getInstanceOf("array",new STAttrMap().put("content", list_keyValuePairs));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:580:4: VariableId
					{
					VariableId115=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_atom3642); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 580:20: -> {%{$VariableId.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(VariableId115!=null?VariableId115.getText():null));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:581:4: This
					{
					This116=(ITSPHPAst)match(input,This,FOLLOW_This_in_atom3656); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 581:14: -> {%{$This.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(This116!=null?This116.getText():null));
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


	public static class primitiveAtomWithConstant_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "primitiveAtomWithConstant"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:584:1: primitiveAtomWithConstant : ( Bool -> {%{$Bool.text}}| Int -> {%{$Int.text}}| Float -> {%{$Float.text}}| String -> {%{$String.text}}| Null -> {%{$Null.text}}| CONSTANT -> {%{$CONSTANT.text}}| ^( CLASS_STATIC_ACCESS staticAccess CONSTANT ) -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text));
	public final PHP54TranslatorWalker.primitiveAtomWithConstant_return primitiveAtomWithConstant() throws RecognitionException {
		PHP54TranslatorWalker.primitiveAtomWithConstant_return retval = new PHP54TranslatorWalker.primitiveAtomWithConstant_return();
		retval.start = input.LT(1);

		ITSPHPAst Bool117=null;
		ITSPHPAst Int118=null;
		ITSPHPAst Float119=null;
		ITSPHPAst String120=null;
		ITSPHPAst Null121=null;
		ITSPHPAst CONSTANT122=null;
		ITSPHPAst CONSTANT124=null;
		TreeRuleReturnScope staticAccess123 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:585:2: ( Bool -> {%{$Bool.text}}| Int -> {%{$Int.text}}| Float -> {%{$Float.text}}| String -> {%{$String.text}}| Null -> {%{$Null.text}}| CONSTANT -> {%{$CONSTANT.text}}| ^( CLASS_STATIC_ACCESS staticAccess CONSTANT ) -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text))
			int alt64=7;
			switch ( input.LA(1) ) {
			case Bool:
				{
				alt64=1;
				}
				break;
			case Int:
				{
				alt64=2;
				}
				break;
			case Float:
				{
				alt64=3;
				}
				break;
			case String:
				{
				alt64=4;
				}
				break;
			case Null:
				{
				alt64=5;
				}
				break;
			case CONSTANT:
				{
				alt64=6;
				}
				break;
			case CLASS_STATIC_ACCESS:
				{
				alt64=7;
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:585:4: Bool
					{
					Bool117=(ITSPHPAst)match(input,Bool,FOLLOW_Bool_in_primitiveAtomWithConstant3681); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 585:15: -> {%{$Bool.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Bool117!=null?Bool117.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:586:4: Int
					{
					Int118=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_primitiveAtomWithConstant3696); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 586:13: -> {%{$Int.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Int118!=null?Int118.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:587:4: Float
					{
					Float119=(ITSPHPAst)match(input,Float,FOLLOW_Float_in_primitiveAtomWithConstant3710); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 587:15: -> {%{$Float.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Float119!=null?Float119.getText():null));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:588:4: String
					{
					String120=(ITSPHPAst)match(input,String,FOLLOW_String_in_primitiveAtomWithConstant3724); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 588:16: -> {%{$String.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(String120!=null?String120.getText():null));
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:589:4: Null
					{
					Null121=(ITSPHPAst)match(input,Null,FOLLOW_Null_in_primitiveAtomWithConstant3738); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 589:14: -> {%{$Null.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Null121!=null?Null121.getText():null));
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:590:4: CONSTANT
					{
					CONSTANT122=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_primitiveAtomWithConstant3752); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 590:17: -> {%{$CONSTANT.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(CONSTANT122!=null?CONSTANT122.getText():null));
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:591:4: ^( CLASS_STATIC_ACCESS staticAccess CONSTANT )
					{
					match(input,CLASS_STATIC_ACCESS,FOLLOW_CLASS_STATIC_ACCESS_in_primitiveAtomWithConstant3766); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_staticAccess_in_primitiveAtomWithConstant3768);
					staticAccess123=staticAccess();
					state._fsp--;
					if (state.failed) return retval;
					CONSTANT124=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_primitiveAtomWithConstant3770); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 591:52: -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text)
					  {
					  	retval.st = templateLib.getInstanceOf("classConstant",new STAttrMap().put("accessor", (staticAccess123!=null?((StringTemplate)staticAccess123.getTemplate()):null)).put("constant", (CONSTANT124!=null?CONSTANT124.getText():null)));
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
	// $ANTLR end "primitiveAtomWithConstant"


	public static class arrayKeyValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayKeyValue"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:594:1: arrayKeyValue : ( ^( '=>' key= expression value= expression ) -> keyValue(key=$key.stvalue=$value.st)| expression -> {$expression.st});
	public final PHP54TranslatorWalker.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		PHP54TranslatorWalker.arrayKeyValue_return retval = new PHP54TranslatorWalker.arrayKeyValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope key =null;
		TreeRuleReturnScope value =null;
		TreeRuleReturnScope expression125 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:595:2: ( ^( '=>' key= expression value= expression ) -> keyValue(key=$key.stvalue=$value.st)| expression -> {$expression.st})
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==Arrow) ) {
				alt65=1;
			}
			else if ( (LA65_0==ARRAY_ACCESS||(LA65_0 >= Assign && LA65_0 <= At)||(LA65_0 >= BitwiseAnd && LA65_0 <= Bool)||LA65_0==CASTING||LA65_0==CLASS_MEMBER_ACCESS||LA65_0==CLASS_STATIC_ACCESS||LA65_0==CONSTANT||LA65_0==Clone||(LA65_0 >= Divide && LA65_0 <= DivideAssign)||(LA65_0 >= Dot && LA65_0 <= DotAssign)||(LA65_0 >= Equal && LA65_0 <= Exit)||LA65_0==FUNCTION_CALL||LA65_0==Float||(LA65_0 >= GreaterEqualThan && LA65_0 <= GreaterThan)||LA65_0==Identical||(LA65_0 >= Instanceof && LA65_0 <= Int)||(LA65_0 >= LessEqualThan && LA65_0 <= METHOD_CALL_STATIC)||(LA65_0 >= Minus && LA65_0 <= MinusAssign)||(LA65_0 >= Modulo && LA65_0 <= MultiplyAssign)||(LA65_0 >= New && LA65_0 <= Null)||(LA65_0 >= POST_DECREMENT && LA65_0 <= PRE_INCREMENT)||(LA65_0 >= Plus && LA65_0 <= PlusAssign)||LA65_0==QuestionMark||(LA65_0 >= ShiftLeft && LA65_0 <= ShiftRightAssign)||LA65_0==String||LA65_0==This||LA65_0==TypeArray||LA65_0==UNARY_MINUS||LA65_0==VariableId) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:595:4: ^( '=>' key= expression value= expression )
					{
					match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue3800); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_arrayKeyValue3804);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_arrayKeyValue3808);
					value=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 595:44: -> keyValue(key=$key.stvalue=$value.st)
					  {
					  	retval.st = templateLib.getInstanceOf("keyValue",new STAttrMap().put("key", (key!=null?((StringTemplate)key.getTemplate()):null)).put("value", (value!=null?((StringTemplate)value.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:596:4: expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue3828);
					expression125=expression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 596:15: -> {$expression.st}
					  {
					  	retval.st = (expression125!=null?((StringTemplate)expression125.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:599:1: staticAccess : ( TYPE_NAME -> {%{$TYPE_NAME.text}}| Self -> {%{$Self.text}}| Parent -> {%{$Parent.text}});
	public final PHP54TranslatorWalker.staticAccess_return staticAccess() throws RecognitionException {
		PHP54TranslatorWalker.staticAccess_return retval = new PHP54TranslatorWalker.staticAccess_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME126=null;
		ITSPHPAst Self127=null;
		ITSPHPAst Parent128=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:600:3: ( TYPE_NAME -> {%{$TYPE_NAME.text}}| Self -> {%{$Self.text}}| Parent -> {%{$Parent.text}})
			int alt66=3;
			switch ( input.LA(1) ) {
			case TYPE_NAME:
				{
				alt66=1;
				}
				break;
			case Self:
				{
				alt66=2;
				}
				break;
			case Parent:
				{
				alt66=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:600:5: TYPE_NAME
					{
					TYPE_NAME126=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_staticAccess3845); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 600:15: -> {%{$TYPE_NAME.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TYPE_NAME126!=null?TYPE_NAME126.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:601:5: Self
					{
					Self127=(ITSPHPAst)match(input,Self,FOLLOW_Self_in_staticAccess3855); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 601:10: -> {%{$Self.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Self127!=null?Self127.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:602:5: Parent
					{
					Parent128=(ITSPHPAst)match(input,Parent,FOLLOW_Parent_in_staticAccess3865); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 602:12: -> {%{$Parent.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Parent128!=null?Parent128.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:605:1: operator : ( ^( unaryPreOperator expr= expression ) -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)| ^( unaryPostOperator expr= expression ) -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)| ^( binaryOperator left= expression right= expression ) -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)| ^( QuestionMark cond= expression ifCase= expression elseCase= expression ) -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))| castingOperator -> {$castingOperator.st}| ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) ) -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))| newOperator -> {$newOperator.st}| ^( 'clone' expr= expression ) -> clone(expression=$expr.st));
	public final PHP54TranslatorWalker.operator_return operator() throws RecognitionException {
		PHP54TranslatorWalker.operator_return retval = new PHP54TranslatorWalker.operator_return();
		retval.start = input.LT(1);

		ITSPHPAst type=null;
		ITSPHPAst QuestionMark132=null;
		ITSPHPAst Instanceof134=null;
		TreeRuleReturnScope expr =null;
		TreeRuleReturnScope left =null;
		TreeRuleReturnScope right =null;
		TreeRuleReturnScope cond =null;
		TreeRuleReturnScope ifCase =null;
		TreeRuleReturnScope elseCase =null;
		TreeRuleReturnScope unaryPreOperator129 =null;
		TreeRuleReturnScope unaryPostOperator130 =null;
		TreeRuleReturnScope binaryOperator131 =null;
		TreeRuleReturnScope castingOperator133 =null;
		TreeRuleReturnScope newOperator135 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:606:3: ( ^( unaryPreOperator expr= expression ) -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)| ^( unaryPostOperator expr= expression ) -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)| ^( binaryOperator left= expression right= expression ) -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)| ^( QuestionMark cond= expression ifCase= expression elseCase= expression ) -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))| castingOperator -> {$castingOperator.st}| ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) ) -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))| newOperator -> {$newOperator.st}| ^( 'clone' expr= expression ) -> clone(expression=$expr.st))
			int alt68=8;
			switch ( input.LA(1) ) {
			case At:
			case BitwiseNot:
			case LogicNot:
			case PRE_DECREMENT:
			case PRE_INCREMENT:
			case UNARY_MINUS:
				{
				alt68=1;
				}
				break;
			case POST_DECREMENT:
			case POST_INCREMENT:
				{
				alt68=2;
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
				alt68=3;
				}
				break;
			case QuestionMark:
				{
				alt68=4;
				}
				break;
			case CASTING:
				{
				alt68=5;
				}
				break;
			case Instanceof:
				{
				alt68=6;
				}
				break;
			case New:
				{
				alt68=7;
				}
				break;
			case Clone:
				{
				alt68=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 68, 0, input);
				throw nvae;
			}
			switch (alt68) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:606:5: ^( unaryPreOperator expr= expression )
					{
					pushFollow(FOLLOW_unaryPreOperator_in_operator3884);
					unaryPreOperator129=unaryPreOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3888);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 606:46: -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPreOperator",new STAttrMap().put("operator", (unaryPreOperator129!=null?((StringTemplate)unaryPreOperator129.getTemplate()):null)).put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:607:4: ^( unaryPostOperator expr= expression )
					{
					pushFollow(FOLLOW_unaryPostOperator_in_operator3917);
					unaryPostOperator130=unaryPostOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3921);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 607:45: -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPostOperator",new STAttrMap().put("operator", (unaryPostOperator130!=null?((StringTemplate)unaryPostOperator130.getTemplate()):null)).put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:608:4: ^( binaryOperator left= expression right= expression )
					{
					pushFollow(FOLLOW_binaryOperator_in_operator3950);
					binaryOperator131=binaryOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3954);
					left=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3958);
					right=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 608:58: -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.stneedParentheses=$binaryOperator.needParentheses)
					  {
					  	retval.st = templateLib.getInstanceOf("binaryOperator",new STAttrMap().put("operator", (binaryOperator131!=null?((StringTemplate)binaryOperator131.getTemplate()):null)).put("left", (left!=null?((StringTemplate)left.getTemplate()):null)).put("right", (right!=null?((StringTemplate)right.getTemplate()):null)).put("needParentheses", (binaryOperator131!=null?((PHP54TranslatorWalker.binaryOperator_return)binaryOperator131).needParentheses:false)));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:609:4: ^( QuestionMark cond= expression ifCase= expression elseCase= expression )
					{
					QuestionMark132=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_operator3992); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator3996);
					cond=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator4000);
					ifCase=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator4004);
					elseCase=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 609:75: -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.stneedParentheses=precedenceHelper.needParentheses($QuestionMark))
					  {
					  	retval.st = templateLib.getInstanceOf("ternaryOperator",new STAttrMap().put("cond", (cond!=null?((StringTemplate)cond.getTemplate()):null)).put("ifCase", (ifCase!=null?((StringTemplate)ifCase.getTemplate()):null)).put("elseCase", (elseCase!=null?((StringTemplate)elseCase.getTemplate()):null)).put("needParentheses", precedenceHelper.needParentheses(QuestionMark132)));
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:610:4: castingOperator
					{
					pushFollow(FOLLOW_castingOperator_in_operator4035);
					castingOperator133=castingOperator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 610:27: -> {$castingOperator.st}
					  {
					  	retval.st = (castingOperator133!=null?((StringTemplate)castingOperator133.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:611:4: ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) )
					{
					Instanceof134=(ITSPHPAst)match(input,Instanceof,FOLLOW_Instanceof_in_operator4052); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator4056);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:611:33: (type= TYPE_NAME |type= VariableId )
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==TYPE_NAME) ) {
						alt67=1;
					}
					else if ( (LA67_0==VariableId) ) {
						alt67=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 67, 0, input);
						throw nvae;
					}
					switch (alt67) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:611:34: type= TYPE_NAME
							{
							type=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_operator4061); if (state.failed) return retval;
							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:611:49: type= VariableId
							{
							type=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_operator4065); if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 611:69: -> instanceof(expression=$expr.sttype=$type.textneedParentheses=precedenceHelper.needParentheses($Instanceof))
					  {
					  	retval.st = templateLib.getInstanceOf("instanceof",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)).put("type", (type!=null?type.getText():null)).put("needParentheses", precedenceHelper.needParentheses(Instanceof134)));
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:612:4: newOperator
					{
					pushFollow(FOLLOW_newOperator_in_operator4093);
					newOperator135=newOperator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 612:23: -> {$newOperator.st}
					  {
					  	retval.st = (newOperator135!=null?((StringTemplate)newOperator135.getTemplate()):null);
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:613:8: ^( 'clone' expr= expression )
					{
					match(input,Clone,FOLLOW_Clone_in_operator4114); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_operator4118);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 613:40: -> clone(expression=$expr.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:616:1: unaryPreOperator : ( PRE_INCREMENT -> {%{\"++\"}}| PRE_DECREMENT -> {%{\"--\"}}| '@' -> {%{\"@\"}}| '~' -> {%{\"~\"}}| '!' -> {%{\"!\"}}| UNARY_MINUS -> {%{\"-\"}});
	public final PHP54TranslatorWalker.unaryPreOperator_return unaryPreOperator() throws RecognitionException {
		PHP54TranslatorWalker.unaryPreOperator_return retval = new PHP54TranslatorWalker.unaryPreOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:617:2: ( PRE_INCREMENT -> {%{\"++\"}}| PRE_DECREMENT -> {%{\"--\"}}| '@' -> {%{\"@\"}}| '~' -> {%{\"~\"}}| '!' -> {%{\"!\"}}| UNARY_MINUS -> {%{\"-\"}})
			int alt69=6;
			switch ( input.LA(1) ) {
			case PRE_INCREMENT:
				{
				alt69=1;
				}
				break;
			case PRE_DECREMENT:
				{
				alt69=2;
				}
				break;
			case At:
				{
				alt69=3;
				}
				break;
			case BitwiseNot:
				{
				alt69=4;
				}
				break;
			case LogicNot:
				{
				alt69=5;
				}
				break;
			case UNARY_MINUS:
				{
				alt69=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:617:4: PRE_INCREMENT
					{
					match(input,PRE_INCREMENT,FOLLOW_PRE_INCREMENT_in_unaryPreOperator4149); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 617:18: -> {%{\"++\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"++");
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:618:8: PRE_DECREMENT
					{
					match(input,PRE_DECREMENT,FOLLOW_PRE_DECREMENT_in_unaryPreOperator4162); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 618:23: -> {%{\"--\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"--");
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:619:8: '@'
					{
					match(input,At,FOLLOW_At_in_unaryPreOperator4176); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 619:14: -> {%{\"@\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"@");
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:620:8: '~'
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_unaryPreOperator4191); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 620:14: -> {%{\"~\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"~");
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:621:8: '!'
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_unaryPreOperator4206); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 621:14: -> {%{\"!\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"!");
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:622:8: UNARY_MINUS
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unaryPreOperator4221); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 622:20: -> {%{\"-\"}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:625:1: unaryPostOperator : ( POST_INCREMENT -> {%{\"++\"}}| POST_DECREMENT -> {%{\"--\"}});
	public final PHP54TranslatorWalker.unaryPostOperator_return unaryPostOperator() throws RecognitionException {
		PHP54TranslatorWalker.unaryPostOperator_return retval = new PHP54TranslatorWalker.unaryPostOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:626:2: ( POST_INCREMENT -> {%{\"++\"}}| POST_DECREMENT -> {%{\"--\"}})
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==POST_INCREMENT) ) {
				alt70=1;
			}
			else if ( (LA70_0==POST_DECREMENT) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:626:4: POST_INCREMENT
					{
					match(input,POST_INCREMENT,FOLLOW_POST_INCREMENT_in_unaryPostOperator4245); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 626:19: -> {%{\"++\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"++");
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:627:8: POST_DECREMENT
					{
					match(input,POST_DECREMENT,FOLLOW_POST_DECREMENT_in_unaryPostOperator4258); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 627:23: -> {%{\"--\"}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:630:1: binaryOperator returns [boolean needParentheses] : ( 'or' | 'xor' | 'and' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' | '||' | '&&' | '|' | '^' | '&' | '==' | '!=' | '<>' | '===' | '!==' | '<' | '<=' | '>' | '>=' | '<<' | '>>' | '+' | '-' | '.' | '*' | '/' | '%' );
	public final PHP54TranslatorWalker.binaryOperator_return binaryOperator() throws RecognitionException {
		PHP54TranslatorWalker.binaryOperator_return retval = new PHP54TranslatorWalker.binaryOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:635:2: ( 'or' | 'xor' | 'and' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' | '||' | '&&' | '|' | '^' | '&' | '==' | '!=' | '<>' | '===' | '!==' | '<' | '<=' | '>' | '>=' | '<<' | '>>' | '+' | '-' | '.' | '*' | '/' | '%' )
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:682:1: castingOperator : ( ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression ) -> primitiveCast(isNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)| ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression ) -> cast(type=$TYPE_NAME.textexpression=$expression.st));
	public final PHP54TranslatorWalker.castingOperator_return castingOperator() throws RecognitionException {
		PHP54TranslatorWalker.castingOperator_return retval = new PHP54TranslatorWalker.castingOperator_return();
		retval.start = input.LT(1);

		ITSPHPAst isNullable=null;
		ITSPHPAst TYPE_NAME137=null;
		TreeRuleReturnScope type =null;
		TreeRuleReturnScope expression136 =null;
		TreeRuleReturnScope expression138 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:683:2: ( ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression ) -> primitiveCast(isNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)| ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression ) -> cast(type=$TYPE_NAME.textexpression=$expression.st))
			int alt78=2;
			int LA78_0 = input.LA(1);
			if ( (LA78_0==CASTING) ) {
				int LA78_1 = input.LA(2);
				if ( (LA78_1==DOWN) ) {
					int LA78_2 = input.LA(3);
					if ( (LA78_2==TYPE) ) {
						int LA78_3 = input.LA(4);
						if ( (LA78_3==DOWN) ) {
							int LA78_4 = input.LA(5);
							if ( (LA78_4==TYPE_MODIFIER) ) {
								switch ( input.LA(6) ) {
								case DOWN:
									{
									switch ( input.LA(7) ) {
									case Cast:
										{
										int LA78_9 = input.LA(8);
										if ( (LA78_9==QuestionMark) ) {
											int LA78_10 = input.LA(9);
											if ( (LA78_10==UP) ) {
												int LA78_11 = input.LA(10);
												if ( ((LA78_11 >= TypeArray && LA78_11 <= TypeInt)||LA78_11==TypeString) ) {
													alt78=1;
												}
												else if ( (LA78_11==TYPE_NAME) ) {
													alt78=2;
												}
												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 78, 11, input);
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
														new NoViableAltException("", 78, 10, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else if ( (LA78_9==UP) ) {
											int LA78_11 = input.LA(9);
											if ( ((LA78_11 >= TypeArray && LA78_11 <= TypeInt)||LA78_11==TypeString) ) {
												alt78=1;
											}
											else if ( (LA78_11==TYPE_NAME) ) {
												alt78=2;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 78, 11, input);
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
													new NoViableAltException("", 78, 9, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case QuestionMark:
										{
										int LA78_10 = input.LA(8);
										if ( (LA78_10==UP) ) {
											int LA78_11 = input.LA(9);
											if ( ((LA78_11 >= TypeArray && LA78_11 <= TypeInt)||LA78_11==TypeString) ) {
												alt78=1;
											}
											else if ( (LA78_11==TYPE_NAME) ) {
												alt78=2;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 78, 11, input);
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
													new NoViableAltException("", 78, 10, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case UP:
										{
										int LA78_11 = input.LA(8);
										if ( ((LA78_11 >= TypeArray && LA78_11 <= TypeInt)||LA78_11==TypeString) ) {
											alt78=1;
										}
										else if ( (LA78_11==TYPE_NAME) ) {
											alt78=2;
										}
										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 78, 11, input);
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
												new NoViableAltException("", 78, 6, input);
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
									alt78=1;
									}
									break;
								case TYPE_NAME:
									{
									alt78=2;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 78, 5, input);
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
										new NoViableAltException("", 78, 4, input);
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
									new NoViableAltException("", 78, 3, input);
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
								new NoViableAltException("", 78, 2, input);
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
							new NoViableAltException("", 78, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 78, 0, input);
				throw nvae;
			}
			switch (alt78) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:683:4: ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression )
					{
					match(input,CASTING,FOLLOW_CASTING_in_castingOperator4522); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_castingOperator4528); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:685:5: ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER )
					int alt73=2;
					int LA73_0 = input.LA(1);
					if ( (LA73_0==TYPE_MODIFIER) ) {
						int LA73_1 = input.LA(2);
						if ( (LA73_1==DOWN) ) {
							alt73=1;
						}
						else if ( ((LA73_1 >= TypeArray && LA73_1 <= TypeInt)||LA73_1==TypeString) ) {
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:685:7: ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? )
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator4538); if (state.failed) return retval;
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:685:23: ( Cast )?
								int alt71=2;
								int LA71_0 = input.LA(1);
								if ( (LA71_0==Cast) ) {
									alt71=1;
								}
								switch (alt71) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:685:23: Cast
										{
										match(input,Cast,FOLLOW_Cast_in_castingOperator4540); if (state.failed) return retval;
										}
										break;

								}

								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:685:29: (isNullable= '?' )?
								int alt72=2;
								int LA72_0 = input.LA(1);
								if ( (LA72_0==QuestionMark) ) {
									alt72=1;
								}
								switch (alt72) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:685:30: isNullable= '?'
										{
										isNullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_castingOperator4546); if (state.failed) return retval;
										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:686:7: TYPE_MODIFIER
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator4557); if (state.failed) return retval;
							}
							break;

					}

					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:688:5: (type= scalarTypes |type= arrayType )
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( ((LA74_0 >= TypeBool && LA74_0 <= TypeInt)||LA74_0==TypeString) ) {
						alt74=1;
					}
					else if ( (LA74_0==TypeArray) ) {
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:688:6: type= scalarTypes
							{
							pushFollow(FOLLOW_scalarTypes_in_castingOperator4572);
							type=scalarTypes();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:688:23: type= arrayType
							{
							pushFollow(FOLLOW_arrayType_in_castingOperator4576);
							type=arrayType();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					pushFollow(FOLLOW_expression_in_castingOperator4587);
					expression136=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 692:3: -> primitiveCast(isNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("primitiveCast",new STAttrMap().put("isNullable", isNullable!=null).put("type", (type!=null?((StringTemplate)type.getTemplate()):null)).put("expression", (expression136!=null?((StringTemplate)expression136.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:694:4: ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression )
					{
					match(input,CASTING,FOLLOW_CASTING_in_castingOperator4623); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_castingOperator4629); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:696:5: ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER )
					int alt77=2;
					int LA77_0 = input.LA(1);
					if ( (LA77_0==TYPE_MODIFIER) ) {
						int LA77_1 = input.LA(2);
						if ( (LA77_1==DOWN) ) {
							alt77=1;
						}
						else if ( (LA77_1==TYPE_NAME) ) {
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:696:7: ^( TYPE_MODIFIER ( Cast )? ( '?' )? )
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator4639); if (state.failed) return retval;
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:696:23: ( Cast )?
								int alt75=2;
								int LA75_0 = input.LA(1);
								if ( (LA75_0==Cast) ) {
									alt75=1;
								}
								switch (alt75) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:696:23: Cast
										{
										match(input,Cast,FOLLOW_Cast_in_castingOperator4641); if (state.failed) return retval;
										}
										break;

								}

								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:696:29: ( '?' )?
								int alt76=2;
								int LA76_0 = input.LA(1);
								if ( (LA76_0==QuestionMark) ) {
									alt76=1;
								}
								switch (alt76) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:696:29: '?'
										{
										match(input,QuestionMark,FOLLOW_QuestionMark_in_castingOperator4644); if (state.failed) return retval;
										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:697:7: TYPE_MODIFIER
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator4654); if (state.failed) return retval;
							}
							break;

					}

					TYPE_NAME137=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_castingOperator4666); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					pushFollow(FOLLOW_expression_in_castingOperator4676);
					expression138=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 703:3: -> cast(type=$TYPE_NAME.textexpression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("cast",new STAttrMap().put("type", (TYPE_NAME137!=null?TYPE_NAME137.getText():null)).put("expression", (expression138!=null?((StringTemplate)expression138.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:706:1: newOperator : ^( 'new' type= TYPE_NAME actualParameters ) -> new(type=$type.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.newOperator_return newOperator() throws RecognitionException {
		PHP54TranslatorWalker.newOperator_return retval = new PHP54TranslatorWalker.newOperator_return();
		retval.start = input.LT(1);

		ITSPHPAst type=null;
		TreeRuleReturnScope actualParameters139 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:707:2: ( ^( 'new' type= TYPE_NAME actualParameters ) -> new(type=$type.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:707:4: ^( 'new' type= TYPE_NAME actualParameters )
			{
			match(input,New,FOLLOW_New_in_newOperator4709); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			type=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_newOperator4717); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_newOperator4723);
			actualParameters139=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 711:3: -> new(type=$type.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("new",new STAttrMap().put("type", (type!=null?type.getText():null)).put("parameters", (actualParameters139!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters139).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:714:1: actualParameters returns [List<Object> parameters] : ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS ) ;
	public final PHP54TranslatorWalker.actualParameters_return actualParameters() throws RecognitionException {
		PHP54TranslatorWalker.actualParameters_return retval = new PHP54TranslatorWalker.actualParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:715:2: ( ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS ) )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:715:4: ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:715:4: ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==ACTUAL_PARAMETERS) ) {
				int LA80_1 = input.LA(2);
				if ( (LA80_1==DOWN) ) {
					alt80=1;
				}
				else if ( (LA80_1==UP) ) {
					alt80=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 80, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}
			switch (alt80) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:715:6: ^( ACTUAL_PARAMETERS (params+= expression )+ )
					{
					match(input,ACTUAL_PARAMETERS,FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4761); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:715:32: (params+= expression )+
					int cnt79=0;
					loop79:
					do {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==ARRAY_ACCESS||(LA79_0 >= Assign && LA79_0 <= At)||(LA79_0 >= BitwiseAnd && LA79_0 <= Bool)||LA79_0==CASTING||LA79_0==CLASS_MEMBER_ACCESS||LA79_0==CLASS_STATIC_ACCESS||LA79_0==CONSTANT||LA79_0==Clone||(LA79_0 >= Divide && LA79_0 <= DivideAssign)||(LA79_0 >= Dot && LA79_0 <= DotAssign)||(LA79_0 >= Equal && LA79_0 <= Exit)||LA79_0==FUNCTION_CALL||LA79_0==Float||(LA79_0 >= GreaterEqualThan && LA79_0 <= GreaterThan)||LA79_0==Identical||(LA79_0 >= Instanceof && LA79_0 <= Int)||(LA79_0 >= LessEqualThan && LA79_0 <= METHOD_CALL_STATIC)||(LA79_0 >= Minus && LA79_0 <= MinusAssign)||(LA79_0 >= Modulo && LA79_0 <= MultiplyAssign)||(LA79_0 >= New && LA79_0 <= Null)||(LA79_0 >= POST_DECREMENT && LA79_0 <= PRE_INCREMENT)||(LA79_0 >= Plus && LA79_0 <= PlusAssign)||LA79_0==QuestionMark||(LA79_0 >= ShiftLeft && LA79_0 <= ShiftRightAssign)||LA79_0==String||LA79_0==This||LA79_0==TypeArray||LA79_0==UNARY_MINUS||LA79_0==VariableId) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:715:32: params+= expression
							{
							pushFollow(FOLLOW_expression_in_actualParameters4765);
							params=expression();
							state._fsp--;
							if (state.failed) return retval;
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt79 >= 1 ) break loop79;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(79, input);
								throw eee;
						}
						cnt79++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {retval.parameters =list_params;}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:716:5: ACTUAL_PARAMETERS
					{
					match(input,ACTUAL_PARAMETERS,FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4775); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:720:1: functionCall : ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters ) -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.functionCall_return functionCall() throws RecognitionException {
		PHP54TranslatorWalker.functionCall_return retval = new PHP54TranslatorWalker.functionCall_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters140 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:721:2: ( ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters ) -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:721:4: ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters )
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_functionCall4792); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			identifier=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_functionCall4796); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_functionCall4798);
			actualParameters140=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 722:3: -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("functionCall",new STAttrMap().put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters140!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters140).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:725:1: methodCall : ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters ) -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCall_return methodCall() throws RecognitionException {
		PHP54TranslatorWalker.methodCall_return retval = new PHP54TranslatorWalker.methodCall_return();
		retval.start = input.LT(1);

		ITSPHPAst callee=null;
		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters141 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:726:2: ( ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters ) -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:726:4: ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCall4828); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:726:18: (callee= This |callee= VariableId )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==This) ) {
				alt81=1;
			}
			else if ( (LA81_0==VariableId) ) {
				alt81=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}
			switch (alt81) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:726:19: callee= This
					{
					callee=(ITSPHPAst)match(input,This,FOLLOW_This_in_methodCall4833); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:726:31: callee= VariableId
					{
					callee=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_methodCall4837); if (state.failed) return retval;
					}
					break;

			}

			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCall4842); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCall4844);
			actualParameters141=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 727:3: -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCall",new STAttrMap().put("callee", (callee!=null?callee.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters141!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters141).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:730:1: methodCallSelfOrParent : ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters ) -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCallSelfOrParent_return methodCallSelfOrParent() throws RecognitionException {
		PHP54TranslatorWalker.methodCallSelfOrParent_return retval = new PHP54TranslatorWalker.methodCallSelfOrParent_return();
		retval.start = input.LT(1);

		ITSPHPAst callee=null;
		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters142 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:731:2: ( ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters ) -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:731:4: ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCallSelfOrParent4878); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:731:18: (callee= Self |callee= Parent )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==Self) ) {
				alt82=1;
			}
			else if ( (LA82_0==Parent) ) {
				alt82=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}
			switch (alt82) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:731:19: callee= Self
					{
					callee=(ITSPHPAst)match(input,Self,FOLLOW_Self_in_methodCallSelfOrParent4883); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:731:31: callee= Parent
					{
					callee=(ITSPHPAst)match(input,Parent,FOLLOW_Parent_in_methodCallSelfOrParent4887); if (state.failed) return retval;
					}
					break;

			}

			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCallSelfOrParent4892); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCallSelfOrParent4894);
			actualParameters142=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 732:3: -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCallStatic",new STAttrMap().put("callee", (callee!=null?callee.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters142!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters142).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:735:1: methodCallStatic : ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters ) -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCallStatic_return methodCallStatic() throws RecognitionException {
		PHP54TranslatorWalker.methodCallStatic_return retval = new PHP54TranslatorWalker.methodCallStatic_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		ITSPHPAst TYPE_NAME143=null;
		TreeRuleReturnScope actualParameters144 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:736:2: ( ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters ) -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:736:4: ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL_STATIC,FOLLOW_METHOD_CALL_STATIC_in_methodCallStatic4928); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			TYPE_NAME143=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_methodCallStatic4930); if (state.failed) return retval;
			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCallStatic4934); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCallStatic4936);
			actualParameters144=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 737:3: -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCallStatic",new STAttrMap().put("callee", (TYPE_NAME143!=null?TYPE_NAME143.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters144!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters144).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:740:1: classStaticAccess : ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) ) -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text);
	public final PHP54TranslatorWalker.classStaticAccess_return classStaticAccess() throws RecognitionException {
		PHP54TranslatorWalker.classStaticAccess_return retval = new PHP54TranslatorWalker.classStaticAccess_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope staticAccess145 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:741:2: ( ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) ) -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:741:4: ^( CLASS_STATIC_ACCESS staticAccess (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT ) )
			{
			match(input,CLASS_STATIC_ACCESS,FOLLOW_CLASS_STATIC_ACCESS_in_classStaticAccess4971); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_staticAccess_in_classStaticAccess4973);
			staticAccess145=staticAccess();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:741:39: (identifier= CLASS_STATIC_ACCESS_VARIABLE_ID |identifier= CONSTANT )
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==CLASS_STATIC_ACCESS_VARIABLE_ID) ) {
				alt83=1;
			}
			else if ( (LA83_0==CONSTANT) ) {
				alt83=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:741:40: identifier= CLASS_STATIC_ACCESS_VARIABLE_ID
					{
					identifier=(ITSPHPAst)match(input,CLASS_STATIC_ACCESS_VARIABLE_ID,FOLLOW_CLASS_STATIC_ACCESS_VARIABLE_ID_in_classStaticAccess4978); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:741:83: identifier= CONSTANT
					{
					identifier=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_classStaticAccess4982); if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 742:3: -> classMemberAccessStatic(accessor=$staticAccess.stidentifier=$identifier.text)
			  {
			  	retval.st = templateLib.getInstanceOf("classMemberAccessStatic",new STAttrMap().put("accessor", (staticAccess145!=null?((StringTemplate)staticAccess145.getTemplate()):null)).put("identifier", (identifier!=null?identifier.getText():null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:745:1: postFixExpression : ( ^( CLASS_MEMBER_ACCESS expression Identifier ) -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)| ^( ARRAY_ACCESS expr= expression index= expression ) -> arrayAccess(expression=$expr.stindex=$index.st)| ^( METHOD_CALL_POSTFIX expression Identifier actualParameters ) -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters));
	public final PHP54TranslatorWalker.postFixExpression_return postFixExpression() throws RecognitionException {
		PHP54TranslatorWalker.postFixExpression_return retval = new PHP54TranslatorWalker.postFixExpression_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier147=null;
		ITSPHPAst Identifier149=null;
		TreeRuleReturnScope expr =null;
		TreeRuleReturnScope index =null;
		TreeRuleReturnScope expression146 =null;
		TreeRuleReturnScope expression148 =null;
		TreeRuleReturnScope actualParameters150 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:746:2: ( ^( CLASS_MEMBER_ACCESS expression Identifier ) -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)| ^( ARRAY_ACCESS expr= expression index= expression ) -> arrayAccess(expression=$expr.stindex=$index.st)| ^( METHOD_CALL_POSTFIX expression Identifier actualParameters ) -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters))
			int alt84=3;
			switch ( input.LA(1) ) {
			case CLASS_MEMBER_ACCESS:
				{
				alt84=1;
				}
				break;
			case ARRAY_ACCESS:
				{
				alt84=2;
				}
				break;
			case METHOD_CALL_POSTFIX:
				{
				alt84=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:746:4: ^( CLASS_MEMBER_ACCESS expression Identifier )
					{
					match(input,CLASS_MEMBER_ACCESS,FOLLOW_CLASS_MEMBER_ACCESS_in_postFixExpression5013); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression5015);
					expression146=expression();
					state._fsp--;
					if (state.failed) return retval;
					Identifier147=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_postFixExpression5017); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 746:52: -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)
					  {
					  	retval.st = templateLib.getInstanceOf("classMemberAccess",new STAttrMap().put("expression", (expression146!=null?((StringTemplate)expression146.getTemplate()):null)).put("identifier", (Identifier147!=null?Identifier147.getText():null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:747:4: ^( ARRAY_ACCESS expr= expression index= expression )
					{
					match(input,ARRAY_ACCESS,FOLLOW_ARRAY_ACCESS_in_postFixExpression5041); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression5045);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression5049);
					index=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 747:54: -> arrayAccess(expression=$expr.stindex=$index.st)
					  {
					  	retval.st = templateLib.getInstanceOf("arrayAccess",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)).put("index", (index!=null?((StringTemplate)index.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:748:4: ^( METHOD_CALL_POSTFIX expression Identifier actualParameters )
					{
					match(input,METHOD_CALL_POSTFIX,FOLLOW_METHOD_CALL_POSTFIX_in_postFixExpression5071); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_postFixExpression5073);
					expression148=expression();
					state._fsp--;
					if (state.failed) return retval;
					Identifier149=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_postFixExpression5075); if (state.failed) return retval;
					pushFollow(FOLLOW_actualParameters_in_postFixExpression5077);
					actualParameters150=actualParameters();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 748:66: -> postFixCall(expression=$expression.stidentifier=$Identifier.textparameters=$actualParameters.parameters)
					  {
					  	retval.st = templateLib.getInstanceOf("postFixCall",new STAttrMap().put("expression", (expression148!=null?((StringTemplate)expression148.getTemplate()):null)).put("identifier", (Identifier149!=null?Identifier149.getText():null)).put("parameters", (actualParameters150!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters150).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:751:1: exit : ( ^( 'exit' ( expression )? ) -> exit(expression=$expression.st)| Exit -> exit(expression=null));
	public final PHP54TranslatorWalker.exit_return exit() throws RecognitionException {
		PHP54TranslatorWalker.exit_return retval = new PHP54TranslatorWalker.exit_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope expression151 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:752:2: ( ^( 'exit' ( expression )? ) -> exit(expression=$expression.st)| Exit -> exit(expression=null))
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==Exit) ) {
				int LA86_1 = input.LA(2);
				if ( (LA86_1==DOWN) ) {
					alt86=1;
				}
				else if ( (LA86_1==UP||LA86_1==ARRAY_ACCESS||LA86_1==Arrow||(LA86_1 >= Assign && LA86_1 <= At)||LA86_1==BLOCK_CONDITIONAL||(LA86_1 >= BitwiseAnd && LA86_1 <= Bool)||LA86_1==CASTING||LA86_1==CLASS_MEMBER_ACCESS||LA86_1==CLASS_STATIC_ACCESS||LA86_1==CONSTANT||LA86_1==Clone||LA86_1==Default||(LA86_1 >= Divide && LA86_1 <= DivideAssign)||(LA86_1 >= Dot && LA86_1 <= DotAssign)||(LA86_1 >= Equal && LA86_1 <= Exit)||LA86_1==FUNCTION_CALL||LA86_1==Float||(LA86_1 >= GreaterEqualThan && LA86_1 <= GreaterThan)||(LA86_1 >= Identical && LA86_1 <= Identifier)||(LA86_1 >= Instanceof && LA86_1 <= Int)||(LA86_1 >= LessEqualThan && LA86_1 <= METHOD_CALL_STATIC)||(LA86_1 >= Minus && LA86_1 <= MinusAssign)||(LA86_1 >= Modulo && LA86_1 <= MultiplyAssign)||(LA86_1 >= New && LA86_1 <= Null)||(LA86_1 >= POST_DECREMENT && LA86_1 <= PRE_INCREMENT)||(LA86_1 >= Plus && LA86_1 <= PlusAssign)||LA86_1==QuestionMark||LA86_1==SWITCH_CASES||(LA86_1 >= ShiftLeft && LA86_1 <= ShiftRightAssign)||LA86_1==String||(LA86_1 >= TYPE_NAME && LA86_1 <= This)||LA86_1==TypeArray||LA86_1==UNARY_MINUS||(LA86_1 >= VARIABLE_DECLARATION_LIST && LA86_1 <= VariableId)) ) {
					alt86=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 86, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:752:4: ^( 'exit' ( expression )? )
					{
					match(input,Exit,FOLLOW_Exit_in_exit5109); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:752:13: ( expression )?
						int alt85=2;
						int LA85_0 = input.LA(1);
						if ( (LA85_0==ARRAY_ACCESS||(LA85_0 >= Assign && LA85_0 <= At)||(LA85_0 >= BitwiseAnd && LA85_0 <= Bool)||LA85_0==CASTING||LA85_0==CLASS_MEMBER_ACCESS||LA85_0==CLASS_STATIC_ACCESS||LA85_0==CONSTANT||LA85_0==Clone||(LA85_0 >= Divide && LA85_0 <= DivideAssign)||(LA85_0 >= Dot && LA85_0 <= DotAssign)||(LA85_0 >= Equal && LA85_0 <= Exit)||LA85_0==FUNCTION_CALL||LA85_0==Float||(LA85_0 >= GreaterEqualThan && LA85_0 <= GreaterThan)||LA85_0==Identical||(LA85_0 >= Instanceof && LA85_0 <= Int)||(LA85_0 >= LessEqualThan && LA85_0 <= METHOD_CALL_STATIC)||(LA85_0 >= Minus && LA85_0 <= MinusAssign)||(LA85_0 >= Modulo && LA85_0 <= MultiplyAssign)||(LA85_0 >= New && LA85_0 <= Null)||(LA85_0 >= POST_DECREMENT && LA85_0 <= PRE_INCREMENT)||(LA85_0 >= Plus && LA85_0 <= PlusAssign)||LA85_0==QuestionMark||(LA85_0 >= ShiftLeft && LA85_0 <= ShiftRightAssign)||LA85_0==String||LA85_0==This||LA85_0==TypeArray||LA85_0==UNARY_MINUS||LA85_0==VariableId) ) {
							alt85=1;
						}
						switch (alt85) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:752:13: expression
								{
								pushFollow(FOLLOW_expression_in_exit5111);
								expression151=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 752:26: -> exit(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("exit",new STAttrMap().put("expression", (expression151!=null?((StringTemplate)expression151.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:753:4: Exit
					{
					match(input,Exit,FOLLOW_Exit_in_exit5127); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 753:12: -> exit(expression=null)
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
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:566:7: ( atom )
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:566:7: atom
		{
		pushFollow(FOLLOW_atom_in_synpred1_PHP54TranslatorWalker3499);
		atom();
		state._fsp--;
		if (state.failed) return ;
		}

	}
	// $ANTLR end synpred1_PHP54TranslatorWalker

	// $ANTLR start synpred7_PHP54TranslatorWalker
	public final void synpred7_PHP54TranslatorWalker_fragment() throws RecognitionException {
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:572:4: ( classStaticAccess )
		// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:572:4: classStaticAccess
		{
		pushFollow(FOLLOW_classStaticAccess_in_synpred7_PHP54TranslatorWalker3567);
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
	public static final BitSet FOLLOW_statement_in_namespaceBody134 = new BitSet(new long[]{0x2820408800800008L,0x00000000000881C0L,0x000025000C200020L});
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
	public static final BitSet FOLLOW_unaryPrimitiveAtom_in_constantAssignment701 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_primitiveAtomWithConstant_in_unaryPrimitiveAtom731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unaryPrimitiveAtom741 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_primitiveAtomWithConstant_in_unaryPrimitiveAtom743 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_in_classMemberDeclaration805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclarationList_in_classMemberDeclaration807 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_variableDeclarationList832 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_variableDeclarationList834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclarationList836 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList845 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_localVariableDeclarationList878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_localVariableDeclarationList885 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_localVariableDeclarationList887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_localVariableDeclarationList889 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_localVariableDeclaration_in_localVariableDeclarationList898 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier931 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_typeModifier935 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008001DL});
	public static final BitSet FOLLOW_QuestionMark_in_typeModifier940 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008000DL});
	public static final BitSet FOLLOW_variableModifier_in_typeModifier943 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier956 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier978 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_staticToken1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessModifier1044 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Protected_in_accessModifier1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_accessModifier1062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1078 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_variableDeclaration1080 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1099 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_localVariableDeclaration1117 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_localVariableDeclaration1121 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_localVariableDeclaration1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_allTypes1176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_allTypes1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypes1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypes1199 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypes1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypes1211 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesWithoutArray1233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypesWithoutArray1242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_abstractConstructDeclaration1261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractConstructDeclaration1268 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractConstructDeclaration1270 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractConstructDeclaration1277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractConstructDeclaration1279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractConstructDeclaration1281 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_abstractConstructDeclaration1287 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_abstractConstructDeclaration1292 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Construct_in_constructDeclaration1354 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_constructDeclaration1361 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_constructDeclaration1363 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_constructDeclaration1370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_constructDeclaration1372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_constructDeclaration1374 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_constructDeclaration1380 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_constructDeclaration1385 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1444 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1450 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractMethodDeclaration1459 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractMethodDeclaration1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractMethodDeclaration1463 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_abstractMethodDeclaration1472 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_abstractMethodDeclaration1476 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_abstractMethodDeclaration1482 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_abstractMethodDeclaration1487 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1554 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1558 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Abstract_in_abstractToken1584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_methodDeclaration1600 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_methodDeclaration1606 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_methodDeclaration1608 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_methodDeclaration1615 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_methodDeclaration1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_methodDeclaration1619 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1628 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_methodDeclaration1632 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration1638 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_methodDeclaration1643 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1738 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1762 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1844 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1856 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Final_in_finalToken1891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramDeclaration_in_formalParameters1930 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1966 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_paramDeclaration1973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_paramDeclaration1975 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_scalarAndResource_in_paramDeclaration1984 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_paramDeclaration1994 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeObject_in_paramDeclaration2002 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceType_in_paramDeclaration2012 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_parameterNormalOrOptional_in_paramDeclaration2028 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeArray_in_arrayType2067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_classInterfaceType2082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_scalarAndResource2098 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_scalarAndResource2107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional2126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_parameterNormalOrOptional2130 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional2139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block2156 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_block2160 = new BitSet(new long[]{0x2820400000800008L,0x00000000000080C0L,0x000024000C200020L});
	public static final BitSet FOLLOW_BLOCK_in_block2169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration2183 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_interfaceDeclaration2190 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Abstract_in_interfaceDeclaration2192 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration2198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extendsDeclaration_in_interfaceDeclaration2204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration2209 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTERFACE_BODY_in_interfaceBody2261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_interfaceBodyDefinition_in_interfaceBody2265 = new BitSet(new long[]{0x0000200800000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_INTERFACE_BODY_in_interfaceBody2281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBodyDefinition2301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceConstructDeclaration_in_interfaceBodyDefinition2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDefinition2319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_interfaceConstructDeclaration2337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_interfaceConstructDeclaration2344 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_interfaceConstructDeclaration2346 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_interfaceConstructDeclaration2353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_interfaceConstructDeclaration2355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_interfaceConstructDeclaration2357 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceConstructDeclaration2363 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_interfaceConstructDeclaration2368 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_interfaceMethodDeclaration2428 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_interfaceMethodDeclaration2434 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_interfaceMethodDeclaration2436 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_interfaceMethodDeclaration2443 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_interfaceMethodDeclaration2445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_interfaceMethodDeclaration2447 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodDeclaration2453 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaration2458 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_interfaceMethodDeclaration2463 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Function_in_functionDeclaration2514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FUNCTION_MODIFIER_in_functionDeclaration2520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_TYPE_in_functionDeclaration2526 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_functionDeclaration2528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclaration2530 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclaration2536 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclaration2541 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_functionDeclaration2546 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_localVariableDeclarationList_in_instruction2605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifCondition_in_instruction2615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_switchCondition_in_instruction2627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forLoop_in_instruction2638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreachLoop_in_instruction2650 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_instruction2662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_doWhileLoop_in_instruction2674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tryCatch_in_instruction2686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXPRESSION_in_instruction2699 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2701 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Return_in_instruction2718 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2720 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Throw_in_instruction2740 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2742 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Echo_in_instruction2761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2765 = new BitSet(new long[]{0x81980102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_Break_in_instruction2784 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_instruction2789 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Break_in_instruction2807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Continue_in_instruction2825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_instruction2830 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Continue_in_instruction2847 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_If_in_ifCondition2870 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_ifCondition2876 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_blockConditional_in_ifCondition2884 = new BitSet(new long[]{0x0000000000002008L});
	public static final BitSet FOLLOW_blockConditional_in_ifCondition2891 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BLOCK_CONDITIONAL_in_blockConditional2932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_blockConditional2936 = new BitSet(new long[]{0x2820400000800008L,0x00000000000080C0L,0x000024000C200020L});
	public static final BitSet FOLLOW_Switch_in_switchCondition2952 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_switchCondition2954 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_switchContent_in_switchCondition2958 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SWITCH_CASES_in_switchContent2986 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_caseLabel_in_switchContent2990 = new BitSet(new long[]{0x819A0102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_blockConditional_in_switchContent2994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_caseLabel3022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Default_in_caseLabel3037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_For_in_forLoop3054 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclarationList_in_forLoop3063 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3067 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3076 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_expressionList_in_forLoop3084 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_blockConditional_in_forLoop3090 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList3134 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expressionList3138 = new BitSet(new long[]{0x81980102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_EXPRESSION_LIST_in_expressionList3159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Foreach_in_foreachLoop3186 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_foreachLoop3192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_foreachLoop3212 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_foreachLoop3220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_foreachLoop3222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002700000000L});
	public static final BitSet FOLLOW_scalarTypes_in_foreachLoop3224 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3235 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_foreachLoop3258 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_foreachLoop3261 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_foreachLoop3263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_foreachLoop3265 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_foreachLoop3270 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_blockConditional_in_foreachLoop3277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_While_in_whileLoop3319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_whileLoop3321 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_blockConditional_in_whileLoop3323 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Do_in_doWhileLoop3350 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_blockConditional_in_doWhileLoop3352 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_doWhileLoop3354 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Try_in_tryCatch3381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_blockConditional_in_tryCatch3383 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_catchBlock_in_tryCatch3387 = new BitSet(new long[]{0x0000004000000008L});
	public static final BitSet FOLLOW_Catch_in_catchBlock3419 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_catchBlock3425 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_catchBlock3432 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_catchBlock3434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_catchBlock3436 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_catchBlock3443 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_blockConditional_in_catchBlock3453 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atom_in_expression3499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operator_in_expression3511 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_expression3525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_expression3536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallSelfOrParent_in_expression3547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallStatic_in_expression3557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classStaticAccess_in_expression3567 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixExpression_in_expression3576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exit_in_expression3585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveAtomWithConstant_in_atom3608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_atom3621 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayKeyValue_in_atom3625 = new BitSet(new long[]{0x81980102917F86A8L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_VariableId_in_atom3642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_This_in_atom3656 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Bool_in_primitiveAtomWithConstant3681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Int_in_primitiveAtomWithConstant3696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Float_in_primitiveAtomWithConstant3710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_primitiveAtomWithConstant3724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Null_in_primitiveAtomWithConstant3738 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_in_primitiveAtomWithConstant3752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_in_primitiveAtomWithConstant3766 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_staticAccess_in_primitiveAtomWithConstant3768 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_CONSTANT_in_primitiveAtomWithConstant3770 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue3800 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3804 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3808 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3828 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_staticAccess3845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccess3855 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccess3865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryPreOperator_in_operator3884 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3888 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unaryPostOperator_in_operator3917 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3921 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_binaryOperator_in_operator3950 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3954 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator3958 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QuestionMark_in_operator3992 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator3996 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator4000 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_operator4004 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_castingOperator_in_operator4035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_operator4052 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator4056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_operator4061 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_operator4065 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_newOperator_in_operator4093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_operator4114 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_operator4118 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_PRE_INCREMENT_in_unaryPreOperator4149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRE_DECREMENT_in_unaryPreOperator4162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_unaryPreOperator4176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_unaryPreOperator4191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicNot_in_unaryPreOperator4206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unaryPreOperator4221 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_INCREMENT_in_unaryPostOperator4245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_DECREMENT_in_unaryPostOperator4258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTING_in_castingOperator4522 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_castingOperator4528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator4538 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_castingOperator4540 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QuestionMark_in_castingOperator4546 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator4557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002780000000L});
	public static final BitSet FOLLOW_scalarTypes_in_castingOperator4572 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_castingOperator4576 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_castingOperator4587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CASTING_in_castingOperator4623 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_castingOperator4629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator4639 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_castingOperator4641 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QuestionMark_in_castingOperator4644 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator4654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_castingOperator4666 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_castingOperator4676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_New_in_newOperator4709 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_newOperator4717 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_newOperator4723 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4761 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_actualParameters4765 = new BitSet(new long[]{0x81980102917F8628L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_ACTUAL_PARAMETERS_in_actualParameters4775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_functionCall4792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_functionCall4796 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall4798 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_methodCall4828 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_This_in_methodCall4833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_methodCall4837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall4842 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall4844 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_methodCallSelfOrParent4878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Self_in_methodCallSelfOrParent4883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Parent_in_methodCallSelfOrParent4887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCallSelfOrParent4892 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCallSelfOrParent4894 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_STATIC_in_methodCallStatic4928 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_methodCallStatic4930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCallStatic4934 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCallStatic4936 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_in_classStaticAccess4971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_staticAccess_in_classStaticAccess4973 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_VARIABLE_ID_in_classStaticAccess4978 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONSTANT_in_classStaticAccess4982 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_ACCESS_in_postFixExpression5013 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression5015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_postFixExpression5017 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARRAY_ACCESS_in_postFixExpression5041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression5045 = new BitSet(new long[]{0x81980102917F8620L,0x6783E7B3FF862625L,0x0000084082178010L});
	public static final BitSet FOLLOW_expression_in_postFixExpression5049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_POSTFIX_in_postFixExpression5071 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression5073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_postFixExpression5075 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_postFixExpression5077 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Exit_in_exit5109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_exit5111 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Exit_in_exit5127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atom_in_synpred1_PHP54TranslatorWalker3499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classStaticAccess_in_synpred7_PHP54TranslatorWalker3567 = new BitSet(new long[]{0x0000000000000002L});
}
