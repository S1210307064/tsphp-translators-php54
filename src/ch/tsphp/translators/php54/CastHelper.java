/*
 * This file is part of the TSPHP project published under the Apache License 2.0
 * For the full copyright and license information, please have a look at LICENSE in the
 * root folder or visit the project's website http://tsphp.ch/wiki/display/TSPHP/License
 */

package ch.tsphp.translators.php54;

import ch.tsphp.common.ITSPHPAst;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import java.util.HashMap;
import java.util.Map;

public class CastHelper implements ICastHelper
{
    private ITempVariableHelper tempVariableHelper;

    public CastHelper(ITempVariableHelper theTempVariableHelper) {
        tempVariableHelper = theTempVariableHelper;
    }

    @Override
    public StringTemplate getCast(StringTemplateGroup templateLib, ITSPHPAst typeAst,
            ITSPHPAst expression, StringTemplate expressionTemplate) {

        String typeName = getTypeNameWithoutModifier(typeAst.getText());

        Map<String, Object> parameters = new HashMap<>();
        String templateName;

        //TODO rstoll TSPHP-834 cast from mixed to scalar needs test
//        ITypeSymbol castTypeSymbol = typeAst.getEvalType();
//        ITypeSymbol evalTypeSymbol = expression.getEvalType();
//        if (typeName.equals("bool") || typeName.equals("array")) {
//            templateName = "primitiveCast";
//        } else if (isScalarType(typeName)) {
//            if (isScalarType( getTypeNameWithoutModifier(evalTypeSymbol)) {
//                templateName = "primitiveCast";
//            } else {
//                templateName = "checkedPrimitiveCast";
//            }
        if (isScalarType(typeName) || typeName.equals("array")) {
            templateName = "primitiveCast";
        } else {
            templateName = "classInterfaceCast";
        }

        parameters.put("type", typeName);
        parameters.put("expression", expressionTemplate);
        if (isNotAVariable(expression)) {
            templateName += "WithTempVariable";
            parameters.put("tempVariableName", tempVariableHelper.getTempVariableNameForCast(expression));
        }
        return templateLib.getInstanceOf(templateName, parameters);
    }

    private boolean isScalarType(String typeName) {
        return typeName.equals("bool")
                || typeName.equals("int")
                || typeName.equals("float")
                || typeName.equals("string");
    }

    private String getTypeNameWithoutModifier(String typeNameWithPotentialModifiers) {
        String typeName = typeNameWithPotentialModifiers;
        if (typeName.endsWith("?")) {
            typeName = typeName.substring(0, typeName.length() - 1);
        }
        if (typeName.endsWith("!")) {
            typeName = typeName.substring(0, typeName.length() - 1);
        }
        return typeName;
    }

    private boolean isNotAVariable(ITSPHPAst expression) {
        return !expression.getText().substring(0, 1).equals("$");
    }
}
