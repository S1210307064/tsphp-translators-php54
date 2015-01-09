/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.coverage;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.antlrmod.ErrorReportingPHP54TranslatorWalker;
import ch.tsphp.translators.php54.test.unit.testutils.AWalkerTest;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.ArgumentCaptor;
import org.mockito.exceptions.base.MockitoAssertionError;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

import static ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker.Else;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;
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
    public void standard_reportRecognitionException()
            throws RecognitionException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ITSPHPAst ast = createAst(tokenType);

        ErrorReportingPHP54TranslatorWalker walker = spy(createWalker(ast));
        Method method = ErrorReportingPHP54TranslatorWalker.class.getMethod(methodName);
        method.invoke(walker);

        try {
            ArgumentCaptor<RecognitionException> captor = ArgumentCaptor.forClass(RecognitionException.class);
            verify(walker).reportError(captor.capture());
            assertThat(methodName + " - failed. Wrong token type", captor.getValue().token.getType(), is(tokenType));
        } catch (MockitoAssertionError e) {
            fail(methodName + " failed - verify caused exception:\n" + e.getClass().getName() + e.getMessage());
        }
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testStrings() {
        return Arrays.asList(new Object[][]{
                {"abstractConstructDeclaration", Else},
                {"abstractMethodDeclaration", Else},
                {"abstractMethodModifier", Else},
                {"abstractToken", Else},
                {"accessModifier", Else},
                {"accessModifierWithoutPrivate", Else},
                {"actualParameters", Else},
                {"allTypes", Else},
                {"arrayKeyValue", Else},
                {"arrayType", Else},
                {"atom", Else},
                {"binaryOperatorWithoutDivision", Else},
                {"block", Else},
                {"blockConditional", Else},
                {"caseLabel", Else},
                {"castOperator", Else},
                {"catchBlock", Else},
                {"classBody", Else},
                {"classBodyDefinition", Else},
                {"classDeclaration", Else},
                {"classInterfaceType", Else},
                {"classModifier", Else},
                {"classModifierNames", Else},
                {"classStaticAccess", Else},
                {"compilationUnit", Else},
                {"constDeclaration", Else},
                {"constDeclarationList", Else},
                {"constructDeclaration", Else},
                {"constructDestructModifier", Else},
                {"definition", Else},
                {"division", Else},
                {"doWhileLoop", Else},
                {"expression", Else},
                {"extendsDeclaration", Else},
                {"fieldDeclaration", Else},
                {"finalToken", Else},
                {"foreachLoop", Else},
                {"forLoop", Else},
                {"formalParameters", Else},
                {"functionCall", Else},
                {"functionDeclaration", Else},
                {"ifCondition", Else},
                {"implementsDeclaration", Else},
                {"instruction", Else},
                {"interfaceBody", Else},
                {"interfaceBodyDefinition", Else},
                {"interfaceConstructDeclaration", Else},
                {"interfaceDeclaration", Else},
                {"interfaceMethodDeclaration", Else},
                {"localVariableDeclarationList", Else},
                {"methodCall", Else},
                {"methodCallSelfOrParent", Else},
                {"methodCallStatic", Else},
                {"methodDeclaration", Else},
                {"methodModifier", Else},
                {"namespace", Else},
                {"namespaceBody", Else},
                {"newOperator", Else},
                {"operator", Else},
                {"paramDeclaration", Else},
                {"parameterNormalOrOptional", Else},
                {"postFixExpression", Else},
                {"primitiveAtomWithConstant", Else},
                {"primitiveTypes", Else},
                {"primitiveTypesWithoutArray", Else},
                {"returnTypes", Else},
                {"scalarAndResource", Else},
                {"scalarTypes", Else},
                {"statement", Else},
                {"staticAccess", Else},
                {"staticToken", Else},
                {"switchCondition", Else},
                {"switchContent", Else},
                {"tryCatch", Else},
                {"typeModifier", Else},
                {"unaryPostOperator", Else},
                {"unaryPreOperator", Else},
                {"unaryPrimitiveAtom", Else},
                {"useDeclaration", Else},
                {"useDeclarationList", Else},
                {"variableDeclaration", Else},
                {"variableDeclarationList", Else},
                {"variableModifier", Else},
                {"whileLoop", Else},
        });
    }
}

