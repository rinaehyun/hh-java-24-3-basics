package grouptasks.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SchoolMap {
    // Fields
    Map<Integer, Student> studentMap = new HashMap<>();

    // Constructors
    public SchoolMap() {}

    public SchoolMap(Map<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    // Methods
    public void addStudent(Student student) {
        this.studentMap.put(student.getStudentId(), student);
    }

    // Getters and Setters
    public Map<Integer, Student> getStudentMap() { return studentMap; }

    public void setStudentMap(Map<Integer, Student> studentMap) { this.studentMap = studentMap; }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolMap schoolMap = (SchoolMap) o;
        return Objects.equals(studentMap, schoolMap.studentMap);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentMap);
    }

    // Print
    @Override
    public String toString() {
        return "SchoolMap{" +
                "studentMap=" + studentMap +
                '}';
    }
}
