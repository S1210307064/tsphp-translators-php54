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
public class CompleteClassTest extends ATranslatorParserTest
{

    public CompleteClassTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {
                        "class A extends B implements \\A{\n"
                            +"const bool A=true,B=null,C=false;\n"
                            +"private int $a,$b=1,$c='1';\n"
                            +"/*some comments \n"
                            + "*/\n"
                            +"public function __construct(int $number){\n"
                                +"$number!=null or exit('$number is null');\n"
                                +"$this->number = $number;\n"
                            + "}\n"
                            +"// a comment\n"
                            +"static protected C $a=new C(),$b,$c=null;\n"
                            + "function void set(int $b,cast float $c){\n"
                                +"if($b==1 && $c <2){\n"
                                    +"while(true){\n"
                                        +"++$i;\n"
                                        + "if($i>=10) break;\n"
                                    + "}\n"
                                + "}\n"
                            + "}\n"
                        + "}\n",
                        "class A extends B implements \\A {"
                        + "\n    const A = true, B = null, C = false;"
                        + "\n    private $a, $b = 1, $c = '1';"
                        + "\n    public function __construct($number) {"
                        + "\n        $number != null or exit('$number is null');"
                        + "\n        $this->number = $number;"
                        + "\n    }"
                        + "\n    static protected $a = new C(), $b, $c = null;"
                        + "\n    public function set($b, $c) {"
                        + "\n        if ($b == 1 && $c < 2) {"
                        + "\n            while (true) {"
                        + "\n                ++$i;"
                        + "\n                if ($i >= 10) {"
                        + "\n                    break;"
                        + "\n                }"
                        + "\n            }"
                        + "\n        }"
                        + "\n    }"
                        + "\n}"
                    },
                    
                });

    }
}
