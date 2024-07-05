package tutorials.templates;

import java.util.Objects;

public class Dog implements Animal {
    // Fields
    String name;
    String type;

    // Constructors
    public Dog() {}

    public Dog(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Methods
    @Override
    public void makeSound() {
        System.out.println("Wuff");
    }

    // Getters and Setters
    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(type, dog.type);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(type);
    }

    // Print
    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                '}';
    }
}
