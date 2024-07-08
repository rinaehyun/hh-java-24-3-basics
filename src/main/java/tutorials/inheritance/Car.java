package tutorials.inheritance;

import java.util.Objects;

public class Car extends Vehicle {
    // Fields
    private int length;
    private int numberOfDoors;
    private int numberOfWheels;


    // Constructors
    public Car() {
        super();
    }

    public Car(int length, int numberOfDoors, int numberOfWheels) {
        super();
        this.length = length;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String brand, String model, int numberOfDoors, int numberOfWheels) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }

    public Car(String brand, String model, String color, String type, int length, int numberOfDoors, int numberOfWheels) {
        super(brand, model, color, type);
        this.length = length;
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }

    // Getters and setters
    public int getLength() {
        return length;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    // Comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return length == car.length && numberOfDoors == car.numberOfDoors && numberOfWheels == car.numberOfWheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, numberOfDoors, numberOfWheels);
    }

    // Print
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", length=" + length +
                ", numberOfDoors=" + numberOfDoors +
                ", numberOfWheels=" + numberOfWheels +
                '}';
    }

}
