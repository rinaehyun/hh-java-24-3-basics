package tutorials.inheritance;

import java.util.Objects;

public class Bike extends Vehicle {
    // Fields
    private int numberOfWheels;
    private int price;
    private int size;

    // Constructors
    public Bike() {
        super();
    }

    public Bike(int numberOfWheels, int price, int size) {
        super();
        this.numberOfWheels = numberOfWheels;
        this.price = price;
        this.size = size;
    }

    public Bike(String brand, String model) {
        super(brand, model);
    }

    public Bike(String brand, String model, String color, String type, int numberOfWheels, int price, int size) {
        super(brand, model, color, type);
        this.numberOfWheels = numberOfWheels;
        this.price = price;
        this.size = size;
    }

    // Methods
    @Override
    public void drive() {
        System.out.println("This is from Bike class");
    }

    // Getters and Setters
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bike bike = (Bike) o;
        return numberOfWheels == bike.numberOfWheels && price == bike.price && size == bike.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfWheels, price, size);
    }

    // Print
    @Override
    public String toString() {
        return "Bike{" +
                "numberOfWheels=" + numberOfWheels +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
