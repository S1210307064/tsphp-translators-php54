/*
 * Copyright 2012 Robert Stoll <rstoll@tutteli.ch>
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
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class PHP54Translator implements ITranslator, IErrorLogger
{

    StringTemplateGroup templateGroup;
    List<Exception> exceptions = new ArrayList<>();
    IPrecedenceHelper precedenceHelper;
    private Collection<IErrorLogger> errorLoggers = new ArrayDeque<>();

    public PHP54Translator() {
        this(new PrecedenceHelper());
    }

    public PHP54Translator(IPrecedenceHelper thePrecedenceHelper) {
        FileReader fileReader = null;
        try {
            // LOAD TEMPLATES (via classpath)
            URL url = ClassLoader.getSystemResource("PHP54.stg");
            fileReader = new FileReader(url.getFile());
            templateGroup = new StringTemplateGroup(fileReader);
            fileReader.close();
        } catch (IOException ex) {
            exceptions.add(ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                //no furhter exceptio handling needed
            }
        }
        precedenceHelper = thePrecedenceHelper;
    }

    @Override
    public String translate(TreeNodeStream stream) {
        ErrorReportingPHP54TranslatorWalker translator =
                new ErrorReportingPHP54TranslatorWalker(stream, precedenceHelper);

        translator.setTemplateLib(templateGroup);

        String translation = null;
        try {
            translation = translator.compilationUnit().getTemplate().toString();
        } catch (RecognitionException ex) {
            exceptions.add(ex);
        }
        if (translator.hasFoundError()) {
            exceptions.addAll(translator.getExceptions());
        }
        return translation;
    }

    @Override
    public boolean hasFoundError() {
        return !exceptions.isEmpty();
    }

    @Override
    public List<Exception> getExceptions() {
        return exceptions;
    }

    @Override
    public void addErrorLogger(IErrorLogger errorLogger) {
        errorLoggers.add(errorLogger);
    }

    @Override
    public void log(TSPHPException exception) {
        for (IErrorLogger logger : errorLoggers) {
            logger.log(exception);
        }
    }
}
