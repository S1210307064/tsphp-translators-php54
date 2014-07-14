/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.typechecker;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorTypeCheckerTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IntDivisionTest extends ATranslatorTypeCheckerTest
{

    public IntDivisionTest(String testString, String theExpectedResult) {
        super(testString, theExpectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        String prefix = "<?php\nnamespace{\n    ";
        String appendix = "\n}\n?>";
        return Arrays.asList(new Object[][]{
                //see TSPHP-733 - PHP's int division can yield a float
                {"int $i = 1 / 2;", prefix + "$i = (int) (1 / 2);" + appendix},
                {"int $i = 1 / 2 + 1;", prefix + "$i = (int) (1 / 2) + 1;" + appendix},
                {"float $i = 1 / 2 + 1.1;", prefix + "$i = (int) (1 / 2) + 1.1;" + appendix},
                {"int $i = 1; $i /= 2;", prefix + "$i = 1;\n    $i = (int) ($i / 2);" + appendix},
                //check that float division is not changed by TSPHP-733
                {"float $i = 1.1 / 2;", prefix + "$i = 1.1 / 2;" + appendix},
                {"float $i = 1.1; $i /= 2;", prefix + "$i = 1.1;\n    $i = $i / 2;" + appendix},

        });
    }
}
