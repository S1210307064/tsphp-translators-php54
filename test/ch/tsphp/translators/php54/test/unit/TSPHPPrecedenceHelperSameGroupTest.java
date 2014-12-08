/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This file is based on the file TSPHPPrecedenceHelperSameGroupTest from the TinsSPHP project.
 * TSPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
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
public class TSPHPPrecedenceHelperSameGroupTest
{
    private int first;
    private int second;

    public TSPHPPrecedenceHelperSameGroupTest(int theFirst, int theSecond) {
        first = theFirst;
        second = theSecond;
    }

    @Test
    public void needParentheses_FirstIsParentOfSecond_ReturnsFalse() {
        ITSPHPAst ast = mock(ITSPHPAst.class);
        when(ast.getType()).thenReturn(first);
        ITSPHPAst parent = mock(ITSPHPAst.class);
        when(ast.getParent()).thenReturn(parent);
        when(parent.getType()).thenReturn(second);

        IPrecedenceHelper precedenceHelper = createPrecedenceHelper();
        boolean result = precedenceHelper.needParentheses(ast);

        assertThat(result, is(false));
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
                {PHP54TranslatorWalker.Assign, PHP54TranslatorWalker.PlusAssign},
                {PHP54TranslatorWalker.PlusAssign, PHP54TranslatorWalker.MinusAssign},
                {PHP54TranslatorWalker.MinusAssign, PHP54TranslatorWalker.DotAssign},
                {PHP54TranslatorWalker.DotAssign, PHP54TranslatorWalker.MultiplyAssign},
                {PHP54TranslatorWalker.MultiplyAssign, PHP54TranslatorWalker.DivideAssign},
                {PHP54TranslatorWalker.DivideAssign, PHP54TranslatorWalker.BitwiseAndAssign},
                {PHP54TranslatorWalker.BitwiseAndAssign, PHP54TranslatorWalker.BitwiseOrAssign},
                {PHP54TranslatorWalker.BitwiseOrAssign, PHP54TranslatorWalker.BitwiseXorAssign},
                {PHP54TranslatorWalker.BitwiseXorAssign, PHP54TranslatorWalker.ModuloAssign},
                {PHP54TranslatorWalker.ModuloAssign, PHP54TranslatorWalker.ShiftLeftAssign},
                {PHP54TranslatorWalker.ShiftLeftAssign, PHP54TranslatorWalker.ShiftRightAssign},
                {PHP54TranslatorWalker.ShiftRightAssign, PHP54TranslatorWalker.Assign},

                {PHP54TranslatorWalker.Equal, PHP54TranslatorWalker.NotEqual},
                {PHP54TranslatorWalker.NotEqual, PHP54TranslatorWalker.Identical},
                {PHP54TranslatorWalker.Identical, PHP54TranslatorWalker.NotIdentical},
                {PHP54TranslatorWalker.NotIdentical, PHP54TranslatorWalker.Equal},

                {PHP54TranslatorWalker.LessThan, PHP54TranslatorWalker.LessEqualThan},
                {PHP54TranslatorWalker.LessEqualThan, PHP54TranslatorWalker.GreaterThan},
                {PHP54TranslatorWalker.GreaterThan, PHP54TranslatorWalker.GreaterEqualThan},
                {PHP54TranslatorWalker.GreaterEqualThan, PHP54TranslatorWalker.LessThan},

                {PHP54TranslatorWalker.ShiftLeft, PHP54TranslatorWalker.ShiftRight},

                {PHP54TranslatorWalker.Plus, PHP54TranslatorWalker.Minus},
                {PHP54TranslatorWalker.Minus, PHP54TranslatorWalker.Dot},
                {PHP54TranslatorWalker.Dot, PHP54TranslatorWalker.Plus},

                {PHP54TranslatorWalker.Multiply, PHP54TranslatorWalker.Divide},
                {PHP54TranslatorWalker.Divide, PHP54TranslatorWalker.Modulo},
                {PHP54TranslatorWalker.Modulo, PHP54TranslatorWalker.Multiply},

                {PHP54TranslatorWalker.CAST, PHP54TranslatorWalker.PRE_INCREMENT},
                {PHP54TranslatorWalker.PRE_INCREMENT, PHP54TranslatorWalker.PRE_DECREMENT},
                {PHP54TranslatorWalker.PRE_DECREMENT, PHP54TranslatorWalker.At},
                {PHP54TranslatorWalker.At, PHP54TranslatorWalker.BitwiseNot},
                {PHP54TranslatorWalker.BitwiseNot, PHP54TranslatorWalker.LogicNot},
                {PHP54TranslatorWalker.LogicNot, PHP54TranslatorWalker.UNARY_MINUS},
                {PHP54TranslatorWalker.UNARY_MINUS, PHP54TranslatorWalker.UNARY_PLUS},
                {PHP54TranslatorWalker.UNARY_PLUS, PHP54TranslatorWalker.CAST},

                {PHP54TranslatorWalker.New, PHP54TranslatorWalker.Clone},

                {PHP54TranslatorWalker.POST_INCREMENT, PHP54TranslatorWalker.POST_DECREMENT},
        });
    }

    protected IPrecedenceHelper createPrecedenceHelper() {
        return new PHP54PrecedenceHelper();
    }
}
