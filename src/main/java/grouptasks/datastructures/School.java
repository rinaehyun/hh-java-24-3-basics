package grouptasks.datastructures;

import java.util.List;

public class School {
    // Fields
    List<Student> students;

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
        for (Student student : this.students) {
            System.out.println(student);
        }
    }

    // Print
    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

}
