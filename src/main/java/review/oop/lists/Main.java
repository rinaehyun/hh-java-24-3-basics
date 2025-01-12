package review.oop.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // *** Mutable vs. Immutable Lists in Java *** //

        // Create objects of Student
        Student student1 = new Student("Sam", "Smith", "S2345");
        Student student2 = new Student("Sarah", "Fisher", "S9873");
        //List<Student> students = Arrays.asList(student1, student2);  // class java.util.Arrays$ArrayList  -> immutable -> wrap with ArrayList
        List<Student> students = new ArrayList<>(List.of(student1, student2));  // class java.util.ArrayList  -> mutable

        // Create objects of School
        School school = new School(students);
        school.addStudent(new Student("Michel", "Trump", "S8765"));
        System.out.println(school);

        // Check if a list is modifiable, you can check its runtime type
        System.out.println(students.getClass());     // class java.util.Arrays$ArrayList
        // Immutable lists often have types like java.util.ImmutableCollections$ListN.
    }
}
