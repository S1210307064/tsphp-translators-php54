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
package ch.tutteli.tsphp.translators.php54.test.typechecker;

import ch.tutteli.tsphp.translators.php54.test.testutils.ATranslatorTypeCheckerTest;
import ch.tutteli.tsphp.translators.php54.test.testutils.AssignHelper;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
public class ClassMemberWithoutInitValueTest extends ATranslatorTypeCheckerTest
{

    public ClassMemberWithoutInitValueTest(String testString, String theExpectedResult) {
        super(testString, theExpectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
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
