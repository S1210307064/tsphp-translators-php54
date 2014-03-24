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
public class CastAssignTest extends ATranslatorTypeCheckerTest
{

    public CastAssignTest(String testString, String theExpectedResult) {
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
                {"int $a =() 1 + 2;", prefix + "$a = (int) (1 + 2);" + appendix},
                {"int $a =() '1'.'1';", prefix + "$a = (int) ('1' . '1');" + appendix},
                {"int $a; $a =() 1 + 2;", prefix + "$a;\n    $a = (int) (1 + 2);" + appendix},
                {"int $a; $a =() '1'.'1';", prefix + "$a;\n    $a = (int) ('1' . '1');" + appendix},
        });
    }
}
