/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit;

import ch.tsphp.common.IScope;
import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.common.ITSPHPAstAdaptor;
import ch.tsphp.common.symbols.ISymbol;
import ch.tsphp.translators.php54.ITempVariableHelper;
import ch.tsphp.translators.php54.TempVariableHelper;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import org.antlr.runtime.Token;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TempVariableHelperTest
{
    private ITSPHPAstAdaptor astAdaptor;

    @Before
    public void setUp() {
        astAdaptor = mock(ITSPHPAstAdaptor.class);
    }

    @Test
    public void getTempVariableNameForCast_IsVariable_ReturnVariableName() {
        ITSPHPAst ast = createAst(PHP54TranslatorWalker.VariableId, "$dummy");

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$dummy"));
    }

    @Test
    public void getTempVariableNameForCast_IsNotVariable_ReturnTempName() {
        ITSPHPAst ast = createAst(PHP54TranslatorWalker.Plus, "+");
        IScope scope = mock(IScope.class);
        when(ast.getScope()).thenReturn(scope);
        ITSPHPAst tmpVariable = mock(ITSPHPAst.class);
        when(astAdaptor.create(anyInt(), anyString())).thenReturn(tmpVariable);
        when(scope.resolve(tmpVariable)).thenReturn(null);
        when(tmpVariable.getText()).thenReturn("$_t12_14");

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14"));
    }

    @Test
    public void getTempVariableNameForCast_IsNotVariableTempAlreadyDefined_ReturnTempNameWithAppendix() {
        ITSPHPAst ast = createAst(PHP54TranslatorWalker.Plus, "+");
        when(ast.getLine()).thenReturn(12);
        when(ast.getCharPositionInLine()).thenReturn(14);
        IScope scope = mock(IScope.class);
        when(ast.getScope()).thenReturn(scope);
        ITSPHPAst tmpVariable = mock(ITSPHPAst.class);
        when(astAdaptor.create(anyInt(), anyString())).thenReturn(tmpVariable);
        when(scope.resolve(tmpVariable)).thenReturn(mock(ISymbol.class)).thenReturn(null);
        when(tmpVariable.getText()).thenReturn("$_t12_14_0");

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14_0"));
        verify(tmpVariable).setText("$_t12_14_0");
    }

    private ITSPHPAst createAst(int tokenType, String name) {
        ITSPHPAst ast = mock(ITSPHPAst.class);
        Token token = mock(Token.class);
        when(ast.getToken()).thenReturn(token);
        when(token.getType()).thenReturn(tokenType);
        when(ast.getText()).thenReturn(name);
        return ast;
    }

    private ITempVariableHelper createTempVariableHelper() {
        return new TempVariableHelper(astAdaptor);
    }
}
