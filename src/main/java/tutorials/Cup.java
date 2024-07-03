package tutorials;

// Abstract object with properties
// The class should be written manually
// keine Rückgabe
public class Cup {
    String color;
    String text;
    int size;
    int content;


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
