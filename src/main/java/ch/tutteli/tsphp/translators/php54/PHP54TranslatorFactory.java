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
import ch.tutteli.tsphp.common.ITranslatorFactory;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.antlr.stringtemplate.StringTemplateGroup;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class PHP54TranslatorFactory implements ITranslatorFactory
{

    private StringTemplateGroup templateGroup;
    private final IPrecedenceHelper precedenceHelper;
    private Exception loadingTemplateException;

    public PHP54TranslatorFactory() {
        precedenceHelper = new PrecedenceHelper();
        InputStreamReader streamReader = null;
        try {
            // LOAD TEMPLATES (via classpath)
            final URL url = ClassLoader.getSystemResource("PHP54.stg");
            streamReader = new InputStreamReader(url.openStream());
            templateGroup = new StringTemplateGroup(streamReader);
            streamReader.close();
        } catch (IOException ex) {
            loadingTemplateException = ex;
        } finally {
            try {
                if (streamReader != null) {
                    streamReader.close();
                }
            } catch (Exception ex) {
                //no furhter exception handling needed
            }
        }
    }

    @Override
    public ITranslator build() {
        return new PHP54Translator(templateGroup, precedenceHelper, loadingTemplateException);
    }
}
