// $ANTLR 3.x D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g 2013-03-06 17:25:46

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
			if (state.failed) return retval;
			if (list_n==null) list_n=new ArrayList<Object>();
			list_n.add(n.getTemplate());
			}

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 50:19: -> file(namespaces=$n)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:53:1: namespace : ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody ) -> namespace(name=namespaceNamebody=$namespaceBody.st);
	public final PHP54TranslatorWalker.namespace_return namespace() throws RecognitionException {
		PHP54TranslatorWalker.namespace_return retval = new PHP54TranslatorWalker.namespace_return();
		retval.start = input.LT(1);

		ITSPHPAst name=null;
		TreeRuleReturnScope namespaceBody1 =null;

		String namespaceName = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:55:2: ( ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody ) -> namespace(name=namespaceNamebody=$namespaceBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:55:4: ^( 'namespace' (name= TYPE_NAME | DEFAULT_NAMESPACE ) namespaceBody )
			{
			match(input,Namespace,FOLLOW_Namespace_in_namespace81); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:55:18: (name= TYPE_NAME | DEFAULT_NAMESPACE )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:55:19: name= TYPE_NAME
					{
					name=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_namespace86); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:55:34: DEFAULT_NAMESPACE
					{
					match(input,DEFAULT_NAMESPACE,FOLLOW_DEFAULT_NAMESPACE_in_namespace88); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_namespaceBody_in_namespace91);
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
			  // 62:4: -> namespace(name=namespaceNamebody=$namespaceBody.st)
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:66:4: ^( NAMESPACE_BODY (statements+= statement )* )
					{
					match(input,NAMESPACE_BODY,FOLLOW_NAMESPACE_BODY_in_namespaceBody126); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:66:31: (statements+= statement )*
						loop2:
						do {
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==CONSTANT_DECLARATION_LIST||LA2_0==Class||LA2_0==EXPRESSION||LA2_0==Echo||LA2_0==Function||LA2_0==Interface||LA2_0==Return||LA2_0==Throw||LA2_0==Use) ) {
								alt2=1;
							}

							switch (alt2) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:66:31: statements+= statement
								{
								pushFollow(FOLLOW_statement_in_namespaceBody130);
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
					  // 66:45: -> body(statements=$statements)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_statements));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:67:4: NAMESPACE_BODY
					{
					match(input,NAMESPACE_BODY,FOLLOW_NAMESPACE_BODY_in_namespaceBody146); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 67:19: -> body(statements=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:70:1: statement : ( useDeclarationList -> {$useDeclarationList.st}| definition -> {$definition.st}| instruction -> {$instruction.st});
	public final PHP54TranslatorWalker.statement_return statement() throws RecognitionException {
		PHP54TranslatorWalker.statement_return retval = new PHP54TranslatorWalker.statement_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope useDeclarationList2 =null;
		TreeRuleReturnScope definition3 =null;
		TreeRuleReturnScope instruction4 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:71:2: ( useDeclarationList -> {$useDeclarationList.st}| definition -> {$definition.st}| instruction -> {$instruction.st})
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
			case EXPRESSION:
			case Echo:
			case Return:
			case Throw:
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:71:4: useDeclarationList
					{
					pushFollow(FOLLOW_useDeclarationList_in_statement166);
					useDeclarationList2=useDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 71:23: -> {$useDeclarationList.st}
					  {
					  	retval.st = (useDeclarationList2!=null?((StringTemplate)useDeclarationList2.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:72:4: definition
					{
					pushFollow(FOLLOW_definition_in_statement175);
					definition3=definition();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 72:15: -> {$definition.st}
					  {
					  	retval.st = (definition3!=null?((StringTemplate)definition3.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:73:4: instruction
					{
					pushFollow(FOLLOW_instruction_in_statement184);
					instruction4=instruction();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 73:16: -> {$instruction.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:76:1: useDeclarationList : ^( 'use' ( useDeclaration )+ ) -> useDeclarationList(useDeclarations=$useDeclaration.st);
	public final PHP54TranslatorWalker.useDeclarationList_return useDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.useDeclarationList_return retval = new PHP54TranslatorWalker.useDeclarationList_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope useDeclaration5 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:77:2: ( ^( 'use' ( useDeclaration )+ ) -> useDeclarationList(useDeclarations=$useDeclaration.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:77:4: ^( 'use' ( useDeclaration )+ )
			{
			match(input,Use,FOLLOW_Use_in_useDeclarationList201); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:77:12: ( useDeclaration )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:77:12: useDeclaration
					{
					pushFollow(FOLLOW_useDeclaration_in_useDeclarationList203);
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
			  // 78:3: -> useDeclarationList(useDeclarations=$useDeclaration.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:81:1: useDeclaration : ^( USE_DECLARATION TYPE_NAME Identifier ) -> useDeclaration(type=$TYPE_NAMEalias=$Identifier);
	public final PHP54TranslatorWalker.useDeclaration_return useDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.useDeclaration_return retval = new PHP54TranslatorWalker.useDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME6=null;
		ITSPHPAst Identifier7=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:82:2: ( ^( USE_DECLARATION TYPE_NAME Identifier ) -> useDeclaration(type=$TYPE_NAMEalias=$Identifier))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:82:4: ^( USE_DECLARATION TYPE_NAME Identifier )
			{
			match(input,USE_DECLARATION,FOLLOW_USE_DECLARATION_in_useDeclaration229); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			TYPE_NAME6=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_useDeclaration231); if (state.failed) return retval;
			Identifier7=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_useDeclaration233); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 83:3: -> useDeclaration(type=$TYPE_NAMEalias=$Identifier)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:86:1: definition : ( classDeclaration -> {$classDeclaration.st}| interfaceDeclaration -> {$interfaceDeclaration.st}| functionDeclaration -> {$functionDeclaration.st}| constDeclarationList -> {$constDeclarationList.st});
	public final PHP54TranslatorWalker.definition_return definition() throws RecognitionException {
		PHP54TranslatorWalker.definition_return retval = new PHP54TranslatorWalker.definition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope classDeclaration8 =null;
		TreeRuleReturnScope interfaceDeclaration9 =null;
		TreeRuleReturnScope functionDeclaration10 =null;
		TreeRuleReturnScope constDeclarationList11 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:87:2: ( classDeclaration -> {$classDeclaration.st}| interfaceDeclaration -> {$interfaceDeclaration.st}| functionDeclaration -> {$functionDeclaration.st}| constDeclarationList -> {$constDeclarationList.st})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:87:4: classDeclaration
					{
					pushFollow(FOLLOW_classDeclaration_in_definition262);
					classDeclaration8=classDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 87:22: -> {$classDeclaration.st}
					  {
					  	retval.st = (classDeclaration8!=null?((StringTemplate)classDeclaration8.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:88:4: interfaceDeclaration
					{
					pushFollow(FOLLOW_interfaceDeclaration_in_definition272);
					interfaceDeclaration9=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 88:26: -> {$interfaceDeclaration.st}
					  {
					  	retval.st = (interfaceDeclaration9!=null?((StringTemplate)interfaceDeclaration9.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:89:4: functionDeclaration
					{
					pushFollow(FOLLOW_functionDeclaration_in_definition282);
					functionDeclaration10=functionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 89:25: -> {$functionDeclaration.st}
					  {
					  	retval.st = (functionDeclaration10!=null?((StringTemplate)functionDeclaration10.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:90:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_definition292);
					constDeclarationList11=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 90:26: -> {$constDeclarationList.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:93:1: classDeclaration : ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody ) -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st);
	public final PHP54TranslatorWalker.classDeclaration_return classDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.classDeclaration_return retval = new PHP54TranslatorWalker.classDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier13=null;
		TreeRuleReturnScope classModifier12 =null;
		TreeRuleReturnScope extendsDeclaration14 =null;
		TreeRuleReturnScope implementsDeclaration15 =null;
		TreeRuleReturnScope classBody16 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:94:2: ( ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody ) -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:94:4: ^( 'class' classModifier Identifier extendsDeclaration implementsDeclaration classBody )
			{
			match(input,Class,FOLLOW_Class_in_classDeclaration310); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_classModifier_in_classDeclaration312);
			classModifier12=classModifier();
			state._fsp--;
			if (state.failed) return retval;
			Identifier13=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_classDeclaration314); if (state.failed) return retval;
			pushFollow(FOLLOW_extendsDeclaration_in_classDeclaration316);
			extendsDeclaration14=extendsDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_implementsDeclaration_in_classDeclaration318);
			implementsDeclaration15=implementsDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_classBody_in_classDeclaration320);
			classBody16=classBody();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 95:3: -> class(modifier=$classModifier.stidentifier=$Identifierext=$extendsDeclaration.stimpl=$implementsDeclaration.stbody=$classBody.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:103:1: classModifier : ( ^( CLASS_MODIFIER list+= classModifierNames ) -> modifier(modifiers=$list)| CLASS_MODIFIER -> {null});
	public final PHP54TranslatorWalker.classModifier_return classModifier() throws RecognitionException {
		PHP54TranslatorWalker.classModifier_return retval = new PHP54TranslatorWalker.classModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:104:2: ( ^( CLASS_MODIFIER list+= classModifierNames ) -> modifier(modifiers=$list)| CLASS_MODIFIER -> {null})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:104:4: ^( CLASS_MODIFIER list+= classModifierNames )
					{
					match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_classModifier384); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_classModifierNames_in_classModifier388);
					list=classModifierNames();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 104:47: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:105:4: CLASS_MODIFIER
					{
					match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_classModifier403); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 105:19: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:108:1: classModifierNames : ( Final | Abstract );
	public final PHP54TranslatorWalker.classModifierNames_return classModifierNames() throws RecognitionException {
		PHP54TranslatorWalker.classModifierNames_return retval = new PHP54TranslatorWalker.classModifierNames_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:110:2: ( Final | Abstract )
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:114:1: extendsDeclaration : ( ^( 'extends' (identifiers+= TYPE_NAME )+ ) -> extends(identifiers=$identifiers)| 'extends' -> {null});
	public final PHP54TranslatorWalker.extendsDeclaration_return extendsDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.extendsDeclaration_return retval = new PHP54TranslatorWalker.extendsDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifiers=null;
		List<Object> list_identifiers=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:115:2: ( ^( 'extends' (identifiers+= TYPE_NAME )+ ) -> extends(identifiers=$identifiers)| 'extends' -> {null})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:115:4: ^( 'extends' (identifiers+= TYPE_NAME )+ )
					{
					match(input,Extends,FOLLOW_Extends_in_extendsDeclaration442); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:115:27: (identifiers+= TYPE_NAME )+
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:115:27: identifiers+= TYPE_NAME
							{
							identifiers=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_extendsDeclaration446); if (state.failed) return retval;
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
					  // 115:41: -> extends(identifiers=$identifiers)
					  {
					  	retval.st = templateLib.getInstanceOf("extends",new STAttrMap().put("identifiers", list_identifiers));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:116:4: 'extends'
					{
					match(input,Extends,FOLLOW_Extends_in_extendsDeclaration462); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 116:18: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:120:1: implementsDeclaration : ( ^( 'implements' (identifiers+= TYPE_NAME )+ ) -> impl(identifiers=$identifiers)| 'implements' -> {null});
	public final PHP54TranslatorWalker.implementsDeclaration_return implementsDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.implementsDeclaration_return retval = new PHP54TranslatorWalker.implementsDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifiers=null;
		List<Object> list_identifiers=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:121:2: ( ^( 'implements' (identifiers+= TYPE_NAME )+ ) -> impl(identifiers=$identifiers)| 'implements' -> {null})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:121:4: ^( 'implements' (identifiers+= TYPE_NAME )+ )
					{
					match(input,Implements,FOLLOW_Implements_in_implementsDeclaration483); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:121:30: (identifiers+= TYPE_NAME )+
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:121:30: identifiers+= TYPE_NAME
							{
							identifiers=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_implementsDeclaration487); if (state.failed) return retval;
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
					  // 121:44: -> impl(identifiers=$identifiers)
					  {
					  	retval.st = templateLib.getInstanceOf("impl",new STAttrMap().put("identifiers", list_identifiers));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:122:4: 'implements'
					{
					match(input,Implements,FOLLOW_Implements_in_implementsDeclaration503); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 122:21: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:125:1: classBody : ( ^( CLASS_BODY (def+= classBodyDefinition )* ) -> body(statements=$def)| CLASS_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.classBody_return classBody() throws RecognitionException {
		PHP54TranslatorWalker.classBody_return retval = new PHP54TranslatorWalker.classBody_return();
		retval.start = input.LT(1);

		List<Object> list_def=null;
		RuleReturnScope def = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:126:2: ( ^( CLASS_BODY (def+= classBodyDefinition )* ) -> body(statements=$def)| CLASS_BODY -> body(statements=null))
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:126:4: ^( CLASS_BODY (def+= classBodyDefinition )* )
					{
					match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_classBody524); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:126:20: (def+= classBodyDefinition )*
						loop12:
						do {
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==CLASS_MEMBER||LA12_0==CONSTANT_DECLARATION_LIST||LA12_0==Construct||LA12_0==METHOD_DECLARATION) ) {
								alt12=1;
							}

							switch (alt12) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:126:20: def+= classBodyDefinition
								{
								pushFollow(FOLLOW_classBodyDefinition_in_classBody528);
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
					  // 126:44: -> body(statements=$def)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_def));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:127:4: CLASS_BODY
					{
					match(input,CLASS_BODY,FOLLOW_CLASS_BODY_in_classBody544); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 127:15: -> body(statements=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:130:1: classBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| abstractConstructDeclaration -> {$abstractConstructDeclaration.st}| constructDeclaration -> {$constructDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st});
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
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:131:2: ( constDeclarationList -> {$constDeclarationList.st}| classMemberDeclaration -> {$classMemberDeclaration.st}| abstractConstructDeclaration -> {$abstractConstructDeclaration.st}| constructDeclaration -> {$constructDeclaration.st}| abstractMethodDeclaration -> {$abstractMethodDeclaration.st}| methodDeclaration -> {$methodDeclaration.st})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:131:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_classBodyDefinition565);
					constDeclarationList17=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 131:27: -> {$constDeclarationList.st}
					  {
					  	retval.st = (constDeclarationList17!=null?((StringTemplate)constDeclarationList17.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:132:4: classMemberDeclaration
					{
					pushFollow(FOLLOW_classMemberDeclaration_in_classBodyDefinition576);
					classMemberDeclaration18=classMemberDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 132:28: -> {$classMemberDeclaration.st}
					  {
					  	retval.st = (classMemberDeclaration18!=null?((StringTemplate)classMemberDeclaration18.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:133:4: abstractConstructDeclaration
					{
					pushFollow(FOLLOW_abstractConstructDeclaration_in_classBodyDefinition586);
					abstractConstructDeclaration19=abstractConstructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 133:34: -> {$abstractConstructDeclaration.st}
					  {
					  	retval.st = (abstractConstructDeclaration19!=null?((StringTemplate)abstractConstructDeclaration19.getTemplate()):null);
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:134:4: constructDeclaration
					{
					pushFollow(FOLLOW_constructDeclaration_in_classBodyDefinition596);
					constructDeclaration20=constructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 134:27: -> {$constructDeclaration.st}
					  {
					  	retval.st = (constructDeclaration20!=null?((StringTemplate)constructDeclaration20.getTemplate()):null);
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:135:4: abstractMethodDeclaration
					{
					pushFollow(FOLLOW_abstractMethodDeclaration_in_classBodyDefinition607);
					abstractMethodDeclaration21=abstractMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 135:31: -> {$abstractMethodDeclaration.st}
					  {
					  	retval.st = (abstractMethodDeclaration21!=null?((StringTemplate)abstractMethodDeclaration21.getTemplate()):null);
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:136:4: methodDeclaration
					{
					pushFollow(FOLLOW_methodDeclaration_in_classBodyDefinition617);
					methodDeclaration22=methodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 136:24: -> {$methodDeclaration.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:139:1: constDeclarationList : ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ ) -> const(identifiers=$identifiers);
	public final PHP54TranslatorWalker.constDeclarationList_return constDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.constDeclarationList_return retval = new PHP54TranslatorWalker.constDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_identifiers=null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:140:2: ( ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ ) -> const(identifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:140:4: ^( CONSTANT_DECLARATION_LIST ^( TYPE ^( TYPE_MODIFIER Public Static Final ) scalarTypes ) (identifiers+= constantAssignment )+ )
			{
			match(input,CONSTANT_DECLARATION_LIST,FOLLOW_CONSTANT_DECLARATION_LIST_in_constDeclarationList636); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_constDeclarationList643); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_constDeclarationList646); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,Public,FOLLOW_Public_in_constDeclarationList648); if (state.failed) return retval;
			match(input,Static,FOLLOW_Static_in_constDeclarationList650); if (state.failed) return retval;
			match(input,Final,FOLLOW_Final_in_constDeclarationList652); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_scalarTypes_in_constDeclarationList655);
			scalarTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:142:15: (identifiers+= constantAssignment )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:142:15: identifiers+= constantAssignment
					{
					pushFollow(FOLLOW_constantAssignment_in_constDeclarationList663);
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
			  // 144:3: -> const(identifiers=$identifiers)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:147:1: constantAssignment : ^( Identifier v= Int ) -> assign(id=$Identifiervalue=v);
	public final PHP54TranslatorWalker.constantAssignment_return constantAssignment() throws RecognitionException {
		PHP54TranslatorWalker.constantAssignment_return retval = new PHP54TranslatorWalker.constantAssignment_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst Identifier23=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:148:2: ( ^( Identifier v= Int ) -> assign(id=$Identifiervalue=v))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:148:4: ^( Identifier v= Int )
			{
			Identifier23=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_constantAssignment693); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_constantAssignment697); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 149:4: -> assign(id=$Identifiervalue=v)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:152:1: scalarTypes : ( 'bool' | 'int' | 'float' | 'string' );
	public final PHP54TranslatorWalker.scalarTypes_return scalarTypes() throws RecognitionException {
		PHP54TranslatorWalker.scalarTypes_return retval = new PHP54TranslatorWalker.scalarTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:154:2: ( 'bool' | 'int' | 'float' | 'string' )
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:160:1: classMemberDeclaration : ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st};
	public final PHP54TranslatorWalker.classMemberDeclaration_return classMemberDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.classMemberDeclaration_return retval = new PHP54TranslatorWalker.classMemberDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope variableDeclarationList24 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:161:2: ( ^( CLASS_MEMBER variableDeclarationList ) -> {$variableDeclarationList.st})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:161:4: ^( CLASS_MEMBER variableDeclarationList )
			{
			match(input,CLASS_MEMBER,FOLLOW_CLASS_MEMBER_in_classMemberDeclaration758); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_variableDeclarationList_in_classMemberDeclaration760);
			variableDeclarationList24=variableDeclarationList();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 161:44: -> {$variableDeclarationList.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:164:1: variableDeclarationList : ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers);
	public final PHP54TranslatorWalker.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclarationList_return retval = new PHP54TranslatorWalker.variableDeclarationList_return();
		retval.start = input.LT(1);

		List<Object> list_identifiers=null;
		TreeRuleReturnScope typeModifier25 =null;
		RuleReturnScope identifiers = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:165:2: ( ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ ) -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:165:4: ^( VARIABLE_DECLARATION_LIST ^( TYPE typeModifier allTypes ) (identifiers+= variableDeclaration )+ )
			{
			match(input,VARIABLE_DECLARATION_LIST,FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList777); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_variableDeclarationList784); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_variableDeclarationList786);
			typeModifier25=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_allTypes_in_variableDeclarationList788);
			allTypes();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:167:15: (identifiers+= variableDeclaration )+
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:167:15: identifiers+= variableDeclaration
					{
					pushFollow(FOLLOW_variableDeclaration_in_variableDeclarationList797);
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
			  // 169:3: -> variableDeclarationList(modifier=$typeModifier.stidentifiers=$identifiers)
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


	public static class typeModifier_return extends TreeRuleReturnScope {
		public boolean isCast;
		public boolean isNullable;
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "typeModifier"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:172:1: typeModifier returns [boolean isCast, boolean isNullable] : ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null});
	public final PHP54TranslatorWalker.typeModifier_return typeModifier() throws RecognitionException {
		PHP54TranslatorWalker.typeModifier_return retval = new PHP54TranslatorWalker.typeModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst cast=null;
		ITSPHPAst nullable=null;
		TreeRuleReturnScope variableModifier26 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:2: ( ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? ) -> {$variableModifier.st}| TYPE_MODIFIER -> {null})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:4: ^( TYPE_MODIFIER (cast= Cast )? (nullable= '?' )? ( variableModifier )? )
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier833); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:24: (cast= Cast )?
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==Cast) ) {
							alt17=1;
						}
						switch (alt17) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:24: cast= Cast
								{
								cast=(ITSPHPAst)match(input,Cast,FOLLOW_Cast_in_typeModifier837); if (state.failed) return retval;
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:39: (nullable= '?' )?
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==QuestionMark) ) {
							alt18=1;
						}
						switch (alt18) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:39: nullable= '?'
								{
								nullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_typeModifier842); if (state.failed) return retval;
								}
								break;

						}

						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:45: ( variableModifier )?
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==Private||(LA19_0 >= Protected && LA19_0 <= Public)||LA19_0==Static) ) {
							alt19=1;
						}
						switch (alt19) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:173:45: variableModifier
								{
								pushFollow(FOLLOW_variableModifier_in_typeModifier845);
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
					  // 173:114: -> {$variableModifier.st}
					  {
					  	retval.st = (variableModifier26!=null?((StringTemplate)variableModifier26.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:174:4: TYPE_MODIFIER
					{
					match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_typeModifier858); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 174:18: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:177:1: variableModifier : (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st});
	public final PHP54TranslatorWalker.variableModifier_return variableModifier() throws RecognitionException {
		PHP54TranslatorWalker.variableModifier_return retval = new PHP54TranslatorWalker.variableModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		TreeRuleReturnScope accessModifier27 =null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:178:2: (list+= staticToken list+= accessModifier -> modifier(modifiers=$list)|list+= accessModifier list+= staticToken -> modifier(modifiers=$list)| accessModifier -> {$accessModifier.st})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:178:4: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_variableModifier876);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_variableModifier880);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 178:43: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:179:4: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier896);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_variableModifier900);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 179:43: -> modifier(modifiers=$list)
					  {
					  	retval.st = templateLib.getInstanceOf("modifier",new STAttrMap().put("modifiers", list_list));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:180:4: accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_variableModifier914);
					accessModifier27=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 180:19: -> {$accessModifier.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:183:1: staticToken : Static -> {%{$Static.text}};
	public final PHP54TranslatorWalker.staticToken_return staticToken() throws RecognitionException {
		PHP54TranslatorWalker.staticToken_return retval = new PHP54TranslatorWalker.staticToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Static28=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:184:2: ( Static -> {%{$Static.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:184:4: Static
			{
			Static28=(ITSPHPAst)match(input,Static,FOLLOW_Static_in_staticToken930); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 184:11: -> {%{$Static.text}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:187:1: accessModifier : ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}});
	public final PHP54TranslatorWalker.accessModifier_return accessModifier() throws RecognitionException {
		PHP54TranslatorWalker.accessModifier_return retval = new PHP54TranslatorWalker.accessModifier_return();
		retval.start = input.LT(1);

		ITSPHPAst Private29=null;
		ITSPHPAst Protected30=null;
		ITSPHPAst Public31=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:188:2: ( Private -> {%{$Private.text}}| Protected -> {%{$Protected.text}}| Public -> {%{$Public.text}})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:188:4: Private
					{
					Private29=(ITSPHPAst)match(input,Private,FOLLOW_Private_in_accessModifier946); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 188:12: -> {%{$Private.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Private29!=null?Private29.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:189:4: Protected
					{
					Protected30=(ITSPHPAst)match(input,Protected,FOLLOW_Protected_in_accessModifier955); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 189:14: -> {%{$Protected.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Protected30!=null?Protected30.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:190:4: Public
					{
					Public31=(ITSPHPAst)match(input,Public,FOLLOW_Public_in_accessModifier964); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 190:11: -> {%{$Public.text}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:193:1: variableDeclaration : ( ^( VariableId v= Int ) -> assign(id=$VariableIdvalue=v)| VariableId -> {%{$VariableId.text}});
	public final PHP54TranslatorWalker.variableDeclaration_return variableDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.variableDeclaration_return retval = new PHP54TranslatorWalker.variableDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst VariableId32=null;
		ITSPHPAst VariableId33=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:194:2: ( ^( VariableId v= Int ) -> assign(id=$VariableIdvalue=v)| VariableId -> {%{$VariableId.text}})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:194:4: ^( VariableId v= Int )
					{
					VariableId32=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration981); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_variableDeclaration985); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 194:24: -> assign(id=$VariableIdvalue=v)
					  {
					  	retval.st = templateLib.getInstanceOf("assign",new STAttrMap().put("id", VariableId32).put("value", v));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:195:4: VariableId
					{
					VariableId33=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_variableDeclaration1004); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 195:15: -> {%{$VariableId.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(VariableId33!=null?VariableId33.getText():null));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:198:1: allTypes : ( primitiveTypes | TYPE_NAME );
	public final PHP54TranslatorWalker.allTypes_return allTypes() throws RecognitionException {
		PHP54TranslatorWalker.allTypes_return retval = new PHP54TranslatorWalker.allTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:199:2: ( primitiveTypes | TYPE_NAME )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:199:4: primitiveTypes
					{
					pushFollow(FOLLOW_primitiveTypes_in_allTypes1019);
					primitiveTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:200:4: TYPE_NAME
					{
					match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_allTypes1024); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:203:1: primitiveTypes : ( scalarTypes | TypeArray | TypeResource | TypeObject );
	public final PHP54TranslatorWalker.primitiveTypes_return primitiveTypes() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypes_return retval = new PHP54TranslatorWalker.primitiveTypes_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:204:2: ( scalarTypes | TypeArray | TypeResource | TypeObject )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:204:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypes1036);
					scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:205:4: TypeArray
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_primitiveTypes1042); if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:206:4: TypeResource
					{
					match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypes1048); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:207:4: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypes1054); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:210:1: primitiveTypesWithoutArray : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}});
	public final PHP54TranslatorWalker.primitiveTypesWithoutArray_return primitiveTypesWithoutArray() throws RecognitionException {
		PHP54TranslatorWalker.primitiveTypesWithoutArray_return retval = new PHP54TranslatorWalker.primitiveTypesWithoutArray_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource35=null;
		ITSPHPAst TypeObject36=null;
		TreeRuleReturnScope scalarTypes34 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:211:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}}| TypeObject -> {%{$TypeObject.text}})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:211:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1067);
					scalarTypes34=scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 211:16: -> {$scalarTypes.st}
					  {
					  	retval.st = (scalarTypes34!=null?((StringTemplate)scalarTypes34.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:212:4: TypeResource
					{
					TypeResource35=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_primitiveTypesWithoutArray1076); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 212:17: -> {%{$TypeResource.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TypeResource35!=null?TypeResource35.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:213:4: TypeObject
					{
					TypeObject36=(ITSPHPAst)match(input,TypeObject,FOLLOW_TypeObject_in_primitiveTypesWithoutArray1085); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 213:15: -> {%{$TypeObject.text}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:216:1: abstractConstructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.abstractConstructDeclaration_return abstractConstructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractConstructDeclaration_return retval = new PHP54TranslatorWalker.abstractConstructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope abstractMethodModifier37 =null;
		TreeRuleReturnScope formalParameters38 =null;
		TreeRuleReturnScope block39 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:217:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:217:4: ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_abstractConstructDeclaration1104); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractConstructDeclaration1111); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractConstructDeclaration1113);
			abstractMethodModifier37=abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_abstractConstructDeclaration1120); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_abstractConstructDeclaration1122);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_abstractConstructDeclaration1124);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_abstractConstructDeclaration1130);
			formalParameters38=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_abstractConstructDeclaration1135);
			block39=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 223:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:231:1: constructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.constructDeclaration_return constructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.constructDeclaration_return retval = new PHP54TranslatorWalker.constructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope methodModifier40 =null;
		TreeRuleReturnScope formalParameters41 =null;
		TreeRuleReturnScope block42 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:232:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:232:4: ^(identifier= '__construct' ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_constructDeclaration1197); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_constructDeclaration1204); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_methodModifier_in_constructDeclaration1206);
			methodModifier40=methodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_constructDeclaration1213); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_constructDeclaration1215);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_constructDeclaration1217);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_constructDeclaration1223);
			formalParameters41=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_constructDeclaration1228);
			block42=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 238:3: -> method(modifier=$methodModifier.stidentifier=$identifierparams=$formalParameters.stbody=$block.instructions)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:246:1: abstractMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.abstractMethodDeclaration_return abstractMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodDeclaration_return retval = new PHP54TranslatorWalker.abstractMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope abstractMethodModifier43 =null;
		TreeRuleReturnScope formalParameters44 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:247:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK ) -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:247:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1287); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1293); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1295);
			abstractMethodModifier43=abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_abstractMethodDeclaration1302); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_abstractMethodDeclaration1304);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_abstractMethodDeclaration1306);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:250:4: (identfier= Identifier |identfier= Destruct )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:250:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_abstractMethodDeclaration1315); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:250:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_abstractMethodDeclaration1319); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_abstractMethodDeclaration1325);
			formalParameters44=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input,BLOCK,FOLLOW_BLOCK_in_abstractMethodDeclaration1330); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 254:3: -> abstractMethod(modifier=$abstractMethodModifier.stidentifier=$identfierparams=$formalParameters.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:261:1: abstractMethodModifier : (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.abstractMethodModifier_return abstractMethodModifier() throws RecognitionException {
		PHP54TranslatorWalker.abstractMethodModifier_return retval = new PHP54TranslatorWalker.abstractMethodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:262:2: ( (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:262:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:262:4: (list+= abstractToken list+= accessModifier |list+= accessModifier list+= abstractToken )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:262:6: list+= abstractToken list+= accessModifier
					{
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1384);
					list=abstractToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1388);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:263:5: list+= accessModifier list+= abstractToken
					{
					pushFollow(FOLLOW_accessModifier_in_abstractMethodModifier1397);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_abstractToken_in_abstractMethodModifier1401);
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
			  // 265:3: -> modifier(modifiers=$list)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:268:1: abstractToken : Abstract -> {%{$Abstract.text}};
	public final PHP54TranslatorWalker.abstractToken_return abstractToken() throws RecognitionException {
		PHP54TranslatorWalker.abstractToken_return retval = new PHP54TranslatorWalker.abstractToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Abstract45=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:269:2: ( Abstract -> {%{$Abstract.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:269:4: Abstract
			{
			Abstract45=(ITSPHPAst)match(input,Abstract,FOLLOW_Abstract_in_abstractToken1427); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 269:13: -> {%{$Abstract.text}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:272:1: methodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.methodDeclaration_return methodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.methodDeclaration_return retval = new PHP54TranslatorWalker.methodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identfier=null;
		TreeRuleReturnScope methodModifier46 =null;
		TreeRuleReturnScope formalParameters47 =null;
		TreeRuleReturnScope block48 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:273:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block ) -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:273:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER methodModifier ) ^( TYPE typeModifier returnType ) (identfier= Identifier |identfier= Destruct ) formalParameters block )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_methodDeclaration1443); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_methodDeclaration1449); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_methodModifier_in_methodDeclaration1451);
			methodModifier46=methodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_methodDeclaration1458); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_methodDeclaration1460);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_methodDeclaration1462);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:276:4: (identfier= Identifier |identfier= Destruct )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:276:5: identfier= Identifier
					{
					identfier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodDeclaration1471); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:276:26: identfier= Destruct
					{
					identfier=(ITSPHPAst)match(input,Destruct,FOLLOW_Destruct_in_methodDeclaration1475); if (state.failed) return retval;
					}
					break;

			}

			pushFollow(FOLLOW_formalParameters_in_methodDeclaration1481);
			formalParameters47=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_methodDeclaration1486);
			block48=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 280:3: -> method(modifier=$methodModifier.stidentifier=$identfierparams=$formalParameters.stbody=$block.instructions)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:288:1: methodModifier : (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list);
	public final PHP54TranslatorWalker.methodModifier_return methodModifier() throws RecognitionException {
		PHP54TranslatorWalker.methodModifier_return retval = new PHP54TranslatorWalker.methodModifier_return();
		retval.start = input.LT(1);

		List<Object> list_list=null;
		RuleReturnScope list = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:289:2: ( (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier ) -> modifier(modifiers=$list))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:289:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:289:4: (list+= staticToken list+= finalToken list+= accessModifier |list+= staticToken list+= accessModifier list+= finalToken |list+= staticToken list+= accessModifier |list+= finalToken list+= staticToken list+= accessModifier |list+= finalToken list+= accessModifier list+= staticToken |list+= finalToken list+= accessModifier |list+= accessModifier list+= finalToken list+= staticToken |list+= accessModifier list+= staticToken list+= finalToken |list+= accessModifier list+= staticToken |list+= accessModifier list+= finalToken |list+= accessModifier )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:289:6: list+= staticToken list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1547);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1551);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1556);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:290:5: list+= staticToken list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1564);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1568);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1573);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:291:5: list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_staticToken_in_methodModifier1581);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1585);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:293:5: list+= finalToken list+= staticToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1596);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1600);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1605);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:294:5: list+= finalToken list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1613);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1617);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1622);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:295:5: list+= finalToken list+= accessModifier
					{
					pushFollow(FOLLOW_finalToken_in_methodModifier1631);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_accessModifier_in_methodModifier1635);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:298:5: list+= accessModifier list+= finalToken list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1649);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1653);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1658);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:299:5: list+= accessModifier list+= staticToken list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1666);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1670);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1675);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:300:5: list+= accessModifier list+= staticToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1683);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_staticToken_in_methodModifier1687);
					list=staticToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:301:5: list+= accessModifier list+= finalToken
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1695);
					list=accessModifier();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					pushFollow(FOLLOW_finalToken_in_methodModifier1699);
					list=finalToken();
					state._fsp--;
					if (state.failed) return retval;
					if (list_list==null) list_list=new ArrayList<Object>();
					list_list.add(list.getTemplate());
					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:302:5: list+= accessModifier
					{
					pushFollow(FOLLOW_accessModifier_in_methodModifier1707);
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
			  // 304:3: -> modifier(modifiers=$list)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:307:1: finalToken : Final -> {%{$Final.text}};
	public final PHP54TranslatorWalker.finalToken_return finalToken() throws RecognitionException {
		PHP54TranslatorWalker.finalToken_return retval = new PHP54TranslatorWalker.finalToken_return();
		retval.start = input.LT(1);

		ITSPHPAst Final49=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:308:2: ( Final -> {%{$Final.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:308:4: Final
			{
			Final49=(ITSPHPAst)match(input,Final,FOLLOW_Final_in_finalToken1734); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 308:10: -> {%{$Final.text}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:311:1: returnType : ( allTypes | Void );
	public final PHP54TranslatorWalker.returnType_return returnType() throws RecognitionException {
		PHP54TranslatorWalker.returnType_return retval = new PHP54TranslatorWalker.returnType_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:312:2: ( allTypes | Void )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:312:4: allTypes
					{
					pushFollow(FOLLOW_allTypes_in_returnType1750);
					allTypes();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:313:4: Void
					{
					match(input,Void,FOLLOW_Void_in_returnType1755); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:316:1: formalParameters : ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null});
	public final PHP54TranslatorWalker.formalParameters_return formalParameters() throws RecognitionException {
		PHP54TranslatorWalker.formalParameters_return retval = new PHP54TranslatorWalker.formalParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:2: ( ^( PARAMETER_LIST (params+= paramDeclaration )+ ) -> parameterList(declarations=$params)| PARAMETER_LIST -> {null})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:4: ^( PARAMETER_LIST (params+= paramDeclaration )+ )
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1769); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:27: (params+= paramDeclaration )+
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:317:27: params+= paramDeclaration
							{
							pushFollow(FOLLOW_paramDeclaration_in_formalParameters1773);
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
					  // 317:48: -> parameterList(declarations=$params)
					  {
					  	retval.st = templateLib.getInstanceOf("parameterList",new STAttrMap().put("declarations", list_params));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:318:4: PARAMETER_LIST
					{
					match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_formalParameters1789); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 318:19: -> {null}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:321:1: paramDeclaration : ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue);
	public final PHP54TranslatorWalker.paramDeclaration_return paramDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.paramDeclaration_return retval = new PHP54TranslatorWalker.paramDeclaration_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope typeName =null;
		TreeRuleReturnScope typeModifier50 =null;
		TreeRuleReturnScope parameterNormalOrOptional51 =null;

		String defaultValue =null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:323:2: ( ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional ) -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:323:4: ^( PARAMETER_DECLARATION ^( TYPE typeModifier ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType ) ) parameterNormalOrOptional )
			{
			match(input,PARAMETER_DECLARATION,FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1809); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_paramDeclaration1816); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_paramDeclaration1818);
			typeModifier50=typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:325:5: ( scalarAndResource |typeName= arrayType | TypeObject |typeName= classInterfaceType )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:325:7: scalarAndResource
					{
					pushFollow(FOLLOW_scalarAndResource_in_paramDeclaration1827);
					scalarAndResource();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:326:7: typeName= arrayType
					{
					pushFollow(FOLLOW_arrayType_in_paramDeclaration1837);
					typeName=arrayType();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:327:7: TypeObject
					{
					match(input,TypeObject,FOLLOW_TypeObject_in_paramDeclaration1845); if (state.failed) return retval;
					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:328:7: typeName= classInterfaceType
					{
					pushFollow(FOLLOW_classInterfaceType_in_paramDeclaration1855);
					typeName=classInterfaceType();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

			}

			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_parameterNormalOrOptional_in_paramDeclaration1871);
			parameterNormalOrOptional51=parameterNormalOrOptional();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			if ( state.backtracking==0 ) {
					    defaultValue =  (typeModifier50!=null?((PHP54TranslatorWalker.typeModifier_return)typeModifier50).isNullable:false) && typeName!=null ? "null" : (parameterNormalOrOptional51!=null?((PHP54TranslatorWalker.parameterNormalOrOptional_return)parameterNormalOrOptional51).defaultValue:null);
					}
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 336:3: -> parameter(type=$typeName.textvariableId=$parameterNormalOrOptional.variableIddefaultValue=defaultValue)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:338:1: arrayType : TypeArray -> {%{$TypeArray.text}};
	public final PHP54TranslatorWalker.arrayType_return arrayType() throws RecognitionException {
		PHP54TranslatorWalker.arrayType_return retval = new PHP54TranslatorWalker.arrayType_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeArray52=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:339:2: ( TypeArray -> {%{$TypeArray.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:339:4: TypeArray
			{
			TypeArray52=(ITSPHPAst)match(input,TypeArray,FOLLOW_TypeArray_in_arrayType1910); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 339:14: -> {%{$TypeArray.text}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:342:1: classInterfaceType : TYPE_NAME -> {%{$TYPE_NAME.text}};
	public final PHP54TranslatorWalker.classInterfaceType_return classInterfaceType() throws RecognitionException {
		PHP54TranslatorWalker.classInterfaceType_return retval = new PHP54TranslatorWalker.classInterfaceType_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME53=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:343:2: ( TYPE_NAME -> {%{$TYPE_NAME.text}})
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:343:4: TYPE_NAME
			{
			TYPE_NAME53=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_classInterfaceType1925); if (state.failed) return retval;
			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 343:14: -> {%{$TYPE_NAME.text}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:346:1: scalarAndResource : ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}});
	public final PHP54TranslatorWalker.scalarAndResource_return scalarAndResource() throws RecognitionException {
		PHP54TranslatorWalker.scalarAndResource_return retval = new PHP54TranslatorWalker.scalarAndResource_return();
		retval.start = input.LT(1);

		ITSPHPAst TypeResource55=null;
		TreeRuleReturnScope scalarTypes54 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:347:2: ( scalarTypes -> {$scalarTypes.st}| TypeResource -> {%{$TypeResource.text}})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:347:4: scalarTypes
					{
					pushFollow(FOLLOW_scalarTypes_in_scalarAndResource1941);
					scalarTypes54=scalarTypes();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 347:16: -> {$scalarTypes.st}
					  {
					  	retval.st = (scalarTypes54!=null?((StringTemplate)scalarTypes54.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:348:4: TypeResource
					{
					TypeResource55=(ITSPHPAst)match(input,TypeResource,FOLLOW_TypeResource_in_scalarAndResource1950); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 348:17: -> {%{$TypeResource.text}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:351:1: parameterNormalOrOptional returns [String variableId,String defaultValue] : ( ^( VariableId v= Int ) | VariableId );
	public final PHP54TranslatorWalker.parameterNormalOrOptional_return parameterNormalOrOptional() throws RecognitionException {
		PHP54TranslatorWalker.parameterNormalOrOptional_return retval = new PHP54TranslatorWalker.parameterNormalOrOptional_return();
		retval.start = input.LT(1);

		ITSPHPAst v=null;
		ITSPHPAst VariableId56=null;
		ITSPHPAst VariableId57=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:352:2: ( ^( VariableId v= Int ) | VariableId )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:352:4: ^( VariableId v= Int )
					{
					VariableId56=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional1969); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					v=(ITSPHPAst)match(input,Int,FOLLOW_Int_in_parameterNormalOrOptional1973); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {retval.variableId =(VariableId56!=null?VariableId56.getText():null); retval.defaultValue =(v!=null?v.getText():null);}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:353:4: VariableId
					{
					VariableId57=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_parameterNormalOrOptional1982); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:356:1: block returns [List<Object> instructions] : ( ^( BLOCK (instr+= instruction )* ) | BLOCK );
	public final PHP54TranslatorWalker.block_return block() throws RecognitionException {
		PHP54TranslatorWalker.block_return retval = new PHP54TranslatorWalker.block_return();
		retval.start = input.LT(1);

		List<Object> list_instr=null;
		RuleReturnScope instr = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:357:2: ( ^( BLOCK (instr+= instruction )* ) | BLOCK )
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:357:4: ^( BLOCK (instr+= instruction )* )
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block1999); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:357:17: (instr+= instruction )*
						loop37:
						do {
							int alt37=2;
							int LA37_0 = input.LA(1);
							if ( (LA37_0==EXPRESSION||LA37_0==Echo||LA37_0==Return||LA37_0==Throw) ) {
								alt37=1;
							}

							switch (alt37) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:357:17: instr+= instruction
								{
								pushFollow(FOLLOW_instruction_in_block2003);
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:358:4: BLOCK
					{
					match(input,BLOCK,FOLLOW_BLOCK_in_block2012); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:361:1: interfaceDeclaration : ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody ) -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st);
	public final PHP54TranslatorWalker.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceDeclaration_return retval = new PHP54TranslatorWalker.interfaceDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier58=null;
		TreeRuleReturnScope extendsDeclaration59 =null;
		TreeRuleReturnScope interfaceBody60 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:362:2: ( ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody ) -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:362:4: ^( 'interface' ^( CLASS_MODIFIER Abstract ) Identifier extendsDeclaration interfaceBody )
			{
			match(input,Interface,FOLLOW_Interface_in_interfaceDeclaration2026); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,CLASS_MODIFIER,FOLLOW_CLASS_MODIFIER_in_interfaceDeclaration2033); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,Abstract,FOLLOW_Abstract_in_interfaceDeclaration2035); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier58=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_interfaceDeclaration2041); if (state.failed) return retval;
			pushFollow(FOLLOW_extendsDeclaration_in_interfaceDeclaration2047);
			extendsDeclaration59=extendsDeclaration();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration2052);
			interfaceBody60=interfaceBody();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 368:3: -> interface(identifier=$Identifierext=$extendsDeclaration.stbody=$interfaceBody.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:375:1: interfaceBody : ( ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* ) -> body(statements=$def)| INTERFACE_BODY -> body(statements=null));
	public final PHP54TranslatorWalker.interfaceBody_return interfaceBody() throws RecognitionException {
		PHP54TranslatorWalker.interfaceBody_return retval = new PHP54TranslatorWalker.interfaceBody_return();
		retval.start = input.LT(1);

		List<Object> list_def=null;
		RuleReturnScope def = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:376:2: ( ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* ) -> body(statements=$def)| INTERFACE_BODY -> body(statements=null))
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:376:4: ^( INTERFACE_BODY (def+= interfaceBodyDefinition )* )
					{
					match(input,INTERFACE_BODY,FOLLOW_INTERFACE_BODY_in_interfaceBody2104); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:376:24: (def+= interfaceBodyDefinition )*
						loop39:
						do {
							int alt39=2;
							int LA39_0 = input.LA(1);
							if ( (LA39_0==CONSTANT_DECLARATION_LIST||LA39_0==Construct||LA39_0==METHOD_DECLARATION) ) {
								alt39=1;
							}

							switch (alt39) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:376:24: def+= interfaceBodyDefinition
								{
								pushFollow(FOLLOW_interfaceBodyDefinition_in_interfaceBody2108);
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
					  // 376:52: -> body(statements=$def)
					  {
					  	retval.st = templateLib.getInstanceOf("body",new STAttrMap().put("statements", list_def));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:377:4: INTERFACE_BODY
					{
					match(input,INTERFACE_BODY,FOLLOW_INTERFACE_BODY_in_interfaceBody2124); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 377:19: -> body(statements=null)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:380:1: interfaceBodyDefinition : ( constDeclarationList -> {$constDeclarationList.st}| interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}| interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st});
	public final PHP54TranslatorWalker.interfaceBodyDefinition_return interfaceBodyDefinition() throws RecognitionException {
		PHP54TranslatorWalker.interfaceBodyDefinition_return retval = new PHP54TranslatorWalker.interfaceBodyDefinition_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope constDeclarationList61 =null;
		TreeRuleReturnScope interfaceConstructDeclaration62 =null;
		TreeRuleReturnScope interfaceMethodDeclaration63 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:381:2: ( constDeclarationList -> {$constDeclarationList.st}| interfaceConstructDeclaration -> {$interfaceConstructDeclaration.st}| interfaceMethodDeclaration -> {$interfaceMethodDeclaration.st})
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:381:4: constDeclarationList
					{
					pushFollow(FOLLOW_constDeclarationList_in_interfaceBodyDefinition2144);
					constDeclarationList61=constDeclarationList();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 381:25: -> {$constDeclarationList.st}
					  {
					  	retval.st = (constDeclarationList61!=null?((StringTemplate)constDeclarationList61.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:382:4: interfaceConstructDeclaration
					{
					pushFollow(FOLLOW_interfaceConstructDeclaration_in_interfaceBodyDefinition2153);
					interfaceConstructDeclaration62=interfaceConstructDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 382:34: -> {$interfaceConstructDeclaration.st}
					  {
					  	retval.st = (interfaceConstructDeclaration62!=null?((StringTemplate)interfaceConstructDeclaration62.getTemplate()):null);
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:383:4: interfaceMethodDeclaration
					{
					pushFollow(FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDefinition2162);
					interfaceMethodDeclaration63=interfaceMethodDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 383:31: -> {$interfaceMethodDeclaration.st}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:386:1: interfaceConstructDeclaration : ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.interfaceConstructDeclaration_return interfaceConstructDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceConstructDeclaration_return retval = new PHP54TranslatorWalker.interfaceConstructDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope formalParameters64 =null;
		TreeRuleReturnScope block65 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:387:2: ( ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block ) -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:387:4: ^(identifier= '__construct' ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) formalParameters block )
			{
			identifier=(ITSPHPAst)match(input,Construct,FOLLOW_Construct_in_interfaceConstructDeclaration2180); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_interfaceConstructDeclaration2187); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_interfaceConstructDeclaration2189);
			abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_interfaceConstructDeclaration2196); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_interfaceConstructDeclaration2198);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_interfaceConstructDeclaration2200);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			pushFollow(FOLLOW_formalParameters_in_interfaceConstructDeclaration2206);
			formalParameters64=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_interfaceConstructDeclaration2211);
			block65=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 393:3: -> abstractMethod(modifier=\"public\"identifier=$identifierparams=$formalParameters.stbody=$block.instructions)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:401:1: interfaceMethodDeclaration : ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st);
	public final PHP54TranslatorWalker.interfaceMethodDeclaration_return interfaceMethodDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.interfaceMethodDeclaration_return retval = new PHP54TranslatorWalker.interfaceMethodDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier66=null;
		TreeRuleReturnScope formalParameters67 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:402:2: ( ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK ) -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:402:4: ^( METHOD_DECLARATION ^( METHOD_MODIFIER abstractMethodModifier ) ^( TYPE typeModifier returnType ) Identifier formalParameters BLOCK )
			{
			match(input,METHOD_DECLARATION,FOLLOW_METHOD_DECLARATION_in_interfaceMethodDeclaration2271); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,METHOD_MODIFIER,FOLLOW_METHOD_MODIFIER_in_interfaceMethodDeclaration2277); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractMethodModifier_in_interfaceMethodDeclaration2279);
			abstractMethodModifier();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			match(input,TYPE,FOLLOW_TYPE_in_interfaceMethodDeclaration2286); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_interfaceMethodDeclaration2288);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_interfaceMethodDeclaration2290);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier66=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_interfaceMethodDeclaration2296); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameters_in_interfaceMethodDeclaration2301);
			formalParameters67=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input,BLOCK,FOLLOW_BLOCK_in_interfaceMethodDeclaration2306); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 409:3: -> abstractMethod(modifier=\"public\"identifier=$Identifierparams=$formalParameters.st)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:416:1: functionDeclaration : ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions);
	public final PHP54TranslatorWalker.functionDeclaration_return functionDeclaration() throws RecognitionException {
		PHP54TranslatorWalker.functionDeclaration_return retval = new PHP54TranslatorWalker.functionDeclaration_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier68=null;
		TreeRuleReturnScope formalParameters69 =null;
		TreeRuleReturnScope block70 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:417:2: ( ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block ) -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:417:4: ^( 'function' FUNCTION_MODIFIER ^( TYPE typeModifier returnType ) Identifier formalParameters block )
			{
			match(input,Function,FOLLOW_Function_in_functionDeclaration2357); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_functionDeclaration2363); if (state.failed) return retval;
			match(input,TYPE,FOLLOW_TYPE_in_functionDeclaration2369); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_typeModifier_in_functionDeclaration2371);
			typeModifier();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_returnType_in_functionDeclaration2373);
			returnType();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			Identifier68=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration2379); if (state.failed) return retval;
			pushFollow(FOLLOW_formalParameters_in_functionDeclaration2384);
			formalParameters69=formalParameters();
			state._fsp--;
			if (state.failed) return retval;
			pushFollow(FOLLOW_block_in_functionDeclaration2389);
			block70=block();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 424:3: -> method(modifier=nullidentifier=$Identifierparams=$formalParameters.stbody=$block.instructions)
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:433:1: instruction : ( ^( EXPRESSION ( expression )? ) -> expression(expression=$expression.st)| ^( 'return' ( expression )? ) -> return(expression=$expression.st)| ^( 'throw' expression ) -> throw(expression=$expression.st)| ^( 'echo' (exprs+= expression )+ ) -> echo(expressions=$exprs));
	public final PHP54TranslatorWalker.instruction_return instruction() throws RecognitionException {
		PHP54TranslatorWalker.instruction_return retval = new PHP54TranslatorWalker.instruction_return();
		retval.start = input.LT(1);

		List<Object> list_exprs=null;
		TreeRuleReturnScope expression71 =null;
		TreeRuleReturnScope expression72 =null;
		TreeRuleReturnScope expression73 =null;
		RuleReturnScope exprs = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:434:2: ( ^( EXPRESSION ( expression )? ) -> expression(expression=$expression.st)| ^( 'return' ( expression )? ) -> return(expression=$expression.st)| ^( 'throw' expression ) -> throw(expression=$expression.st)| ^( 'echo' (exprs+= expression )+ ) -> echo(expressions=$exprs))
			int alt45=4;
			switch ( input.LA(1) ) {
			case EXPRESSION:
				{
				alt45=1;
				}
				break;
			case Return:
				{
				alt45=2;
				}
				break;
			case Throw:
				{
				alt45=3;
				}
				break;
			case Echo:
				{
				alt45=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:443:3: ^( EXPRESSION ( expression )? )
					{
					match(input,EXPRESSION,FOLLOW_EXPRESSION_in_instruction2468); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:443:16: ( expression )?
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( ((LA42_0 >= Assign && LA42_0 <= At)||(LA42_0 >= BitwiseAnd && LA42_0 <= Bool)||LA42_0==CASTING||LA42_0==CLASS_MEMBER_ACCESS||LA42_0==CLASS_STATIC_ACCESS||LA42_0==CONSTANT||LA42_0==Clone||(LA42_0 >= Divide && LA42_0 <= DivideAssign)||(LA42_0 >= Dot && LA42_0 <= DotAssign)||LA42_0==Equal||LA42_0==FUNCTION_CALL||LA42_0==Float||(LA42_0 >= GreaterEqualThan && LA42_0 <= GreaterThan)||LA42_0==Identical||(LA42_0 >= Instanceof && LA42_0 <= Int)||(LA42_0 >= LessEqualThan && LA42_0 <= METHOD_CALL)||LA42_0==METHOD_CALL_STATIC||(LA42_0 >= Minus && LA42_0 <= MinusAssign)||(LA42_0 >= Modulo && LA42_0 <= MultiplyAssign)||(LA42_0 >= New && LA42_0 <= Null)||(LA42_0 >= POST_DECREMENT && LA42_0 <= PRE_INCREMENT)||(LA42_0 >= Plus && LA42_0 <= PlusAssign)||LA42_0==QuestionMark||(LA42_0 >= ShiftLeft && LA42_0 <= ShiftRightAssign)||LA42_0==String||LA42_0==TypeArray||LA42_0==UNARY_MINUS||LA42_0==VariableId) ) {
							alt42=1;
						}
						switch (alt42) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:443:16: expression
								{
								pushFollow(FOLLOW_expression_in_instruction2470);
								expression71=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 443:29: -> expression(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("expression",new STAttrMap().put("expression", (expression71!=null?((StringTemplate)expression71.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:444:4: ^( 'return' ( expression )? )
					{
					match(input,Return,FOLLOW_Return_in_instruction2487); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:444:15: ( expression )?
						int alt43=2;
						int LA43_0 = input.LA(1);
						if ( ((LA43_0 >= Assign && LA43_0 <= At)||(LA43_0 >= BitwiseAnd && LA43_0 <= Bool)||LA43_0==CASTING||LA43_0==CLASS_MEMBER_ACCESS||LA43_0==CLASS_STATIC_ACCESS||LA43_0==CONSTANT||LA43_0==Clone||(LA43_0 >= Divide && LA43_0 <= DivideAssign)||(LA43_0 >= Dot && LA43_0 <= DotAssign)||LA43_0==Equal||LA43_0==FUNCTION_CALL||LA43_0==Float||(LA43_0 >= GreaterEqualThan && LA43_0 <= GreaterThan)||LA43_0==Identical||(LA43_0 >= Instanceof && LA43_0 <= Int)||(LA43_0 >= LessEqualThan && LA43_0 <= METHOD_CALL)||LA43_0==METHOD_CALL_STATIC||(LA43_0 >= Minus && LA43_0 <= MinusAssign)||(LA43_0 >= Modulo && LA43_0 <= MultiplyAssign)||(LA43_0 >= New && LA43_0 <= Null)||(LA43_0 >= POST_DECREMENT && LA43_0 <= PRE_INCREMENT)||(LA43_0 >= Plus && LA43_0 <= PlusAssign)||LA43_0==QuestionMark||(LA43_0 >= ShiftLeft && LA43_0 <= ShiftRightAssign)||LA43_0==String||LA43_0==TypeArray||LA43_0==UNARY_MINUS||LA43_0==VariableId) ) {
							alt43=1;
						}
						switch (alt43) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:444:15: expression
								{
								pushFollow(FOLLOW_expression_in_instruction2489);
								expression72=expression();
								state._fsp--;
								if (state.failed) return retval;
								}
								break;

						}

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 444:28: -> return(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("return",new STAttrMap().put("expression", (expression72!=null?((StringTemplate)expression72.getTemplate()):null)));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:445:4: ^( 'throw' expression )
					{
					match(input,Throw,FOLLOW_Throw_in_instruction2508); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_instruction2510);
					expression73=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 445:26: -> throw(expression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("throw",new STAttrMap().put("expression", (expression73!=null?((StringTemplate)expression73.getTemplate()):null)));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:446:4: ^( 'echo' (exprs+= expression )+ )
					{
					match(input,Echo,FOLLOW_Echo_in_instruction2528); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:446:18: (exprs+= expression )+
					int cnt44=0;
					loop44:
					do {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( ((LA44_0 >= Assign && LA44_0 <= At)||(LA44_0 >= BitwiseAnd && LA44_0 <= Bool)||LA44_0==CASTING||LA44_0==CLASS_MEMBER_ACCESS||LA44_0==CLASS_STATIC_ACCESS||LA44_0==CONSTANT||LA44_0==Clone||(LA44_0 >= Divide && LA44_0 <= DivideAssign)||(LA44_0 >= Dot && LA44_0 <= DotAssign)||LA44_0==Equal||LA44_0==FUNCTION_CALL||LA44_0==Float||(LA44_0 >= GreaterEqualThan && LA44_0 <= GreaterThan)||LA44_0==Identical||(LA44_0 >= Instanceof && LA44_0 <= Int)||(LA44_0 >= LessEqualThan && LA44_0 <= METHOD_CALL)||LA44_0==METHOD_CALL_STATIC||(LA44_0 >= Minus && LA44_0 <= MinusAssign)||(LA44_0 >= Modulo && LA44_0 <= MultiplyAssign)||(LA44_0 >= New && LA44_0 <= Null)||(LA44_0 >= POST_DECREMENT && LA44_0 <= PRE_INCREMENT)||(LA44_0 >= Plus && LA44_0 <= PlusAssign)||LA44_0==QuestionMark||(LA44_0 >= ShiftLeft && LA44_0 <= ShiftRightAssign)||LA44_0==String||LA44_0==TypeArray||LA44_0==UNARY_MINUS||LA44_0==VariableId) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:446:18: exprs+= expression
							{
							pushFollow(FOLLOW_expression_in_instruction2532);
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
					  // 446:33: -> echo(expressions=$exprs)
					  {
					  	retval.st = templateLib.getInstanceOf("echo",new STAttrMap().put("expressions", list_exprs));
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


	public static class expression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "expression"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:450:1: expression options {backtrack=true; } : ( primitiveAtomWithConstant -> {$primitiveAtomWithConstant.st}| ^( TypeArray (keyValuePairs+= arrayKeyValue )* ) -> array(content=$keyValuePairs)| VariableId -> {%{$VariableId.text}}| ^( CLASS_STATIC_ACCESS staticAccess CONSTANT ) -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text)| ^( unaryPreOperator expr= expression ) -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)| ^( unaryPostOperator expr= expression ) -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)| ^( binaryOperator left= expression right= expression ) -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.st)| ^( '?' cond= expression ifCase= expression elseCase= expression ) -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.st)| castingOperator -> {$castingOperator.st}| ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) ) -> instanceof(expression=$expr.sttype=$type.text)| newOperator -> {$newOperator.st}| ^( 'clone' expr= expression ) -> clone(expression=$expr.st)| functionCall -> {$functionCall.st}| methodCall -> {$methodCall.st}| methodCallSelfOrParent -> {$methodCallSelfOrParent.st}| methodCallStatic -> {$methodCallStatic.st}| postFixExpression -> {$postFixExpression.st});
	public final PHP54TranslatorWalker.expression_return expression() throws RecognitionException {
		PHP54TranslatorWalker.expression_return retval = new PHP54TranslatorWalker.expression_return();
		retval.start = input.LT(1);

		ITSPHPAst type=null;
		ITSPHPAst VariableId75=null;
		ITSPHPAst CONSTANT77=null;
		List<Object> list_keyValuePairs=null;
		TreeRuleReturnScope expr =null;
		TreeRuleReturnScope left =null;
		TreeRuleReturnScope right =null;
		TreeRuleReturnScope cond =null;
		TreeRuleReturnScope ifCase =null;
		TreeRuleReturnScope elseCase =null;
		TreeRuleReturnScope primitiveAtomWithConstant74 =null;
		TreeRuleReturnScope staticAccess76 =null;
		TreeRuleReturnScope unaryPreOperator78 =null;
		TreeRuleReturnScope unaryPostOperator79 =null;
		TreeRuleReturnScope binaryOperator80 =null;
		TreeRuleReturnScope castingOperator81 =null;
		TreeRuleReturnScope newOperator82 =null;
		TreeRuleReturnScope functionCall83 =null;
		TreeRuleReturnScope methodCall84 =null;
		TreeRuleReturnScope methodCallSelfOrParent85 =null;
		TreeRuleReturnScope methodCallStatic86 =null;
		TreeRuleReturnScope postFixExpression87 =null;
		RuleReturnScope keyValuePairs = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:452:2: ( primitiveAtomWithConstant -> {$primitiveAtomWithConstant.st}| ^( TypeArray (keyValuePairs+= arrayKeyValue )* ) -> array(content=$keyValuePairs)| VariableId -> {%{$VariableId.text}}| ^( CLASS_STATIC_ACCESS staticAccess CONSTANT ) -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text)| ^( unaryPreOperator expr= expression ) -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)| ^( unaryPostOperator expr= expression ) -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)| ^( binaryOperator left= expression right= expression ) -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.st)| ^( '?' cond= expression ifCase= expression elseCase= expression ) -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.st)| castingOperator -> {$castingOperator.st}| ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) ) -> instanceof(expression=$expr.sttype=$type.text)| newOperator -> {$newOperator.st}| ^( 'clone' expr= expression ) -> clone(expression=$expr.st)| functionCall -> {$functionCall.st}| methodCall -> {$methodCall.st}| methodCallSelfOrParent -> {$methodCallSelfOrParent.st}| methodCallStatic -> {$methodCallStatic.st}| postFixExpression -> {$postFixExpression.st})
			int alt48=17;
			switch ( input.LA(1) ) {
			case Bool:
			case CONSTANT:
			case Float:
			case Int:
			case Null:
			case String:
				{
				alt48=1;
				}
				break;
			case TypeArray:
				{
				alt48=2;
				}
				break;
			case VariableId:
				{
				alt48=3;
				}
				break;
			case CLASS_STATIC_ACCESS:
				{
				alt48=4;
				}
				break;
			case At:
			case BitwiseNot:
			case LogicNot:
			case PRE_DECREMENT:
			case PRE_INCREMENT:
			case UNARY_MINUS:
				{
				alt48=5;
				}
				break;
			case POST_DECREMENT:
			case POST_INCREMENT:
				{
				alt48=6;
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
				alt48=7;
				}
				break;
			case QuestionMark:
				{
				alt48=8;
				}
				break;
			case CASTING:
				{
				alt48=9;
				}
				break;
			case Instanceof:
				{
				alt48=10;
				}
				break;
			case New:
				{
				alt48=11;
				}
				break;
			case Clone:
				{
				alt48=12;
				}
				break;
			case FUNCTION_CALL:
				{
				alt48=13;
				}
				break;
			case METHOD_CALL:
				{
				int LA48_14 = input.LA(2);
				if ( (LA48_14==DOWN) ) {
					int LA48_17 = input.LA(3);
					if ( (LA48_17==This||LA48_17==VariableId) ) {
						alt48=14;
					}
					else if ( (LA48_17==Parent||LA48_17==Self) ) {
						alt48=15;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++)
								input.consume();
							NoViableAltException nvae =
								new NoViableAltException("", 48, 17, input);
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
							new NoViableAltException("", 48, 14, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case METHOD_CALL_STATIC:
				{
				alt48=16;
				}
				break;
			case CLASS_MEMBER_ACCESS:
				{
				alt48=17;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:452:7: primitiveAtomWithConstant
					{
					pushFollow(FOLLOW_primitiveAtomWithConstant_in_expression2568);
					primitiveAtomWithConstant74=primitiveAtomWithConstant();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 452:38: -> {$primitiveAtomWithConstant.st}
					  {
					  	retval.st = (primitiveAtomWithConstant74!=null?((StringTemplate)primitiveAtomWithConstant74.getTemplate()):null);
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:453:4: ^( TypeArray (keyValuePairs+= arrayKeyValue )* )
					{
					match(input,TypeArray,FOLLOW_TypeArray_in_expression2583); if (state.failed) return retval;
					if ( input.LA(1)==Token.DOWN ) {
						match(input, Token.DOWN, null); if (state.failed) return retval;
						// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:453:29: (keyValuePairs+= arrayKeyValue )*
						loop46:
						do {
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==Arrow||(LA46_0 >= Assign && LA46_0 <= At)||(LA46_0 >= BitwiseAnd && LA46_0 <= Bool)||LA46_0==CASTING||LA46_0==CLASS_MEMBER_ACCESS||LA46_0==CLASS_STATIC_ACCESS||LA46_0==CONSTANT||LA46_0==Clone||(LA46_0 >= Divide && LA46_0 <= DivideAssign)||(LA46_0 >= Dot && LA46_0 <= DotAssign)||LA46_0==Equal||LA46_0==FUNCTION_CALL||LA46_0==Float||(LA46_0 >= GreaterEqualThan && LA46_0 <= GreaterThan)||LA46_0==Identical||(LA46_0 >= Instanceof && LA46_0 <= Int)||(LA46_0 >= LessEqualThan && LA46_0 <= METHOD_CALL)||LA46_0==METHOD_CALL_STATIC||(LA46_0 >= Minus && LA46_0 <= MinusAssign)||(LA46_0 >= Modulo && LA46_0 <= MultiplyAssign)||(LA46_0 >= New && LA46_0 <= Null)||(LA46_0 >= POST_DECREMENT && LA46_0 <= PRE_INCREMENT)||(LA46_0 >= Plus && LA46_0 <= PlusAssign)||LA46_0==QuestionMark||(LA46_0 >= ShiftLeft && LA46_0 <= ShiftRightAssign)||LA46_0==String||LA46_0==TypeArray||LA46_0==UNARY_MINUS||LA46_0==VariableId) ) {
								alt46=1;
							}

							switch (alt46) {
							case 1 :
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:453:29: keyValuePairs+= arrayKeyValue
								{
								pushFollow(FOLLOW_arrayKeyValue_in_expression2587);
								keyValuePairs=arrayKeyValue();
								state._fsp--;
								if (state.failed) return retval;
								if (list_keyValuePairs==null) list_keyValuePairs=new ArrayList<Object>();
								list_keyValuePairs.add(keyValuePairs.getTemplate());
								}
								break;

							default :
								break loop46;
							}
						} while (true);

						match(input, Token.UP, null); if (state.failed) return retval;
					}

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 453:49: -> array(content=$keyValuePairs)
					  {
					  	retval.st = templateLib.getInstanceOf("array",new STAttrMap().put("content", list_keyValuePairs));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:454:4: VariableId
					{
					VariableId75=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_expression2606); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 454:22: -> {%{$VariableId.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(VariableId75!=null?VariableId75.getText():null));
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:455:4: ^( CLASS_STATIC_ACCESS staticAccess CONSTANT )
					{
					match(input,CLASS_STATIC_ACCESS,FOLLOW_CLASS_STATIC_ACCESS_in_expression2623); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_staticAccess_in_expression2625);
					staticAccess76=staticAccess();
					state._fsp--;
					if (state.failed) return retval;
					CONSTANT77=(ITSPHPAst)match(input,CONSTANT,FOLLOW_CONSTANT_in_expression2627); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 455:54: -> classConstant(accessor=$staticAccess.stconstant=$CONSTANT.text)
					  {
					  	retval.st = templateLib.getInstanceOf("classConstant",new STAttrMap().put("accessor", (staticAccess76!=null?((StringTemplate)staticAccess76.getTemplate()):null)).put("constant", (CONSTANT77!=null?CONSTANT77.getText():null)));
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:456:4: ^( unaryPreOperator expr= expression )
					{
					pushFollow(FOLLOW_unaryPreOperator_in_expression2653);
					unaryPreOperator78=unaryPreOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2657);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 456:44: -> unaryPreOperator(operator=$unaryPreOperator.stexpression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPreOperator",new STAttrMap().put("operator", (unaryPreOperator78!=null?((StringTemplate)unaryPreOperator78.getTemplate()):null)).put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:457:4: ^( unaryPostOperator expr= expression )
					{
					pushFollow(FOLLOW_unaryPostOperator_in_expression2685);
					unaryPostOperator79=unaryPostOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2689);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 457:44: -> unaryPostOperator(operator=$unaryPostOperator.stexpression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("unaryPostOperator",new STAttrMap().put("operator", (unaryPostOperator79!=null?((StringTemplate)unaryPostOperator79.getTemplate()):null)).put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 7 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:458:4: ^( binaryOperator left= expression right= expression )
					{
					pushFollow(FOLLOW_binaryOperator_in_expression2717);
					binaryOperator80=binaryOperator();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2721);
					left=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2725);
					right=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 458:57: -> binaryOperator(operator=$binaryOperator.stleft=$left.stright=$right.st)
					  {
					  	retval.st = templateLib.getInstanceOf("binaryOperator",new STAttrMap().put("operator", (binaryOperator80!=null?((StringTemplate)binaryOperator80.getTemplate()):null)).put("left", (left!=null?((StringTemplate)left.getTemplate()):null)).put("right", (right!=null?((StringTemplate)right.getTemplate()):null)));
					  }


					}

					}
					break;
				case 8 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:459:4: ^( '?' cond= expression ifCase= expression elseCase= expression )
					{
					match(input,QuestionMark,FOLLOW_QuestionMark_in_expression2753); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2757);
					cond=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2761);
					ifCase=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2765);
					elseCase=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 459:66: -> ternaryOperator(cond=$cond.stifCase=$ifCase.stelseCase=$elseCase.st)
					  {
					  	retval.st = templateLib.getInstanceOf("ternaryOperator",new STAttrMap().put("cond", (cond!=null?((StringTemplate)cond.getTemplate()):null)).put("ifCase", (ifCase!=null?((StringTemplate)ifCase.getTemplate()):null)).put("elseCase", (elseCase!=null?((StringTemplate)elseCase.getTemplate()):null)));
					  }


					}

					}
					break;
				case 9 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:460:4: castingOperator
					{
					pushFollow(FOLLOW_castingOperator_in_expression2791);
					castingOperator81=castingOperator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 460:26: -> {$castingOperator.st}
					  {
					  	retval.st = (castingOperator81!=null?((StringTemplate)castingOperator81.getTemplate()):null);
					  }


					}

					}
					break;
				case 10 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:461:4: ^( Instanceof expr= expression (type= TYPE_NAME |type= VariableId ) )
					{
					match(input,Instanceof,FOLLOW_Instanceof_in_expression2807); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2811);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:461:33: (type= TYPE_NAME |type= VariableId )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==TYPE_NAME) ) {
						alt47=1;
					}
					else if ( (LA47_0==VariableId) ) {
						alt47=2;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 47, 0, input);
						throw nvae;
					}
					switch (alt47) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:461:34: type= TYPE_NAME
							{
							type=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_expression2816); if (state.failed) return retval;
							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:461:49: type= VariableId
							{
							type=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_expression2820); if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 461:68: -> instanceof(expression=$expr.sttype=$type.text)
					  {
					  	retval.st = templateLib.getInstanceOf("instanceof",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)).put("type", (type!=null?type.getText():null)));
					  }


					}

					}
					break;
				case 11 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:462:4: newOperator
					{
					pushFollow(FOLLOW_newOperator_in_expression2842);
					newOperator82=newOperator();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 462:22: -> {$newOperator.st}
					  {
					  	retval.st = (newOperator82!=null?((StringTemplate)newOperator82.getTemplate()):null);
					  }


					}

					}
					break;
				case 12 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:463:8: ^( 'clone' expr= expression )
					{
					match(input,Clone,FOLLOW_Clone_in_expression2862); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_expression2866);
					expr=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 463:39: -> clone(expression=$expr.st)
					  {
					  	retval.st = templateLib.getInstanceOf("clone",new STAttrMap().put("expression", (expr!=null?((StringTemplate)expr.getTemplate()):null)));
					  }


					}

					}
					break;
				case 13 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:464:8: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_expression2889);
					functionCall83=functionCall();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 464:28: -> {$functionCall.st}
					  {
					  	retval.st = (functionCall83!=null?((StringTemplate)functionCall83.getTemplate()):null);
					  }


					}

					}
					break;
				case 14 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:465:4: methodCall
					{
					pushFollow(FOLLOW_methodCall_in_expression2905);
					methodCall84=methodCall();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 465:22: -> {$methodCall.st}
					  {
					  	retval.st = (methodCall84!=null?((StringTemplate)methodCall84.getTemplate()):null);
					  }


					}

					}
					break;
				case 15 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:466:4: methodCallSelfOrParent
					{
					pushFollow(FOLLOW_methodCallSelfOrParent_in_expression2921);
					methodCallSelfOrParent85=methodCallSelfOrParent();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 466:33: -> {$methodCallSelfOrParent.st}
					  {
					  	retval.st = (methodCallSelfOrParent85!=null?((StringTemplate)methodCallSelfOrParent85.getTemplate()):null);
					  }


					}

					}
					break;
				case 16 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:467:4: methodCallStatic
					{
					pushFollow(FOLLOW_methodCallStatic_in_expression2936);
					methodCallStatic86=methodCallStatic();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 467:27: -> {$methodCallStatic.st}
					  {
					  	retval.st = (methodCallStatic86!=null?((StringTemplate)methodCallStatic86.getTemplate()):null);
					  }


					}

					}
					break;
				case 17 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:468:4: postFixExpression
					{
					pushFollow(FOLLOW_postFixExpression_in_expression2951);
					postFixExpression87=postFixExpression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 468:27: -> {$postFixExpression.st}
					  {
					  	retval.st = (postFixExpression87!=null?((StringTemplate)postFixExpression87.getTemplate()):null);
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


	public static class primitiveAtomWithConstant_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "primitiveAtomWithConstant"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:471:1: primitiveAtomWithConstant : ( Bool | Int | Float | String | Null | CONSTANT );
	public final PHP54TranslatorWalker.primitiveAtomWithConstant_return primitiveAtomWithConstant() throws RecognitionException {
		PHP54TranslatorWalker.primitiveAtomWithConstant_return retval = new PHP54TranslatorWalker.primitiveAtomWithConstant_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:473:2: ( Bool | Int | Float | String | Null | CONSTANT )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:
			{
			if ( input.LA(1)==Bool||input.LA(1)==CONSTANT||input.LA(1)==Float||input.LA(1)==Int||input.LA(1)==Null||input.LA(1)==String ) {
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
	// $ANTLR end "primitiveAtomWithConstant"


	public static class arrayKeyValue_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arrayKeyValue"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:481:1: arrayKeyValue : ( ^( '=>' key= expression value= expression ) -> keyValue(key=$key.stvalue=$value.st)| expression -> {$expression.st});
	public final PHP54TranslatorWalker.arrayKeyValue_return arrayKeyValue() throws RecognitionException {
		PHP54TranslatorWalker.arrayKeyValue_return retval = new PHP54TranslatorWalker.arrayKeyValue_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope key =null;
		TreeRuleReturnScope value =null;
		TreeRuleReturnScope expression88 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:482:2: ( ^( '=>' key= expression value= expression ) -> keyValue(key=$key.stvalue=$value.st)| expression -> {$expression.st})
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==Arrow) ) {
				alt49=1;
			}
			else if ( ((LA49_0 >= Assign && LA49_0 <= At)||(LA49_0 >= BitwiseAnd && LA49_0 <= Bool)||LA49_0==CASTING||LA49_0==CLASS_MEMBER_ACCESS||LA49_0==CLASS_STATIC_ACCESS||LA49_0==CONSTANT||LA49_0==Clone||(LA49_0 >= Divide && LA49_0 <= DivideAssign)||(LA49_0 >= Dot && LA49_0 <= DotAssign)||LA49_0==Equal||LA49_0==FUNCTION_CALL||LA49_0==Float||(LA49_0 >= GreaterEqualThan && LA49_0 <= GreaterThan)||LA49_0==Identical||(LA49_0 >= Instanceof && LA49_0 <= Int)||(LA49_0 >= LessEqualThan && LA49_0 <= METHOD_CALL)||LA49_0==METHOD_CALL_STATIC||(LA49_0 >= Minus && LA49_0 <= MinusAssign)||(LA49_0 >= Modulo && LA49_0 <= MultiplyAssign)||(LA49_0 >= New && LA49_0 <= Null)||(LA49_0 >= POST_DECREMENT && LA49_0 <= PRE_INCREMENT)||(LA49_0 >= Plus && LA49_0 <= PlusAssign)||LA49_0==QuestionMark||(LA49_0 >= ShiftLeft && LA49_0 <= ShiftRightAssign)||LA49_0==String||LA49_0==TypeArray||LA49_0==UNARY_MINUS||LA49_0==VariableId) ) {
				alt49=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:482:4: ^( '=>' key= expression value= expression )
					{
					match(input,Arrow,FOLLOW_Arrow_in_arrayKeyValue3022); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_arrayKeyValue3026);
					key=expression();
					state._fsp--;
					if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_arrayKeyValue3030);
					value=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 482:44: -> keyValue(key=$key.stvalue=$value.st)
					  {
					  	retval.st = templateLib.getInstanceOf("keyValue",new STAttrMap().put("key", (key!=null?((StringTemplate)key.getTemplate()):null)).put("value", (value!=null?((StringTemplate)value.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:483:4: expression
					{
					pushFollow(FOLLOW_expression_in_arrayKeyValue3050);
					expression88=expression();
					state._fsp--;
					if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 483:15: -> {$expression.st}
					  {
					  	retval.st = (expression88!=null?((StringTemplate)expression88.getTemplate()):null);
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:486:1: staticAccess : ( TYPE_NAME -> {%{$TYPE_NAME.text}}| Self -> {%{$Self.text}}| Parent -> {%{$Parent.text}});
	public final PHP54TranslatorWalker.staticAccess_return staticAccess() throws RecognitionException {
		PHP54TranslatorWalker.staticAccess_return retval = new PHP54TranslatorWalker.staticAccess_return();
		retval.start = input.LT(1);

		ITSPHPAst TYPE_NAME89=null;
		ITSPHPAst Self90=null;
		ITSPHPAst Parent91=null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:487:3: ( TYPE_NAME -> {%{$TYPE_NAME.text}}| Self -> {%{$Self.text}}| Parent -> {%{$Parent.text}})
			int alt50=3;
			switch ( input.LA(1) ) {
			case TYPE_NAME:
				{
				alt50=1;
				}
				break;
			case Self:
				{
				alt50=2;
				}
				break;
			case Parent:
				{
				alt50=3;
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:487:5: TYPE_NAME
					{
					TYPE_NAME89=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_staticAccess3067); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 487:15: -> {%{$TYPE_NAME.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(TYPE_NAME89!=null?TYPE_NAME89.getText():null));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:488:5: Self
					{
					Self90=(ITSPHPAst)match(input,Self,FOLLOW_Self_in_staticAccess3077); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 488:10: -> {%{$Self.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Self90!=null?Self90.getText():null));
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:489:5: Parent
					{
					Parent91=(ITSPHPAst)match(input,Parent,FOLLOW_Parent_in_staticAccess3087); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 489:12: -> {%{$Parent.text}}
					  {
					  	retval.st = new StringTemplate(templateLib,(Parent91!=null?Parent91.getText():null));
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


	public static class unaryPreOperator_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unaryPreOperator"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:493:1: unaryPreOperator : ( PRE_INCREMENT -> {%{\"++\"}}| PRE_DECREMENT -> {%{\"--\"}}| '@' -> {%{\"@\"}}| '~' -> {%{\"~\"}}| '!' -> {%{\"!\"}}| UNARY_MINUS -> {%{\"-\"}});
	public final PHP54TranslatorWalker.unaryPreOperator_return unaryPreOperator() throws RecognitionException {
		PHP54TranslatorWalker.unaryPreOperator_return retval = new PHP54TranslatorWalker.unaryPreOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:494:2: ( PRE_INCREMENT -> {%{\"++\"}}| PRE_DECREMENT -> {%{\"--\"}}| '@' -> {%{\"@\"}}| '~' -> {%{\"~\"}}| '!' -> {%{\"!\"}}| UNARY_MINUS -> {%{\"-\"}})
			int alt51=6;
			switch ( input.LA(1) ) {
			case PRE_INCREMENT:
				{
				alt51=1;
				}
				break;
			case PRE_DECREMENT:
				{
				alt51=2;
				}
				break;
			case At:
				{
				alt51=3;
				}
				break;
			case BitwiseNot:
				{
				alt51=4;
				}
				break;
			case LogicNot:
				{
				alt51=5;
				}
				break;
			case UNARY_MINUS:
				{
				alt51=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 51, 0, input);
				throw nvae;
			}
			switch (alt51) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:494:4: PRE_INCREMENT
					{
					match(input,PRE_INCREMENT,FOLLOW_PRE_INCREMENT_in_unaryPreOperator3106); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 494:18: -> {%{\"++\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"++");
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:495:8: PRE_DECREMENT
					{
					match(input,PRE_DECREMENT,FOLLOW_PRE_DECREMENT_in_unaryPreOperator3119); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 495:23: -> {%{\"--\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"--");
					  }


					}

					}
					break;
				case 3 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:496:8: '@'
					{
					match(input,At,FOLLOW_At_in_unaryPreOperator3133); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 496:14: -> {%{\"@\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"@");
					  }


					}

					}
					break;
				case 4 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:497:8: '~'
					{
					match(input,BitwiseNot,FOLLOW_BitwiseNot_in_unaryPreOperator3148); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 497:14: -> {%{\"~\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"~");
					  }


					}

					}
					break;
				case 5 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:498:8: '!'
					{
					match(input,LogicNot,FOLLOW_LogicNot_in_unaryPreOperator3163); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 498:14: -> {%{\"!\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"!");
					  }


					}

					}
					break;
				case 6 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:499:8: UNARY_MINUS
					{
					match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_unaryPreOperator3178); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 499:20: -> {%{\"-\"}}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:502:1: unaryPostOperator : ( POST_INCREMENT -> {%{\"++\"}}| POST_DECREMENT -> {%{\"--\"}});
	public final PHP54TranslatorWalker.unaryPostOperator_return unaryPostOperator() throws RecognitionException {
		PHP54TranslatorWalker.unaryPostOperator_return retval = new PHP54TranslatorWalker.unaryPostOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:2: ( POST_INCREMENT -> {%{\"++\"}}| POST_DECREMENT -> {%{\"--\"}})
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==POST_INCREMENT) ) {
				alt52=1;
			}
			else if ( (LA52_0==POST_DECREMENT) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:503:4: POST_INCREMENT
					{
					match(input,POST_INCREMENT,FOLLOW_POST_INCREMENT_in_unaryPostOperator3202); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 503:19: -> {%{\"++\"}}
					  {
					  	retval.st = new StringTemplate(templateLib,"++");
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:504:8: POST_DECREMENT
					{
					match(input,POST_DECREMENT,FOLLOW_POST_DECREMENT_in_unaryPostOperator3215); if (state.failed) return retval;
					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 504:23: -> {%{\"--\"}}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "binaryOperator"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:507:1: binaryOperator : ( 'or' | 'xor' | 'and' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' | '==' | '!=' | '<>' | '===' | '!==' | '||' | '&&' | '|' | '^' | '&' | '<' | '<=' | '>' | '>=' | '<<' | '>>' | '+' | '-' | '.' | '*' | '/' | '%' );
	public final PHP54TranslatorWalker.binaryOperator_return binaryOperator() throws RecognitionException {
		PHP54TranslatorWalker.binaryOperator_return retval = new PHP54TranslatorWalker.binaryOperator_return();
		retval.start = input.LT(1);

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:509:2: ( 'or' | 'xor' | 'and' | '=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '%=' | '.=' | '<<=' | '>>=' | '==' | '!=' | '<>' | '===' | '!==' | '||' | '&&' | '|' | '^' | '&' | '<' | '<=' | '>' | '>=' | '<<' | '>>' | '+' | '-' | '.' | '*' | '/' | '%' )
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

			if ( state.backtracking==0 ) {retval.st = templateLib.getInstanceOf("operator",new STAttrMap().put("o", ((ITSPHPAst)retval.start).getText()));}
		}
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:554:1: castingOperator : ( ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression ) -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)| ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression ) -> cast(type=$TYPE_NAME.textexpression=$expression.st));
	public final PHP54TranslatorWalker.castingOperator_return castingOperator() throws RecognitionException {
		PHP54TranslatorWalker.castingOperator_return retval = new PHP54TranslatorWalker.castingOperator_return();
		retval.start = input.LT(1);

		ITSPHPAst isNullable=null;
		ITSPHPAst TYPE_NAME93=null;
		TreeRuleReturnScope type =null;
		TreeRuleReturnScope expression92 =null;
		TreeRuleReturnScope expression94 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:555:2: ( ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression ) -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)| ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression ) -> cast(type=$TYPE_NAME.textexpression=$expression.st))
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==CASTING) ) {
				int LA60_1 = input.LA(2);
				if ( (LA60_1==DOWN) ) {
					int LA60_2 = input.LA(3);
					if ( (LA60_2==TYPE) ) {
						int LA60_3 = input.LA(4);
						if ( (LA60_3==DOWN) ) {
							int LA60_4 = input.LA(5);
							if ( (LA60_4==TYPE_MODIFIER) ) {
								switch ( input.LA(6) ) {
								case DOWN:
									{
									switch ( input.LA(7) ) {
									case Cast:
										{
										int LA60_9 = input.LA(8);
										if ( (LA60_9==QuestionMark) ) {
											int LA60_10 = input.LA(9);
											if ( (LA60_10==UP) ) {
												int LA60_11 = input.LA(10);
												if ( ((LA60_11 >= TypeArray && LA60_11 <= TypeInt)||LA60_11==TypeString) ) {
													alt60=1;
												}
												else if ( (LA60_11==TYPE_NAME) ) {
													alt60=2;
												}
												else {
													if (state.backtracking>0) {state.failed=true; return retval;}
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++)
															input.consume();
														NoViableAltException nvae =
															new NoViableAltException("", 60, 11, input);
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
														new NoViableAltException("", 60, 10, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}
										}
										else if ( (LA60_9==UP) ) {
											int LA60_11 = input.LA(9);
											if ( ((LA60_11 >= TypeArray && LA60_11 <= TypeInt)||LA60_11==TypeString) ) {
												alt60=1;
											}
											else if ( (LA60_11==TYPE_NAME) ) {
												alt60=2;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 60, 11, input);
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
													new NoViableAltException("", 60, 9, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case QuestionMark:
										{
										int LA60_10 = input.LA(8);
										if ( (LA60_10==UP) ) {
											int LA60_11 = input.LA(9);
											if ( ((LA60_11 >= TypeArray && LA60_11 <= TypeInt)||LA60_11==TypeString) ) {
												alt60=1;
											}
											else if ( (LA60_11==TYPE_NAME) ) {
												alt60=2;
											}
											else {
												if (state.backtracking>0) {state.failed=true; return retval;}
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++)
														input.consume();
													NoViableAltException nvae =
														new NoViableAltException("", 60, 11, input);
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
													new NoViableAltException("", 60, 10, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}
										}
										break;
									case UP:
										{
										int LA60_11 = input.LA(8);
										if ( ((LA60_11 >= TypeArray && LA60_11 <= TypeInt)||LA60_11==TypeString) ) {
											alt60=1;
										}
										else if ( (LA60_11==TYPE_NAME) ) {
											alt60=2;
										}
										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++)
													input.consume();
												NoViableAltException nvae =
													new NoViableAltException("", 60, 11, input);
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
												new NoViableAltException("", 60, 6, input);
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
									alt60=1;
									}
									break;
								case TYPE_NAME:
									{
									alt60=2;
									}
									break;
								default:
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++)
											input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 60, 5, input);
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
										new NoViableAltException("", 60, 4, input);
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
									new NoViableAltException("", 60, 3, input);
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
								new NoViableAltException("", 60, 2, input);
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
							new NoViableAltException("", 60, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:555:4: ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER ) (type= scalarTypes |type= arrayType ) ) expression )
					{
					match(input,CASTING,FOLLOW_CASTING_in_castingOperator3472); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_castingOperator3478); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:557:5: ( ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? ) | TYPE_MODIFIER )
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==TYPE_MODIFIER) ) {
						int LA55_1 = input.LA(2);
						if ( (LA55_1==DOWN) ) {
							alt55=1;
						}
						else if ( ((LA55_1 >= TypeArray && LA55_1 <= TypeInt)||LA55_1==TypeString) ) {
							alt55=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 55, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 55, 0, input);
						throw nvae;
					}
					switch (alt55) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:557:7: ^( TYPE_MODIFIER ( Cast )? (isNullable= '?' )? )
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator3488); if (state.failed) return retval;
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:557:23: ( Cast )?
								int alt53=2;
								int LA53_0 = input.LA(1);
								if ( (LA53_0==Cast) ) {
									alt53=1;
								}
								switch (alt53) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:557:23: Cast
										{
										match(input,Cast,FOLLOW_Cast_in_castingOperator3490); if (state.failed) return retval;
										}
										break;

								}

								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:557:29: (isNullable= '?' )?
								int alt54=2;
								int LA54_0 = input.LA(1);
								if ( (LA54_0==QuestionMark) ) {
									alt54=1;
								}
								switch (alt54) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:557:30: isNullable= '?'
										{
										isNullable=(ITSPHPAst)match(input,QuestionMark,FOLLOW_QuestionMark_in_castingOperator3496); if (state.failed) return retval;
										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:558:7: TYPE_MODIFIER
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator3507); if (state.failed) return retval;
							}
							break;

					}

					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:560:5: (type= scalarTypes |type= arrayType )
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( ((LA56_0 >= TypeBool && LA56_0 <= TypeInt)||LA56_0==TypeString) ) {
						alt56=1;
					}
					else if ( (LA56_0==TypeArray) ) {
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
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:560:6: type= scalarTypes
							{
							pushFollow(FOLLOW_scalarTypes_in_castingOperator3522);
							type=scalarTypes();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:560:23: type= arrayType
							{
							pushFollow(FOLLOW_arrayType_in_castingOperator3526);
							type=arrayType();
							state._fsp--;
							if (state.failed) return retval;
							}
							break;

					}

					match(input, Token.UP, null); if (state.failed) return retval;

					pushFollow(FOLLOW_expression_in_castingOperator3537);
					expression92=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 564:3: -> primitiveCast(isNotNullable=$isNullable!=nulltype=$type.stexpression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("primitiveCast",new STAttrMap().put("isNotNullable", isNullable!=null).put("type", (type!=null?((StringTemplate)type.getTemplate()):null)).put("expression", (expression92!=null?((StringTemplate)expression92.getTemplate()):null)));
					  }


					}

					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:566:4: ^( CASTING ^( TYPE ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER ) TYPE_NAME ) expression )
					{
					match(input,CASTING,FOLLOW_CASTING_in_castingOperator3573); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					match(input,TYPE,FOLLOW_TYPE_in_castingOperator3579); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:568:5: ( ^( TYPE_MODIFIER ( Cast )? ( '?' )? ) | TYPE_MODIFIER )
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==TYPE_MODIFIER) ) {
						int LA59_1 = input.LA(2);
						if ( (LA59_1==DOWN) ) {
							alt59=1;
						}
						else if ( (LA59_1==TYPE_NAME) ) {
							alt59=2;
						}
						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 59, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 59, 0, input);
						throw nvae;
					}
					switch (alt59) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:568:7: ^( TYPE_MODIFIER ( Cast )? ( '?' )? )
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator3589); if (state.failed) return retval;
							if ( input.LA(1)==Token.DOWN ) {
								match(input, Token.DOWN, null); if (state.failed) return retval;
								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:568:23: ( Cast )?
								int alt57=2;
								int LA57_0 = input.LA(1);
								if ( (LA57_0==Cast) ) {
									alt57=1;
								}
								switch (alt57) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:568:23: Cast
										{
										match(input,Cast,FOLLOW_Cast_in_castingOperator3591); if (state.failed) return retval;
										}
										break;

								}

								// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:568:29: ( '?' )?
								int alt58=2;
								int LA58_0 = input.LA(1);
								if ( (LA58_0==QuestionMark) ) {
									alt58=1;
								}
								switch (alt58) {
									case 1 :
										// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:568:29: '?'
										{
										match(input,QuestionMark,FOLLOW_QuestionMark_in_castingOperator3594); if (state.failed) return retval;
										}
										break;

								}

								match(input, Token.UP, null); if (state.failed) return retval;
							}

							}
							break;
						case 2 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:569:7: TYPE_MODIFIER
							{
							match(input,TYPE_MODIFIER,FOLLOW_TYPE_MODIFIER_in_castingOperator3604); if (state.failed) return retval;
							}
							break;

					}

					TYPE_NAME93=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_castingOperator3616); if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					pushFollow(FOLLOW_expression_in_castingOperator3626);
					expression94=expression();
					state._fsp--;
					if (state.failed) return retval;
					match(input, Token.UP, null); if (state.failed) return retval;

					// TEMPLATE REWRITE
					if ( state.backtracking==0 ) {
					  // 575:3: -> cast(type=$TYPE_NAME.textexpression=$expression.st)
					  {
					  	retval.st = templateLib.getInstanceOf("cast",new STAttrMap().put("type", (TYPE_NAME93!=null?TYPE_NAME93.getText():null)).put("expression", (expression94!=null?((StringTemplate)expression94.getTemplate()):null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:578:1: newOperator : ^( 'new' type= TYPE_NAME actualParameters ) -> new(type=$type.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.newOperator_return newOperator() throws RecognitionException {
		PHP54TranslatorWalker.newOperator_return retval = new PHP54TranslatorWalker.newOperator_return();
		retval.start = input.LT(1);

		ITSPHPAst type=null;
		TreeRuleReturnScope actualParameters95 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:579:2: ( ^( 'new' type= TYPE_NAME actualParameters ) -> new(type=$type.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:579:4: ^( 'new' type= TYPE_NAME actualParameters )
			{
			match(input,New,FOLLOW_New_in_newOperator3659); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			type=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_newOperator3667); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_newOperator3673);
			actualParameters95=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 583:3: -> new(type=$type.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("new",new STAttrMap().put("type", (type!=null?type.getText():null)).put("parameters", (actualParameters95!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters95).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:586:1: actualParameters returns [List<Object> parameters] : ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS ) ;
	public final PHP54TranslatorWalker.actualParameters_return actualParameters() throws RecognitionException {
		PHP54TranslatorWalker.actualParameters_return retval = new PHP54TranslatorWalker.actualParameters_return();
		retval.start = input.LT(1);

		List<Object> list_params=null;
		RuleReturnScope params = null;
		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:587:2: ( ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS ) )
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:587:4: ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS )
			{
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:587:4: ( ^( ACTUAL_PARAMETERS (params+= expression )+ ) | ACTUAL_PARAMETERS )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==ACTUAL_PARAMETERS) ) {
				int LA62_1 = input.LA(2);
				if ( (LA62_1==DOWN) ) {
					alt62=1;
				}
				else if ( (LA62_1==UP) ) {
					alt62=2;
				}
				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 62, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}
			switch (alt62) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:587:6: ^( ACTUAL_PARAMETERS (params+= expression )+ )
					{
					match(input,ACTUAL_PARAMETERS,FOLLOW_ACTUAL_PARAMETERS_in_actualParameters3711); if (state.failed) return retval;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:587:32: (params+= expression )+
					int cnt61=0;
					loop61:
					do {
						int alt61=2;
						int LA61_0 = input.LA(1);
						if ( ((LA61_0 >= Assign && LA61_0 <= At)||(LA61_0 >= BitwiseAnd && LA61_0 <= Bool)||LA61_0==CASTING||LA61_0==CLASS_MEMBER_ACCESS||LA61_0==CLASS_STATIC_ACCESS||LA61_0==CONSTANT||LA61_0==Clone||(LA61_0 >= Divide && LA61_0 <= DivideAssign)||(LA61_0 >= Dot && LA61_0 <= DotAssign)||LA61_0==Equal||LA61_0==FUNCTION_CALL||LA61_0==Float||(LA61_0 >= GreaterEqualThan && LA61_0 <= GreaterThan)||LA61_0==Identical||(LA61_0 >= Instanceof && LA61_0 <= Int)||(LA61_0 >= LessEqualThan && LA61_0 <= METHOD_CALL)||LA61_0==METHOD_CALL_STATIC||(LA61_0 >= Minus && LA61_0 <= MinusAssign)||(LA61_0 >= Modulo && LA61_0 <= MultiplyAssign)||(LA61_0 >= New && LA61_0 <= Null)||(LA61_0 >= POST_DECREMENT && LA61_0 <= PRE_INCREMENT)||(LA61_0 >= Plus && LA61_0 <= PlusAssign)||LA61_0==QuestionMark||(LA61_0 >= ShiftLeft && LA61_0 <= ShiftRightAssign)||LA61_0==String||LA61_0==TypeArray||LA61_0==UNARY_MINUS||LA61_0==VariableId) ) {
							alt61=1;
						}

						switch (alt61) {
						case 1 :
							// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:587:32: params+= expression
							{
							pushFollow(FOLLOW_expression_in_actualParameters3715);
							params=expression();
							state._fsp--;
							if (state.failed) return retval;
							if (list_params==null) list_params=new ArrayList<Object>();
							list_params.add(params.getTemplate());
							}
							break;

						default :
							if ( cnt61 >= 1 ) break loop61;
							if (state.backtracking>0) {state.failed=true; return retval;}
								EarlyExitException eee =
									new EarlyExitException(61, input);
								throw eee;
						}
						cnt61++;
					} while (true);

					match(input, Token.UP, null); if (state.failed) return retval;

					if ( state.backtracking==0 ) {retval.parameters =list_params;}
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:588:5: ACTUAL_PARAMETERS
					{
					match(input,ACTUAL_PARAMETERS,FOLLOW_ACTUAL_PARAMETERS_in_actualParameters3725); if (state.failed) return retval;
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:592:1: functionCall : ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters ) -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.functionCall_return functionCall() throws RecognitionException {
		PHP54TranslatorWalker.functionCall_return retval = new PHP54TranslatorWalker.functionCall_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters96 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:593:2: ( ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters ) -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:593:4: ^( FUNCTION_CALL identifier= TYPE_NAME actualParameters )
			{
			match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_functionCall3742); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			identifier=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_functionCall3746); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_functionCall3748);
			actualParameters96=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 594:3: -> functionCall(identifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("functionCall",new STAttrMap().put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters96!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters96).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:597:1: methodCall : ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters ) -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCall_return methodCall() throws RecognitionException {
		PHP54TranslatorWalker.methodCall_return retval = new PHP54TranslatorWalker.methodCall_return();
		retval.start = input.LT(1);

		ITSPHPAst callee=null;
		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters97 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:598:2: ( ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters ) -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:598:4: ^( METHOD_CALL (callee= This |callee= VariableId ) identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCall3778); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:598:18: (callee= This |callee= VariableId )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==This) ) {
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
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:598:19: callee= This
					{
					callee=(ITSPHPAst)match(input,This,FOLLOW_This_in_methodCall3783); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:598:31: callee= VariableId
					{
					callee=(ITSPHPAst)match(input,VariableId,FOLLOW_VariableId_in_methodCall3787); if (state.failed) return retval;
					}
					break;

			}

			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCall3792); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCall3794);
			actualParameters97=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 599:3: -> methodCall(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCall",new STAttrMap().put("callee", (callee!=null?callee.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters97!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters97).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:602:1: methodCallSelfOrParent : ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters ) -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCallSelfOrParent_return methodCallSelfOrParent() throws RecognitionException {
		PHP54TranslatorWalker.methodCallSelfOrParent_return retval = new PHP54TranslatorWalker.methodCallSelfOrParent_return();
		retval.start = input.LT(1);

		ITSPHPAst callee=null;
		ITSPHPAst identifier=null;
		TreeRuleReturnScope actualParameters98 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:603:2: ( ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters ) -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:603:4: ^( METHOD_CALL (callee= Self |callee= Parent ) identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_methodCallSelfOrParent3828); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:603:18: (callee= Self |callee= Parent )
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==Self) ) {
				alt64=1;
			}
			else if ( (LA64_0==Parent) ) {
				alt64=2;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 64, 0, input);
				throw nvae;
			}
			switch (alt64) {
				case 1 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:603:19: callee= Self
					{
					callee=(ITSPHPAst)match(input,Self,FOLLOW_Self_in_methodCallSelfOrParent3833); if (state.failed) return retval;
					}
					break;
				case 2 :
					// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:603:31: callee= Parent
					{
					callee=(ITSPHPAst)match(input,Parent,FOLLOW_Parent_in_methodCallSelfOrParent3837); if (state.failed) return retval;
					}
					break;

			}

			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCallSelfOrParent3842); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCallSelfOrParent3844);
			actualParameters98=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 604:3: -> methodCallStatic(callee=$callee.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCallStatic",new STAttrMap().put("callee", (callee!=null?callee.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters98!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters98).parameters:null)));
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
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:607:1: methodCallStatic : ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters ) -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters);
	public final PHP54TranslatorWalker.methodCallStatic_return methodCallStatic() throws RecognitionException {
		PHP54TranslatorWalker.methodCallStatic_return retval = new PHP54TranslatorWalker.methodCallStatic_return();
		retval.start = input.LT(1);

		ITSPHPAst identifier=null;
		ITSPHPAst TYPE_NAME99=null;
		TreeRuleReturnScope actualParameters100 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:608:2: ( ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters ) -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:608:4: ^( METHOD_CALL_STATIC TYPE_NAME identifier= Identifier actualParameters )
			{
			match(input,METHOD_CALL_STATIC,FOLLOW_METHOD_CALL_STATIC_in_methodCallStatic3878); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			TYPE_NAME99=(ITSPHPAst)match(input,TYPE_NAME,FOLLOW_TYPE_NAME_in_methodCallStatic3880); if (state.failed) return retval;
			identifier=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_methodCallStatic3884); if (state.failed) return retval;
			pushFollow(FOLLOW_actualParameters_in_methodCallStatic3886);
			actualParameters100=actualParameters();
			state._fsp--;
			if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 609:3: -> methodCallStatic(callee=$TYPE_NAME.textidentifier=$identifier.textparameters=$actualParameters.parameters)
			  {
			  	retval.st = templateLib.getInstanceOf("methodCallStatic",new STAttrMap().put("callee", (TYPE_NAME99!=null?TYPE_NAME99.getText():null)).put("identifier", (identifier!=null?identifier.getText():null)).put("parameters", (actualParameters100!=null?((PHP54TranslatorWalker.actualParameters_return)actualParameters100).parameters:null)));
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


	public static class postFixExpression_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "postFixExpression"
	// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:612:1: postFixExpression : ^( CLASS_MEMBER_ACCESS expression Identifier ) -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text);
	public final PHP54TranslatorWalker.postFixExpression_return postFixExpression() throws RecognitionException {
		PHP54TranslatorWalker.postFixExpression_return retval = new PHP54TranslatorWalker.postFixExpression_return();
		retval.start = input.LT(1);

		ITSPHPAst Identifier102=null;
		TreeRuleReturnScope expression101 =null;

		try {
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:613:2: ( ^( CLASS_MEMBER_ACCESS expression Identifier ) -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text))
			// D:\\TSPHP-translators-php54\\src\\main\\antlr\\PHP54TranslatorWalker.g:613:4: ^( CLASS_MEMBER_ACCESS expression Identifier )
			{
			match(input,CLASS_MEMBER_ACCESS,FOLLOW_CLASS_MEMBER_ACCESS_in_postFixExpression3922); if (state.failed) return retval;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_postFixExpression3924);
			expression101=expression();
			state._fsp--;
			if (state.failed) return retval;
			Identifier102=(ITSPHPAst)match(input,Identifier,FOLLOW_Identifier_in_postFixExpression3926); if (state.failed) return retval;
			match(input, Token.UP, null); if (state.failed) return retval;

			// TEMPLATE REWRITE
			if ( state.backtracking==0 ) {
			  // 613:49: -> classMemberAccess(expression=$expression.stidentifier=$Identifier.text)
			  {
			  	retval.st = templateLib.getInstanceOf("classMemberAccess",new STAttrMap().put("expression", (expression101!=null?((StringTemplate)expression101.getTemplate()):null)).put("identifier", (Identifier102!=null?Identifier102.getText():null)));
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
	// $ANTLR end "postFixExpression"

	// Delegated rules



	public static final BitSet FOLLOW_namespace_in_compilationUnit54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Namespace_in_namespace81 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_namespace86 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_DEFAULT_NAMESPACE_in_namespace88 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_namespaceBody_in_namespace91 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NAMESPACE_BODY_in_namespaceBody126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_namespaceBody130 = new BitSet(new long[]{0x2800008800000008L,0x0000000000080100L,0x0000010004000020L});
	public static final BitSet FOLLOW_NAMESPACE_BODY_in_namespaceBody146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_useDeclarationList_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_definition_in_statement175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_statement184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Use_in_useDeclarationList201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_useDeclaration_in_useDeclarationList203 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_USE_DECLARATION_in_useDeclaration229 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_useDeclaration231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_useDeclaration233 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classDeclaration_in_definition262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_definition272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionDeclaration_in_definition282 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_definition292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Class_in_classDeclaration310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classModifier_in_classDeclaration312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_classDeclaration314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extendsDeclaration_in_classDeclaration316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_implementsDeclaration_in_classDeclaration318 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_classBody_in_classDeclaration320 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_classModifier384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classModifierNames_in_classModifier388 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_classModifier403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration442 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_extendsDeclaration446 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Extends_in_extendsDeclaration462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration483 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_implementsDeclaration487 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_Implements_in_implementsDeclaration503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_BODY_in_classBody524 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_classBodyDefinition_in_classBody528 = new BitSet(new long[]{0x0000200808000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_CLASS_BODY_in_classBody544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_classBodyDefinition565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_classMemberDeclaration_in_classBodyDefinition576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstractConstructDeclaration_in_classBodyDefinition586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constructDeclaration_in_classBodyDefinition596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstractMethodDeclaration_in_classBodyDefinition607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodDeclaration_in_classBodyDefinition617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CONSTANT_DECLARATION_LIST_in_constDeclarationList636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_constDeclarationList643 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_constDeclarationList646 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Public_in_constDeclarationList648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_Static_in_constDeclarationList650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_Final_in_constDeclarationList652 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_scalarTypes_in_constDeclarationList655 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_constantAssignment_in_constDeclarationList663 = new BitSet(new long[]{0x0000000000000008L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_constantAssignment693 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_constantAssignment697 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_in_classMemberDeclaration758 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_variableDeclarationList_in_classMemberDeclaration760 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VARIABLE_DECLARATION_LIST_in_variableDeclarationList777 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_variableDeclarationList784 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_variableDeclarationList786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_allTypes_in_variableDeclarationList788 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_variableDeclaration_in_variableDeclarationList797 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier833 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_typeModifier837 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008001DL});
	public static final BitSet FOLLOW_QuestionMark_in_typeModifier842 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x000000000008000DL});
	public static final BitSet FOLLOW_variableModifier_in_typeModifier845 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_typeModifier858 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_variableModifier900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_variableModifier914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Static_in_staticToken930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Private_in_accessModifier946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Protected_in_accessModifier955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Public_in_accessModifier964 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration981 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_variableDeclaration985 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_variableDeclaration1004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_primitiveTypes_in_allTypes1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_allTypes1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypes1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_primitiveTypes1042 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypes1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypes1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_primitiveTypesWithoutArray1067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_primitiveTypesWithoutArray1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeObject_in_primitiveTypesWithoutArray1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_abstractConstructDeclaration1104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractConstructDeclaration1111 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractConstructDeclaration1113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractConstructDeclaration1120 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractConstructDeclaration1122 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractConstructDeclaration1124 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_abstractConstructDeclaration1130 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_abstractConstructDeclaration1135 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Construct_in_constructDeclaration1197 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_constructDeclaration1204 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_constructDeclaration1206 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_constructDeclaration1213 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_constructDeclaration1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_constructDeclaration1217 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_constructDeclaration1223 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_constructDeclaration1228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_abstractMethodDeclaration1287 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_abstractMethodDeclaration1293 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_abstractMethodDeclaration1295 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_abstractMethodDeclaration1302 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_abstractMethodDeclaration1304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_abstractMethodDeclaration1306 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_abstractMethodDeclaration1315 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_abstractMethodDeclaration1319 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_abstractMethodDeclaration1325 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_abstractMethodDeclaration1330 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_abstractMethodModifier1397 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_abstractToken_in_abstractMethodModifier1401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Abstract_in_abstractToken1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_methodDeclaration1443 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_methodDeclaration1449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodModifier_in_methodDeclaration1451 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_methodDeclaration1458 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_methodDeclaration1460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_methodDeclaration1462 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_methodDeclaration1471 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Destruct_in_methodDeclaration1475 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_methodDeclaration1481 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_methodDeclaration1486 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1600 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000DL});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1675 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_staticToken_in_methodModifier1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1695 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_finalToken_in_methodModifier1699 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_accessModifier_in_methodModifier1707 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Final_in_finalToken1734 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allTypes_in_returnType1750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Void_in_returnType1755 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1769 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_paramDeclaration_in_formalParameters1773 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
	public static final BitSet FOLLOW_PARAMETER_LIST_in_formalParameters1789 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETER_DECLARATION_in_paramDeclaration1809 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_paramDeclaration1816 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_paramDeclaration1818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000003F81000000L});
	public static final BitSet FOLLOW_scalarAndResource_in_paramDeclaration1827 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_paramDeclaration1837 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeObject_in_paramDeclaration1845 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_classInterfaceType_in_paramDeclaration1855 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_parameterNormalOrOptional_in_paramDeclaration1871 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TypeArray_in_arrayType1910 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_classInterfaceType1925 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_scalarTypes_in_scalarAndResource1941 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeResource_in_scalarAndResource1950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional1969 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Int_in_parameterNormalOrOptional1973 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_parameterNormalOrOptional1982 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BLOCK_in_block1999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_instruction_in_block2003 = new BitSet(new long[]{0x2800000000000008L,0x0000000000000000L,0x0000000004000020L});
	public static final BitSet FOLLOW_BLOCK_in_block2012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Interface_in_interfaceDeclaration2026 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CLASS_MODIFIER_in_interfaceDeclaration2033 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Abstract_in_interfaceDeclaration2035 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceDeclaration2041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_extendsDeclaration_in_interfaceDeclaration2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_interfaceBody_in_interfaceDeclaration2052 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTERFACE_BODY_in_interfaceBody2104 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_interfaceBodyDefinition_in_interfaceBody2108 = new BitSet(new long[]{0x0000200800000008L,0x0000000400000000L});
	public static final BitSet FOLLOW_INTERFACE_BODY_in_interfaceBody2124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constDeclarationList_in_interfaceBodyDefinition2144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceConstructDeclaration_in_interfaceBodyDefinition2153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceMethodDeclaration_in_interfaceBodyDefinition2162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Construct_in_interfaceConstructDeclaration2180 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_interfaceConstructDeclaration2187 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_interfaceConstructDeclaration2189 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_interfaceConstructDeclaration2196 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_interfaceConstructDeclaration2198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_interfaceConstructDeclaration2200 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceConstructDeclaration2206 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_interfaceConstructDeclaration2211 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_DECLARATION_in_interfaceMethodDeclaration2271 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_METHOD_MODIFIER_in_interfaceMethodDeclaration2277 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_abstractMethodModifier_in_interfaceMethodDeclaration2279 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_in_interfaceMethodDeclaration2286 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_interfaceMethodDeclaration2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_interfaceMethodDeclaration2290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_interfaceMethodDeclaration2296 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_interfaceMethodDeclaration2301 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_BLOCK_in_interfaceMethodDeclaration2306 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Function_in_functionDeclaration2357 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FUNCTION_MODIFIER_in_functionDeclaration2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_TYPE_in_functionDeclaration2369 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_typeModifier_in_functionDeclaration2371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000103F81000000L});
	public static final BitSet FOLLOW_returnType_in_functionDeclaration2373 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Identifier_in_functionDeclaration2379 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_formalParameters_in_functionDeclaration2384 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_block_in_functionDeclaration2389 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_EXPRESSION_in_instruction2468 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Return_in_instruction2487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2489 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Throw_in_instruction2508 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2510 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_Echo_in_instruction2528 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_instruction2532 = new BitSet(new long[]{0x81980102917F8608L,0x6783E7B2FF862624L,0x0000084080178010L});
	public static final BitSet FOLLOW_primitiveAtomWithConstant_in_expression2568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TypeArray_in_expression2583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arrayKeyValue_in_expression2587 = new BitSet(new long[]{0x81980102917F8688L,0x6783E7B2FF862624L,0x0000084080178010L});
	public static final BitSet FOLLOW_VariableId_in_expression2606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CLASS_STATIC_ACCESS_in_expression2623 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_staticAccess_in_expression2625 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_CONSTANT_in_expression2627 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unaryPreOperator_in_expression2653 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2657 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_unaryPostOperator_in_expression2685 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_binaryOperator_in_expression2717 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2721 = new BitSet(new long[]{0x81980102917F8600L,0x6783E7B2FF862624L,0x0000084080178010L});
	public static final BitSet FOLLOW_expression_in_expression2725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_QuestionMark_in_expression2753 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2757 = new BitSet(new long[]{0x81980102917F8600L,0x6783E7B2FF862624L,0x0000084080178010L});
	public static final BitSet FOLLOW_expression_in_expression2761 = new BitSet(new long[]{0x81980102917F8600L,0x6783E7B2FF862624L,0x0000084080178010L});
	public static final BitSet FOLLOW_expression_in_expression2765 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_castingOperator_in_expression2791 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Instanceof_in_expression2807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_expression2816 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_VariableId_in_expression2820 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_newOperator_in_expression2842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Clone_in_expression2862 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_expression2866 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_expression2889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCall_in_expression2905 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallSelfOrParent_in_expression2921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_methodCallStatic_in_expression2936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postFixExpression_in_expression2951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Arrow_in_arrayKeyValue3022 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3026 = new BitSet(new long[]{0x81980102917F8600L,0x6783E7B2FF862624L,0x0000084080178010L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3030 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_arrayKeyValue3050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_NAME_in_staticAccess3067 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Self_in_staticAccess3077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Parent_in_staticAccess3087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRE_INCREMENT_in_unaryPreOperator3106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRE_DECREMENT_in_unaryPreOperator3119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_At_in_unaryPreOperator3133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BitwiseNot_in_unaryPreOperator3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LogicNot_in_unaryPreOperator3163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNARY_MINUS_in_unaryPreOperator3178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_INCREMENT_in_unaryPostOperator3202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_POST_DECREMENT_in_unaryPostOperator3215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASTING_in_castingOperator3472 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_castingOperator3478 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator3488 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_castingOperator3490 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QuestionMark_in_castingOperator3496 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator3507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002780000000L});
	public static final BitSet FOLLOW_scalarTypes_in_castingOperator3522 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_arrayType_in_castingOperator3526 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_castingOperator3537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CASTING_in_castingOperator3573 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_in_castingOperator3579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator3589 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Cast_in_castingOperator3591 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_QuestionMark_in_castingOperator3594 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TYPE_MODIFIER_in_castingOperator3604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_TYPE_NAME_in_castingOperator3616 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_expression_in_castingOperator3626 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_New_in_newOperator3659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_newOperator3667 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_newOperator3673 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTUAL_PARAMETERS_in_actualParameters3711 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_actualParameters3715 = new BitSet(new long[]{0x81980102917F8608L,0x6783E7B2FF862624L,0x0000084080178010L});
	public static final BitSet FOLLOW_ACTUAL_PARAMETERS_in_actualParameters3725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_CALL_in_functionCall3742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_functionCall3746 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_functionCall3748 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_methodCall3778 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_This_in_methodCall3783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_VariableId_in_methodCall3787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCall3792 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCall3794 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_in_methodCallSelfOrParent3828 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_Self_in_methodCallSelfOrParent3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Parent_in_methodCallSelfOrParent3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCallSelfOrParent3842 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCallSelfOrParent3844 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_METHOD_CALL_STATIC_in_methodCallStatic3878 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TYPE_NAME_in_methodCallStatic3880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_methodCallStatic3884 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_actualParameters_in_methodCallStatic3886 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CLASS_MEMBER_ACCESS_in_postFixExpression3922 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_expression_in_postFixExpression3924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_postFixExpression3926 = new BitSet(new long[]{0x0000000000000008L});
}
