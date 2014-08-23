/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.testutils;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import org.antlr.runtime.RecognitionException;
import org.junit.Ignore;

import static ch.tsphp.typechecker.antlr.TSPHPTypeCheckWalker.EOF;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@Ignore
public abstract class ANodeWithoutChildrenWalkerTest extends AWalkerTest
{
    protected String testCase;
    protected int tokenType;


    public ANodeWithoutChildrenWalkerTest(String theTestCase, int theTokenType) {
        testCase = theTestCase;
        tokenType = theTokenType;
    }

    public abstract void walk(PHP54TranslatorWalker walker) throws RecognitionException;

    public void check() throws RecognitionException {
        ITSPHPAst ast = createAst(tokenType);

        PHP54TranslatorWalker walker = spy(createWalker(ast));
        walk(walker);

        assertThat(testCase, treeNodeStream.LA(1), is(EOF));
        verify(walker).reportError(any(org.antlr.runtime.NoViableAltException.class));
    }
}
