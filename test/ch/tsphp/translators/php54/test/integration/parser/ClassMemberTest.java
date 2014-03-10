/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.parser;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ClassMemberTest extends ATranslatorParserTest
{

    public ClassMemberTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException  {
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
