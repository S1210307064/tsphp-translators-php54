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
public class CastTest extends ATranslatorTypeCheckerTest
{

    public CastTest(String testString, String theExpectedResult) {
        super(testString, theExpectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        String $a = "($a !== null ? ($a !== false ? ($a instanceof MyClass ? $a : "
                + "\\trigger_error('Cast failed, the evaluation type of $a must be MyClass.', \\E_RECOVERABLE_ERROR))"
                + " : false)"
                + " : null)";
        String prefix = "<?php\nnamespace{\n    $a = null;\n    ($a !== null ? ($a !== false ? ";
        String appendix = " : false) : null);\n}\n?>";
        return Arrays.asList(new Object[][]{
                {"mixed $a = null; (bool) $a;", prefix + "(bool) $a" + appendix},
                {"mixed $a = null; (bool!) $a;", prefix + "(bool) $a" + appendix},
                {"mixed $a = null; (bool?) $a;", prefix + "(bool) $a" + appendix},
                {"mixed $a = null; (bool!?) $a;", prefix + "(bool) $a" + appendix},
                {"mixed $a = null; (int) $a;", prefix + "(int) $a" + appendix},
                {"mixed $a = null; (int!) $a;", prefix + "(int) $a" + appendix},
                {"mixed $a = null; (int?) $a;", prefix + "(int) $a" + appendix},
                {"mixed $a = null; (int!?) $a;", prefix + "(int) $a" + appendix},
                {"mixed $a = null; (float) $a;", prefix + "(float) $a" + appendix},
                {"mixed $a = null; (float!) $a;", prefix + "(float) $a" + appendix},
                {"mixed $a = null; (float?) $a;", prefix + "(float) $a" + appendix},
                {"mixed $a = null; (float!?) $a;", prefix + "(float) $a" + appendix},
                {"mixed $a = null; (string) $a;", prefix + "(string) $a" + appendix},
                {"mixed $a = null; (string!) $a;", prefix + "(string) $a" + appendix},
                {"mixed $a = null; (string?) $a;", prefix + "(string) $a" + appendix},
                {"mixed $a = null; (string!?) $a;", prefix + "(string) $a" + appendix},

                {
                        "class MyClass{} mixed $a=null;\n(MyClass) $a;",
                        "<?php\nnamespace{\n    class MyClass {}\n    $a = null;\n    " + $a + ";\n}\n?>"},
                {
                        "class A{}class MyClass extends A{} mixed $a=null;\n(A) (MyClass) $a;",
                        "<?php\nnamespace{\n    class A {}\n    class MyClass extends A {}\n    $a = null;\n    "
                                + "(($_t2_14 = " + $a + ") !== null ? "
                                + "($_t2_14 !== false ? "
                                + "($_t2_14 instanceof A ? "
                                + "$_t2_14 "
                                + ": \\trigger_error('Cast failed, the evaluation type of "
                                + $a + " must be A.', \\E_RECOVERABLE_ERROR))"
                                + " : false)"
                                + " : null);"
                                + "\n}\n?>"
                },
        });
    }
}
