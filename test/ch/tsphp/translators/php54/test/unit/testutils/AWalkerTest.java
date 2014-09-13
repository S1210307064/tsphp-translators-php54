/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.unit.testutils;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.common.TSPHPAst;
import ch.tsphp.common.TSPHPAstAdaptor;
import ch.tsphp.translators.php54.ICastHelper;
import ch.tsphp.translators.php54.IPrecedenceHelper;
import ch.tsphp.translators.php54.antlrmod.ErrorReportingPHP54TranslatorWalker;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeNodeStream;
import org.junit.Ignore;

import static org.mockito.Mockito.mock;

@Ignore
public abstract class AWalkerTest
{
    protected TreeNodeStream treeNodeStream;
    protected IPrecedenceHelper precedenceHelper;
    protected ICastHelper castHelper;

    protected ErrorReportingPHP54TranslatorWalker createWalker(ITSPHPAst ast) {
        treeNodeStream = createTreeNodeStream(ast);
        precedenceHelper = mock(IPrecedenceHelper.class);
        castHelper = mock(ICastHelper.class);
        return new ErrorReportingPHP54TranslatorWalker(treeNodeStream, precedenceHelper, castHelper);
    }

    protected TreeNodeStream createTreeNodeStream(ITSPHPAst ast) {
        return new CommonTreeNodeStream(new TSPHPAstAdaptor(), ast);
    }

    protected ITSPHPAst createAst(int tokenType) {
        return new TSPHPAst(new CommonToken(tokenType));
    }
}
