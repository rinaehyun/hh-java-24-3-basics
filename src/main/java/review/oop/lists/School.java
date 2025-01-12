package review.oop.lists;

import java.util.ArrayList;
import java.util.List;

public class School {
    // Fields
    List<Student> students;

    // Constructors
    public School() {
        this.students = new ArrayList<>();
    }

    public School(List<Student> students) {
        // Wrapping an immutable list with new ArrayList<>(...) ensures the resulting list is modifiable.
        this.students = new ArrayList<>(students);
    }

    // Getters and Setters
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = new ArrayList<>(students);     // ensure it's modifiable
    }

    // Print
    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    // Methods
    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
        System.out.println(students);
    }
}
