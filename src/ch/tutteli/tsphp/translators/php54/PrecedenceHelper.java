package ch.tutteli.tsphp.translators.php54;

import ch.tutteli.tsphp.common.ITSPHPAst;
import java.util.HashMap;
import java.util.Map;

public class PrecedenceHelper implements IPrecedenceHelper
{

    private Map<String, Integer> precedenceRules = new HashMap<>();

    public PrecedenceHelper() {
        initPrecedenceRules();
    }

    @Override
    public boolean needParentheses(ITSPHPAst operatorAst) {
        String operator = operatorAst.getText();
        String parentOperator = operatorAst.getParent().getText();
        return precedenceRules.containsKey(parentOperator)
                && precedenceRules.get(parentOperator) > precedenceRules.get(operator);
    }

    private void initPrecedenceRules() {
        //CHECKSTYLE:OFF:MagicNumber
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
        //CHECKSTYLE:ON:MagicNumber
    }
}
