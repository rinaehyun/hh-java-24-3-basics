package review.oop.inheritance;

public class Car extends Vehicle {
    // Fields

    // Constructors
    Car(String color, int maxSpeed) {
        super(4, color, maxSpeed);
    }

    void honk() {
        System.out.println("Honk honk!");
    }
}
