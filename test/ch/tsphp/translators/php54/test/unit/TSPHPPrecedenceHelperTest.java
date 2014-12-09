/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This file is based on the file TSPHPPrecedenceHelperTest from the TinsSPHP project.
 * TSPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
 */

package ch.tsphp.translators.php54.test.unit;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.IPrecedenceHelper;
import ch.tsphp.translators.php54.PHP54PrecedenceHelper;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TSPHPPrecedenceHelperTest
{
    @Test
    public void needParentheses_ParentIsNotOperator_ReturnsFalse() {
        ITSPHPAst ast = mock(ITSPHPAst.class);
        when(ast.getType()).thenReturn(PHP54TranslatorWalker.Plus);
        ITSPHPAst parent = mock(ITSPHPAst.class);
        when(ast.getParent()).thenReturn(parent);
        when(parent.getType()).thenReturn(PHP54TranslatorWalker.EXPRESSION);

        IPrecedenceHelper precedenceHelper = createPrecedenceHelper();
        boolean result = precedenceHelper.needParentheses(ast);

        assertThat(result, is(false));
    }

    protected IPrecedenceHelper createPrecedenceHelper() {
        return new PHP54PrecedenceHelper();
    }
}
