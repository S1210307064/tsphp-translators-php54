/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.test.integration.testutils;

import ch.tsphp.common.ITypeChecker;
import ch.tsphp.parser.antlr.TSPHPParser;
import ch.tsphp.typechecker.TypeChecker;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Ignore;

@Ignore
public abstract class ATranslatorTypeCheckerTest extends ATest
{

    public ATranslatorTypeCheckerTest(String theTestString, String theExpectedResult) {
        super(theTestString, theExpectedResult);
    }

    @Override
    protected void typeCheck() {
        ITypeChecker typeChecker = new TypeChecker();
        typeChecker.registerErrorLogger(this);

        typeChecker.enrichWithDefinitions(ast, commonTreeNodeStream);
        Assert.assertFalse(testString + " failed. found definition exception(s)", typeChecker.hasFoundError());

        typeChecker.enrichWithReferences(ast, commonTreeNodeStream);
        Assert.assertFalse(testString + " failed. found reference exception(s)", typeChecker.hasFoundError());

        typeChecker.doTypeChecking(ast, commonTreeNodeStream);
        Assert.assertFalse(testString + " failed. found type checking exception(s)", typeChecker.hasFoundError());
    }

    @Override
    protected ParserRuleReturnScope parserRun(TSPHPParser parser) throws RecognitionException {
        return parser.compilationUnit();
    }

    @Override
    protected void run() throws RecognitionException {
        result = translator.compilationUnit();
    }
}
