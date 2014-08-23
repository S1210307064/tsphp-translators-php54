/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54;

import ch.tsphp.common.ITSPHPAst;
import ch.tsphp.translators.php54.antlr.PHP54TranslatorWalker;

import java.util.HashMap;
import java.util.Map;

/**
 * A precedence helper which orients itself by PHP 5.4.
 */
public class PHP54PrecedenceHelper implements IPrecedenceHelper
{

    private Map<Integer, Integer> precedenceRules = new HashMap<>();

    public PHP54PrecedenceHelper() {
        initPrecedenceRules();
    }

    @Override
    public boolean needParentheses(ITSPHPAst operatorAst) {
        int operatorType = operatorAst.getType();
        int parentOperatorType = operatorAst.getParent().getType();
        return precedenceRules.containsKey(parentOperatorType)
                && precedenceRules.get(parentOperatorType) > precedenceRules.get(operatorType);
    }

    @SuppressWarnings("checkstyle:magicnumber")
    private void initPrecedenceRules() {
        precedenceRules.put(PHP54TranslatorWalker.LogicOrWeak, 10);
        precedenceRules.put(PHP54TranslatorWalker.LogicXorWeak, 11);
        precedenceRules.put(PHP54TranslatorWalker.LogicAndWeak, 12);

        precedenceRules.put(PHP54TranslatorWalker.Assign, 20);
        precedenceRules.put(PHP54TranslatorWalker.PlusAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.MinusAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.Dot, 20);
        precedenceRules.put(PHP54TranslatorWalker.MultiplyAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.DivideAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.BitwiseAndAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.BitwiseOrAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.BitwiseXorAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.ModuloAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.ShiftLeftAssign, 20);
        precedenceRules.put(PHP54TranslatorWalker.ShiftRightAssign, 20);

        precedenceRules.put(PHP54TranslatorWalker.QuestionMark, 30);

        precedenceRules.put(PHP54TranslatorWalker.LogicOr, 40);
        precedenceRules.put(PHP54TranslatorWalker.LogicAnd, 41);

        precedenceRules.put(PHP54TranslatorWalker.BitwiseOr, 50);
        precedenceRules.put(PHP54TranslatorWalker.BitwiseXor, 51);
        precedenceRules.put(PHP54TranslatorWalker.BitwiseAnd, 52);

        precedenceRules.put(PHP54TranslatorWalker.Equal, 60);
        precedenceRules.put(PHP54TranslatorWalker.NotEqual, 60);
        precedenceRules.put(PHP54TranslatorWalker.Identical, 60);
        precedenceRules.put(PHP54TranslatorWalker.NotIdentical, 60);


        precedenceRules.put(PHP54TranslatorWalker.LessThan, 70);
        precedenceRules.put(PHP54TranslatorWalker.LessEqualThan, 70);
        precedenceRules.put(PHP54TranslatorWalker.GreaterThan, 70);
        precedenceRules.put(PHP54TranslatorWalker.GreaterEqualThan, 70);

        precedenceRules.put(PHP54TranslatorWalker.ShiftLeft, 80);
        precedenceRules.put(PHP54TranslatorWalker.ShiftRight, 80);

        precedenceRules.put(PHP54TranslatorWalker.Plus, 90);
        precedenceRules.put(PHP54TranslatorWalker.Minus, 90);
        precedenceRules.put(PHP54TranslatorWalker.Dot, 90);

        precedenceRules.put(PHP54TranslatorWalker.Multiply, 100);
        precedenceRules.put(PHP54TranslatorWalker.Divide, 100);
        precedenceRules.put(PHP54TranslatorWalker.Modulo, 100);

        precedenceRules.put(PHP54TranslatorWalker.Instanceof, 110);

        precedenceRules.put(PHP54TranslatorWalker.CAST, 120);
        precedenceRules.put(PHP54TranslatorWalker.PRE_INCREMENT, 120);
        precedenceRules.put(PHP54TranslatorWalker.PRE_DECREMENT, 120);
        precedenceRules.put(PHP54TranslatorWalker.At, 120);
        precedenceRules.put(PHP54TranslatorWalker.BitwiseNot, 120);
        precedenceRules.put(PHP54TranslatorWalker.LogicNot, 120);
        precedenceRules.put(PHP54TranslatorWalker.UNARY_MINUS, 120);
        precedenceRules.put(PHP54TranslatorWalker.UNARY_PLUS, 120);


        precedenceRules.put(PHP54TranslatorWalker.New, 130);
        precedenceRules.put(PHP54TranslatorWalker.Clone, 130);

        precedenceRules.put(PHP54TranslatorWalker.POST_INCREMENT, 150);
        precedenceRules.put(PHP54TranslatorWalker.POST_DECREMENT, 150);


    }
}
