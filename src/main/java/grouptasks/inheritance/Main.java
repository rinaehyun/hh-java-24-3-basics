package grouptasks.inheritance;

public class Main {
    public static void main(String[] args) {

        // Test inherited method -> overloaded by child-class
        Vehicle firstVehicle = new Vehicle("Porsche", "911", 2016);
        firstVehicle.showVehicleInfo();

        Car firstCar = new Car("Hyundai", "IONIQ 5", 2022, 5);
        firstCar.showVehicleInfo();
    }
}
