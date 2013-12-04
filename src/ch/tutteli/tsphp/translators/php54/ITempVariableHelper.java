package ch.tutteli.tsphp.translators.php54;

import ch.tutteli.tsphp.common.ITSPHPAst;

public interface ITempVariableHelper
{
    String getTempVariableNameForCast(ITSPHPAst expression);
}
