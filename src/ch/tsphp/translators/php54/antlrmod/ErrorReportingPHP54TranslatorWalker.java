/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54.antlrmod;

import ch.tsphp.common.ErrorReporterHelper;
import ch.tsphp.common.IErrorLogger;
import ch.tsphp.common.IErrorReporter;
import ch.tsphp.translators.php54.ICastHelper;
import ch.tsphp.translators.php54.IPrecedenceHelper;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;

import java.util.ArrayDeque;
import java.util.Collection;

/**
 * Extends PHP54TranslatorWalker by IErrorReporter.
 */
public class ErrorReportingPHP54TranslatorWalker extends PHP54TranslatorWalker implements IErrorReporter
{

    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
    private boolean hasFoundError;

    public ErrorReportingPHP54TranslatorWalker(
            TreeNodeStream input,
            IPrecedenceHelper precedenceHelper,
            ICastHelper castHelper) {

        super(input, precedenceHelper, castHelper);
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
