package grouptasks.immutability;

public class Comparison {
    public static void main(String[] args) {

        int a = 0;
        a = 2;
        System.out.println(a);

        Integer b = null;
        b = 2;
        System.out.println(b);

        // final -> the value cannot be modified
        final int c = 3;
        System.out.println(c);

        staticMethod();
    }

    static int a = 5;
    int b = 10;

    public static void staticMethod() {
        System.out.println("This is a static method.");
        System.out.println(a);
        //System.out.println(b);
    }



    public void instanceMethod() {
        System.out.println("This is an instance method.");
        staticMethod();
        System.out.println(a);
        System.out.println(b);
    }
}
