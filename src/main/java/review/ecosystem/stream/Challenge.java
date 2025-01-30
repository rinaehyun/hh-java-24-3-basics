package review.ecosystem.stream;

import java.util.List;

public class Challenge {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 5, 2, 1, 9, 6, 10, 4, 8, 7);

        System.out.println("Filter numbers in the list");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Double each number in the list");
        numbers.stream()
                .map(number -> number * 2)
                .forEach(System.out::println);

        System.out.println("Sort the numbers in the list in ascending order");
        List<Integer> sortedList = numbers.stream()
                .sorted()
                .toList();
        System.out.println(sortedList);

        System.out.println("Calculate the sum of all numbers in the list");
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
