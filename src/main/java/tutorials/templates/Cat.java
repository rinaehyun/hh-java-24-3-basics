package tutorials.templates;

import java.util.Objects;

public class Cat implements Animal {
    // Fields
    String name;
    String color;

    // Constructors
    public Cat() {}

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Methods
    @Override
    public void makeSound() {
        System.out.println("Miau");
    }

    // Getters and Setters
    public String getName() { return name; }

    public String getColor() { return color; }

    public void setName(String name) { this.name = name; }

    public void setColor() { this.color = color; }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name, cat.name) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    // Print
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
