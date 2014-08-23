/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.coverage;

import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import org.antlr.runtime.tree.TreeRuleReturnScope;
import org.antlr.stringtemplate.StringTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class WalkerMethodCoverageTest
{
    protected Class clazz;

    public WalkerMethodCoverageTest(Class theClass) {
        clazz = theClass;
    }

    @Test
    public void getTemplate_Standard_ReturnTemplate()
            throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        TreeRuleReturnScope treeRuleReturnScope = (TreeRuleReturnScope) clazz.newInstance();
        StringTemplate st = mock(StringTemplate.class);
        Field field = treeRuleReturnScope.getClass().getField("st");
        field.set(treeRuleReturnScope, st);

        StringTemplate result = (StringTemplate) treeRuleReturnScope.getTemplate();

        assertThat(result, is(st));
    }

    @Test
    public void toString_Standard_ReturnTemplateAsString()
            throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        TreeRuleReturnScope treeRuleReturnScope = (TreeRuleReturnScope) clazz.newInstance();
        String template = treeRuleReturnScope.getClass().getName();
        StringTemplate st = mock(StringTemplate.class);
        when(st.toString()).thenReturn(template);
        Field field = treeRuleReturnScope.getClass().getField("st");
        field.set(treeRuleReturnScope, st);

        String result = treeRuleReturnScope.toString();

        assertThat(result, is(template));
    }

    @Test
    public void toString_TemplateNull_ReturnNull()
            throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        TreeRuleReturnScope treeRuleReturnScope = (TreeRuleReturnScope) clazz.newInstance();

        String result = treeRuleReturnScope.toString();

        assertThat(result, is(nullValue()));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {PHP54TranslatorWalker.abstractConstructDeclaration_return.class},
                {PHP54TranslatorWalker.abstractMethodDeclaration_return.class},
                {PHP54TranslatorWalker.abstractMethodModifier_return.class},
                {PHP54TranslatorWalker.abstractToken_return.class},
                {PHP54TranslatorWalker.accessModifier_return.class},
                {PHP54TranslatorWalker.actualParameters_return.class},
                {PHP54TranslatorWalker.allTypes_return.class},
                {PHP54TranslatorWalker.arrayKeyValue_return.class},
                {PHP54TranslatorWalker.arrayType_return.class},
                {PHP54TranslatorWalker.atom_return.class},
                {PHP54TranslatorWalker.binaryOperatorWithoutDivision_return.class},
                {PHP54TranslatorWalker.block_return.class},
                {PHP54TranslatorWalker.blockConditional_return.class},
                {PHP54TranslatorWalker.caseLabel_return.class},
                {PHP54TranslatorWalker.castOperator_return.class},
                {PHP54TranslatorWalker.catchBlock_return.class},
                {PHP54TranslatorWalker.classBody_return.class},
                {PHP54TranslatorWalker.classBodyDefinition_return.class},
                {PHP54TranslatorWalker.classInterfaceType_return.class},
                {PHP54TranslatorWalker.classMemberDeclaration_return.class},
                {PHP54TranslatorWalker.classModifier_return.class},
                {PHP54TranslatorWalker.classModifierNames_return.class},
                {PHP54TranslatorWalker.classStaticAccess_return.class},
                {PHP54TranslatorWalker.compilationUnit_return.class},
                {PHP54TranslatorWalker.constDeclaration_return.class},
                {PHP54TranslatorWalker.constDeclarationList_return.class},
                {PHP54TranslatorWalker.constructDeclaration_return.class},
                {PHP54TranslatorWalker.definition_return.class},
                {PHP54TranslatorWalker.division_return.class},
                {PHP54TranslatorWalker.doWhileLoop_return.class},
                {PHP54TranslatorWalker.exit_return.class},
                {PHP54TranslatorWalker.expression_return.class},
                {PHP54TranslatorWalker.expressionList_return.class},
                {PHP54TranslatorWalker.extendsDeclaration_return.class},
                {PHP54TranslatorWalker.finalToken_return.class},
                {PHP54TranslatorWalker.foreachLoop_return.class},
                {PHP54TranslatorWalker.forLoop_return.class},
                {PHP54TranslatorWalker.formalParameters_return.class},
                {PHP54TranslatorWalker.functionCall_return.class},
                {PHP54TranslatorWalker.functionDeclaration_return.class},
                {PHP54TranslatorWalker.ifCondition_return.class},
                {PHP54TranslatorWalker.implementsDeclaration_return.class},
                {PHP54TranslatorWalker.instruction_return.class},
                {PHP54TranslatorWalker.interfaceBody_return.class},
                {PHP54TranslatorWalker.interfaceBodyDefinition_return.class},
                {PHP54TranslatorWalker.interfaceConstructDeclaration_return.class},
                {PHP54TranslatorWalker.interfaceDeclaration_return.class},
                {PHP54TranslatorWalker.interfaceMethodDeclaration_return.class},
                {PHP54TranslatorWalker.localVariableDeclaration_return.class},
                {PHP54TranslatorWalker.localVariableDeclarationList_return.class},
                {PHP54TranslatorWalker.methodCall_return.class},
                {PHP54TranslatorWalker.methodCallSelfOrParent_return.class},
                {PHP54TranslatorWalker.methodCallStatic_return.class},
                {PHP54TranslatorWalker.methodDeclaration_return.class},
                {PHP54TranslatorWalker.methodModifier_return.class},
                {PHP54TranslatorWalker.namespace_return.class},
                {PHP54TranslatorWalker.namespaceBody_return.class},
                {PHP54TranslatorWalker.newOperator_return.class},
                {PHP54TranslatorWalker.operator_return.class},
                {PHP54TranslatorWalker.paramDeclaration_return.class},
                {PHP54TranslatorWalker.parameterNormalOrOptional_return.class},
                {PHP54TranslatorWalker.postFixExpression_return.class},
                {PHP54TranslatorWalker.primitiveAtomWithConstant_return.class},
                {PHP54TranslatorWalker.primitiveTypes_return.class},
                {PHP54TranslatorWalker.primitiveTypesWithoutArray_return.class},
                {PHP54TranslatorWalker.returnTypes_return.class},
                {PHP54TranslatorWalker.scalarAndResource_return.class},
                {PHP54TranslatorWalker.scalarTypes_return.class},
                {PHP54TranslatorWalker.statement_return.class},
                {PHP54TranslatorWalker.staticAccess_return.class},
                {PHP54TranslatorWalker.staticToken_return.class},
                {PHP54TranslatorWalker.switchCondition_return.class},
                {PHP54TranslatorWalker.switchContent_return.class},
                {PHP54TranslatorWalker.tryCatch_return.class},
                {PHP54TranslatorWalker.typeModifier_return.class},
                {PHP54TranslatorWalker.unaryPostOperator_return.class},
                {PHP54TranslatorWalker.unaryPreOperator_return.class},
                {PHP54TranslatorWalker.unaryPrimitiveAtom_return.class},
                {PHP54TranslatorWalker.useDeclaration_return.class},
                {PHP54TranslatorWalker.useDeclarationList_return.class},
                {PHP54TranslatorWalker.variableDeclaration_return.class},
                {PHP54TranslatorWalker.variableDeclarationList_return.class},
                {PHP54TranslatorWalker.variableModifier_return.class},
                {PHP54TranslatorWalker.whileLoop_return.class}
        });
    }
}
