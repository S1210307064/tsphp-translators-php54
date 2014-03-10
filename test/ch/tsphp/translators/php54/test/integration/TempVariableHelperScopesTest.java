/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration;

import ch.tsphp.common.IScope;
import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.common.ITSPHPAstAdaptor;
import ch.tsphp.common.TSPHPAst;
import ch.tsphp.common.TSPHPAstAdaptor;
import ch.tsphp.translators.php54.ITempVariableHelper;
import ch.tsphp.translators.php54.TempVariableHelper;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import ch.tsphp.typechecker.error.ErrorMessageProvider;
import ch.tsphp.typechecker.error.ITypeCheckerErrorReporter;
import ch.tsphp.typechecker.error.TypeCheckerErrorReporter;
import ch.tsphp.typechecker.scopes.ConditionalScope;
import ch.tsphp.typechecker.scopes.GlobalNamespaceScope;
import ch.tsphp.typechecker.scopes.IGlobalNamespaceScope;
import ch.tsphp.typechecker.scopes.IScopeHelper;
import ch.tsphp.typechecker.scopes.NamespaceScope;
import ch.tsphp.typechecker.scopes.ScopeHelper;
import ch.tsphp.typechecker.symbols.VariableSymbol;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TempVariableHelperScopesTest
{
    private ITSPHPAstAdaptor astAdaptor;
    private IScopeHelper scopeHelper;
    private ITypeCheckerErrorReporter typeCheckerErrorReporter;

    @Before
    public void setUp() {
        astAdaptor = new TSPHPAstAdaptor();
        typeCheckerErrorReporter = new TypeCheckerErrorReporter(new ErrorMessageProvider());
        scopeHelper = new ScopeHelper(typeCheckerErrorReporter);
    }

    @Test
    public void getTempVariableNameForCast_ConditionalScope_ReturnTempName() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        ast.setScope(createConditionalScope(scopeHelper, typeCheckerErrorReporter));

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14"));
    }

    @Test
    public void getTempVariableNameForCast_ConditionalScopeIsAlreadyDefined_ReturnTempNameWithAppendix() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        IScope scope = createConditionalScope(scopeHelper, typeCheckerErrorReporter);

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
        ast.setScope(createNamespaceScope(scopeHelper, typeCheckerErrorReporter));


        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14"));
    }

    @Test
    public void getTempVariableNameForCast_NamespaceScope_ReturnTempNameWithAppendix() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        IScope scope = createNamespaceScope(scopeHelper, typeCheckerErrorReporter);
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
        ast.setScope(createGlobalNamespaceScope(scopeHelper));

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14"));
    }

    @Test
    public void getTempVariableNameForCast_GlobalNamespaceScope_ReturnTempNameWithAppendix() {
        ITSPHPAst ast = astAdaptor.create(PHP54TranslatorWalker.Plus, "+");
        ast.getToken().setLine(12);
        ast.getToken().setCharPositionInLine(14);
        IScope scope = createGlobalNamespaceScope(scopeHelper);
        scope.define(new VariableSymbol(new TSPHPAst(), new HashSet<Integer>(), "$_t12_14"));
        ast.setScope(scope);

        ITempVariableHelper tempVariableHelper = createTempVariableHelper();
        String name = tempVariableHelper.getTempVariableNameForCast(ast);

        assertThat(name, is("$_t12_14_0"));
    }

    protected ITempVariableHelper createTempVariableHelper() {
        return new TempVariableHelper(astAdaptor);
    }

    protected IScope createConditionalScope(
            IScopeHelper scopeHelper, ITypeCheckerErrorReporter typeCheckerErrorReporter) {
        return new ConditionalScope(
                scopeHelper, createNamespaceScope(scopeHelper, typeCheckerErrorReporter), typeCheckerErrorReporter);
    }

    protected IScope createNamespaceScope(
            IScopeHelper scopeHelper, ITypeCheckerErrorReporter typeCheckerErrorReporter) {
        return new NamespaceScope(
                scopeHelper, "\\test\\", createGlobalNamespaceScope(scopeHelper), typeCheckerErrorReporter);
    }

    protected IGlobalNamespaceScope createGlobalNamespaceScope(IScopeHelper scopeHelper) {
        return new GlobalNamespaceScope(scopeHelper, "\\test\\");
    }
}