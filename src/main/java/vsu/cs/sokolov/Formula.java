package vsu.cs.sokolov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Formula {
    private ArrayList<String> variablesRow;
    private HashMap<String, Double> variablesWithValues;
    private ArrayList<Character> operations;

    public Formula() {
    }

    public void prepare(String formula) throws Exception {
        StringBuilder tempVarName = new StringBuilder();
        StringBuilder tempFormula = new StringBuilder(formula);

        int iter = 0;
        for (char ch : tempFormula.toString().toCharArray()) {
            if (ch == ' ') {
                tempFormula.deleteCharAt(iter);
            }
            iter++;
        }

        for (char ch : tempFormula.toString().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                tempVarName.append(ch);
            } else  {
                variablesRow.add(new String(tempVarName));
                tempVarName.delete(0, tempVarName.length() - 1);
                operations.add(ch);
            }
        }

        for (String var : variablesRow) {
            if (!variablesWithValues.containsKey(var)) {
                variablesWithValues.put(var, Double.MIN_VALUE);
            }
        }
    }

    public double execute(double... values) throws Exception {

        int iter = 0;
        for (Map.Entry<String, Double> entry : variablesWithValues.entrySet()) {
            entry.setValue(values[iter++]);
        }

        double result = 0;
        double tempValue = 0;
        char tempOperation;
        boolean isTempValueComplete = false;
        boolean isFirstVariableWereWritten = false;

        for (int i = 0; i < variablesRow.size(); i++) {
            if (isTempValueComplete) {
                result += tempValue;
                tempValue = 0;
                isTempValueComplete = false;
            } else {
                if (isFirstVariableWereWritten) {

                } else {
                    tempValue += this.values.get(i);
                }
            }
        }

    }
}
