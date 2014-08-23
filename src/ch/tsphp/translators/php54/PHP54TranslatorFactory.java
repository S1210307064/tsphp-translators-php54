/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54;

import ch.tsphp.common.ITSPHPAstAdaptor;
import ch.tsphp.common.ITranslator;
import ch.tsphp.common.ITranslatorFactory;
import ch.tsphp.common.TSPHPAstAdaptor;
import ch.tsphp.common.exceptions.TSPHPException;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * The factory which builds the PHP54Translator.
 * <p/>
 * It loads a StringTemplate which is used by the PHP54Translator.
 */
public class PHP54TranslatorFactory implements ITranslatorFactory
{

    private StringTemplateGroup templateGroup;
    private final IPrecedenceHelper precedenceHelper;
    private final ITempVariableHelper tempVariableHelper;
    private Exception loadingTemplateException;

    public PHP54TranslatorFactory() {
        this(new TSPHPAstAdaptor());
    }

    public PHP54TranslatorFactory(ITSPHPAstAdaptor anAstAdaptor) {
        precedenceHelper = new PHP54PrecedenceHelper();
        tempVariableHelper = new TempVariableHelper(anAstAdaptor);
        InputStreamReader streamReader = null;
        try {
            // LOAD TEMPLATES (via classpath)
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            final InputStream inputStream = classLoader.getResourceAsStream("PHP54.stg");
            if (inputStream != null) {
                streamReader = new InputStreamReader(inputStream);
                templateGroup = new StringTemplateGroup(streamReader);
                streamReader.close();
            } else {
                loadingTemplateException = new TSPHPException("PHP54.stg could not be resolved");
            }
        } catch (IOException ex) {
            loadingTemplateException = ex;
        } finally {
            try {
                if (streamReader != null) {
                    streamReader.close();
                }
            } catch (IOException ex) {
                //no further exception handling needed
            }
        }
    }

    @Override
    public ITranslator build() {
        return new PHP54Translator(templateGroup, precedenceHelper, tempVariableHelper, loadingTemplateException);
    }
}
