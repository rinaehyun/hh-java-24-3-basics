package grouptasks;

import grouptasks.classes.Book;
import grouptasks.classes.Library;

import java.util.Arrays;

public class OOPExamples {
    public static void main(String[] args) {

        // Example with Car class
        generateCarObjects();

        // Example with Person class
        generatePersonObjects();

        // Example with Book class
        displayBookInfo();

        // Example with Library class
        displayLibraryInfo();
    }


    public static void generateCarObjects() {
        // the first Car object -> without any fields
        Car myCar = new Car();
        myCar.starts();

        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.yearOfManufacture);

        // the second Car object -> with one field
        Car yourCar = new Car(80.0);
        System.out.println(yourCar.speed);

        yourCar.accelerates(125.5);
        System.out.println(yourCar.speed);

        System.out.println(myCar.brand);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.yearOfManufacture);

        // the third Car object -> with all fields
        Car ourCar = new Car("BMW", "BMW i7", "Black", 2020, 180.5);
        System.out.println(ourCar.brand);
        System.out.println(ourCar.model);
        System.out.println(ourCar.color);
        System.out.println(ourCar.yearOfManufacture);
        System.out.println(ourCar.speed);
    }


    public static void generatePersonObjects() {
        // the first person
        Person firstPerson = new Person();
        firstPerson.name = "Thomas";
        firstPerson.age = 30;
        firstPerson.introduce();

        // the second person
        Person secondPerson = new Person("Anna", 25);
        secondPerson.introduce();

        // the third person
        Person thirdPerson = new Person("Mark", 33, "male");
        thirdPerson.introduce();
    }


    public static void displayBookInfo() {
        Book book = new Book("Harry Porter 1", "J. K. Rowling", "134-3-26-34567-8");
        System.out.println(book);
    }


    public static void displayLibraryInfo() {
        // Create an array of Book objects
        Book[] library = new Book[3];
        library[0] = new Book("Harry Porter 5", "J. K. Rowling", "333-2-78-65430-5");
        library[1] = new Book("How to read a book", "Van Doren", "356-8-39-94876-7");
        library[2] = new Book("Sapiens", "Yuval Noah Harari", "383-7-36-86543-2");

        // Print the books as a collection
        System.out.println(Arrays.toString(library));

        // Print each book in the library
        for (Book book : library) {
            System.out.println(book);
        }
    }
}
