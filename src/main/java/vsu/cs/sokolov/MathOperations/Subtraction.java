package vsu.cs.sokolov.MathOperations;

public class Subtraction extends Operation{
    public Subtraction(char operationSign) {
        super(0, operationSign);
    }

    @Override
    double getExecuted() {
        return 0;
    }
}
