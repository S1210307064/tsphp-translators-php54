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
import ch.tutteli.tsphp.translators.php54.test.testutils.ExpressionHelper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class EchoTest extends ATranslatorParserTest
{

    private static List<Object[]> collection;

   

    public EchoTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        collection = new ArrayList<>();
        List<String[]> expressions = ExpressionHelper.getExpressions();
        for(String[] expression:expressions){
               collection.add(new Object[]{
                    "echo "+expression[0]+";",
                    "echo "+expression[1]+";"
                });
                collection.add(new Object[]{
                    "echo "+expression[0]+","+expression[0]+";",
                    "echo "+expression[1]+", "+expression[1]+";"
                });
        }
       
        return collection;

    }

}
