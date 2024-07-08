package grouptasks.datastructures;

public class Student {
    // Fields
    String firstName;
    String lastName;
    int studentId;

    // Constructors;
    public Student() {}

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    // Print
    @Override
    public String toString() {
        return "{ " +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", studentId = " + studentId +
                " }";
    }
}
