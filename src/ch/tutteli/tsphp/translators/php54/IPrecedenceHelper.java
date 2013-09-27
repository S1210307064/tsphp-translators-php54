package ch.tutteli.tsphp.translators.php54;

import ch.tutteli.tsphp.common.ITSPHPAst;

public interface IPrecedenceHelper
{
    boolean needParentheses(ITSPHPAst operatorAst);
}
