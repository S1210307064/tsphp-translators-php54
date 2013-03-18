/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package ch.tutteli.tsphp.translators.php54.test.parser;

import ch.tutteli.tsphp.translators.php54.test.testutils.ATranslatorParserTest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class TryCatchTest extends ATranslatorParserTest
{

    public TryCatchTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
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
