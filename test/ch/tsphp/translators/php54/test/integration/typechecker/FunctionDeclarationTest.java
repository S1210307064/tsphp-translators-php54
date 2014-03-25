/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.typechecker;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorTypeCheckerTest;
import ch.tsphp.translators.php54.test.integration.testutils.AssignHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class FunctionDeclarationTest extends ATranslatorTypeCheckerTest
{

    public FunctionDeclarationTest(String testString, String theExpectedResult) {
        super(testString, "<?php\nnamespace{\n    "+theExpectedResult+"\n}\n?>");
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                //see TSPHP-762
                {"function void foo(int $i = 10){}","function foo($i = 10) {\n    }"},
                {"function void foo(int? $i = 10){}","function foo($i = 10) {\n    }"},
                {"function void foo(int? $i = null){}","function foo($i = null) {\n    }"}
        });
    }
}
