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
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ForeachTest extends ATranslatorParserTest
{

    public ForeachTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        List<String[]> expressions = ExpressionHelper.getAllExpressions(8);
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "foreach(" + expression[0] + " as object $v);",
                        "foreach (" + expression[1] + " as $v) {\n}"
                    });
        }

        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "foreach($a as int $k => MyClass $v)$a=1;",
                        "foreach ($a as $k => $v) {\n    $a = 1;\n}"
                    },
                    {
                        "foreach($a as float $v) $a=1;",
                        "foreach ($a as $v) {\n    $a = 1;\n}"
                    },
                    {
                        "foreach($a as string $k => string $v){$a=1;}",
                        "foreach ($a as $k => $v) {\n    $a = 1;\n}"
                    },
                    {
                        "foreach($a as bool $v) {$a=1;}",
                        "foreach ($a as $v) {\n    $a = 1;\n}"
                    },
                    {
                        "foreach($a as bool $k=> array $v){$a=1; $b=2;}",
                        "foreach ($a as $k => $v) {\n    $a = 1;\n    $b = 2;\n}"
                    },
                    {
                        "foreach($a as int $v) {$a=1; $b=3;}",
                        "foreach ($a as $v) {\n    $a = 1;\n    $b = 3;\n}"
                    }
                }));
        return collection;
    }
}
