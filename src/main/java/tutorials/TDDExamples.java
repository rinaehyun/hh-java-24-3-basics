// 28.06.24 Part 2 - 07. Test Driven Development
package tutorials;

public class TDDExamples {

    public static String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
