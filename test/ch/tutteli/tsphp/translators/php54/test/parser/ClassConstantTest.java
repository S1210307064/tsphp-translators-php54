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
package ch.tutteli.tsphp.translators.php54.test.parser;

import ch.tutteli.tsphp.translators.php54.test.testutils.ATranslatorParserTest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ClassConstantTest extends ATranslatorParserTest
{

    public ClassConstantTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"class a{const int a=1;}", "class a {\n    const a = 1;\n}"},
                    {"class a{const int a=1,b=1;}", "class a {\n    const a = 1, b = 1;\n}"},
                    {
                        "class a{const int a='hello'; const float b=1;}",
                        "class a {\n    const a = 'hello';\n    const b = 1;\n}"
                    },
                    {
                        "class a{const int a=true; const float b=null;}",
                        "class a {\n    const a = true;\n    const b = null;\n}"
                    },
                     {
                        "class a{const int a=Foo::a; const float b=self::a;}",
                        "class a {\n    const a = Foo::a;\n    const b = self::a;\n}"
                    },
                });
    }
}
