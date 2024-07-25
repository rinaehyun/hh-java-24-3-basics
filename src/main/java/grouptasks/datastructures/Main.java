package grouptasks.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test ArrayLists
        generateArrayListsInClass();

        // Test Map
        compareArrayListsAndMap();

        // Examples with MAP
        generateMapInClass();

        // Test how to input values to Map
        tryMultipleConstructorsWithMap();
    }


    public static void generateArrayListsInClass() {
        // *** Coding: Students in List *** //
        // Create a list
        List<Student> students = new ArrayList<>();

        // Initialize student objects
        Student student1 = new Student("Rinae", "Hyun", 12345);
        Student student2 = new Student("Jimin", "Park", 38291);
        Student student3 = new Student("Seokjin", "Kim", 87530);

        // Add student to students-list by using .add()
        students.add(student1);
        students.add(student2);
        students.add(student3);


        // *** Coding: School *** //
        Student student4 = new Student("JK", "Jeon", 29183);
        School school = new School(students);
        school.addStudent(student4);
        school.showAllStudents();

        School school2 = new School();
        school2.addStudent(student2);
        System.out.println(school2);


        // *** Coding: Searching and Deleting *** //
        System.out.println(school.findStudentById(29183));
        school.removeStudentFromSchool(12345);
        school.showAllStudents();


        // *** Bonus: Course *** //
        List<Course> courses = new ArrayList<>();

        Course math = new Course("Mathmatics", "Mr. Smith", "A505");
        Course english = new Course("English", "Ms. Smith", "B417");
        Course science = new Course("Biology", "Mr. Tailor", "D382");

        courses.add(math);
        courses.add(english);
        courses.add(science);

        System.out.println(courses);

        student2.addCourses(math);
        student2.addCourses(science);

        school.showAllStudents();
        school.showAllCourses(38291);

    }

    public static void compareArrayListsAndMap() {
        SchoolMap schoolMap = new SchoolMap();

        // Initialize student objects
        Student student1 = new Student("Rinae", "Hyun", 12345);
        Student student2 = new Student("Jimin", "Park", 38291);
        Student student3 = new Student("Seokjin", "Kim", 87530);

        schoolMap.addStudent(student1);
        schoolMap.addStudent(student2);

    }

    public static void generateMapInClass() {
        Medication medication = new Medication("Tebonin", 30.5, true);

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(medication);
        pharmacy.save(new Medication("Ibuprofen", 10.99, true));
        pharmacy.save(new Medication("Paracetamol", 25.99, true));
        pharmacy.save(new Medication("Diclofenac", 8.99, false));

        System.out.println(pharmacy);

        System.out.println(pharmacy.find("Tebonin"));

        pharmacy.delete("ABC");
        System.out.println(pharmacy);

    }


    public static void tryMultipleConstructorsWithMap() {

        Map<String, Medication> mapsForConstructor = Map.of(
                new Medication("Paracetamol", 25.99, true).getName(), new Medication("Paracetamol", 25.99, true),
                new Medication("Diclofenac", 8.99, false).getName(), new Medication("Diclofenac", 8.99, false)
        );
        Pharmacy newPharmacy = new Pharmacy(mapsForConstructor);

        Pharmacy newPharmacyWithCount = new Pharmacy(mapsForConstructor, 30);
    }
}
