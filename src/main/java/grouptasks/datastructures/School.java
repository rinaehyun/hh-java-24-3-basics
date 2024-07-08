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

    // Print
    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

}
