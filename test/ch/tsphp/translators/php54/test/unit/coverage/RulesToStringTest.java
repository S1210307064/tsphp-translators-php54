/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

/*
 * This file is based on the file RulesToStringTest from the translator component of the TinsPHP project.
 * TinsPHP is also published under the Apache License 2.0
 * For more information see http://tsphp.ch/wiki/display/TINS/License
 */

package ch.tsphp.translators.php54.test.unit.coverage;

import org.antlr.stringtemplate.StringTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class RulesToStringTest
{
    private static final String WALKER_NAME = "ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker$";

    private String ruleName;

    public RulesToStringTest(String theRuleName) {
        ruleName = theRuleName;
    }

    @Test
    public void toString_Standard_DelegatesToTemplate() throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchFieldException {
        StringTemplate stringTemplate = mock(StringTemplate.class);
        String toString = "hello world";
        when(stringTemplate.toString()).thenReturn(toString);

        Object treeRuleReturnScope = Class.forName(WALKER_NAME + ruleName + "_return").newInstance();
        Field field = treeRuleReturnScope.getClass().getField("st");
        field.set(treeRuleReturnScope, stringTemplate);
        String result = treeRuleReturnScope.toString();

        assertEquals(ruleName + "- failed. ", toString, result);
    }

    @Test
    public void toString_TemplateIsNull_ReturnsNull() throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchFieldException {
        //no arrange necessary

        Object treeRuleReturnScope = Class.forName(WALKER_NAME + ruleName + "_return").newInstance();
        String result = treeRuleReturnScope.toString();

        assertNull(ruleName + "- failed. ", result);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        Collection<Object[]> names = NotCorrectStartNodeTypeTest.testStrings();
        List<Object[]> collection = new ArrayList<>();
        for (Object[] name : names) {
            collection.add(new Object[]{name[0]});
        }
        return collection;
    }
}
