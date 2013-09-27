package ch.tutteli.tsphp.translators.php54;

import ch.tutteli.tsphp.common.IErrorLogger;
import ch.tutteli.tsphp.common.ITranslator;
import ch.tutteli.tsphp.common.exceptions.TSPHPException;
import ch.tutteli.tsphp.translators.php54.antlr.ErrorReportingPHP54TranslatorWalker;
import java.util.ArrayDeque;
import java.util.Collection;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

public class PHP54Translator implements ITranslator, IErrorLogger
{

    private StringTemplateGroup templateGroup;
    private IPrecedenceHelper precedenceHelper;
    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();
    private boolean hasFoundError;
    private Exception loadingTemplateException;

    public PHP54Translator(StringTemplateGroup theTemplateGroup, IPrecedenceHelper thePrecedenceHelper,
            Exception exception) {
        templateGroup = theTemplateGroup;
        precedenceHelper = thePrecedenceHelper;
        loadingTemplateException = exception;
    }

    @Override
    public String translate(TreeNodeStream stream) {
        String translation = null;
        if (loadingTemplateException == null) {
            ErrorReportingPHP54TranslatorWalker translator =
                    new ErrorReportingPHP54TranslatorWalker(stream, precedenceHelper);

            for (IErrorLogger logger : errorLoggers) {
                translator.addErrorLogger(logger);
            }
            translator.addErrorLogger(this);

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
    public void addErrorLogger(IErrorLogger errorLogger) {
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
    public void log(TSPHPException tsphpe) {
        hasFoundError = true;
    }
}
