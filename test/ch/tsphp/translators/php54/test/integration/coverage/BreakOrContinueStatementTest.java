/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.coverage;

import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tsphp.translators.php54.test.integration.testutils.StatementHelper;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BreakOrContinueStatementTest extends ATranslatorParserTest
{

    public BreakOrContinueStatementTest(String testString, String expectedResult) {
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
        Collection<Object[]> collection = new ArrayList<>();
        collection.addAll(
                StatementHelper.getStatements("break;", "",
                        "<?php\nnamespace{\n    break;", "    ", "\n}\n?>"));
        collection.addAll(
                StatementHelper.getStatements("continue;", "",
                        "<?php\nnamespace{\n    continue;", "    ", "\n}\n?>"));
        return collection;
    }
}
