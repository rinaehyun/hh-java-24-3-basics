package review.oop.inheritance;

public class Vehicle {
    // Fields
    int wheels;
    String color;
    int maxSpeed;

    // Constructors
    Vehicle() {}

    Vehicle(int wheels, String color, int maxSpeed) {
        this.wheels = wheels;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // Print
    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    // Methods
    public void startEngine() {
        System.out.println("Engine started.");
    }
}
