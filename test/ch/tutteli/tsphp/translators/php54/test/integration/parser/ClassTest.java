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
public class ClassTest extends ATranslatorParserTest
{

    public ClassTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {"class a{};", "class a {}"},
                    {"class a extends b{};", "class a extends b {}"},
                    {"class a extends b\\c{};", "class a extends b\\c {}"},
                    {"class a extends b\\c\\d{};", "class a extends b\\c\\d {}"},
                    {"class a extends \\b{};", "class a extends \\b {}"},
                    {"class a extends \\b\\c{};", "class a extends \\b\\c {}"},
                    {"class a extends \\b\\c\\d{};", "class a extends \\b\\c\\d {}"},
                    {"class a implements b{};", "class a implements b {}"},
                    {"class a implements b\\c{};", "class a implements b\\c {}"},
                    {"class a implements b\\c\\d{};", "class a implements b\\c\\d {}"},
                    {"class a implements \\b{};", "class a implements \\b {}"},
                    {"class a implements \\b\\c{};", "class a implements \\b\\c {}"},
                    {"class a implements \\b\\c\\d{};", "class a implements \\b\\c\\d {}"},
                    {"class a implements b,\\c,d\\e{};", "class a implements b,\\c,d\\e {}"},
                    {"abstract class a{};", "abstract class a {}"},
                    {"final class a{};", "final class a {}"},
                    {
                        "abstract class a extends f implements b,\\c,d\\e {}", 
                        "abstract class a extends f implements b,\\c,d\\e {}"
                    },
                    {"final class a extends f implements d\\e{}", "final class a extends f implements d\\e {}"},
                    {"class a extends f implements d\\e,b,e,v,z{}", "class a extends f implements d\\e,b,e,v,z {}"},
                });
    }
}
