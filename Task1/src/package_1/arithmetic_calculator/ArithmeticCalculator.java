package package_1.arithmetic_calculator;

public class ArithmeticCalculator {
    private double a;
    private double b;

    public ArithmeticCalculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double calculate(Operation operation) {
        if (operation == Operation.ADD)
            return a + b;
        else if (operation == Operation.SUBTRACT)
            return a - b;
        else if (operation == Operation.MULTIPLY)
            return a * b;
        else
            return 0;
    }
}

