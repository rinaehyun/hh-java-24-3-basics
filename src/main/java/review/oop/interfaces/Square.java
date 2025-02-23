package review.oop.interfaces;

public class Square implements Shape {
    // Fields
    private double side;

    // Constructors
    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    // Print
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    // Methods
    @Override
    public double calculateArea() {
        return side * side;
    }
}
