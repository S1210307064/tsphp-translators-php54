package ch.tutteli.tsphp.translators.php54;

import ch.tutteli.tsphp.common.IScope;
import ch.tutteli.tsphp.common.ISymbol;
import ch.tutteli.tsphp.common.ITSPHPAst;
import ch.tutteli.tsphp.common.ITSPHPAstAdaptor;
import ch.tutteli.tsphp.translators.php54.antlr.PHP54TranslatorWalker;

public class TempVariableHelper implements ITempVariableHelper
{

    private final ITSPHPAstAdaptor astAdaptor;

    public TempVariableHelper(ITSPHPAstAdaptor theAstAdaptor) {
        astAdaptor = theAstAdaptor;
    }

    @Override
    public String getTempVariableNameForCast(ITSPHPAst expression) {
        if (expression.getToken().getType() == PHP54TranslatorWalker.VariableId) {
            return expression.getText();
        }
        String tokenText = "$_t" + expression.getLine() + "_" + expression.getCharPositionInLine();
        ITSPHPAst tmpVariable = astAdaptor.create(PHP54TranslatorWalker.VariableId, tokenText);
        IScope scope = expression.getScope();
        ISymbol symbol = scope != null ? scope.resolve(tmpVariable) : null;
        int count = 0;
        while (symbol != null) {
            tmpVariable.setText(tokenText + "_" + count);
            symbol = scope.resolve(tmpVariable);
            ++count;
        }
        return tmpVariable.getText();
    }
}
