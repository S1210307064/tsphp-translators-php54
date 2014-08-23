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

    private StringTemplateGroup templateGroup;
    private IPrecedenceHelper precedenceHelper;
    private ITempVariableHelper tempVariableHelper;
    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
    private boolean hasFoundError;
    private Exception loadingTemplateException;

    public PHP54Translator(StringTemplateGroup theTemplateGroup,
            IPrecedenceHelper thePrecedenceHelper,
            ITempVariableHelper theTempTempVariableHelper,
            Exception exception) {
        templateGroup = theTemplateGroup;
        precedenceHelper = thePrecedenceHelper;
        tempVariableHelper = theTempTempVariableHelper;
        loadingTemplateException = exception;
    }

    @Override
    public String translate(TreeNodeStream stream) {
        String translation = null;
        if (loadingTemplateException == null) {
            ErrorReportingPHP54TranslatorWalker translator =
                    new ErrorReportingPHP54TranslatorWalker(stream, precedenceHelper, tempVariableHelper);

            for (IErrorLogger logger : errorLoggers) {
                translator.registerErrorLogger(logger);
            }
            translator.registerErrorLogger(this);

            translator.setTemplateLib(templateGroup);

            try {
                translation = translator.compilationUnit().getTemplate().toString();
            } catch (RecognitionException ex) {
                informErrorLogger(ex);
            }
        } else {
            informErrorLogger(loadingTemplateException);
        }

        return translation;

    }

    @Override
    public boolean hasFoundError() {
        return hasFoundError;
    }

    @Override
    public void registerErrorLogger(IErrorLogger errorLogger) {
        errorLoggers.add(errorLogger);
    }

    private void informErrorLogger(Exception ex) {
        hasFoundError = true;
        for (IErrorLogger logger : errorLoggers) {
            logger.log(new TSPHPException(ex));
        }
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