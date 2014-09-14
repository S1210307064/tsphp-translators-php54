/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54;

import ch.tsphp.common.ITSPHPAst;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

/**
 * Represents a helper which deals with casts, built-in casts respectively.
 */
public interface ICastHelper
{
    /**
     * Returns the output code for a built-in cast in the form of a StringTemplate.
     */
    StringTemplate getCast(StringTemplateGroup templateLib, ITSPHPAst typeAst,
            ITSPHPAst expression, StringTemplate expressionTemplate);
}