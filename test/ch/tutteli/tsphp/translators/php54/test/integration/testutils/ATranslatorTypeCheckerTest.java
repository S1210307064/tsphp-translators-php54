package ch.tutteli.tsphp.translators.php54.test.integration.testutils;

import ch.tutteli.tsphp.common.ITypeChecker;
import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.typechecker.TypeChecker;
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
    protected void typecheck() {
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
