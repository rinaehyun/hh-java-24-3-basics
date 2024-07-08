package grouptasks;

public class Car {
    // Fields
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    double speed;


    // Constructors
    public Car() {
    }

    public Car(double speed) {
        this.speed = speed;
    }

    public Car(String brand, String model, String color, int yearOfManufacture, double speed) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.speed = speed;
    }

    // Methods
    public void starts() {
        System.out.println("The car starts to drive.");
    }

    public void accelerates(double speed) {
        this.speed = speed;
    }
}
