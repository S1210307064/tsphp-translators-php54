package ch.tutteli.tsphp.translators.php54.antlrmod;

import ch.tutteli.tsphp.common.ErrorReporterHelper;
import ch.tutteli.tsphp.common.IErrorLogger;
import ch.tutteli.tsphp.common.IErrorReporter;
import ch.tutteli.tsphp.translators.php54.IPrecedenceHelper;
import ch.tutteli.tsphp.translators.php54.ITempVariableHelper;
import ch.tutteli.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;

import java.util.ArrayDeque;
import java.util.Collection;

public class ErrorReportingPHP54TranslatorWalker extends PHP54TranslatorWalker implements IErrorReporter
{

    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
    private boolean hasFoundError;

    public ErrorReportingPHP54TranslatorWalker(
            TreeNodeStream input,
            IPrecedenceHelper precedenceHelper,
            ITempVariableHelper tempVariableHelper) {

        super(input, precedenceHelper, tempVariableHelper);
    }

    @Override
    public boolean hasFoundError() {
        return hasFoundError;
    }

    @Override
    public void reportError(RecognitionException exception) {
        hasFoundError = true;
        ErrorReporterHelper.reportError(errorLoggers, exception, "translating to php 5.4");
    }

    @Override
    public void registerErrorLogger(IErrorLogger errorLogger) {
        errorLoggers.add(errorLogger);
    }
}
