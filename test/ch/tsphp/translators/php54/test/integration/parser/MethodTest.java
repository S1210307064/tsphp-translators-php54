/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.parser;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tsphp.translators.php54.test.integration.testutils.ParameterListHelper;
import ch.tsphp.translators.php54.test.integration.testutils.TypeHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class MethodTest extends ATranslatorParserTest
{

    private static List<Object[]> collection;

   

    public MethodTest(String testString, String expectedResult) {
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
        
         //return values
        collection.addAll(TypeHelper.getAllTypesWithModifier(
                "class a{function ", " get(){}}",
                "class a {\n    public function get() {\n    }\n}",""));

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "class a {function void set", "{}}",
                "class a {\n    public function set"," {\n    }\n}"));
       
        return collection;

    }

    private static void addModifiers() {

        String[][] variations = new String[][]{
            {"", "public"},
            //
            {"private", "private"},
            {"private static", "private static"},
            {"private final", "private final"},
            {"private static final", "private static final"},
            {"private final static", "private final static"},
            //
            {"protected", "protected"},
            {"protected static", "protected static"},
            {"protected final", "protected final"},
            {"protected static final", "protected static final"},
            {"protected final static", "protected final static"},
            //
            {"public", "public"},
            {"public static", "public static"},
            {"public final", "public final"},
            {"public static final", "public static final"},
            {"public final static", "public final static"},
            //
            {"static", "static public"},
            {"static private", "static private"},
            {"static private final", "static private final"},
            {"static protected", "static protected"},
            {"static protected final", "static protected final"},
            {"static public", "static public"},
            {"static public final", "static public final"},
            {"static final", "static final public"},
            {"static final private", "static final private"},
            {"static final protected", "static final protected"},
            {"static final public", "static final public"},
            //
            {"final", "final public"},
            {"final static", "final static public"},
            {"final private", "final private"},
            {"final private static", "final private static"},
            {"final protected", "final protected"},
            {"final protected static", "final protected static"},
            {"final public", "final public"},
            {"final public static", "final public static"},
            {"final static private", "final static private"},
            {"final static protected", "final static protected"},
            {"final static public", "final static public"}
        };

        for (String[] variation : variations) {
            collection.add(new Object[]{
                        "class a{" + variation[0] + " function void foo(){}}",
                        "class a {\n    " + variation[1] + " function foo() {\n    }\n}"
                    });
        }
    }

}
