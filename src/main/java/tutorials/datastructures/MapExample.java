package tutorials.datastructures;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // Create and initialize a Map
        Map<String, Integer> map = new HashMap<>();

        // Add values
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Cherry", 5);

        // Replace the previous value of 3
        map.put("Apple", 4);

        // Check the size
        int size = map.size();
        System.out.println(size);

        // Retrieve a value
        int count = map.get("Banana");
        System.out.println(count);

        // Check if the map has a specific key
        boolean hasApple = map.containsKey("Apple");
        System.out.println(hasApple);

        // Remove a key-value pair
        map.remove("Cherry");

        // Iterate through the Map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove all items
        map.clear();

        // Check if the map is empty
        boolean isEmtpyMap = map.isEmpty();
        System.out.println(isEmtpyMap);

    }

}
