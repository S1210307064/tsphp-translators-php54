/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This file is based on the file ArrayKeyValueExpressionTest from the translator component of the TinsPHP project.
 * TinsPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
 */

package ch.tsphp.translators.php54.test.integration.coverage;

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
public class ArrayKeyValueExpressionTest extends ATranslatorParserTest
{

    public ArrayKeyValueExpressionTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        List<String[]> expressions = ExpressionHelper.getAllExpressions(1);
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                    "[" + expression[0] + "];",
                    "[" + expression[1] + "];"
            });
        }
        return collection;
    }
}
