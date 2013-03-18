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
public class VariableInitTest extends ATranslatorTypeCheckerTest
{

    private static List<Object[]> collection;

    public VariableInitTest(String testString, String theExpectedResult) {
        super(testString, theExpectedResult);
    }

    @Test
    public void test() throws RecognitionException, FileNotFoundException, IOException {
        translate();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        collection = new ArrayList<>();


        addCastingAssignment();

        return collection;
    }

    private static void addCastingAssignment() {

        String[] noCastNeededTypes = new String[]{
            "bool"
        };
        String[] castTypes = new String[]{
            "bool?",
            "int",
            "int?",
            "float",
            "float?",
            "string",
            "string?",
            "object"
        };
        String[] castToBoolTypes = new String[]{
            "array",
            "resource",
            "Exception",
            "ErrorException"
        };
        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "bool", false);

        noCastNeededTypes = new String[]{
            "bool",
            "int"
        };
        castTypes = new String[]{
            "bool?",
            "int?",
            "float",
            "float?",
            "string",
            "string?",
            "object"
        };
        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "int", false);

        noCastNeededTypes = new String[]{
            "bool",
            "int",
            "float"
        };
        castTypes = new String[]{
            "bool?",
            "int?",
            "float?",
            "string",
            "string?",
            "object"
        };
        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "float", false);

        noCastNeededTypes = new String[]{
            "bool",
            "int",
            "float",
            "string"
        };
        castTypes = new String[]{
            "bool?",
            "int?",
            "float?",
            "string?",
            "object"
        };
        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "string", false);

        noCastNeededTypes = new String[]{
            "bool",
            "bool?"
        };
        castTypes = new String[]{
            "int",
            "int?",
            "float",
            "float?",
            "string",
            "string?",
            "object"
        };
        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "bool?", true);

        noCastNeededTypes = new String[]{
            "bool",
            "bool?",
            "int",
            "int?"
        };
        castTypes = new String[]{
            "float",
            "float?",
            "string",
            "string?",
            "object"
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "int?", true);

        noCastNeededTypes = new String[]{
            "bool",
            "bool?",
            "int",
            "int?",
            "float",
            "float?"
        };
        castTypes = new String[]{
            "string",
            "string?",
            "object"
        };
        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "float?", true);

        noCastNeededTypes = new String[]{
            "bool",
            "bool?",
            "int",
            "int?",
            "float",
            "float?",
            "string",
            "string?"
        };
        castTypes = new String[]{
            "object"
        };
        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "string?", true);


        noCastNeededTypes = new String[]{
            "array"
        };
        castTypes = new String[]{
            "bool",
            "bool?",
            "int",
            "int?",
            "float",
            "float?",
            "string",
            "string?",
            "object",
            "resource",
            "Exception",
            "ErrorException"
        };
        castToBoolTypes = new String[]{};

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "array", true, false);

    }

    private static void addVariations(String[] noCastTypes, String[] castTypes, String[] castToBoolTypes,
            String typeName, boolean isNullable) {
        addVariations(noCastTypes, castTypes, castToBoolTypes, typeName, isNullable, true);
    }

    private static void addVariations(String[] noCastTypes, String[] castTypes, String[] castToBoolTypes,
            String typeName, boolean isNullable, boolean isScalar) {

        String typeNameWithoutNullable = typeName;
        if (typeName.endsWith("?")) {
            typeNameWithoutNullable = typeName.substring(0, typeName.length() - 1);
        }
        String cast = isNullable 
                ? "($b !== null ? (" + typeNameWithoutNullable + ") $b : null)"
                : "(" + typeNameWithoutNullable + ") $b";

        String castBool = isNullable ? "($b !== null ? (bool) $b : null)" : "(bool) $b";

        for (String type2 : noCastTypes) {
            collection.add(new Object[]{
                type2 + " $b; cast " + typeName + " $a =  $b;",
                "namespace{\n    $b;\n    $a = $b;\n}"
            });
            collection.add(new Object[]{
                type2 + " $b; " + typeName + " $a =()  $b;",
                "namespace{\n    $b;\n    $a = " + cast + ";\n}"
            });
        }

        for (String type2 : castTypes) {
            collection.add(new Object[]{
                type2 + " $b; cast " + typeName + " $a =  $b;",
                "namespace{\n    $b;\n    $a = " + cast + ";\n}"
            });
            collection.add(new Object[]{
                type2 + " $b; " + typeName + " $a =()  $b;",
                "namespace{\n    $b;\n    $a = " + cast + ";\n}"
            });
        }

        for (String type2 : castToBoolTypes) {
            collection.add(new Object[]{
                type2 + " $b; cast " + typeName + " $a =  $b;",
                "namespace{\n    $b;\n    $a = " + castBool + ";\n}"
            });
            collection.add(new Object[]{
                type2 + " $b; " + typeName + " $a =()  $b;",
                "namespace{\n    $b;\n    $a = " + cast + ";\n}"
            });
        }

    }
}
