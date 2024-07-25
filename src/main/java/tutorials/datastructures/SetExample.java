package tutorials.datastructures;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        // Create and initialize a Set
        Set<String> set = new HashSet<>();

        // Add values
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Add duplicate values -> will not be added
        set.add("Apple");

        // Check the size
        int size = set.size();
        System.out.println(size);

        // Check if an item exists
        boolean hasBanana = set.contains("Banana");
        System.out.println(hasBanana);

        // Remove an item
        set.remove("Cherry");

        // Iterate through the Set
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Remove all items
        set.clear();

        // Check if the Set is empty
        boolean isEmptySet = set.isEmpty();
        System.out.println(isEmptySet);

    }
}
