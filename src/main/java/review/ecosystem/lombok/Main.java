package review.ecosystem.lombok;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S342", "Sam", "Address1", Grade.A);
        Student student2 = new Student("S123", "Sarah", "Address2", Grade.B);
        System.out.println(student1);
        System.out.println(student2);

        Teacher teacher1 = new Teacher("T123", "Müller", "Sport");
        System.out.println(teacher1);

        Class class1 = new Class("class1", "Sport", teacher1, List.of(student1, student2));
        System.out.println(class1);

        // Create Objects with Builder
        Student student3 = Student.builder()
                .id("S789")
                .name("Mike")
                .address("Address3")
                .grade(Grade.C)
                .build();
        System.out.println(student3);
    }
}
