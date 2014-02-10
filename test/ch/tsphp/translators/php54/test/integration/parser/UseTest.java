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
public class UseTest extends ATranslatorParserTest
{

    public UseTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"use a as b;", "use a as b;"},
                    {"use a\\b as c;", "use a\\b as c;"},
                    {"use a\\b\\c as d;", "use a\\b\\c as d;"},
                    {"use a\\b;", "use a\\b as b;"},
                    {"use a\\b\\c;", "use a\\b\\c as c;"},
                    {"use \\a as b;", "use \\a as b;"},
                    {"use \\a\\b as b;", "use \\a\\b as b;"},
                    {"use \\a\\b\\c as d;", "use \\a\\b\\c as d;"},
                    {"use \\a;", "use \\a as a;"},
                    {"use \\a\\b;", "use \\a\\b as b;"},
                    {"use \\a\\c\\f;", "use \\a\\c\\f as f;"}
                });
    }
}
