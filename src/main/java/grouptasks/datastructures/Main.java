package grouptasks.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // *** Coding: Students in List *** //
        // Create a list
        List<Student> students = new ArrayList<>();

        // Initialize student objects
        Student student1 = new Student("Rinae", "Hyun", 12345);
        Student student2 = new Student("Jimin", "Park", 38291);
        Student student3 = new Student("Seokjin", "Kim", 87530);

        // Add student to students-list by using .add()
        students.add(student1);
        students.add(student2);
        students.add(student3);


        // *** Coding: School *** //
        Student student4 = new Student("JK", "Jeon", 29183);
        School school = new School(students);
        school.addStudent(student4);
        school.showAllStudents();
    }
}
