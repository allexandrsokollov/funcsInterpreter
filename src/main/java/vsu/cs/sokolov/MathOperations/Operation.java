package vsu.cs.sokolov.MathOperations;

import vsu.cs.sokolov.Variable;

abstract class Operation {
    private int priority;
    private final char operationSign;
    private Variable leftVar;
    private Variable rightVar;

    public Operation(int priority, char operationSign) {
        this.priority = priority;
        this.operationSign = operationSign;
    }


    public Variable getLeftVar() {
        return leftVar;
    }

    public void setLeftVar(Variable leftVar) {
        this.leftVar = leftVar;
    }

    public Variable getRightVar() {
        return rightVar;
    }

    public void setRightVar(Variable rightVar) {
        this.rightVar = rightVar;
    }

    public int getPriority() {
        return priority;
    }

    public void incrementPriority() {
        this.priority++;
    }

    public void decrementPriority() {
        this.priority--;
    }

    public char getOperationSign() {
        return operationSign;
    }

    public static String getSortedVarsAndOperationsRow(String varsAndOperationsRow) {
        return  null;
    }

    abstract double getExecuted();
}
