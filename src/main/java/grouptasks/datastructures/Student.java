package grouptasks.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    // Fields
    String firstName;
    String lastName;
    int studentId;
    List<Course> courses = new ArrayList<>();

    // Constructors
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
    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public int getStudentId() {
        return studentId;
    }

    public List<Course> getCourses() { return courses; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setStudentId(int studentId) { this.studentId = studentId; }

    public void setCourses(List<Course> courses) { this.courses = courses; }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(courses, student.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, studentId, courses);
    }

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
