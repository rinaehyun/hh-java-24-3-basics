package grouptasks.inheritance;

import java.util.Objects;

public class Vehicle {
    // Fields
    private String manufacturer;
    private String model;
    private int yearOfManufacture;

    // Constructors
    public Vehicle() {
    }

    public Vehicle(String manufacturer, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    // Methods
    public void showVehicleInfo() {
        System.out.println("The model " + model + " was manufactured by " + manufacturer + " in " + yearOfManufacture + ".");
    }

    // Getters and Setters
    public String getManufacturer() { return manufacturer; }

    public String getModel() { return model; }

    public int getYearOfManufacture() { return yearOfManufacture; }

    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public void setModel(String model) { this.model = model; }

    public void setYearOfManufacture(int yearOfManufacture) { this.yearOfManufacture = yearOfManufacture; }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return yearOfManufacture == vehicle.yearOfManufacture && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearOfManufacture);
    }

    // Print
    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
