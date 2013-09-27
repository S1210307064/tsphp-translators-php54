package ch.tutteli.tsphp.translators.php54.test.integration.parser;

import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ParameterListHelper;
import ch.tutteli.tsphp.translators.php54.test.integration.testutils.TypeHelper;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class AbstractMethodTest extends ATranslatorParserTest
{

    private static List<Object[]> collection;

    public AbstractMethodTest(String testString, String expectedResult) {
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
                "class a{abstract function ", " get();}",
                "class a {\n    abstract public function get();\n}", ""));

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "class a {abstract function void set", ";}",
                "class a {\n    abstract public function set", ";\n}"));

        return collection;

    }

    private static void addModifiers() {

        String[][] variations = new String[][]{
            {"abstract", "abstract public"},
            {"abstract protected", "abstract protected"},
            {"abstract public", "abstract public"},
            {"protected abstract", "protected abstract"},
            {"public abstract", "public abstract"}
        };

        for (String[] variation : variations) {
            collection.add(new Object[]{
                        "class a{" + variation[0] + " function void foo();}",
                        "class a {\n    " + variation[1] + " function foo();\n}"
                    });
        }
    }
}
