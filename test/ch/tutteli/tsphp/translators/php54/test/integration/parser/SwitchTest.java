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
public class SwitchTest extends ATranslatorParserTest
{

    public SwitchTest(String testString, String expectedResult) {
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
                        "switch(" + expression[0] + "){}",
                        "switch (" + expression[1] + ") {\n}"
                    });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "switch($a){ case 1: $a=1; }",
                        "switch ($a) {\n    case 1:\n        $a = 1;\n}"
                    },
                    {
                        "switch($a){ case 1: case 2: $a=1; break; }",
                        "switch ($a) {\n    case 1:\n    case 2:\n        $a = 1;\n        break;\n}"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: $c=1;}",
                        "switch ($a) {\n    case 1:\n        $a = 1;\n    case 2:\n        $c = 1;\n}"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: case 3: $a=1; }",
                        "switch ($a) {\n    case 1:\n        $a = 1;\n    case 2:\n    case 3:\n        $a = 1;\n}"
                    },
                    {
                        "switch($a){ case 1: $a=1; $b=2; }",
                        "switch ($a) {\n    case 1:\n        $a = 1;\n        $b = 2;\n}"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: case 3: $a=2; default: $c=2; }",
                        "switch ($a) {\n    case 1:\n        $a = 1;\n    case 2:\n    case 3:\n        $a = 2;"
                        + "\n    default:\n        $c = 2;\n}"
                    },
                    {
                        "switch($a){ case 1: $a=1; case 2: $a=1; default: $c=2; case 3: $a=2; }",
                        "switch ($a) {\n    case 1:\n        $a = 1;\n    case 2:\n        $a = 1;"
                        + "\n    default:\n        $c = 2;\n    case 3:\n        $a = 2;\n}"
                    },
                    {
                        "switch($a){ case 1: {$a=1; $b=2; } case 2: case 3: {$a=1;} }",
                        "switch ($a) {\n    case 1:\n        $a = 1;\n        $b = 2;"
                        + "\n    case 2:\n    case 3:\n        $a = 1;\n}"
                    },
                    {
                        "switch($a){ case 1: {$a=1; $b=2; } {$a=1;} case 2: case 3: {$a=1;} }",
                        "switch ($a) {\n    case 1:\n        $a = 1;\n        $b = 2;\n        $a = 1;"
                        + "\n    case 2:\n    case 3:\n        $a = 1;\n}"
                    },
                    //due to the design decision that empty cases are allowed
                    {
                        "switch($a){ case 1: $a=1; case 1+1: default: case 2: $b=2; case 2: case 3: {$a=1;} }",
                        "switch ($a) {\n    case 1:\n        $a = 1;"
                        + "\n    case 1 + 1:\n    case 2:\n    default:\n        $b = 2;"
                        + "\n    case 2:\n    case 3:\n        $a = 1;\n}"
                    }
                }));
        return collection;
    }
}
