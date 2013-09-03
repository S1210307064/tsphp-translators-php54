/*
 * Copyright 2013 Robert Stoll <rstoll@tutteli.ch>
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
package ch.tutteli.tsphp.translators.php54.test.integration.parser;

import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ATranslatorParserTest;
import ch.tutteli.tsphp.translators.php54.test.integration.testutils.ParameterListHelper;
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
public class AbstractConstructDestructTest extends ATranslatorParserTest
{

    private static List<Object[]> collection;

    public AbstractConstructDestructTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        collection = new ArrayList<>();

        addModifiers();

        //parameters
        collection.addAll(ParameterListHelper.getTestStrings(
                "class a {abstract function __construct", ";}",
                "class a {\n    abstract public function __construct", ";\n}"));

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
                        "class a{" + variation[0] + " function __construct();}",
                        "class a {\n    " + variation[1] + " function __construct();\n}"
                    });
            collection.add(new Object[]{
                        "class a{" + variation[0] + " function __destruct();}",
                        "class a {\n    " + variation[1] + " function __destruct();\n}"
                    });
        }
    }
}
