/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.coverage;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorTypeCheckerTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CastOperatorTest extends ATranslatorTypeCheckerTest
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
        String prefix = "<?php\nnamespace{\n    $a = null;\n    ($a !== null ? ($a !== false ? ";
        String appendix = " : false) : null);\n}\n?>";
        return Arrays.asList(new Object[][]{
                {"mixed $a=null; (cast bool) $a;", prefix + "(bool) $a" + appendix},
                {"mixed $a=null; (cast bool!) $a;", prefix + "(bool) $a" + appendix},
                {"mixed $a=null; (cast bool?) $a;", prefix + "(bool) $a" + appendix},
                {"mixed $a=null; (cast bool!?) $a;", prefix + "(bool) $a" + appendix},
                {"mixed $a=null; (cast int) $a;", prefix + "(int) $a" + appendix},
                {"mixed $a=null; (cast int!) $a;", prefix + "(int) $a" + appendix},
                {"mixed $a=null; (cast int?) $a;", prefix + "(int) $a" + appendix},
                {"mixed $a=null; (cast int!?) $a;", prefix + "(int) $a" + appendix},
                {"mixed $a=null; (cast float) $a;", prefix + "(float) $a" + appendix},
                {"mixed $a=null; (cast float!) $a;", prefix + "(float) $a" + appendix},
                {"mixed $a=null; (cast float?) $a;", prefix + "(float) $a" + appendix},
                {"mixed $a=null; (cast float!?) $a;", prefix + "(float) $a" + appendix},
                {"mixed $a=null; (cast string) $a;", prefix + "(string) $a" + appendix},
                {"mixed $a=null; (cast string!) $a;", prefix + "(string) $a" + appendix},
                {"mixed $a=null; (cast string?) $a;", prefix + "(string) $a" + appendix},
                {"mixed $a=null; (cast string!?) $a;", prefix + "(string) $a" + appendix},
                {"mixed $a=null; (cast array) $a;", prefix + "(array) $a" + appendix},
                {
                        "class MyClass{} mixed $a=null; (cast MyClass) $a;",
                        "<?php\nnamespace{\n    class MyClass {}\n    $a = null;\n    "
                                + "($a !== null ? ($a !== false ? "
                                + "($a instanceof MyClass ? $a : "
                                + "\\trigger_error('Cast failed, the evaluation type of $a must be MyClass.',"
                                + " \\E_RECOVERABLE_ERROR))"
                                + " : false) : null);\n}\n?>"
                },
        });
    }
}
