/*
 * Copyright 2013 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.tutteli.tsphp.translators.php54.test.integration.parser;

import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ExpressionHelper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ForeachTest extends ATranslatorParserTest
{

    public ForeachTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        List<String[]> expressions = ExpressionHelper.getExpressions();
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
