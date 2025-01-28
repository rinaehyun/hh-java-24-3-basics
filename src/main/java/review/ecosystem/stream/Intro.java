package review.ecosystem.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Intro {
    public static void main(String[] args) {
        List<String> myList = List.of("Apple", "Banana", "Grapes", "Orange", "Mango", "Mandarin", "Mango", "Mango");

        // forEach(): performs an action for each element in the stream
        myList.stream()
                .filter(fruit -> fruit.startsWith("M"))
                .forEach(fruit -> System.out.println("The element: " + fruit));

        myList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        int totalLength = myList.stream()
                .mapToInt(String::length)
                .reduce(0, (a, b) -> a + b);

        System.out.println(totalLength);


        // FILTER
        // distinct(): removes duplicates from the stream
        myList.stream()
                .distinct()
                .forEach(System.out::println);

        // limit(): limits the number of elements in the stream
        myList.stream()
                .limit(3)
                .forEach(System.out::println);

        // filter(): filters elements based on a condition
        List<Integer> numbers = List.of(3, 6, 8, 2, 9, 5, 4, 1, 10, 7);
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number > 5)
                .toList();
        System.out.println(evenNumbers);


        // STRUCTURAL
        List<String> names = List.of("Mike", "Bob", "David", "Charlie", "Alice");

        // map(): transforms each element of the stream
        List<String> upperCase = names.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println(upperCase);

        // flatMap(): transform each element of the stream and flattens the result
        List<String> letters = names.stream()
                .map(name -> name.split(""))
                .flatMap(Arrays::stream)
                .toList();
        System.out.println(letters);

        // sorted(): sorts the elements in the stream
        List<String> sortedResult = names.stream()
                .sorted()
                .toList();
        System.out.println(sortedResult);

        List<String> list = List.of("A", "1", "C", "8", "G", "5", "4", "9", "B");
        List<String> reversedResult = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(reversedResult);

        // TERMINATOR
        // reduce(): reduces the stream to a single value
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        // collect(): collects the elements of the stream into a data structure
        //String result = String.join(", ", myList);
        String result = myList.stream()
                        .collect(Collectors.joining(", "));
        System.out.println("Fruits: " + result);
    }
}
