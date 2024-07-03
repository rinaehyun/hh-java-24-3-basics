package tutorials;

public class OOP {

    public static void main(String[] args) {

        // Create an object with class Cup()
        // to create an object -> with 'new'
        // Cup() : a type of function
        Cup rinaesCup = new Cup();

        // Assign values
        rinaesCup.color = "white";
        rinaesCup.text = "MAHLE";
        rinaesCup.size = 400;
        rinaesCup.content = 100;

        System.out.println(rinaesCup.color);

        rinaesCup.color = "blue";
        System.out.println(rinaesCup.color);
        System.out.println(rinaesCup);



        Cup stevesCup = new Cup("green");

        //stevesCup.color = "green";
        stevesCup.text = "MHP";
        stevesCup.size = 500;
        stevesCup.content = 0;
    }
}
