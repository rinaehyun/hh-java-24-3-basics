package grouptasks.datastructures;

import java.util.ArrayList;
import java.util.List;

public class Student {
    // Fields
    String firstName;
    String lastName;
    int studentId;
    List<Course> courses = new ArrayList<>();;

    // Constructors;
    public Student() {}

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    // Methods
    public void addCourses(Course course) {
        if (!courses.contains(course)) courses.add(course);
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public List<Course> getCourses() { return courses; }

    // Print
    @Override
    public String toString() {
        return "Student { " +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", studentId = " + studentId +
                ", courses = " + courses +
                " }";
    }
}
