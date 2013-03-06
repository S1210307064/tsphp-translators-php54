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

import ch.tutteli.tsphp.common.ITSPHPAst;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Robert Stoll <rstoll@tutteli.ch>
 */
public class PrecedenceHelper implements IPrecedenceHelper
{

    private Map<String, Integer> precedenceRules = new HashMap<>();

    public PrecedenceHelper() {
        initPrecendecRules();
    }

    @Override
    public boolean needParentheses(ITSPHPAst operatorAst) {
        String operator = operatorAst.getText();
        String parentOperator = operatorAst.getParent().getText();
        return precedenceRules.containsKey(parentOperator)
                && precedenceRules.get(parentOperator) > precedenceRules.get(operator);
    }

    private void initPrecendecRules() {
        precedenceRules.put("or", 10);
        precedenceRules.put("xor", 11);
        precedenceRules.put("and", 12);

        precedenceRules.put("=", 20);
        precedenceRules.put("+=", 20);
        precedenceRules.put("-=", 20);
        precedenceRules.put("*=", 20);
        precedenceRules.put("/=", 20);
        precedenceRules.put("&=", 20);
        precedenceRules.put("|=", 20);
        precedenceRules.put("^=", 20);
        precedenceRules.put("%=", 20);
        precedenceRules.put(".=", 20);
        precedenceRules.put("<<=", 20);
        precedenceRules.put(">>=", 20);

        precedenceRules.put("?", 30);

        precedenceRules.put("||", 40);
        precedenceRules.put("&&", 41);
        precedenceRules.put("|", 50);
        precedenceRules.put("^", 51);
        precedenceRules.put("&", 52);

        precedenceRules.put("==", 60);
        precedenceRules.put("!=", 60);
        precedenceRules.put("<>", 60);
        precedenceRules.put("===", 60);
        precedenceRules.put("!==", 60);



        precedenceRules.put("<", 70);
        precedenceRules.put("<=", 70);
        precedenceRules.put(">", 70);
        precedenceRules.put(">=", 70);

        precedenceRules.put("<<", 80);
        precedenceRules.put(">>", 80);

        precedenceRules.put("+", 90);
        precedenceRules.put("-", 90);
        precedenceRules.put(".", 90);

        precedenceRules.put("*", 100);
        precedenceRules.put("/", 100);
        precedenceRules.put("%", 100);
        
        precedenceRules.put("instanceof", 110);
        
        precedenceRules.put("!", 120);
        precedenceRules.put("@", 120);
        precedenceRules.put("~", 120);
        precedenceRules.put("uMinus", 120);
        precedenceRules.put("preIncr", 120);
        precedenceRules.put("preDecr", 120);
        
        precedenceRules.put("postIncr", 130);
        precedenceRules.put("postDecr", 130);
    }
}
