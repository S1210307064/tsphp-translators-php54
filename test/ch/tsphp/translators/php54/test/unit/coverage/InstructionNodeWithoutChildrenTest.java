/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.coverage;

import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import ch.tsphp.translators.php54.test.unit.testutils.ANodeWithoutChildrenWalkerTest;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeRuleReturnScope;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.VARIABLE_DECLARATION_LIST;

@RunWith(Parameterized.class)
public class InstructionNodeWithoutChildrenTest extends ANodeWithoutChildrenWalkerTest
{

    public InstructionNodeWithoutChildrenTest(String theTestCase, int theTokenType) {
        super(theTestCase, theTokenType);
    }

    @Override
    public TreeRuleReturnScope walk(PHP54TranslatorWalker walker) throws RecognitionException {
        return walker.instruction();
    }

    @Test
    public void test() throws RecognitionException, IllegalAccessException, NoSuchFieldException {
        check();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"Local variable declaration list", VARIABLE_DECLARATION_LIST},

        });
    }
}

