package review;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        System.out.println("Java is cool!");

        System.out.println("=== Examples of operators ===");
        operate();

        System.out.println("=== Examples of relational operators ===");
        compare();
    }

    public static void operate() {
        // Operators
        int a = 10;
        int b = 5;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        int subtraction = a - b;
        System.out.println("subtraction: " + subtraction);

        int multiplication = a * b;
        System.out.println("multiplication: " + multiplication);

        float division = (float) a / b;
        System.out.println("division: " + division);
    }

    public static void compare() {
        int a = 10;
        int b = 5;
        System.out.println("greater than: " + (a > b));
        System.out.println("less than: " + (a < b));
        System.out.println("equality: " + (a == b));
    }
}
