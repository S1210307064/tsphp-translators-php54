/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
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
package ch.tutteli.tsphp.translators.php54.test;

import ch.tutteli.tsphp.translators.php54.test.testutils.ATranslatorTest;
import ch.tutteli.tsphp.translators.php54.test.testutils.ExpressionHelper;
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
public class ForTest extends ATranslatorTest
{

    public ForTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "for($a=1     ; true ; ++$i  ) $a=1;",
                        "for ($a = 1; true; ++$i) {\n    $a = 1;\n}"
                    },
                    {
                        "for(         ; true ; ++$i  ) $a=1;",
                        "for (; true; ++$i) {\n    $a = 1;\n}"
                    },
                    {
                        "for(         ;      ; $i+=1 ) $a=1;",
                        "for (; ; $i = $i + 1) {\n    $a = 1;\n}"
                    },
                    {
                        "for(         ; true ;       ) $a=1;",
                        "for (; true; ) {\n    $a = 1;\n}"
                    },
                    {
                        "for(         ;      ;       ) $a=1;",
                        "for (; ; ) {\n    $a = 1;\n}"
                    },
                    {
                        "for(int $i=0;$i<10;++$i){}",
                        "for ($i = 0; $i < 10; ++$i) {\n}"
                    }
                }));

        List<String[]> expressions = ExpressionHelper.getExpressions();
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "for(" + expression[0] + ";" + expression[0] + ";" + expression[0] + ") $a=1;",
                        "for (" + expression[1] + "; " + expression[1] + "; " + expression[1] + ") {\n    $a = 1;\n}"
                    });
            collection.add(new Object[]{
                        "for("
                        + expression[0] + "," + expression[0] + ";"
                        + expression[0] + "," + expression[0] + ";"
                        + expression[0] + "," + expression[0] + " "
                        + ") $a^=1;",
                        "for (" + expression[1] + ", " + expression[1] + "; "
                        + expression[1] + ", " + expression[1] + "; "
                        + expression[1] + ", " + expression[1] + ") {\n    $a = $a ^ 1;\n}"
                    });
        }


        return collection;
    }
}
