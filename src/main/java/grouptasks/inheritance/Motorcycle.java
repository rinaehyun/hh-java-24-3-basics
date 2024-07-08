package grouptasks.inheritance;

import java.util.Objects;

public class Motorcycle extends Vehicle{
    // Fields
    private String fuelType;
    private String engineType;
    private int topSpeed;

    // Constructors
    public Motorcycle() {
    }

    public Motorcycle(String manufacturer, int yearOfManufacture, String fuelType, String engineType, int topSpeed) {
        super(manufacturer, yearOfManufacture);
        this.fuelType = fuelType;
        this.engineType = engineType;
        this.topSpeed = topSpeed;
    }

    // Methods
    @Override
    public void showVehicleInfo() {
        System.out.println("The engine type is: " + engineType);
    }

    // Getters and Setters
    public String getFuelType() { return fuelType; }

    public String getEngineType() { return engineType; }

    public int getTopSpeed() { return topSpeed; }

    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public void setEngineType(String engineType) { this.engineType = engineType; }

    public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return topSpeed == that.topSpeed && Objects.equals(fuelType, that.fuelType) && Objects.equals(engineType, that.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fuelType, engineType, topSpeed);
    }

    // Print
    @Override
    public String toString() {
        return "Motorcycle{" +
                "fuelType='" + fuelType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
