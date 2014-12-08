/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This file is part of the TinsPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TINS/License
 */

package ch.tsphp.translators.php54.test.unit;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.IPrecedenceHelper;
import ch.tsphp.translators.php54.PHP54PrecedenceHelper;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class TSPHPPrecedenceHelperDifferentGroupTest
{
    private int first;
    private int second;

    public TSPHPPrecedenceHelperDifferentGroupTest(int theFirst, int theSecond) {
        first = theFirst;
        second = theSecond;
    }

    @Test
    public void needParentheses_FirstIsParentOfSecond_ReturnsTrue() {
        ITSPHPAst ast = mock(ITSPHPAst.class);
        when(ast.getType()).thenReturn(first);
        ITSPHPAst parent = mock(ITSPHPAst.class);
        when(ast.getParent()).thenReturn(parent);
        when(parent.getType()).thenReturn(second);

        IPrecedenceHelper precedenceHelper = createPrecedenceHelper();
        boolean result = precedenceHelper.needParentheses(ast);

        assertThat(result, is(true));
    }

    @Test
    public void needParentheses_SecondIsParentOfFirst_ReturnsFalse() {
        ITSPHPAst ast = mock(ITSPHPAst.class);
        when(ast.getType()).thenReturn(second);
        ITSPHPAst parent = mock(ITSPHPAst.class);
        when(ast.getParent()).thenReturn(parent);
        when(parent.getType()).thenReturn(first);

        IPrecedenceHelper precedenceHelper = createPrecedenceHelper();
        boolean result = precedenceHelper.needParentheses(ast);

        assertThat(result, is(false));
    }

    @Test
    public void needParentheses_FirstIsParentOfFirst_ReturnsFalse() {
        ITSPHPAst ast = mock(ITSPHPAst.class);
        when(ast.getType()).thenReturn(first);
        ITSPHPAst parent = mock(ITSPHPAst.class);
        when(ast.getParent()).thenReturn(parent);
        when(parent.getType()).thenReturn(first);

        IPrecedenceHelper precedenceHelper = createPrecedenceHelper();
        boolean result = precedenceHelper.needParentheses(ast);

        assertThat(result, is(false));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {PHP54TranslatorWalker.LogicOrWeak, PHP54TranslatorWalker.LogicXorWeak},
                {PHP54TranslatorWalker.LogicXorWeak, PHP54TranslatorWalker.LogicAndWeak},
                {PHP54TranslatorWalker.LogicAndWeak, PHP54TranslatorWalker.Assign},
                {PHP54TranslatorWalker.Assign, PHP54TranslatorWalker.QuestionMark},
                {PHP54TranslatorWalker.QuestionMark, PHP54TranslatorWalker.LogicOr},
                {PHP54TranslatorWalker.LogicOr, PHP54TranslatorWalker.LogicAnd},
                {PHP54TranslatorWalker.LogicAnd, PHP54TranslatorWalker.BitwiseOr},
                {PHP54TranslatorWalker.BitwiseOr, PHP54TranslatorWalker.BitwiseXor},
                {PHP54TranslatorWalker.BitwiseXor, PHP54TranslatorWalker.BitwiseAnd},
                {PHP54TranslatorWalker.BitwiseAnd, PHP54TranslatorWalker.Equal},
                {PHP54TranslatorWalker.Equal, PHP54TranslatorWalker.LessThan},
                {PHP54TranslatorWalker.LessThan, PHP54TranslatorWalker.ShiftLeft},
                {PHP54TranslatorWalker.ShiftLeft, PHP54TranslatorWalker.Plus},
                {PHP54TranslatorWalker.Plus, PHP54TranslatorWalker.Multiply},
                {PHP54TranslatorWalker.Multiply, PHP54TranslatorWalker.Instanceof},
                {PHP54TranslatorWalker.Instanceof, PHP54TranslatorWalker.CAST},
                {PHP54TranslatorWalker.CAST, PHP54TranslatorWalker.New},
                {PHP54TranslatorWalker.New, PHP54TranslatorWalker.POST_INCREMENT},

                //one additional test to see that separated group work correctly as well
                {PHP54TranslatorWalker.LogicOrWeak, PHP54TranslatorWalker.POST_INCREMENT},
        });
    }

    protected IPrecedenceHelper createPrecedenceHelper() {
        return new PHP54PrecedenceHelper();
    }
}
