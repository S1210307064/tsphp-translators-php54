/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.parser;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tsphp.translators.php54.test.integration.testutils.ExpressionHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class VariableDeclarationTest extends ATranslatorParserTest
{

    public VariableDeclarationTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"int $a;", "$a;"});
        collection.add(new Object[]{"int $a, $b=1;", "$a;\n$b = 1;"});
        collection.add(new Object[]{"int $a=60*60, $b;", "$a = 60 * 60;\n$b;"});

        List<String[]> expressions = ExpressionHelper.getAllExpressions(7);
        for (String[] expression : expressions) {
            collection.add(new Object[]{
                "int $a=" + expression[0] + ";",
                "$a = " + expression[1] + ";"
            });
        }

        expressions = ExpressionHelper.getAllExpressions(9);
        for (String[] expression : expressions) {
            collection.add(new Object[]{
                    "int $a=()" + expression[0] + ";",
                    "$a = (int) " + expression[1] + ";"
            });
        }

        return collection;
    }
}
