package ch.tutteli.tsphp.translators.php54.test;

import ch.tutteli.tsphp.translators.php54.test.testutils.ATest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class ClassMemberTest extends ATest
{

    public ClassMemberTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"class a{int $a=1;}", "class a {\n    public $a = 1;\n}"},
                    {"class a{private int $a=1;}", "class a {\n    private $a = 1;\n}"},
                    {"class a{protected int $a=1;}", "class a {\n    protected $a = 1;\n}"},
                    {"class a{public int $a=1;}", "class a {\n    public $a = 1;\n}"},
                    //
                    {"class a{static int $a;}", "class a {\n    static public $a;\n}"},
                    {"class a{static private int $a;}", "class a {\n    static private $a;\n}"},
                    {"class a{static protected int $a;}", "class a {\n    static protected $a;\n}"},
                    {"class a{static public int $a;}", "class a {\n    static public $a;\n}"},
                    //
                    {"class a{private static int $a;}", "class a {\n    private static $a;\n}"},
                    {"class a{protected static int $a;}", "class a {\n    protected static $a;\n}"},
                    {"class a{ public static int $a;}", "class a {\n    public static $a;\n}"},
                    //
                    {"class a{int $a, $b;}", "class a {\n    public $a, $b;\n}"},
                    {"class a{private int $a,$b=1,$c;}", "class a {\n    private $a, $b = 1, $c;\n}"},
                    {"class a{protected int $a,$b,$c=1;}", "class a {\n    protected $a, $b, $c = 1;\n}"},
                    {"class a{public int $a=1,$b=1,$c;}", "class a {\n    public $a = 1, $b = 1, $c;\n}"},
                });
    }
}
