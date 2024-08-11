package practices;

import java.util.*;

public class SetAndMap {
    public static void main(String[] args) {

        showHashSetExample();

        showHashMapExample();
    }

    public static void showHashSetExample() {
        Set<String> fruits = new HashSet<>();

        fruits.add(null);
        fruits.add("apple");
        fruits.add("orange");
        fruits.add(null);
        fruits.add("banana");
        fruits.add("orange");  // The duplicated item isn't inserted.
        fruits.add(null);

        System.out.println(fruits);
        System.out.println(fruits.contains("orange"));
        System.out.println(fruits.size());
        fruits.remove(null);
        fruits.removeIf(fruit -> !fruit.equals("banana"));
        System.out.println(fruits);
    }

    public static void showHashMapExample() {
        Map<Integer, String> students = new HashMap<>();

        students.put(3, "Sam");
        students.put(2, "Mark");
        students.putIfAbsent(2, "Tom");
        students.put(1, "Thomas");

        System.out.println(students.containsKey(3));
        System.out.println(students.keySet());
        System.out.println(students.size());
        System.out.println(Arrays.toString(students.values().toArray()));
        System.out.println(students.get(3));
        System.out.println(students.remove(2));

        System.out.println(students);

    }
}
