package tutorials;

import tutorials.classes.Cup;

public class OOP {

    public static void main(String[] args) {

        // Create an object with class Cup()
        // to create an object -> with 'new'
        // Cup() : a type of function
        Cup rinaesCup = new Cup();

        // Assign values
        rinaesCup.setColor("white");
        rinaesCup.setText("MAHLE");
        rinaesCup.setSize(400);
        rinaesCup.setContent(100);

        System.out.println(rinaesCup.getColor());

        rinaesCup.setColor("blue");
        System.out.println(rinaesCup.getColor());
        System.out.println(rinaesCup);



        Cup stevesCup = new Cup("green");

        //stevesCup.color = "green";
        stevesCup.setText("MHP");
        stevesCup.setSize(500);
        stevesCup.setContent(0);


        // Comparison of two objects
        System.out.println("Hello".equals("Hallo"));
        System.out.println(rinaesCup.equals(stevesCup));
    }
}
