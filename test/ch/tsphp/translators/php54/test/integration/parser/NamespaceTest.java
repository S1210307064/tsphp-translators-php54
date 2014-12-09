/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
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
public class NamespaceTest extends ATranslatorParserTest
{

    public NamespaceTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }


    @Override
    public ParserRuleReturnScope parserRun(TSPHPParser parser) throws RecognitionException {
        return parser.compilationUnit();
    }

    @Override
    public void run() throws RecognitionException {
        result = translator.compilationUnit();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"namespace{}", "<?php\nnamespace{}\n?>"},
                {"namespace  {}", "<?php\nnamespace{}\n?>"},
                {"namespace a{}", "<?php\nnamespace a{}\n?>"},
                {"namespace a\\b{}", "<?php\nnamespace a\\b{}\n?>"},
                {"namespace a;", "<?php\nnamespace a{}\n?>"},
                {"namespace a\\b\\c;", "<?php\nnamespace a\\b\\c{}\n?>"},
                {"namespace a\\b{} namespace{}", "<?php\nnamespace a\\b{}\nnamespace{}\n?>"},
                {
                        " namespace{} namespace a\\b{}  namespace{}  namespace a{}",
                        "<?php\nnamespace{}\nnamespace a\\b{}\nnamespace{}\nnamespace a{}\n?>"
                },
        });
    }
}
