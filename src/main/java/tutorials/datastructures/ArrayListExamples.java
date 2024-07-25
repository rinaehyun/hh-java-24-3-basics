package tutorials.datastructures;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {
        // Create an empty arrayList
        List<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Berlin");
        list.add("Amsterdam");
        list.add("Madrid");
        list.add("Prague");

        // Add an element at a specific position
        list.add(1, "Tokyo");

        // Access elements
        System.out.println("Element at index 2: " + list.get(2));

        // Remove an element
        list.remove("Amsterdam");

        // Check if the list has a specific element
        System.out.println(list.contains("Tokyo"));

        // Check the size of the arrayList
        System.out.println(list.size());

        // Iterating through the ArrayList
        for (String city : list) {
            System.out.println(city);
        }

        // Remove all elements from the list
        list.clear();

        // Check if the list is empty
        System.out.println(list.isEmpty());
    }

}
