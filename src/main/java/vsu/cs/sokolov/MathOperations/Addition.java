package vsu.cs.sokolov.MathOperations;

public class Addition extends Operation{

    public Addition(char operationSign) {
        super(0, operationSign);
    }

    @Override
    double getExecuted() {
        return this.getLeftVar().getValue() + this.getRightVar().getValue();
    }


}
