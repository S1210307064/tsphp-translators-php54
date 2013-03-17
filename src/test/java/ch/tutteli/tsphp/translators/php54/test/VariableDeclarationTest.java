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
public class VariableDeclarationTest extends ATranslatorTest
{

    public VariableDeclarationTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        collection.add(new Object[]{"int $a;", "$a;"});
        collection.add(new Object[]{"int $a, $b=1;", "$a;\n$b = 1;"});
        collection.add(new Object[]{"int $a=60*60, $b;", "$a = 60 * 60;\n$b;"});

        List<String[]> expressions = ExpressionHelper.getExpressions();
        for (String[] expression : expressions) {
            collection.add(new Object[]{
                "int $a=" + expression[0] + ";",
                "$a = " + expression[1] + ";"
            });
            collection.add(new Object[]{
                "cast int $a=" + expression[0] + ";",
                "$a = " + expression[1] + ";"
            });
            collection.add(new Object[]{
                "cast int $a=()" + expression[0] + ";",
                "$a = (int) " + expression[1] + ";"
            });
        }
        return collection;
    }
}
