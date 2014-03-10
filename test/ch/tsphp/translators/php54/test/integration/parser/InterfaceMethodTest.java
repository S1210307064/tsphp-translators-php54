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
public class InterfaceMethodTest extends ATranslatorParserTest
{

    private static List<Object[]> collection;

   

    public InterfaceMethodTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        collection = new ArrayList<>();
        
         //return values
        collection.addAll(TypeHelper.getAllTypesWithModifier(
                "interface a{function ", " get();}",
                "interface a {\n    public function get();\n}",""));

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "interface a {function void set", ";}",
                "interface a {\n    public function set",";\n}"));
       
        return collection;

    }


}
