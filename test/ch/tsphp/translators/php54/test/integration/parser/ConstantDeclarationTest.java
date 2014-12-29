/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This file is based on the file ConstantTest from the translator component of the TinsPHP project.
 * TinsPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
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
public class ConstantDeclarationTest extends ATranslatorParserTest
{

    public ConstantDeclarationTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"const bool a = false;", "const a = false;"},
                {"const bool a = true;", "const a = true;"},
                {"const int a = 1;", "const a = 1;"},
                {"const float a = 1.2;", "const a = 1.2;"},
                {"const string a = 'hi';", "const a = 'hi';"},
                //only valid since we only use the parser, null cannot be assigned to a constant
                {"const int a = null;", "const a = null;"},
                //only valid since we only use the parser, b is not defined
                {"const int a = b;", "const a = b;"},
                //TODO rstoll TSPHP-793 constant arrays
//                {"const array a = [1,2,3];", "const a = [1, 2, 3];"},
//                {"const array a = ['a'=> 1, 'b' =>2, 2 => 3];", "const a = ['a' => 1, 'b' => 2, 2 => 3];"},
                // multiple constants
                {"const int a = 1, b = 2;", "const a = 1, b = 2;"},
                // only valid since we only use the parser, different types would cause a type check error
                {
                        "const int a = false, b = true, c=1, d=2.1, e='hi', f=null, g=h, i=[1,2], j=['a'=>'b'];",
                        "const a = false, b = true, c = 1, d = 2.1, e = 'hi', "
                                + "f = null, g = h, i = [1, 2], j = ['a' => 'b'];"
                },
                //unary primitive atom
                {"const int a = +1, b = -2;", "const a = +1, b = -2;"},
        });
    }
}
