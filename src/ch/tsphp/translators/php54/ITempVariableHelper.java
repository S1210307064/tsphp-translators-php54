package ch.tsphp.translators.php54;

import ch.tsphp.common.ITSPHPAst;

public interface ITempVariableHelper
{
    String getTempVariableNameForCast(ITSPHPAst expression);
}
