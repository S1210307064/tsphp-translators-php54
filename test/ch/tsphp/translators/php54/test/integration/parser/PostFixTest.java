/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.parser;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PostFixTest extends ATranslatorParserTest
{

    public PostFixTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        String[][] tmp1 = new String[][]{
            {"$a->foo()", "$a->foo()"},
            {"$this->foo()", "$this->foo()"},
            {"self::foo()", "self::foo()"},
            {"parent::foo()", "parent::foo()"},
            {"Foo::foo()", "Foo::foo()"},
            //
            {"$a[0]", "$a[0]"},
            {"$this[0]", "$this[0]"},
            //
            {"self::$a", "self::$a"},
            {"parent::$a", "parent::$a"},
            {"Foo::$a", "Foo::$a"},
            {"\\bar\\Foo::$a", "\\bar\\Foo::$a"}
        };
        List<Object[]> tmp2 = new ArrayList<>();
        for (String[] expression : tmp1) {
            tmp2.add(expression);
            tmp2.add(new String[]{expression[0] + "[0]", expression[1] + "[0]"});
            tmp2.add(new String[]{
                        expression[0] + "->foo('hello')",
                        expression[1] + "->foo('hello')"
                    });
        }

        List<Object[]> tmp3 = new ArrayList<>();
        for (Object[] expression : tmp2) {
            tmp3.add(expression);
            tmp3.add(new String[]{expression[0] + "[$i]", expression[1] + "[$i]"});
            tmp3.add(new String[]{
                        expression[0] + "->foo(1,2)",
                        expression[1] + "->foo(1, 2)",
                    });
        }

        for (Object[] expression : tmp3) {
            collection.add(new Object[]{expression[0] + ";",expression[1]+";"});
            collection.add(new Object[]{
                expression[0] + "[$i+$j%2];", expression[1]+"[$i + $j % 2];"
            });
            collection.add(new Object[]{
                        expression[0] + "->foo($a + $b);",
                        expression[1] + "->foo($a + $b);"
                    });
        }

        return collection;
    }
}
