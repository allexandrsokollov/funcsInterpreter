package vsu.cs.sokolov;

import java.util.ArrayList;
import java.util.HashMap;

public class Formula {
    private ArrayList<String> variables;
    private HashMap<String, Double> variablesWithValues;
    private ArrayList<Character> operations;

    public Formula() {
    }

    public void prepare(String formula) throws Exception {
        ArrayList<Double> values;
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
                variables.add(new String(tempVarName));
                tempVarName.delete(0, tempVarName.length() - 1);
                operations.add(ch);
            }
        }
    }

    public double execute(double... values) throws Exception {
        for (double value : values) {
            this.values.add(value);
        }

        if (this.values.size() > variables.size()) {
            throw new Exception("too many values. We don't such a lot of variables");
        } else if (this.values.size() < variables.size()) {
            throw new Exception("You have written too few values. there is more variables than values");
        }

        double result = 0;
        double tempValue = 0;
        char tempOperation;
        boolean isTempValueComplete = false;
        boolean isFirstVariableWereWritten = false;

        for (int i = 0; i < variables.size(); i++) {
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
