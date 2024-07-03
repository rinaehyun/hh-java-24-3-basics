package grouptasks;

public class OOPExamples {
    public static void main(String[] args) {

        // the first Car object
        Car myCar = new Car();
        myCar.starts();

        // the second Car object
        Car yourCar = new Car();
        yourCar.accelerates(125.5);
        System.out.println(yourCar.speed);
    }
}
