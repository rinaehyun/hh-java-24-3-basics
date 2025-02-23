package review;

public class TestExamples {
    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int product(int a, int b) {
        return a * b;
    }

    public static String convertToUppercase(String str) {
        return str.toUpperCase();
    }

    public static int makePositive(int a) {
        if (a < 0) return -a;
        return a;
    }
}
