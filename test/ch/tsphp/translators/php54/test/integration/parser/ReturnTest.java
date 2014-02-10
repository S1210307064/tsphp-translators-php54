package ch.tsphp.translators.php54.test.integration.parser;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tsphp.translators.php54.test.integration.testutils.ExpressionHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class ReturnTest extends ATranslatorParserTest
{

    private static List<Object[]> collection;

   

    public ReturnTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        collection = new ArrayList<>();
        List<String[]> expressions = ExpressionHelper.getAllExpressions(7);
        for(String[] expression:expressions){
               collection.add(new Object[]{
                    "return "+expression[0]+";",
                    "return "+expression[1]+";"
                });
        }
       
        return collection;

    }

}
