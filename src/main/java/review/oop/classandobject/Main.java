package review.oop.classandobject;

public class Main {
    public static void main(String[] args) {

        // Create an object of 'Car' and call the method to start it.
        Car car1 = new Car();
        car1.starts();

        Car car2 = new Car("BMW", "i5", "black", 2023, 200.0);
        System.out.println(car2);

        car2.accelerate(230.5);
        System.out.println(car2);
    }
}
