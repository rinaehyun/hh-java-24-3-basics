package grouptasks;

public class Fibonacci {

    public static void main(String[] args) {
        //System.out.println(NthFibonacci(3));
    }

    /*
    public static int NthFibonacci(int numOrder) {


    }
    */

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
}
