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

import ch.tutteli.tsphp.common.ITranslator;
import ch.tutteli.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.stringtemplate.StringTemplateGroup;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class PHP54Translator implements ITranslator
{

    StringTemplateGroup templateGroup;
    List<Exception> exceptions = new ArrayList<>();

    public PHP54Translator() {
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
    }

    @Override
    public String translate(TreeNodeStream stream) {
        PHP54TranslatorWalker translator = new PHP54TranslatorWalker(stream);
        translator.setTemplateLib(templateGroup);

        String translation = null;
        try {
            translation = translator.compilationUnit().getTemplate().toString();
        } catch (RecognitionException ex) {
            exceptions.add(ex);
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
}
