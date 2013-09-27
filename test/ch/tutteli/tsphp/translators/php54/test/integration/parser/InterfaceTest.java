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
public class InterfaceTest extends ATranslatorParserTest
{

    public InterfaceTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"interface a{};", "interface a {}"},
                    {"interface a extends b{};", "interface a extends b {}"},
                    {"interface a extends b\\c{};", "interface a extends b\\c {}"},
                    {"interface a extends b\\c\\d{};", "interface a extends b\\c\\d {}"},
                    {"interface a extends \\b{};", "interface a extends \\b {}"},
                    {"interface a extends \\b\\c{};", "interface a extends \\b\\c {}"},
                    {"interface a extends \\b\\c\\d{};", "interface a extends \\b\\c\\d {}"},
                });
    }
}
