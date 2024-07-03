package grouptasks;

public class OOPExamples {
    public static void main(String[] args) {

        // the first Car object -> without any fields
        Car myCar = new Car();
        myCar.starts();

        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.yearOfManufacture);

        // the second Car object -> with one field
        Car yourCar = new Car(80.0);
        System.out.println(yourCar.speed);

        yourCar.accelerates(125.5);
        System.out.println(yourCar.speed);

        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.yearOfManufacture);

        // the third Car object -> with all fields
        Car ourCar = new Car("BMW", "BMW i7", "Black", 2020, 180.5);
        System.out.println(ourCar.brand);
        System.out.println(ourCar.model);
        System.out.println(ourCar.color);
        System.out.println(ourCar.yearOfManufacture);
        System.out.println(ourCar.speed);
    }
}
