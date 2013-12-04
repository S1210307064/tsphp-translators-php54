package ch.tutteli.tsphp.translators.php54;

import ch.tutteli.tsphp.common.IErrorLogger;
import ch.tutteli.tsphp.common.ITranslator;
import ch.tutteli.tsphp.common.exceptions.TSPHPException;
import ch.tutteli.tsphp.translators.php54.antlrmod.ErrorReportingPHP54TranslatorWalker;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.util.ArrayDeque;
import java.util.Collection;

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
            } catch (Exception ex) {
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
