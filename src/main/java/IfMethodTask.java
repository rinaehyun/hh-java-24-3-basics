import java.security.PrivilegedExceptionAction;

public class IfMethodTask {

    public static void main(String[] args) {
        int result = addNumber(3, 4);
        System.out.println(result);

        System.out.println(addNumber(2.5, 3));

        // conditional call
        int a = 22;
        int b = 18;
        if (a > b) {
            System.out.println(subtractNumber(a, b));
        } else {
            System.out.println(addNumber(a, b));
        }

        int positveNumber = makePositive(2);
        System.out.println(positveNumber);

        System.out.println(checkEven(17));

        checkPalindrome("Racecar");
    }

    // Add two integers
    public static int addNumber(int a, int b) {
        return a + b;
    }

    // Add two doubles
    public static double addNumber(double a, double b) {
        System.out.println(b);
        return a + b;
    }

    // Subtraction of two integers
    public static int subtractNumber(int a, int b) {
        return a - b;
    }

    // Get abs value of an integer
    public static int makePositive(int a) {
        return Math.abs(a);
        /*
        if (a < 0) {
            return a * -1;
        }
        return a;
        */
    }

    // Check if the number is even
    public static int checkEven(int a) {
        if (a % 2 == 0) {
            return a;
        } else {
            return a * 2;
        }
    }

    // check if the string is a palindrome
    public static void checkPalindrome (String word) {
        word = word.toLowerCase();
        String reversedWord = new StringBuilder(word).reverse().toString();

        if (word.equals(reversedWord) && !word.isEmpty()) {
            System.out.println("This word is a palindrome.");
        } else {
            System.out.println("Opps! It is not a palindrome.");
        }
    }
}
