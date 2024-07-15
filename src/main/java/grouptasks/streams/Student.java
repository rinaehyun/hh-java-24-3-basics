package grouptasks.streams;

public class Student {
    // Fields
    int id;
    String name;
    String postalCode;
    int age;

    // Constructors
    public Student() {}

    public Student(int id, String name, String postalCode, int age) {
        this.id = id;
        this.name = name;
        this.postalCode = postalCode;
        this.age = age;
    }

    // Print
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", age=" + age +
                '}';
    }
}
