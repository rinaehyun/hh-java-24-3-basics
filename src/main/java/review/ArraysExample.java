package review;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {

        int[] numbers = {3, 2, 4, 7, 5};
        int[] numbers2 = {5, 1, 6, 9, 8};

        System.out.println("=== For Loop ===");
        showForLoop(numbers);

        System.out.println("=== For-Each Loop ===");
        showForEachLoop(numbers);

        System.out.println("=== Multi-dimensional array");
        int[][] matrix = new int[2][3];
        System.out.println(Arrays.deepToString(matrix));
        matrix[1][2] = 5;
        System.out.println(Arrays.deepToString(matrix));

        String[][] strings = new String[2][2];
        System.out.println(Arrays.deepToString(strings));
        strings[0][1] = "Hello World";
        System.out.println(Arrays.deepToString(strings));

        System.out.println("=== Sum of elements in an array ===");
        addAllElements(numbers);

        System.out.println("=== the largest number ===");
        findLargestNumber(numbers);

        System.out.println("=== Add two arrays ===");
        addTwoArrays(numbers, numbers2);

        System.out.println("=== Read letters ===");
        readLetters();
    }

    public static void showForLoop(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.println(numbers[i]);
            } else {
                System.out.println(numbers[i] * 2);
            }
        }
    }

    public static void showForEachLoop(int[] numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void addAllElements(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void findLargestNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
    }

    public static void addTwoArrays(int[] numbers1, int[] numbers2) {
       if (numbers1.length == numbers2.length) {
            int[] sum = new int[numbers1.length];
            for (int i = 0; i < numbers1.length; i++) {
                sum[i] = numbers1[i] + numbers2[i];
            }
            System.out.println(Arrays.toString(sum));
       }
    }

    public static void readLetters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any words: ");
        String str = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
