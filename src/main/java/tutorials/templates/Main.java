package tutorials.templates;

public class Main {
    public static void main(String[] args) {

        // Test to implement methods from Interface
        testMethodsFromInterface();
    }

    public static void testMethodsFromInterface() {
        Dog d1 = new Dog("Simba", "Retriever");
        Cat c1 = new Cat("Leimer", "Black");

        d1.makeSound();
        c1.makeSound();
    }
}
