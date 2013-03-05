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
package ch.tutteli.tsphp.translators.php54.test.testutils;

import ch.tutteli.tsphp.common.AstHelper;
import ch.tutteli.tsphp.common.AstHelperRegistry;
import ch.tutteli.tsphp.common.ITSPHPAst;
import ch.tutteli.tsphp.common.ITSPHPAstAdaptor;
import ch.tutteli.tsphp.common.TSPHPAstAdaptor;
import ch.tutteli.tsphp.parser.antlr.ANTLRNoCaseStringStream;
import ch.tutteli.tsphp.parser.antlr.TSPHPErrorReportingLexer;
import ch.tutteli.tsphp.parser.antlr.TSPHPErrorReportingParser;
import ch.tutteli.tsphp.parser.antlr.TSPHPParser;
import ch.tutteli.tsphp.translators.php54.PHP54Translator;
import ch.tutteli.tsphp.translators.php54.antlr.PHP54TranslatorWalker;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeRuleReturnScope;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.junit.Assert;
import org.junit.Ignore;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
@Ignore
public abstract class ATest
{

    protected String testString;
    protected String expectedResult;
    protected ITSPHPAst ast;
    protected CommonTreeNodeStream commonTreeNodeStream;
    protected PHP54TranslatorWalker translator;
    protected TreeRuleReturnScope result;

    public ATest(String theTestString, String theExpectedResult) {
        testString = theTestString;
        expectedResult = theExpectedResult;
    }

    public void translate() throws FileNotFoundException, IOException, RecognitionException {
        ITSPHPAstAdaptor adaptor = new TSPHPAstAdaptor();
        AstHelperRegistry.set(new AstHelper(adaptor));
        
        CharStream stream = new ANTLRNoCaseStringStream(testString);
        TSPHPErrorReportingLexer lexer = new TSPHPErrorReportingLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        TSPHPErrorReportingParser parser = new TSPHPErrorReportingParser(tokens);
        parser.setTreeAdaptor(adaptor);

        ParserRuleReturnScope parserResult = parserRun(parser);
        ast = (ITSPHPAst) parserResult.getTree();

        Assert.assertFalse(testString.replaceAll("\n", " ") + " failed - lexer throw exception", lexer.hasFoundError());
        Assert.assertFalse(testString.replaceAll("\n", " ") + " failed - parser throw exception", parser.hasFoundError());

        commonTreeNodeStream = new CommonTreeNodeStream(adaptor, ast);
        commonTreeNodeStream.setTokenStream(parser.getTokenStream());

        // LOAD TEMPLATES (via classpath)
        URL url = ClassLoader.getSystemResource("PHP54.stg");
        FileReader fr = new FileReader(url.getFile());
        StringTemplateGroup templates = new StringTemplateGroup(fr);
        fr.close();

        //  CREATE TREE NODE STREAM FOR TREE PARSERS
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);
        nodes.setTokenStream(parser.getTokenStream());        // where to find tokens
        translator = new PHP54TranslatorWalker(nodes);
        translator.setTemplateLib(templates);

        run();

        check();
    }

    protected ParserRuleReturnScope parserRun(TSPHPParser parser) throws RecognitionException {
        return parser.statement();
    }

    protected void run() throws RecognitionException {
        result = translator.statement();
    }

    public void check() {
        Assert.assertEquals(testString + " failed.", expectedResult,
                result.getTemplate().toString().replaceAll("\r", ""));
    }
}
