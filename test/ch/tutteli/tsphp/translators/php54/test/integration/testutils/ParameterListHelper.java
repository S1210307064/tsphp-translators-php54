package ch.tutteli.tsphp.translators.php54.test.integration.testutils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ParameterListHelper
{

    private static List<Object[]> collection;

    private ParameterListHelper() {
    }

    public static Collection<Object[]> getTestStrings(String prefix, String appendix,
            String prefixExpect, String appendixExpected) {

        collection = new ArrayList<>();
        prefix += "(";
        prefixExpect += "(";
        appendix = ")" + appendix;
        appendixExpected = ")" + appendixExpected;
        String[] types = TypeHelper.getScalarTypes();
        for (String type : types) {
            collection.add(new Object[]{
                        prefix + type + " $a" + appendix,
                        prefixExpect + "$a" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + type + " $a," + type + " $b" + appendix,
                        prefixExpect + "$a, $b" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "cast " + type + " $a" + appendix,
                        prefixExpect + "$a" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "cast " + type + " $a, cast " + type + " $b" + appendix,
                        prefixExpect + "$a, $b" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + type + "? $a" + appendix,
                        prefixExpect + "$a" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + type + "? $a, " + type + "? $b" + appendix,
                        prefixExpect + "$a, $b" + appendixExpected
                    });

            collection.add(new Object[]{
                        prefix + "cast " + type + "? $a" + appendix,
                        prefixExpect + "$a" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "cast " + type + "? $a, cast " + type + "? $b" + appendix,
                        prefixExpect + "$a, $b" + appendixExpected
                    });
        }
        types = TypeHelper.getClassInterfaceTypes();

        //class / interfaceType can also have the ? modifier
        for (String type : types) {
            collection.add(new Object[]{
                        prefix + type + " $a" + appendix,
                        prefixExpect + type + " $a" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + type + " $a, " + type + " $b" + appendix,
                        prefixExpect + type + " $a, " + type + " $b" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "cast " + type + " $a" + appendix,
                        prefixExpect + type + " $a" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "cast " + type + " $a, cast " + type + " $b" + appendix,
                        prefixExpect + type + " $a, " + type + " $b" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + type + "? $a" + appendix,
                        prefixExpect + type + " $a = null" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + type + "? $a, " + type + "? $b" + appendix,
                        prefixExpect + type + " $a = null, " + type + " $b = null" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "cast " + type + "? $a" + appendix,
                        prefixExpect + type + " $a = null" + appendixExpected
                    });
            collection.add(new Object[]{
                        prefix + "cast " + type + "? $a, cast " + type + "? $b" + appendix,
                        prefixExpect + type + " $a = null, " + type + " $b = null" + appendixExpected
                    });
        }
        collection.add(new Object[]{
                    prefix + "array $a" + appendix,
                    prefixExpect + "array $a" + appendixExpected
                });
        collection.add(new Object[]{
                    prefix + "cast array $a" + appendix,
                    prefixExpect + "array $a" + appendixExpected
                });
        collection.add(new Object[]{
                    prefix + "array? $a" + appendix,
                    prefixExpect + "array $a = null" + appendixExpected
                });
        collection.add(new Object[]{
                    prefix + "cast array $a" + appendix,
                    prefixExpect + "array $a" + appendixExpected
                });

        collection.add(new Object[]{
                    prefix + "resource $a" + appendix,
                    prefixExpect + "$a" + appendixExpected
                });
        collection.add(new Object[]{
                    prefix + "resource? $a" + appendix,
                    prefixExpect + "$a" + appendixExpected
                });
        collection.add(new Object[]{
                    prefix + "object $a" + appendix,
                    prefixExpect + "$a" + appendixExpected
                });
        collection.add(new Object[]{
                    prefix + "object? $a" + appendix,
                    prefixExpect + "$a" + appendixExpected
                });

        //normal
        addVariations(
                prefix, "int", appendix,
                prefixExpect, "", "", appendixExpected);
        //cast 
        addVariations(
                prefix, "cast array", appendix,
                prefixExpect, "array ", "", appendixExpected);
        //?
        addVariations(
                prefix, "\\Exception?", appendix,
                prefixExpect, "\\Exception ", " = null", appendixExpected);
        //cast and ? mixed
        addVariations(
                prefix, "cast int?", appendix,
                prefixExpect, "", "", appendixExpected);
        //TODO TSPHP-589 rstoll add test for optional parameters
//        addVariationsForOptional(prefix, appendix, prefixExpect, appendixExpected);

        //empty params
        collection.add(new Object[]{prefix + appendix, prefixExpect + appendixExpected});
        return collection;
    }

    private static void addVariations(String prefix, String type, String appendix,
            String prefixExpected, String typeExpectedPrefix, String typeExpectedAppendix, String appendixExpected) {


        String paramStat1 = "int $x";
        String paramStat2 = "array $y";
        String paramStat1Expected = "$x";
        String paramStat2Expected = "array $y";

        collection.addAll(Arrays.asList(new Object[][]{
                    {
                        prefix + type + " $a" + appendix,
                        prefixExpected + typeExpectedPrefix + "$a" + typeExpectedAppendix + appendixExpected
                    },
                    {
                        prefix + type + " $a" + "," + paramStat1 + appendix,
                        prefixExpected
                        + typeExpectedPrefix + "$a" + typeExpectedAppendix + ", "
                        + paramStat1Expected + appendixExpected
                    },
                    {
                        prefix + paramStat1 + "," + type + " $a" + appendix,
                        prefixExpected
                        + paramStat1Expected + ", "
                        + typeExpectedPrefix + "$a" + typeExpectedAppendix + appendixExpected
                    },
                    {
                        prefix + type + " $a" + ", " + paramStat1 + ", " + paramStat2 + appendix,
                        prefixExpected
                        + typeExpectedPrefix + "$a" + typeExpectedAppendix + ", "
                        + paramStat1Expected + ", "
                        + paramStat2Expected + appendixExpected
                    },
                    {
                        prefix + type + " $a" + ", " + type + " $b" + ", " + paramStat1 + appendix,
                        prefixExpected
                        + typeExpectedPrefix + "$a" + typeExpectedAppendix + ", "
                        + typeExpectedPrefix + "$b" + typeExpectedAppendix + ", "
                        + paramStat1Expected + appendixExpected
                    },
                    {
                        prefix + type + " $a" + ", " + paramStat1 + "," + type + " $b" + "" + appendix,
                        prefixExpected
                        + typeExpectedPrefix + "$a" + typeExpectedAppendix + ", "
                        + paramStat1Expected + ", "
                        + typeExpectedPrefix + "$b" + typeExpectedAppendix + appendixExpected
                    },
                    {
                        prefix + paramStat1 + "," + type + " $a" + ", " + paramStat2 + appendix,
                        prefixExpected
                        + paramStat1Expected + ", "
                        + typeExpectedPrefix + "$a" + typeExpectedAppendix + ", "
                        + paramStat2Expected + appendixExpected
                    },
                    {
                        prefix + paramStat1 + "," + type + " $a" + ", " + type + " $b" + "" + appendix,
                        prefixExpected
                        + paramStat1Expected + ", "
                        + typeExpectedPrefix + "$a" + typeExpectedAppendix + ", "
                        + typeExpectedPrefix + "$b" + typeExpectedAppendix + appendixExpected
                    },
                    {
                        prefix + type + " $a, " + type + " $b , " + type + " $c" + appendix,
                        prefixExpected
                        + typeExpectedPrefix + "$a" + typeExpectedAppendix + ", "
                        + typeExpectedPrefix + "$b" + typeExpectedAppendix + ", "
                        + typeExpectedPrefix + "$c" + typeExpectedAppendix + appendixExpected
                    }
                }));
    }

    private static void addVariationsForOptional(String prefix, String appendix,
            String prefixExpect, String appendixExpect) {
        collection.addAll(Arrays.asList(new Object[][]{
                    //optional parameter
                    {
                        prefix + "int $a, int $b='hallo'" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type tMod int) ($b 'hallo'))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int? $i, int $b=+1" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type (tMod ?) int) $i) "
                        + "(pDecl (type tMod int) ($b 1))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a,cast int? $i, int $b=-10, int $d=2.0" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type (tMod cast ?) int) $i) "
                        + "(pDecl (type tMod int) ($b (uMinus 10))) "
                        + "(pDecl (type tMod int) ($d 2.0))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int? $a=null,int $b=true, int $c=E_ALL" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type (tMod ?) int) ($a null)) "
                        + "(pDecl (type tMod int) ($b true)) "
                        + "(pDecl (type tMod int) ($c E_ALL))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $b=false, int $d=null" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type tMod int) ($b false)) "
                        + "(pDecl (type tMod int) ($d null))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "int $a, int $b, int $d=true" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type tMod int) $a) "
                        + "(pDecl (type tMod int) $b) "
                        + "(pDecl (type tMod int) ($d true))"
                        + ")" + appendixExpect
                    },
                    {
                        prefix + "cast int $a=1, int? $b=2, cast int $d=3" + appendix,
                        prefixExpect + "(params "
                        + "(pDecl (type (tMod cast) int) ($a 1)) "
                        + "(pDecl (type (tMod ?) int) ($b 2)) "
                        + "(pDecl (type (tMod cast) int) ($d 3))"
                        + ")" + appendixExpect
                    }
                }));


        String[] types = TypeHelper.getClassInterfaceTypes();

        for (String type : types) {
            collection.add(new Object[]{
                        prefix + "int $a=" + type + "::a" + appendix,
                        prefixExpect
                        + "(params (pDecl (type tMod int) ($a (sMemAccess " + type + " a))))"
                        + appendixExpect
                    });
        }
    }
}