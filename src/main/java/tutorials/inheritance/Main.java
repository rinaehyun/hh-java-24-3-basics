package tutorials.inheritance;

public class Main {

    public static void main(String[] args) {

        // Compare the result of methods -> The children has a method, which overrides the one from the parent.
        compareMethodsFromParentAndChild();

        // Initialize Car objects with different constructors
        compareConstructors();

        // Convert fields in Parent-Class from private to protected -> Child-Class can access to them
        testProtectedFields();
    }


    public static void compareMethodsFromParentAndChild() {
        Bike myBike = new Bike();
        myBike.drive();

        Vehicle vehicle = new Vehicle();
        vehicle.drive();
    }

    public static void compareConstructors() {
        Car carWithoutFields = new Car();
        System.out.println(carWithoutFields);

        Car carWithChildrenFields = new Car(50, 4, 4);
        System.out.println(carWithChildrenFields);

        Car carWithPartOfFields = new Car("BMW", "X1", 5, 4);
        System.out.println(carWithPartOfFields);

        Car carWithParentFields = new Car("Audi", "A6", "white", "Combi", 300, 5, 4);
        System.out.println(carWithParentFields);

        Bike bikeOnlyWithParentFields = new Bike("Giant", "bike1");
        System.out.println(bikeOnlyWithParentFields);
    }

    public static void testProtectedFields() {
        Car myCar = new Car("Audi", "A6", "white", "Combi", 300, 5, 4);
        System.out.println(myCar);
    }
}
