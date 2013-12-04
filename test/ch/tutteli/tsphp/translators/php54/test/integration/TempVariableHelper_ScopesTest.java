package ch.tutteli.tsphp.translators.php54.test.integration;

import ch.tutteli.tsphp.common.IScope;
import ch.tutteli.tsphp.common.ITSPHPAst;
import ch.tutteli.tsphp.common.ITSPHPAstAdaptor;
import ch.tutteli.tsphp.common.TSPHPAst;
import ch.tutteli.tsphp.common.TSPHPAstAdaptor;
import ch.tutteli.tsphp.translators.php54.ITempVariableHelper;
import ch.tutteli.tsphp.translators.php54.TempVariableHelper;
import ch.tutteli.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import ch.tutteli.tsphp.typechecker.scopes.ConditionalScope;
import ch.tutteli.tsphp.typechecker.scopes.GlobalNamespaceScope;
import ch.tutteli.tsphp.typechecker.scopes.IScopeHelper;
import ch.tutteli.tsphp.typechecker.scopes.NamespaceScope;
import ch.tutteli.tsphp.typechecker.scopes.ScopeHelper;
import ch.tutteli.tsphp.typechecker.symbols.VariableSymbol;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TempVariableHelper_ScopesTest
{
    private ITSPHPAstAdaptor astAdaptor;
    private IScopeHelper scopeHelper;

    @Before
    public void setUp() {
        astAdaptor = new TSPHPAstAdaptor();
        scopeHelper = new ScopeHelper();
    }

    @Test
    public void getTempVariableNameForCast_ConditionalScope_ReturnTempName() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        ast.setScope(
                new ConditionalScope(scopeHelper,
                        new NamespaceScope(scopeHelper, "\\test\\",
                                new GlobalNamespaceScope(scopeHelper, "\\test\\"))));

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14"));
    }

    @Test
    public void getTempVariableNameForCast_ConditionalScopeIsAlreadyDefined_ReturnTempNameWithAppendix() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        IScope scope =
                new ConditionalScope(scopeHelper,
                        new NamespaceScope(scopeHelper, "\\test\\",
                                new GlobalNamespaceScope(scopeHelper, "\\test\\")));
        scope.define(new VariableSymbol(new TSPHPAst(), new HashSet<Integer>(), "$_t12_14"));
        ast.setScope(scope);

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14_0"));
    }

    @Test
    public void getTempVariableNameForCast_NamespaceScope_ReturnTempName() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        ast.setScope(new NamespaceScope(scopeHelper, "\\test\\", new GlobalNamespaceScope(scopeHelper, "\\test\\")));


        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14"));
    }

    @Test
    public void getTempVariableNameForCast_NamespaceScope_ReturnTempNameWithAppendix() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        IScope scope = new NamespaceScope(scopeHelper, "\\test\\", new GlobalNamespaceScope(scopeHelper, "\\test\\"));
        scope.define(new VariableSymbol(new TSPHPAst(), new HashSet<Integer>(), "$_t12_14"));
        ast.setScope(scope);

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14_0"));
    }

    @Test
    public void getTempVariableNameForCast_GlobalNamespaceScope_ReturnTempName() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        ast.setScope(new GlobalNamespaceScope(scopeHelper, "\\test\\"));

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14"));
    }

    @Test
    public void getTempVariableNameForCast_GlobalNamespaceScope_ReturnTempNameWithAppendix() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        IScope scope = new GlobalNamespaceScope(scopeHelper, "\\test\\");
        scope.define(new VariableSymbol(new TSPHPAst(), new HashSet<Integer>(), "$_t12_14"));
        ast.setScope(scope);

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14_0"));
    }

    private ITempVariableHelper createTempVariableHelper() {
        return new TempVariableHelper(astAdaptor);
    }
}