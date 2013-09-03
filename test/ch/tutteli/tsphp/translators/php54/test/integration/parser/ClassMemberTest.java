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
package ch.tutteli.tsphp.translators.php54.test.integration.parser;

import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
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
public class ClassMemberTest extends ATranslatorParserTest
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
        List<Object[]> collection = new ArrayList<>();
        String[][] variations = new String[][]{
            {"", "public"},
            {"private", "private"},
            {"private static", "private static"},
            {"protected", "protected"},
            {"protected static", "protected static"},
            {"public", "public"},
            {"public static", "public static"},
            {"static", "static public"},
            {"static private", "static private"},
            {"static protected", "static protected"},
            {"static public", "static public"}
        };
        for (String[] variation : variations) {
            collection.add(new Object[]{
                        "class a{" + variation[0] + " int $a=1;}",
                        "class a {\n    " + variation[1] + " $a = 1;\n}"
                    });
            collection.add(new Object[]{
                        "class a{" + variation[0] + " int $a;}",
                        "class a {\n    " + variation[1] + " $a;\n}"
                    });
            collection.add(new Object[]{
                        "class a{" + variation[0] + " int $a,$b=1;}",
                        "class a {\n    " + variation[1] + " $a, $b = 1;\n}"
                    });
        }
        collection.add(new Object[]{
                        "class a{private int $a,$b,$c=1;}",
                        "class a {\n    private $a, $b, $c = 1;\n}"
                    });
        return collection;
    }
}
