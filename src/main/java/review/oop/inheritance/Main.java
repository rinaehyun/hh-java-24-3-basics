package review.oop.inheritance;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("black", 250);
        System.out.println(car1);
        car1.startEngine();
        car1.honk();

        Bike bike1 = new Bike("Blue", 80);
        System.out.println(bike1);
        bike1.startEngine();
        bike1.ringBell();

        Bike bike2 = new Bike("Honda", "green");
        System.out.println(bike2);
        bike2.ringBell();
    }
}
