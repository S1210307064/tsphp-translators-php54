package ch.tutteli.tsphp.translators.php54.test.integration.testutils;

import java.util.Collection;

public class AssignHelper
{

    private static Collection<Object[]> collection;
    private static boolean isDeclaration;

    public static void addCastingAssignment(Collection<Object[]> theCollection, boolean isDeclaration) {
        collection = theCollection;
        AssignHelper.isDeclaration = isDeclaration;


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

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "array", true);

    }

    private static void addVariations(String[] noCastTypes, String[] castTypes, String[] castToBoolTypes,
            String typeName, boolean isNullable) {

        String typeNameWithoutNullable = typeName;
        if (typeName.endsWith("?")) {
            typeNameWithoutNullable = typeName.substring(0, typeName.length() - 1);
        }
        String cast = isNullable
                ? "($b !== null ? (" + typeNameWithoutNullable + ") $b : null)"
                : "(" + typeNameWithoutNullable + ") $b";

        String castBool = isNullable ? "($b !== null ? (bool) $b : null)" : "(bool) $b";

        String assign = isDeclaration ? " = " : "; $a = ";
        String outputAssign = isDeclaration ? " = " : ";\n    $a = ";
        String castAssign = isDeclaration ? " =() " : "; $a =() ";


        for (String type2 : noCastTypes) {
            collection.add(new Object[]{
                type2 + " $b; cast " + typeName + " $a " + assign + " $b;",
                "<?php\nnamespace{\n    $b;\n    $a" + outputAssign + "$b;\n}\n?>"
            });
            collection.add(new Object[]{
                type2 + " $b; " + typeName + " $a " + castAssign + "$b;",
                "<?php\nnamespace{\n    $b;\n    $a" + outputAssign + cast + ";\n}\n?>"
            });
        }

        for (String type2 : castTypes) {
            collection.add(new Object[]{
                type2 + " $b; cast " + typeName + " $a " + assign + " $b;",
                "<?php\nnamespace{\n    $b;\n    $a" + outputAssign + cast + ";\n}\n?>"
            });
            collection.add(new Object[]{
                type2 + " $b; " + typeName + " $a " + castAssign + "$b;",
                "<?php\nnamespace{\n    $b;\n    $a" + outputAssign + cast + ";\n}\n?>"
            });
        }

        for (String type2 : castToBoolTypes) {
            collection.add(new Object[]{
                type2 + " $b; cast " + typeName + " $a " + assign + " $b;",
                "<?php\nnamespace{\n    $b;\n    $a" + outputAssign + castBool + ";\n}\n?>"
            });
            collection.add(new Object[]{
                type2 + " $b; " + typeName + " $a" + castAssign + "$b;",
                "<?php\nnamespace{\n    $b;\n    $a" + outputAssign + castBool + ";\n}\n?>"
            });
        }

    }
}
