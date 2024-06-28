// 28.06.24 Part 1 - 06. Junit Test
package grouptasks;

import java.util.Arrays;
import java.util.List;

public class JUnitTask {
    public static void main(String[] args) {

        // *** Bonus task *** //
        String greetings = "hey, hola!";
        boolean lanCheck = validateHello(greetings);
        System.out.println(lanCheck);

        // Call metho for debugging
        System.out.println(validateEven(11));
    }


    // *** Bonus task *** //
    /**
     * Function name: validateHello
     * @param greetings (String)
     * @return a choice (String).
     */
    public static boolean validateHello(String greetings){

        String[] greetingsArray = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        List<String> greetingsList = Arrays.asList(greetingsArray);

        String[] greetingWords = greetings.split("\\b");

        for (String word : greetingWords) {
            if (greetingsList.contains(word.toLowerCase())) {
                return true;
            }
        }
        return false;

    }


    // *** Basic Tasks *** //

    // Task1 - Write a test for a method that calculates the sum of two integers.
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Task2 - Write a test for a method that calculates the product of two integers.
    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    // Task3 - Write a test for a method that checks if a given number is even.
    public static boolean validateEven(int num) {
        return num % 2 == 0;
    }

    // Task4 - Write a test for a method that converts a given string to uppercase.
    public static String convertToUppercase(String input) {
        return input.toUpperCase();
    }

    // Task5 - Write a test for a method that checks if a given number is positive.
    public static boolean validatePositive(int num) {
        return num > 0;
    }
}
