package ch.tutteli.tsphp.translators.php54;

import ch.tutteli.tsphp.common.ITranslator;
import ch.tutteli.tsphp.common.ITranslatorFactory;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.antlr.stringtemplate.StringTemplateGroup;

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
                //no further exception handling needed
            }
        }
    }

    @Override
    public ITranslator build() {
        return new PHP54Translator(templateGroup, precedenceHelper, loadingTemplateException);
    }
}
