// 26.06.24 Part 1 - 03. If Else Method
package grouptasks;

//import static jdk.internal.org.jline.utils.Colors.s;

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


        // Call methods for checking Palindrome
        checkPalindrome("helloh");

        boolean checkString = checkPalindromeWithLoop("helloh");
        System.out.println("The String is a palindrome?: " + checkString);
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

        if (word.equals(reversedWord)) {
            System.out.println("This word is a palindrome.");
        } else {
            System.out.println("Opps! It is not a palindrome.");
        }
    }

    // check if the string is a palindrome - using for loop
    public static boolean checkPalindromeWithLoop (String word) {
        word = word.toLowerCase();
        double lastIndexFixed = word.length() - 1;
        int lastIndex = word.length() - 1;

        for (int wordIndex = 0; wordIndex < lastIndexFixed/2; wordIndex++) {
            if (word.charAt(wordIndex) != word.charAt(lastIndex)) {
                return false;
            }
            lastIndex--;
        }
        return true;
    }
}
