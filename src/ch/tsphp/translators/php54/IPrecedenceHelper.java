package ch.tsphp.translators.php54;

import ch.tsphp.common.ITSPHPAst;

public interface IPrecedenceHelper
{
    boolean needParentheses(ITSPHPAst operatorAst);
}
