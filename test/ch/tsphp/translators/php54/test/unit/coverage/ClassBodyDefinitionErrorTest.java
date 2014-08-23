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

import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Construct;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.EOF;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.METHOD_DECLARATION;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.METHOD_MODIFIER;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Protected;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Public;
import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.Try;
import static org.antlr.runtime.tree.TreeParser.UP;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@SuppressWarnings("ThrowableResultOfMethodCallIgnored")
public class ClassBodyDefinitionErrorTest extends AWalkerTest
{

    @Test
    public void EmptyConstruct_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(Construct);

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(EOF));
    }

    @Test
    public void ErroneousConstruct_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(Construct);
        ast.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ConstructEmptyMethodModifier_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(Construct);
        ast.addChild(createAst(METHOD_MODIFIER));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(UP));
    }


    @Test
    public void ConstructErroneousMethodModifierAfterProtected_reportNoViableAltException() throws
            RecognitionException {
        ITSPHPAst ast = createAst(Construct);
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        ast.addChild(methodModifier);
        methodModifier.addChild(createAst(Protected));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void ConstructErroneousMethodModifierAfterPublic_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(Construct);
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        ast.addChild(methodModifier);
        methodModifier.addChild(createAst(Public));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void EmptyMethodDeclaration_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(METHOD_DECLARATION);

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(EOF));
    }

    @Test
    public void ErroneousMethodDeclaration_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(METHOD_DECLARATION);
        ast.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void MethodDeclarationEmptyMethodModifier_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(METHOD_DECLARATION);
        ast.addChild(createAst(METHOD_MODIFIER));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(UP));
    }

    @Test
    public void MethodDeclarationErroneousMethodModifier_reportNoViableAltException() throws RecognitionException {
        ITSPHPAst ast = createAst(METHOD_DECLARATION);
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        ast.addChild(methodModifier);
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void MethodDeclarationErroneousMethodModifierAfterProtected_reportNoViableAltException()
            throws RecognitionException {
        ITSPHPAst ast = createAst(METHOD_DECLARATION);
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        ast.addChild(methodModifier);
        methodModifier.addChild(createAst(Protected));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }

    @Test
    public void MethodDeclarationErroneousMethodModifierAfterPublic_reportNoViableAltException()
            throws RecognitionException {
        ITSPHPAst ast = createAst(METHOD_DECLARATION);
        ITSPHPAst methodModifier = createAst(METHOD_MODIFIER);
        ast.addChild(methodModifier);
        methodModifier.addChild(createAst(Public));
        methodModifier.addChild(createAst(Try));

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        walker.classBodyDefinition();

        ArgumentCaptor<NoViableAltException> captor = ArgumentCaptor.forClass(NoViableAltException.class);
        verify(walker).reportError(captor.capture());
        assertThat(captor.getValue().token.getType(), is(Try));
    }
}

