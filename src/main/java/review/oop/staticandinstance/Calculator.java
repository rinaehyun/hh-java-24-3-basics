package review.oop.staticandinstance;

public class Calculator {
    // Fields
    // Constructors
    public Calculator() {}

    // Methods
    static double add(double a, double b) { return a + b; }

    static double subtract(double a, double b) { return a - b; }

    static double multiply(double a, double b) { return a * b; }

    static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }
}
