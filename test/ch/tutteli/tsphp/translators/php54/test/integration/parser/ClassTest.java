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
public class ClassTest extends ATranslatorParserTest
{

    public ClassTest(String testString, String expectedResult) {
        super(testString, expectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
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