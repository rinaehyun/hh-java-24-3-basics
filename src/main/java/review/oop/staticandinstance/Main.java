package review.oop.staticandinstance;

public class Main {
    public static void main(String[] args) {
        StaticInstance static1 = new StaticInstance();
        System.out.println(static1);
        // Call a static method
        StaticInstance.incrementTotalCount();
        System.out.println(static1);

        StaticInstance instance1 = new StaticInstance();
        System.out.println(instance1);
        // Call an instance method
        instance1.incrementInstanceCount();
        System.out.println(static1);
        System.out.println(instance1);
    }
}
