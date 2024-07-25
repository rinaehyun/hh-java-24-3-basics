package tutorials.exceptionhandling;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Example with runtime exception
        showRuntimeException();

        // Example with compile-time exception
        showCompileTimeException();
    }


    public static void showRuntimeException() {
        try {
            // logic
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide " + e.getMessage());
        }
        System.out.println("Stuff after try/catch block");


        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


        try {
            int[] intArray = new int[2];
            intArray[2] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void readFile() throws IOException {
        throw new IOException("Error message from readFile() function");
    }

    static void getNameForFile(String name) throws IOException {
        readFile();
    }

    public static void showCompileTimeException() {
        try {
            getNameForFile("text.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
