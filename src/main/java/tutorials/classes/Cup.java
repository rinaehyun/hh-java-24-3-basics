package tutorials.classes;

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

/*
    public String toString() {
        return "Hallo";
    }
    */

}
