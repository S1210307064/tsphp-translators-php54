/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.coverage;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.antlrmod.ErrorReportingPHP54TranslatorWalker;
import ch.tsphp.translators.php54.test.unit.testutils.AWalkerTest;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.Try;
import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.VariableId;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@RunWith(Parameterized.class)
public class NotCorrectStartNodeTypeTest extends AWalkerTest
{
    private String methodName;
    private int tokenType;

    public NotCorrectStartNodeTypeTest(String theMethodName, int theTokenType) {
        methodName = theMethodName;
        tokenType = theTokenType;
    }

    @Test
    public void standard_reportNoViableAltException()
            throws RecognitionException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ITSPHPAst ast = createAst(tokenType);

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        Method method = ErrorReportingPHP54TranslatorWalker.class.getMethod(methodName);
        method.invoke(walker);

        try {
            verify(walker).reportError(any(NoViableAltException.class));
        } catch (Exception e) {
            fail(methodName + " failed - verify caused exception:\n" + e.getClass().getName() + e.getMessage());
        }
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"abstractConstructDeclaration", Try},
                {"abstractMethodDeclaration", Try},
                {"abstractMethodModifier", Try},
                {"abstractToken", Try},
                {"accessModifier", Try},
                {"actualParameters", Try},
                {"allTypes", Try},
                {"arrayKeyValue", Try},
                {"arrayType", Try},
                {"atom", Try},
                {"binaryOperatorWithoutDivision", Try},
                {"block", Try},
                {"blockConditional", Try},
                {"caseLabel", Try},
                {"castOperator", Try},
                {"catchBlock", Try},
                {"classBody", Try},
                {"classBodyDefinition", Try},
                {"classDeclaration", Try},
                {"classInterfaceType", Try},
                {"classMemberDeclaration", Try},
                {"classModifier", Try},
                {"classModifierNames", Try},
                {"classStaticAccess", Try},
                {"compilationUnit", Try},
                {"constDeclaration", Try},
                {"constDeclarationList", Try},
                {"constructDeclaration", Try},
                {"definition", Try},
                {"division", Try},
                {"doWhileLoop", Try},
                {"exit", Try},
                {"expression", Try},
                {"extendsDeclaration", Try},
                {"finalToken", Try},
                {"foreachLoop", Try},
                {"forLoop", Try},
                {"formalParameters", Try},
                {"functionCall", Try},
                {"functionDeclaration", Try},
                {"ifCondition", Try},
                {"implementsDeclaration", Try},
                {"instruction", Try},
                {"interfaceBody", Try},
                {"interfaceBodyDefinition", Try},
                {"interfaceConstructDeclaration", Try},
                {"interfaceDeclaration", Try},
                {"interfaceMethodDeclaration", Try},
                {"localVariableDeclarationList", Try},
                {"methodCall", Try},
                {"methodCallSelfOrParent", Try},
                {"methodCallStatic", Try},
                {"methodDeclaration", Try},
                {"methodModifier", Try},
                {"namespace", Try},
                {"namespaceBody", Try},
                {"newOperator", Try},
                {"operator", Try},
                {"paramDeclaration", Try},
                {"parameterNormalOrOptional", Try},
                {"postFixExpression", Try},
                {"primitiveAtomWithConstant", Try},
                {"primitiveTypes", Try},
                {"primitiveTypesWithoutArray", Try},
                {"returnTypes", Try},
                {"scalarAndResource", Try},
                {"scalarTypes", Try},
                {"statement", Try},
                {"staticAccess", Try},
                {"staticToken", Try},
                {"switchCondition", Try},
                {"switchContent", Try},
                {"tryCatch", VariableId},
                {"typeModifier", Try},
                {"unaryPostOperator", Try},
                {"unaryPreOperator", Try},
                {"unaryPrimitiveAtom", Try},
                {"useDeclaration", Try},
                {"useDeclarationList", Try},
                {"variableDeclaration", Try},
                {"variableDeclarationList", Try},
                {"variableModifier", Try},
                {"whileLoop", Try},
        });
    }
}

