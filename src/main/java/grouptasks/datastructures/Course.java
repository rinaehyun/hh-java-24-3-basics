package grouptasks.datastructures;

import java.util.Objects;

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
    public String getCourseName() { return courseName; }

    public String getInstructor() { return instructor; }

    public String getRoom() { return room; }

    public void setCourseName(String courseName) { this.courseName = courseName; }

    public void setInstructor(String instructor) { this.instructor = instructor; }

    public void setRoom(String room) { this.room = room; }


    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) && Objects.equals(instructor, course.instructor) && Objects.equals(room, course.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseName, instructor, room);
    }

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
