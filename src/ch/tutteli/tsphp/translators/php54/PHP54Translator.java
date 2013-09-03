/*
 * Copyright 2013 Robert Stoll <rstoll@tutteli.ch>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
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

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
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
