package ch.tutteli.tsphp.translators.php54.test.integration.parser;

import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassConstantTest extends ATranslatorParserTest
{

    public ClassConstantTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"class a{const int a=1;}", "class a {\n    const a = 1;\n}"},
                    {"class a{const int a=1,b=1;}", "class a {\n    const a = 1, b = 1;\n}"},
                    {
                        "class a{const int a='hello'; const float b=1;}",
                        "class a {\n    const a = 'hello';\n    const b = 1;\n}"
                    },
                    {
                        "class a{const int a=true; const float b=null;}",
                        "class a {\n    const a = true;\n    const b = null;\n}"
                    },
                     {
                        "class a{const int a=Foo::a; const float b=self::a;}",
                        "class a {\n    const a = Foo::a;\n    const b = self::a;\n}"
                    },
                });
    }
}
