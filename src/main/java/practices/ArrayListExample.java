package practices;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Arrays
        int[] numbers = new int[5];
        String[] strings = new String[3];

        numbers[0] = 3;
        strings[2] = "hello";

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(strings));


        // ArrayLists
        List<String> list = new ArrayList<>();
        list.add("list1");
        list.add(null);
        list.add("next entry");
        list.add(1, "saturday");
        list.add(2, "sunday");
        list.add(4, "tuesday");
        list.add(null);



        for (String l: list) {
            System.out.println(l);
        }

        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.remove(3));
        System.out.println(list);
    }
}
