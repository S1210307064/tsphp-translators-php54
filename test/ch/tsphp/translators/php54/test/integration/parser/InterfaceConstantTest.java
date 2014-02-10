package ch.tsphp.translators.php54.test.integration.parser;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InterfaceConstantTest extends ATranslatorParserTest
{

    public InterfaceConstantTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"interface a{const int a=1;}", "interface a {\n    const a = 1;\n}"},
                    {"interface a{const int a=1,b=1;}", "interface a {\n    const a = 1, b = 1;\n}"},
                    {"interface a{const int a=1; const float b=1;}", "interface a {\n    const a = 1;\n    const b = 1;\n}"},
                });
    }
}
