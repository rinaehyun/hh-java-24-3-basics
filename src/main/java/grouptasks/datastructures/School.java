package grouptasks.datastructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class School {
    // Fields
    List<Student> students = new ArrayList<>();;

    // Constructors
    public School() {}

    public School(List<Student> students) {
        this.students = students;
    }

    // Methods
    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void showAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public void removeStudentFromSchool(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                System.out.println(student.firstName + " " + student.lastName + " left our school.");
                break;
            }
        }
    }

    public void showAllCourses(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                for (Course course : student.getCourses()) {
                    System.out.println(course);
                }
            }
        }
    }

    // Getters and Setters
    public List<Student> getStudents() { return students; }

    public void setStudents(List<Student> students) { this.students = students; }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(students);
    }

    // Print
    @Override
    public String toString() {
        return "School { " +
                "students = " + students +
                '}';
    }
}
