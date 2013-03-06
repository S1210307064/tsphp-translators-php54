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
public class IfTest extends ATranslatorTest
{

    public IfTest(String testString, String expectedResult) {
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
                        "if(" + expression[0] + ") $a=1; else $a+=1;",
                        "if (" + expression[1] + ") {\n    ($a = 1);\n} else {\n    ($a += 1);\n}"
                    });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "if(true) $a=1; else if(false) $b=1; else $c=2;",
                        "if (true) {\n    ($a = 1);\n} else {\n    "
                            + "if (false) {\n        ($b = 1);\n    } else {\n        ($c = 2);\n    }"
                        + "\n}"
                    },
                    {
                        "if(true) $a=1; else if(false) $b=1; else if($a<1) $c=2; else $d*=1;",
                        "if (true) {\n    ($a = 1);\n} else {\n    "
                            + "if (false) {\n        ($b = 1);\n    } else {\n        "
                                + "if (($a < 1)) {\n            ($c = 2);\n        } "
                                + "else {\n            ($d *= 1);\n        }"
                            + "\n    }"
                        + "\n}"
                    },}));

        return collection;
    }
}
