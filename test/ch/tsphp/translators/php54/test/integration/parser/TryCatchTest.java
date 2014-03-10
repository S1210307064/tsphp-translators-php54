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
public class TryCatchTest extends ATranslatorParserTest
{

    public TryCatchTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                    {
                        "try{$a=1;}catch(\\Exception $e){}",
                        "try {\n    $a = 1;\n} catch (\\Exception $e) {\n}"
                    },
                    {
                        "try{$a=1;}catch(\\Exception $e){} catch(\\a\\MyException $e){$a=1;$b=2;}",
                        "try {\n    $a = 1;\n} catch (\\Exception $e) {\n} "
                            + "catch (\\a\\MyException $e) {\n    $a = 1;\n    $b = 2;\n}"
                    },
                    {
                        "try{$a=1;}catch(a $e){} catch(b $e){$a=1;$b=2;}catch(c $e){}",
                         "try {\n    $a = 1;\n} catch (a $e) {\n} "
                            + "catch (b $e) {\n    $a = 1;\n    $b = 2;\n} catch (c $e) {\n}"
                    }
                });
    }
}
