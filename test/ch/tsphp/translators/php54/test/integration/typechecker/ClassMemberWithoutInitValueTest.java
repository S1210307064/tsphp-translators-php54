package ch.tsphp.translators.php54.test.integration.typechecker;

import ch.tsphp.translators.php54.test.integration.testutils.ATranslatorTypeCheckerTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ClassMemberWithoutInitValueTest extends ATranslatorTypeCheckerTest
{

    public ClassMemberWithoutInitValueTest(String testString, String theExpectedResult) {
        super(testString, theExpectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        String prefix = "<?php\nnamespace{\n    class a {\n        public $a = ";
        String appendix = ";\n    }\n}\n?>";
        return Arrays.asList(new Object[][]{
            {"class a{bool $a;}", prefix + "false" + appendix},
            {"class a{int $a;}", prefix + "0" + appendix},
            {"class a{float $a;}", prefix + "0.0" + appendix},
            {"class a{string $a;}", prefix + "''" + appendix},
            {"class a{array $a;}", prefix + "null" + appendix},
            {"class a{resource $a;}", prefix + "null" + appendix},
            {"class a{object $a;}", prefix + "null" + appendix},
            {"class a{bool? $a;}", prefix + "null" + appendix},
            {"class a{int? $a;}", prefix + "null" + appendix},
            {"class a{float? $a;}", prefix + "null" + appendix},
            {"class a{string? $a;}", prefix + "null" + appendix},
            {"class a{Exception $a;}", prefix + "null" + appendix},
            {"class a{ErrorException $a;}", prefix + "null" + appendix}
        });
    }
}
