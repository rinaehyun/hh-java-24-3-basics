package practices;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListExample {
    public static void main(String[] args) {

        // Arrays
        int[] numbers = new int[5];
        String[] strings = new String[3];

        numbers[0] = 3;
        strings[2] = "hello";

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));


        // ArrayLists
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add(null);
        list.add("next entry");
        list.add(1, "saturday");
        list.add(2, "sunday");
        list.add(4, "tuesday");
        list.add(null);



        for (String l: list) {
            System.out.println(l);
        }

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(3));
        System.out.println(list);


        List<String> myList = List.of("Apple", "Banana", "Grapes", "Orange", "Mango");
        showStreamExample(myList);


        showStreamMethods();

    }

    public static void showStreamExample(List<String> list) {
        list.stream()
                .filter(l -> l.startsWith("A"))
                .forEach(System.out::println);

        System.out.println(list.stream()
                        .map(l -> l.toUpperCase())
                //.map(String::toUpperCase)
                // TERMINATOR
                .toList());

        int totalLength = list.stream()
                .mapToInt(String::length)
                // TERMINATOR
                .reduce(0, (a, b) -> a + b);

        int totalLengthTwo = list.stream()
                .mapToInt(l -> l.length())
                // TERMINATOR
                .sum();

        System.out.println(totalLength);
        System.out.println(totalLengthTwo);
    }

    public static void showStreamMethods () {

        // FILTER
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 8, 6, 2);

        List<Integer> evenNumber = numbers.stream()
                .filter(number -> number % 2 == 0)
                .peek(name -> System.out.println(name))
                .distinct()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(evenNumber);

        // STRUCTURAL
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(upperCaseNames);

        List<Character> letters = names.stream()
                .flatMap(name -> Stream.of(name.charAt(2)))
                .sorted((a,b) -> b-a)
                // TERMINATOR
                .collect(Collectors.toList());

        System.out.println(letters);

    }
}
