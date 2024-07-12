package grouptasks.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Create a list with random number from 1 to 10
        List<Integer> list = List.of(3, 5, 2, 9, 10, 4, 1, 6, 8, 7);
        System.out.println(list);


        // Check .filter()
        list.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        // Check .map() to double each number
        list.stream()
                .map(num -> num * 2)
                .forEach(System.out::println);

        // Check .sorted() in ascending order
        list.stream()
                .sorted(Integer::compareTo)
                .forEach(System.out::println);

        // Check .reduce()
        Optional<Integer> resultInt = list.stream()
                .reduce(Integer::sum);
        System.out.println(resultInt);


        // Collect the processed numbers with .reduce()
        Double result = list.stream()
                .filter(num -> num % 2 == 0)
                .map(Integer::doubleValue)
                .sorted(Double::compareTo)
                .reduce(0.0, Double::sum);

        System.out.println(result);


        // Collect the processed numbers into a new list
        List<Double> newList = list.stream()
                .filter(num -> num % 2 == 0)
                .map(Integer::doubleValue)
                .sorted(Double::compareTo)
                .collect(Collectors.toList());

        System.out.println(newList);

    }

    public static ArrayList<Integer> generateList() {
        int min = 1;
        int max = 10;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = min; i <= max; i++) {
            lista.add(i);
        }
        return lista;
    }
}
