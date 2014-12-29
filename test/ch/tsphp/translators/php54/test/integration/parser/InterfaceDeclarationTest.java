/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

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
public class InterfaceDeclarationTest extends ATranslatorParserTest
{

    public InterfaceDeclarationTest(String testString, String expectedResult) {
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
