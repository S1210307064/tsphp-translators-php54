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
public class FunctionTest extends ATranslatorParserTest
{


    public FunctionTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();
        
         //return values
        collection.addAll(TypeHelper.getAllTypesWithModifier(
                "function ", " get(){}",
                "function get() {\n}", ""));

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "function void set", "{}",
                "function set", " {\n}"));
       
        return collection;

    }

}
