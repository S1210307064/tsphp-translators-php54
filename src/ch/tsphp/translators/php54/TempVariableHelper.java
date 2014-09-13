/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54;

import ch.tsphp.common.IScope;
import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.common.ITSPHPAstAdaptor;
import ch.tsphp.common.symbols.ISymbol;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;

/**
 * A temp variable helper which uses the format "$_t + line + char position".
 */
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
