package tutorials.classes;

import java.util.Objects;

// Abstract object with properties
// The class should be written manually
// keine Rückgabe
public class Cup {
    private String color;
    private String text;
    private int size;
    private int content;


    // If we don't create it, it will be automatically created without content
    // Constructor -> multiple possible
    public Cup() {
        // System.out.println("Cup constructor");
        color = "black";
    }

    public Cup(String color) {
        this.color = color;
    }

    // When the fields are private -> use getter() to read it.
    public String getColor() {
        return color;
    }

    public String getText() {
        return text;
    }

    public int getSize() {
        return size;
    }

    // When the fields are updated -> use setter() to assign a new value.
    // Before the value is saved, setter() validates the input.
    public void setColor(String color) {
        this.color = color;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setContent(int content) {
        this.content = content;
    }

    // Method for comparisons
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cup cup = (Cup) o;
        return size == cup.size && content == cup.content && Objects.equals(color, cup.color) && Objects.equals(text, cup.text);
    }

    public int hashCode() {
        return super.hashCode();
    }

    // When the object is printed
    public String toString() {
        return "Cup{" +
                "color='" + color + '\'' +
                ", text='" + text + '\'' +
                ", size=" + size +
                ", content=" + content +
                '}';
    }
}
