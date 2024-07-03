package grouptasks;

public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    double speed;

    public void starts() {
        System.out.println("The car starts to drive.");
    }

    public void accelerates(double speed) {
        this.speed = speed;
    }
}
