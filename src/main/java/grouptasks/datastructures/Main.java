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

        School school2 = new School();
        school2.addStudent(student2);
        System.out.println(school2);


        // *** Coding: Searching and Deleting *** //
        System.out.println(school.findStudentById(29183));
        school.removeStudentFromSchool(12345);
        school.showAllStudents();


        // *** Bonus: Course *** //
        List<Course> courses = new ArrayList<>();

        Course math = new Course("Mathmatics", "Mr. Smith", "A505");
        Course english = new Course("English", "Ms. Smith", "B417");
        Course science = new Course("Biology", "Mr. Tailor", "D382");

        courses.add(math);
        courses.add(english);
        courses.add(science);

        System.out.println(courses);

        student2.addCourses(math);
        student2.addCourses(science);

        school.showAllStudents();
        school.showAllCourses(38291);

    }
}
