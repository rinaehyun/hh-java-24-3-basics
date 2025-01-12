package review.oop.lists;

public class Student {
    // Fields
    String firstName;
    String lastName;
    String studentId;

    // Constructors
    public Student() {}

    public Student(String firstName, String lastName, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    // Print
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
