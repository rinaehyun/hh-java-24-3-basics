package grouptasks;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.print("Which position of the fibonacci would you like to know? ");
        Scanner scanner = new Scanner(System.in);
        int nth = scanner.nextInt();
        int nthNumber = NthFibonacci(nth);
        System.out.println("The " + nth + "th number of Fibonacci is: " + nthNumber);
        scanner.close();
    }

    /**
     * Function name: generateFibonacci
     * @param n (int)
     * @return int array
     * Inside the function:
     *   1. Generate fibonacci numbers
     *   2. Store the numbers into an array
     */
    public static int[] generateFibonacci(int n) {

        int[] f = new int[n];
        f[0] = 1; // may start 0

        if (n >= 2) {
            f[1] = 1;
            for (int i = 2; i < n; i++) {
                f[i] = f[i-2] + f[i-1];
            }
            return f;
        }
        return f;

    }

    /**
     * Function name: generateFibonacci
     * @param n (int)
     * @return int
     * Inside the function:
     *   1. Find a number in nth position
     */
    public static int NthFibonacci(int n) {

        int[] f = generateFibonacci(n);

        return f[n-1];
    }
}
