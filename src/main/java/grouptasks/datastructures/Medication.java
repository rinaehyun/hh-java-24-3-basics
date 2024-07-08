package grouptasks.datastructures;

import java.util.Objects;

public class Medication {
    // Fields
    String name;
    double price;
    boolean availability;

    // Constructors
    public Medication() {}

    public Medication(String name, double price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    // Methods


    // Getters and Setters
    public String getName() { return name; }

    public double getPrice() { return price; }

    public boolean isAvailability() { return availability; }

    public void setName(String name) { this.name = name; }

    public void setPrice(double price) { this.price = price; }

    public void setAvailability(boolean availability) { this.availability = availability; }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Double.compare(price, that.price) == 0 && availability == that.availability && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, availability);
    }

    // Print
    @Override
    public String toString() {
        return "Medication { " +
                "name = '" + name + '\'' +
                ", price = " + price +
                ", availability = " + availability +
                " }";
    }
}
