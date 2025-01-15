package review.oop.lists;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // Fields
    String firstName;
    String lastName;
    String studentId;
    List<Course> courses;

    // Constructors
    public Student() {}

    public Student(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.courses = new ArrayList<>();

    }

    public Student(String firstName, String lastName, String studentId, List<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.courses = new ArrayList<>(courses);
    }

    // Print
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }

    // Methods
    public void addCourse(Course newCourse) {
        this.courses.add(newCourse);
    }
}
