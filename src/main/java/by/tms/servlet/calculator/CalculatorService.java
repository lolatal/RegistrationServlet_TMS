package by.tms.servlet.calculator;

public class CalculatorService {
    public CalculatorService() {
    }

    public double calculate(double a, double b, String type) {

        switch (type) {
            case "sum":
                return sum(a, b);
            case "minus":
                return minus(a, b);
            case "multiply":
                return multiply(a, b);
            case "divide":
                return divide(a, b);
        }
        return 0;
    }

    private double sum(double a, double b) {
        return a + b;
    }

    private double minus(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double divide(double a, double b) {
        return a / b;
    }
}
