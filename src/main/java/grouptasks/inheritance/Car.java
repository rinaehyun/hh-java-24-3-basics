package grouptasks.inheritance;

import java.util.Objects;

public class Car extends Vehicle {
    // Fields
    private int numberOfDoors;

    // Constructors
    public Car() {
    }

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    // Methods
    @Override
    public void showVehicleInfo() {
        System.out.println("This vehicle has " + numberOfDoors + " doors.");
    }

    // Getters and Setters
    public int getNumberOfDoors() { return numberOfDoors; }

    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors;}

    // Comparisons@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numberOfDoors == car.numberOfDoors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors);
    }

    // Print
    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                '}';
    }
}
