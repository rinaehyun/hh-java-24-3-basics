package review.oop.interfaces;

public class Circle implements Shape {
    // Fields
    private double radius;

    // Constructors
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    // Print
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    // Methods
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
