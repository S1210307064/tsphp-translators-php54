package ch.tutteli.tsphp.translators.php54.test;

import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.translators.php54.test.testutils.ATest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

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
/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@RunWith(Parameterized.class)
public class UseTest extends ATest
{

    public UseTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Override
    public ParserRuleReturnScope parserRun(TSPHPParser parser) throws RecognitionException {
        return parser.useDeclarationList();
    }

    @Override
    public void run() throws RecognitionException {
        result = translator.useDeclarationList();
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
