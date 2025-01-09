package review;

public class Conditions {
    public static void main(String[] args) {
        int age = 12;

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else if (age >= 13) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are a kid.");
        }

        System.out.println("Sum of two numbers: " + addNumbers(4,8));
        System.out.println("Sum of two numbers with points: " + addNumbers(4.5,8.8));

        System.out.println("Subtraction of two integers: " + subtract(3, 10));

        System.out.println("Result of makePositive: " + makePositive(-5));
        System.out.println("Result of makePositive: " + makePositive(23));

        System.out.println("=== Conditional calculation ===");
        int number1 = 10;
        int number2 = 8;
        if (number1 > number2) {
            System.out.println("Result: " + subtract(number1, number2));
        } else {
            System.out.println("Result: " + addNumbers(number1, number2));
        }

        System.out.println(" === Check if the number is even. === ");
        System.out.println(isEven(5));
        System.out.println(isEven(10));

        System.out.println(checkEven(8));
        System.out.println(checkEven(9));

        System.out.println("=== Check words ===");
        System.out.println(checkPalindrome("hello"));
        System.out.println(checkPalindrome("Anna"));
        System.out.println(checkPalindrome("Racecar"));
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int makePositive(int num) {
        if (num >= 0) {
            return num;
        } else {
            return -num;
        }
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int checkEven(int number) {
        if (number % 2 == 0) {
            return number;
        } else {
            return number*2;
        }
    }

    public static boolean checkPalindrome(String word) {
        String lowerCase = word.toLowerCase();
        String reversedWord = new StringBuilder(lowerCase).reverse().toString();
        if (lowerCase.equals(reversedWord)) {
            return true;
        } else {
            return false;
        }
    }
}
