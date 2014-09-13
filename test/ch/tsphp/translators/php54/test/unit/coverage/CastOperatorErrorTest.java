/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.coverage;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.antlrmod.ErrorReportingPHP54TranslatorWalker;
import ch.tsphp.translators.php54.test.unit.testutils.AWalkerTest;
import org.antlr.runtime.MismatchedTreeNodeException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.CAST;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Cast;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.EOF;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Plus;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.QuestionMark;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.TYPE;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.TYPE_MODIFIER;
import static org.antlr.runtime.tree.TreeParser.UP;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@SuppressWarnings("ThrowableResultOfMethodCallIgnored")
public class CastOperatorErrorTest extends AWalkerTest
{

    @Test
    public void Empty_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(CAST);

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.castOperator();

        ArgumentCaptor<MismatchedTreeNodeException> captor = ArgumentCaptor.forClass(MismatchedTreeNodeException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(EOF));
    }

    @Test
    public void WithoutType_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(CAST);
        ast.addChild(createAst(Plus));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.castOperator();

        ArgumentCaptor<MismatchedTreeNodeException> captor = ArgumentCaptor.forClass(MismatchedTreeNodeException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Plus));
    }

    @Test
    public void EmptyType_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(CAST);
        ast.addChild(createAst(TYPE));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.castOperator();

        ArgumentCaptor<MismatchedTreeNodeException> captor = ArgumentCaptor.forClass(MismatchedTreeNodeException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(UP));
    }

    @Test
    public void WithoutTypeModifier_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(CAST);
        ITSPHPAst type = createAst(TYPE);
        ast.addChild(type);
        type.addChild(createAst(Plus));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.castOperator();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        //since walker uses tMod=. next token is up and not PLUS as previously
        assertThat(captor.getValue().token.getType(), is(UP));
    }

    @Test
    public void ErroneousTypeWithTypeModifierCast_reportNoViableAltException()
            throws RecognitionException {
        ITSPHPAst ast = createAst(CAST);
        ITSPHPAst type = createAst(TYPE);
        ast.addChild(type);
        ITSPHPAst typeModifier = createAst(TYPE_MODIFIER);
        type.addChild(typeModifier);
        typeModifier.addChild(createAst(Cast));
        type.addChild(createAst(Plus));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.castOperator();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Plus));
    }

    @Test
    public void ErroneousTypeWithTypeModifierCastAndQuestionMark_reportNoViableAltException()
            throws RecognitionException {
        ITSPHPAst ast = createAst(CAST);
        ITSPHPAst type = createAst(TYPE);
        ast.addChild(type);
        ITSPHPAst typeModifier = createAst(TYPE_MODIFIER);
        type.addChild(typeModifier);
        typeModifier.addChild(createAst(Cast));
        typeModifier.addChild(createAst(QuestionMark));
        type.addChild(createAst(Plus));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.castOperator();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Plus));
    }

    @Test
    public void ErroneousTypeWithTypeModifierQuestionMark_reportNoViableAltException()
            throws RecognitionException {
        ITSPHPAst ast = createAst(CAST);
        ITSPHPAst type = createAst(TYPE);
        ast.addChild(type);
        ITSPHPAst typeModifier = createAst(TYPE_MODIFIER);
        type.addChild(typeModifier);
        typeModifier.addChild(createAst(QuestionMark));
        type.addChild(createAst(Plus));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.castOperator();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Plus));
    }

    @Test
    public void ErroneousType_reportNoViableAltException()
            throws RecognitionException {
        ITSPHPAst ast = createAst(CAST);
        ITSPHPAst type = createAst(TYPE);
        ast.addChild(type);
        type.addChild(createAst(TYPE_MODIFIER));
        type.addChild(createAst(Plus));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.castOperator();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Plus));
    }
}

