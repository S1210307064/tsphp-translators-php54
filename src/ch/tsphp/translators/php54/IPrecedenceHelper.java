/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54;

import ch.tsphp.common.ITSPHPAst;

/**
 * A helper which informs whether a operator needs parentheses or not.
 */
public interface IPrecedenceHelper
{
    boolean needParentheses(ITSPHPAst operatorAst);
}
