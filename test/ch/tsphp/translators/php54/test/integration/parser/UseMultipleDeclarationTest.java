/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This file is based on the file UseMultipleTest from the TinsSPHP project.
 * TSPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
 */

package ch.tsphp.translators.php54.test.integration.parser;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UseMultipleDeclarationTest extends ATranslatorParserTest
{

    public UseMultipleDeclarationTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    protected ParserRuleReturnScope parserRun(TSPHPParser parser) throws RecognitionException {
        return parser.compilationUnit();
    }

    protected void run() throws RecognitionException {
        result = translator.compilationUnit();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        //see TSPHP-910 multiple use statements, only last is in output
        return Arrays.asList(new Object[][]{
                {
                        "use \\a, \\b;",
                        "<?php\nnamespace{\n    use \\a as a, \\b as b;\n}\n?>"
                },
                {
                        "use \\a\\a, \\b\\b, \\c as c;",
                        "<?php\nnamespace{\n    use \\a\\a as a, \\b\\b as b, \\c as c;\n}\n?>"
                },
                {
                        "use \\a, \\a\\b as c, \\a\\d;",
                        "<?php\nnamespace{\n    use \\a as a, \\a\\b as c, \\a\\d as d;\n}\n?>"
                }
        });
    }
}
