/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.parser;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tsphp.translators.php54.test.integration.testutils.ParameterListHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ConstructDestructTest extends ATranslatorParserTest
{

    private static List<Object[]> collection;

    public ConstructDestructTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        collection = new ArrayList<>();

        addModifiers();

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "class a {function __construct", "{}}",
                "class a {\n    public function __construct", " {\n    }\n}"));

        return collection;

    }

    private static void addModifiers() {
        String[][] variations = new String[][]{
                {"", "public"},
                //
                {"private", "private"},
                {"private final", "private final"},
                //
                {"protected", "protected"},
                {"protected final", "protected final"},
                //
                {"public", "public"},
                {"public final", "public final"},
                //
                {"final", "final public"},
                {"final private", "final private"},
                {"final protected", "final protected"},
                {"final public", "final public"}
        };


        for (String[] variation : variations) {
            collection.add(new Object[]{
                    "class a{" + variation[0] + " function __construct(){}}",
                    "class a {\n    " + variation[1] + " function __construct() {\n    }\n}"
            });
            collection.add(new Object[]{
                    "class a{" + variation[0] + " function __destruct(){}}",
                    "class a {\n    " + variation[1] + " function __destruct() {\n    }\n}"
            });
        }
    }
}
