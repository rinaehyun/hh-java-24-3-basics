// 28.06.24 Part 1 - 06. Junit Test
package tutorials.basics;

public class SimpleCalculation {

    public static void main(String[] args) {
        System.out.println(add(5, 6));
        System.out.println(add(1, 2));
        System.out.println(add(3, 4));
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
