package ch.tutteli.tsphp.translators.php54.test.integration.parser;

import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ExpressionHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class IfTest extends ATranslatorParserTest
{

    public IfTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        List<Object[]> collection = new ArrayList<>();

        List<String[]> expressions = ExpressionHelper.getAllExpressions(3);
        for (Object[] expression : expressions) {
            collection.add(new Object[]{
                        "if(" + expression[0] + ") $a=1; else $a=1;",
                        "if (" + expression[1] + ") {\n    $a = 1;\n} else {\n    $a = 1;\n}"
                    });
        }
        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        "if(true){$a=1;}",
                        "if (true) {\n    $a = 1;\n}"
                    },
                    {
                        "if(true) $a=1; else if(false) $b=1; else $c=2;",
                        "if (true) {\n    $a = 1;\n} else {\n    "
                        + "if (false) {\n        $b = 1;\n    } else {\n        $c = 2;\n    }"
                        + "\n}"
                    },
                    {
                        "if(true) $a=1; else if(false) $b=1; else if($a<1) $c=2; else $d=1;",
                        "if (true) {\n    $a = 1;\n} else {\n    "
                        + "if (false) {\n        $b = 1;\n    } else {\n        "
                        + "if ($a < 1) {\n            $c = 2;\n        } "
                        + "else {\n            $d = 1;\n        }"
                        + "\n    }"
                        + "\n}"
                    },}));

        return collection;
    }
}
