/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.coverage;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.antlrmod.ErrorReportingPHP54TranslatorWalker;
import ch.tsphp.translators.php54.test.unit.testutils.AWalkerTest;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Break;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Continue;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.EOF;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Echo;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.NAMESPACE_BODY;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Try;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@SuppressWarnings("ThrowableResultOfMethodCallIgnored")
public class InstructionErrorTest extends AWalkerTest
{

    @Test
    public void ErroneousTokenAfterBreak_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst statement = createAst(NAMESPACE_BODY);
        ITSPHPAst ast = createAst(Break);
        statement.addChild(ast);
        statement.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.instruction();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(EOF));
    }

    @Test
    public void ErroneousTokenAfterContinue_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst statement = createAst(NAMESPACE_BODY);
        ITSPHPAst ast = createAst(Continue);
        statement.addChild(ast);
        statement.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.instruction();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(EOF));
    }

    @Test
    public void ErroneousEcho_reportEarlyExitException() throws RecognitionException {
        ITSPHPAst ast = createAst(Echo);
        ast.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.instruction();

        ArgumentCaptor<EarlyExitException> captor = ArgumentCaptor.forClass(EarlyExitException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }
}

