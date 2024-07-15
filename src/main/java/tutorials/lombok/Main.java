package tutorials.lombok;

public class Main {
    public static void main(String[] args) {
        /** Examples with Class **/
        checkCommonMethodsInClass();

        /** Examples with Record  **/
        // Check copied objects
        createObjectWithCopiedFieldInRecord();

        // Use case with @With in the context of Spring API
        changeCarNameFromDb("VW");

        // an Example with @Bilder
        showBuilderExample();
    }


    public static void checkCommonMethodsInClass() {
        Garage garage = new Garage(3, 5);
        Garage garage1 = new Garage();
        garage.addVehicle();
        garage.addVehicle();

        // Getters and Setters
        garage.setCars(5);
        System.out.println(garage.getCars());
        System.out.println(garage.getDrivers());

        // Equals() and toString()
        System.out.println(garage.equals(garage1));
        System.out.println(garage);
    }


    public static void createObjectWithCopiedFieldInRecord() {
        Car porsche = new Car("Porsche", 2000, 4, 2);
        Car porsche2 = new Car("Porsche", porsche.year(), 6, 8);
        System.out.println(porsche.name());
        System.out.println(porsche2.name());

        Car p2 = porsche.withName("BMW");
        System.out.println(p2.name());
        System.out.println(p2.year());

        Car p3 = porsche.withYear(1990);
        System.out.println(p3);
    }


    public static void changeCarNameFromDb(String name) {
        // get car from db( with wrong name)
        Car porsche = new Car("Porsche", 2010, 4, 5);
        porsche = porsche.withName(name);
        System.out.println(porsche);
        // logic save again in database
    }


    public static void showBuilderExample() {
        Car pWithBilder = Car.builder()
                .name("Porsche")
                .year(2015)
                .seats(5)
                .build();

        System.out.println(pWithBilder);
    }
}
