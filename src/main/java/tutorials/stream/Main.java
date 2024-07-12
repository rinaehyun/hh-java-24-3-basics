package tutorials.stream;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Grapes", "Orange", "Mango");

        // Without Streams
        for (String fruit : fruits) {
            if (fruit.contains("p")) {
                System.out.println(fruit);
            }
        }


        // Call a function within streams
        fruits.stream()
                .forEach(Main::printFruit);  // Call printFruit from Main with every element
    }

    private static void printFruit(String s) {
        System.out.println(s);
    }
}
