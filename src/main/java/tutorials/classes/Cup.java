package tutorials.classes;

// Abstract object with properties
// The class should be written manually
// keine Rückgabe
public class Cup {
    public String color;
    public String text;
    public int size;
    public int content;


    // If we don't create it, it will be automatically created without content
    // Constructor -> multiple possible
    public Cup() {
        // System.out.println("Cup constructor");
        color = "black";
    }

    public Cup(String color) {
        this.color = color;
    }

}
