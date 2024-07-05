package tutorials.templates;

public class Main {
    public static void main(String[] args) {

        // Test to implement methods from Interface
        testMethodsFromInterface();

        // Test Polymorphism
        testPolymorphism();

        // Test further methods in a class
        extendMethodsInClass();
    }

    public static void testMethodsFromInterface() {
        Dog d1 = new Dog("Simba", "Retriever");
        Cat c1 = new Cat("Leimer", "Black");

        d1.makeSound();
        c1.makeSound();

        System.out.println(d1.getType());
    }

    public static void testPolymorphism() {
        Animal dogAnimal = new Dog("Simba", "Retriever");
        Animal catAnimal = new Cat("Leimer", "Black");
        Dog dog = new Dog("Max", "Poodle");

        dogAnimal.makeSound();
        catAnimal.makeSound();
        dog.makeSound();

        // Interesting points!
        // An object with Interface -> can use makeSound(), equals(), toSting(), but cannot use other methods or getters/setters !
        System.out.println("Object with data type Interface: " + dogAnimal);
        System.out.println("Object with data type Class: " + dog.getType());
    }

    public static void extendMethodsInClass() {
        Dog dog = new Dog();
        Animal dogAnimal = new Dog();

        // Only Object with data type Class can use the move() method.
        dog.move();
        //dogAnimal.move();
    }
}
