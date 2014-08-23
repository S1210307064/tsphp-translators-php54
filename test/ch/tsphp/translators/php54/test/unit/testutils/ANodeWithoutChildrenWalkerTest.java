/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.testutils;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeRuleReturnScope;
import org.antlr.stringtemplate.StringTemplate;
import org.junit.Ignore;

import java.lang.reflect.Field;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.spy;

@Ignore
public abstract class ANodeWithoutChildrenWalkerTest extends AWalkerTest
{
    protected String testCase;
    protected int tokenType;


    public ANodeWithoutChildrenWalkerTest(String theTestCase, int theTokenType) {
        testCase = theTestCase;
        tokenType = theTokenType;
    }

    public abstract TreeRuleReturnScope walk(PHP54TranslatorWalker walker) throws RecognitionException;

    public void check() throws RecognitionException, NoSuchFieldException, IllegalAccessException {
        ITSPHPAst ast = createAst(tokenType);

        PHP54TranslatorWalker walker = spy(createWalker(ast));
        TreeRuleReturnScope result = walk(walker);

        Field fieldSt = result.getClass().getField("st");
        StringTemplate stringTemplate = (StringTemplate) fieldSt.get(result);
        assertThat(testCase, stringTemplate, is(nullValue()));
    }
}
