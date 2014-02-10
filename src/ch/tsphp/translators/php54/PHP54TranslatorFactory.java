package ch.tsphp.translators.php54;

import ch.tsphp.common.ITSPHPAstAdaptor;
import ch.tsphp.common.ITranslator;
import ch.tsphp.common.ITranslatorFactory;

import java.io.InputStreamReader;
import java.net.URL;

import ch.tsphp.common.TSPHPAstAdaptor;
import org.antlr.stringtemplate.StringTemplateGroup;

public class PHP54TranslatorFactory implements ITranslatorFactory
{

    private StringTemplateGroup templateGroup;
    private final IPrecedenceHelper precedenceHelper;
    private final ITempVariableHelper tempVariableHelper;
    private Exception loadingTemplateException;

    public PHP54TranslatorFactory(){
        this(new TSPHPAstAdaptor());
    }
    public PHP54TranslatorFactory(ITSPHPAstAdaptor anAstAdaptor) {
        precedenceHelper = new PrecedenceHelper();
        tempVariableHelper = new TempVariableHelper(anAstAdaptor);
        InputStreamReader streamReader = null;
        try {
            // LOAD TEMPLATES (via classpath)
            final URL url = ClassLoader.getSystemResource("PHP54.stg");
            streamReader = new InputStreamReader(url.openStream());
            templateGroup = new StringTemplateGroup(streamReader);
            streamReader.close();
        } catch(Exception ex){
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
        return new PHP54Translator(templateGroup, precedenceHelper, tempVariableHelper, loadingTemplateException);
    }
}
