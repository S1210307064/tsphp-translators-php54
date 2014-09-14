/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.coverage;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.antlrmod.ErrorReportingPHP54TranslatorWalker;
import ch.tsphp.translators.php54.test.unit.testutils.AWalkerTest;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.Final;
import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.METHOD_MODIFIER;
import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.Private;
import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.Protected;
import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.Public;
import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.Static;
import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.Try;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@SuppressWarnings("ThrowableResultOfMethodCallIgnored")
public class MethodModifierErrorTest extends AWalkerTest
{

    @Test
    public void ErroneousTokenAfterStatic_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Static));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterStaticPrivate_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Static));
        methodModifier.addChild(createAst(Private));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterStaticProtected_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Static));
        methodModifier.addChild(createAst(Protected));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterStaticPublic_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Static));
        methodModifier.addChild(createAst(Public));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterFinal_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Final));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterFinalPrivate_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Final));
        methodModifier.addChild(createAst(Private));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterFinalProtected_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Final));
        methodModifier.addChild(createAst(Protected));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterFinalPublic_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Final));
        methodModifier.addChild(createAst(Public));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterPrivate_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Private));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterPrivateFinal_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Private));
        methodModifier.addChild(createAst(Final));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterPrivateStatic_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Private));
        methodModifier.addChild(createAst(Static));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterProtected_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Protected));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterProtectedFinal_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Protected));
        methodModifier.addChild(createAst(Final));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterProtectedStatic_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Protected));
        methodModifier.addChild(createAst(Static));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterPublic_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Public));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterPublicFinal_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Public));
        methodModifier.addChild(createAst(Final));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ErroneousTokenAfterPublicStatic_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        methodModifier.addChild(createAst(Public));
        methodModifier.addChild(createAst(Static));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(methodModifier));
        //consume METHOD_MODIFIER and DOWN
        treeNodeStream.consume();
        treeNodeStream.consume();
        walker.methodModifier();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }
}

