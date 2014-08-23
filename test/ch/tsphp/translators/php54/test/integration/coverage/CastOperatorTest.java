/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.coverage;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CastOperatorTest extends ATranslatorParserTest
{

    public CastOperatorTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        String $a = "($a !== null ? ($a instanceof MyClass ? $a : "
                + "\\trigger_error('Cast failed, the evaluation type of $a must be MyClass', \\E_RECOVERABLE_ERROR)) "
                + ": null);";
        return Arrays.asList(new Object[][]{
                {"(cast bool) $a;", "(bool) $a;"},
                {"(cast bool?) $a;", "($a !== null ? (bool) $a : null);"},
                {"(cast int) $a;", "(int) $a;"},
                {"(cast int?) $a;", "($a !== null ? (int) $a : null);"},
                {"(cast float) $a;", "(float) $a;"},
                {"(cast float?) $a;", "($a !== null ? (float) $a : null);"},
                {"(cast string) $a;", "(string) $a;"},
                {"(cast string?) $a;", "($a !== null ? (string) $a : null);"},
                {"(cast array) $a;", "($a !== null ? (array) $a : null);"},
                {"(cast MyClass) $a;", $a},
        });
    }
}
