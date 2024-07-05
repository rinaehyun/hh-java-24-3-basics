package grouptasks.signature;

public class Calculator {
    public static void main(String[] args) {

        // Test to call static methods in a static method
        System.out.println("The sum is: " + add(3, 5));
        System.out.println("The subtraction is: " + subtract(3, 5));
        System.out.println("The multiplication is: " + multiply(3, 5));
        System.out.println("The division is: " + divide(3, 5));

    }

    // Methods
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}
