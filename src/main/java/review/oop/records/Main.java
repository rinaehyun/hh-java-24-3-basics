package review.oop.records;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("A342", "Sophie",
                new Species("Dog", 34000), 4,
                new Owner("Sam", 35, "address1"));
        Animal animal2 = new Animal("C392", "Leimer",
                new Species("Cat", 15000), 6,
                new Owner("John", 25, "address2"));



        // Check automatically generated methods
        System.out.println(animal1);
        System.out.println(animal2);

        System.out.println(animal2.equals(animal1));
        System.out.println(animal1.equals(animal1));

        // Check methods
        Zoo zoo1 = new Zoo(Arrays.asList(animal1, animal2));
        System.out.println(zoo1.calculateTotalFood());
    }
}
