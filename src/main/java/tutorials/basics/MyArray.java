// 27.06.24 Part 1 - 05. Java Arrays
package tutorials.basics;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {

        // ** Array ** //
        int myAge = 27;

        // Give the length of the array but, not values yet
        int[] myAgeArray = new int[3];

        // Give the values of the array directly
        int[] myOtherArray = {27, 36, 63, 15};

        // To access an element in an array (to read an element)
        System.out.println(myOtherArray[0]);
        System.out.println(myOtherArray[2]);

        // Add an element to an array
        myAgeArray[0] = 78;
        System.out.println(myAgeArray[0]);
        System.out.println(myAgeArray[2]);

        // To read the whole array
        System.out.println("Read the whole array?: " + myOtherArray); // where the array in the computer is saved
        System.out.println("Read the whole array?: " + Arrays.toString(myOtherArray)); // The whole array will be displayed as a string

        // Read an empty value in array
        String[] ourNames = new String[10];
        System.out.println("Empty value in int array: " + myAgeArray[1]);
        System.out.println("Empty value in String array: " + ourNames[1]); // nicht drin -> null



        // ** For Loop ** //
        ourNames[0] = "Rinae";
        ourNames[1] = "Steve";
        ourNames[2] = "Jimin";
        ourNames[3] = "Jin";

        System.out.println(ourNames[0]);
        System.out.println(ourNames[1]);
        System.out.println(ourNames[2]);
        System.out.println(ourNames[3]);

        // for loop - using index
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, " +  ourNames[i]);
        }

        // for-each loop - using direct elements
        for (String currentName : ourNames) {
            System.out.println("Hi, " + currentName);
        }
    }
}
