package tutorials.streams;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Grapes", "Orange", "Mango");

        // Without Streams -> 1) filter, 2) print
        for (String fruit : fruits) {
            if (fruit.contains("p")) {
                System.out.println(fruit);
            }
        }


        // Call a function within streams
        fruits.stream()
                .filter((fruit) -> {
                    // logic
                    return fruit.contains("p");
                })
                .forEach(Main::printFruit);  // Call printFruit from Main with every element


        // Use a lambda expression
        fruits.stream()
                .filter(fruit -> fruit.contains("p"))
                .forEach(fruit -> System.out.println(fruit));


        // Map (Stream<Integer>)
        fruits.stream()
                .map(fruit -> fruit.length()) // -> to Stream<Integer>
                .map(fruit -> "Frucht: " + fruit)
                .forEach(System.out::println);


        // Map (IntStream)
        double average = fruits.stream()
                .mapToInt(fruit -> fruit.length()) // to IntStream
                .average()
                .orElseThrow();

        System.out.println(average);


        // Return a value as String
        String result = fruits.stream()
                .map(fruit -> "Frucht: " + fruit)
                .collect(Collectors.joining(", "));

        System.out.println(result);
        System.out.println(result.getClass().getSimpleName());


        // Return a value as List<String>
        List<String> resultList = fruits.stream()
                .filter(fruit -> fruit.contains("p"))
                .map(fruit -> "Frucht: " + fruit)
                .collect(Collectors.toList());

        System.out.println(resultList);
        System.out.println(resultList.getClass().getSimpleName());


        // Check the original List -> not changed !
        System.out.println(fruits);
    }


    private static void printFruit(String s) {
        System.out.println(s);
    }
}
