package grouptasks.datastructures;

public class Course {
    // Fields
    String courseName;
    String instructor;
    String room;

    // Constructors
    public Course() {}

    public Course(String courseName, String instructor, String room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }

    // Getters and Setters


    // Print
    @Override
    public String toString() {
        return "Course { " +
                "courseName = '" + courseName + '\'' +
                ", instructor = '" + instructor + '\'' +
                ", room = '" + room + '\'' +
                " }";
    }
}
