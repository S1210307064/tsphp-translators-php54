/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54;

import ch.tsphp.common.IErrorLogger;
import ch.tsphp.common.ITranslator;
import ch.tsphp.common.exceptions.TSPHPException;
import ch.tsphp.translators.php54.antlrmod.ErrorReportingPHP54TranslatorWalker;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.util.ArrayDeque;
import java.util.Collection;

/**
 * The translator which translates TSPHP to PHP 5.4.
 */
public class PHP54Translator implements ITranslator, IErrorLogger
{

    private final StringTemplateGroup templateGroup;
    private final IPrecedenceHelper precedenceHelper;
    private final ICastHelper castHelper;
    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
    private boolean hasFoundError;
    private Exception loadingTemplateException;

    public PHP54Translator(StringTemplateGroup theTemplateGroup,
            IPrecedenceHelper thePrecedenceHelper,
            ICastHelper theCastVariableHelper,
            Exception exception) {
        templateGroup = theTemplateGroup;
        precedenceHelper = thePrecedenceHelper;
        castHelper = theCastVariableHelper;
        loadingTemplateException = exception;
    }

    @Override
    public String translate(TreeNodeStream stream) {
        String translation = null;
        if (loadingTemplateException == null) {
            ErrorReportingPHP54TranslatorWalker translator =
                    new ErrorReportingPHP54TranslatorWalker(stream, precedenceHelper, castHelper);

            for (IErrorLogger logger : errorLoggers) {
                translator.registerErrorLogger(logger);
            }
            translator.registerErrorLogger(this);

            translator.setTemplateLib(templateGroup);

            try {
                translation = translator.compilationUnit().getTemplate().toString();
            } catch (RecognitionException ex) {
                informErrorLoggers(ex);
            }
        } else {
            informErrorLoggers(loadingTemplateException);
        }

        return translation;

    }

    private void informErrorLoggers(Exception ex) {
        hasFoundError = true;
        for (IErrorLogger logger : errorLoggers) {
            logger.log(new TSPHPException(ex));
        }
    }


    @Override
    public boolean hasFoundError() {
        return hasFoundError;
    }

    @Override
    public void registerErrorLogger(IErrorLogger errorLogger) {
        errorLoggers.add(errorLogger);
    }

    @Override
    public void reset() {
        hasFoundError = false;
    }

    @Override
    public void log(TSPHPException exception) {
        hasFoundError = true;
    }
}