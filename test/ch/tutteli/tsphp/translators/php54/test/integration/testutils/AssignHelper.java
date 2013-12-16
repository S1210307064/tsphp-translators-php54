package ch.tutteli.tsphp.translators.php54.test.integration.testutils;

import java.util.Collection;

public class AssignHelper
{

    private static Collection<Object[]> collection;
    private static boolean isDeclaration;

    public static void addCastingAssignment(Collection<Object[]> theCollection, boolean isDeclaration) {
        collection = theCollection;
        AssignHelper.isDeclaration = isDeclaration;


        String[][] noCastNeededTypes = new String[][]{
                {"bool", "false"}
        };

        String[][] castTypes = new String[][]{
                {"bool?", "null"},
                {"int", "0"},
                {"int?", "null"},
                {"float", "0.0"},
                {"float?", "null"},
                {"string", "''"},
                {"string?", "null"},
                {"object", "null"}
        };

        String[][] castToBoolTypes = new String[][]{
                {"array", "null"},
                {"resource", "null"},
                {"Exception", "null"},
                {"ErrorException", "null"}
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "bool", false);

        noCastNeededTypes = new String[][]{
                {"bool", "false"},
                {"int", "0"}
        };

        castTypes = new String[][]{
                {"bool?", "null"},
                {"int?", "null"},
                {"float", "0.0"},
                {"float?", "null"},
                {"string", "''"},
                {"string?", "null"},
                {"object", "null"},
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "int", false);

        noCastNeededTypes = new String[][]{
                {"bool", "false"},
                {"int", "0"},
                {"float", "0.0"}
        };

        castTypes = new String[][]{
                {"bool?", "null"},
                {"int?", "null"},
                {"float?", "null"},
                {"string", "''"},
                {"string?", "null"},
                {"object", "null"},
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "float", false);

        noCastNeededTypes = new String[][]{
                {"bool", "false"},
                {"int", "0"},
                {"float", "0.0"},
                {"string", "''"},
        };

        castTypes = new String[][]{
                {"bool?", "null"},
                {"int?", "null"},
                {"float?", "null"},
                {"string?", "null"},
                {"object", "null"},
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "string", false);

        noCastNeededTypes = new String[][]{
                {"bool", "false"},
                {"bool?", "null"},
        };

        castTypes = new String[][]{
                {"int", "0"},
                {"int?", "null"},
                {"float", "0.0"},
                {"float?", "null"},
                {"string", "''"},
                {"string?", "null"},
                {"object", "null"}
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "bool?", true);

        noCastNeededTypes = new String[][]{
                {"bool", "false"},
                {"bool?", "null"},
                {"int", "0"},
                {"int?", "null"},
        };

        castTypes = new String[][]{
                {"float", "0.0"},
                {"float?", "null"},
                {"string", "''"},
                {"string?", "null"},
                {"object", "null"},
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "int?", true);

        noCastNeededTypes = new String[][]{
                {"bool", "false"},
                {"bool?", "null"},
                {"int", "0"},
                {"int?", "null"},
                {"float", "0.0"},
                {"float?", "null"},
        };

        castTypes = new String[][]{
                {"string", "''"},
                {"string?", "null"},
                {"object", "null"},
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "float?", true);

        noCastNeededTypes = new String[][]{
                {"bool", "false"},
                {"bool?", "null"},
                {"int", "0"},
                {"int?", "null"},
                {"float", "0.0"},
                {"float?", "null"},
                {"string", "''"},
                {"string?", "null"},
        };

        castTypes = new String[][]{
                {"object", "null"},
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "string?", true);


        noCastNeededTypes = new String[][]{
                {"array", "null"}
        };

        castTypes = new String[][]{
                {"bool", "false"},
                {"bool?", "null"},
                {"int", "0"},
                {"int?", "null"},
                {"float", "0.0"},
                {"float?", "null"},
                {"string", "''"},
                {"string?", "null"},
                {"object", "null"},
                {"resource", "null"},
                {"Exception", "null"},
                {"ErrorException", "null"}
        };

        castToBoolTypes = new String[][]{
        };

        addVariations(noCastNeededTypes, castTypes, castToBoolTypes, "array", true);

    }

    private static void addVariations(String[][] noCastTypes, String[][] castTypes, String[][] castToBoolTypes,
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


        for (String type2[] : noCastTypes) {
            collection.add(new Object[]{
                    type2[0] + " $b=" + type2[1] + "; cast " + typeName + " $a " + assign + " $b;",
                    "<?php\nnamespace{\n    $b = "+type2[1]+";\n    $a" + outputAssign + "$b;\n}\n?>"
            });
            collection.add(new Object[]{
                    type2[0] + " $b=" + type2[1] + ";" + typeName + " $a " + castAssign + "$b;",
                    "<?php\nnamespace{\n    $b = "+type2[1]+";\n    $a" + outputAssign + cast + ";\n}\n?>"
            });
        }

        for (String type2[] : castTypes) {
            collection.add(new Object[]{
                    type2[0] + " $b=" + type2[1] + ";cast " + typeName + " $a " + assign + " $b;",
                    "<?php\nnamespace{\n    $b = "+type2[1]+";\n    $a" + outputAssign + cast + ";\n}\n?>"
            });
            collection.add(new Object[]{
                    type2[0] + " $b=" + type2[1] + ";" + typeName + " $a " + castAssign + "$b;",
                    "<?php\nnamespace{\n    $b = "+type2[1]+";\n    $a" + outputAssign + cast + ";\n}\n?>"
            });
        }

        for (String type2[] : castToBoolTypes) {
            collection.add(new Object[]{
                    type2[0] + " $b=" + type2[1] + ";cast " + typeName + " $a " + assign + " $b;",
                    "<?php\nnamespace{\n    $b = "+type2[1]+";\n    $a" + outputAssign + castBool + ";\n}\n?>"
            });
            collection.add(new Object[]{
                    type2[0] + " $b=" + type2[1] + ";" + typeName + " $a" + castAssign + "$b;",
                    "<?php\nnamespace{\n    $b = "+type2[1]+";\n    $a" + outputAssign + castBool + ";\n}\n?>"
            });
        }

    }
}
