package review.oop.inheritance;

public class Bike extends Vehicle {
    // Fields
    String brand;

    // Constructors
    Bike(String color, int maxSpeed) {
        super(2, color, maxSpeed);
    }

    Bike(String brand, String color) {
        super(2, color, 75);
        this.brand = brand;
    }

    // Print
    @Override
    public String toString() {
        return "Bike{" +
                "brand='" + brand + '\'' +
                ", wheels=" + wheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    // Methods
    void ringBell() {
        super.startEngine();
        System.out.println("Ring ring!");
    }
}
