package grouptasks;

import java.util.Arrays;
import java.util.List;

public class JUnitTask {
    public static void main(String[] args) {

        // Bonus task
        String greetings = "hey, hola!";
        boolean lanCheck = validateHello(greetings);
        System.out.println(lanCheck);
    }


    // ** From codewars ** //
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
}
