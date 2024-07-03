package grouptasks;

public class OOPExamples {
    public static void main(String[] args) {

        // Example with Car class
        generateCarObjects();

        // Example with Person class
        generatePersonObjects();
    }


    public static void generateCarObjects() {
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


    public static void generatePersonObjects() {
        // the first person
        Person firstPerson = new Person();
        firstPerson.name = "Thomas";
        firstPerson.age = 30;
        firstPerson.introduce();

        // the second person
        Person secondPerson = new Person("Anna", 25);
        secondPerson.introduce();

        // the third person
        Person thirdPerson = new Person("Mark", 33, "male");
        thirdPerson.introduce();
    }
}
