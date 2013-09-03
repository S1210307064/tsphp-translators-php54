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
public class WhileTest extends ATranslatorParserTest
{

    public WhileTest(String testString, String expectedResult) {
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
                        "while(" + expression[0] + ") $a=1;",
                        "while (" + expression[1] + ") {\n    $a = 1;\n}"
                    });
            collection.add(new Object[]{
                        "do $a=1; while(" + expression[0] + ");",
                        "do {\n    $a = 1;\n} while(" + expression[1] + ");"
                    });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {"while( true  ) $a=1;", "while (true) {\n    $a = 1;\n}"},
                    {"while( true  ){$a=1;}", "while (true) {\n    $a = 1;\n}"},
                    {
                        "while( true  ){$a=1;int $b=2;}",
                        "while (true) {\n    $a = 1;\n    $b = 2;\n}"
                    },
                    {"do $a=1; while( true  );",  "do {\n    $a = 1;\n} while(true);"},
                    {"do {$a=1;} while( true  );", "do {\n    $a = 1;\n} while(true);"},
                    {"do {$a=1;$b=2;}while( true  );", "do {\n    $a = 1;\n    $b = 2;\n} while(true);"}
                }));
        return collection;
      
    }
}
