package review.oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3.5);
        Shape square = new Square(3);

        System.out.println(circle.calculateArea());
        System.out.println(square.calculateArea());
    }
}
