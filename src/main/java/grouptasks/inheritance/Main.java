package grouptasks.inheritance;

public class Main {
    public static void main(String[] args) {

        // Test inherited method -> overloaded by child-class
        testOverloadedMethods();

        // Compare two child-classes
        compareCarAndMotorcycle();

    }

    public static void testOverloadedMethods() {
        Vehicle firstVehicle = new Vehicle("Porsche", "911", 2016);
        firstVehicle.showVehicleInfo();

        Car firstCar = new Car("Hyundai", "IONIQ 5", 2022, 5);
        firstCar.showVehicleInfo();
    }

    public static void compareCarAndMotorcycle() {
        System.out.println("** Compare two Child-Classes **");
        Car secondCar = new Car("Porsche", "Panamera", 2020, 5);
        secondCar.showVehicleInfo();

        Motorcycle myMotorcycle = new Motorcycle("Hoda", 2004, "Petrol", "Four stroke", 134);
        myMotorcycle.showVehicleInfo();
    }
}
