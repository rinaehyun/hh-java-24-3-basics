package grouptasks.lombok;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Test with lombok annotaions
        generateObjectsWithLombok();

        // Create objects with @Builder()
        System.out.println(" ==== Builder() ==== ");
        createObjectsWithBuilder();

        // Change properties with @With
        updateValuesWithWith();

        // Calculate average grades
        getAverageGrade();
    }


    public static void generateObjectsWithLombok() {
        /** Example with Class Student **/
        Student studentA = new Student();
        Student studentB = new Student("S3221", "StudentB", "Berlin", 2.3);
        Student studentC = new Student("S114", "StudentC", "Hamburg", 1.7);
        Student studentD = new Student("S8900", "StudentC", "Hannover", 2.7);

        System.out.println("*** Example with Class Student ***");
        System.out.println(studentA);
        System.out.println(studentB);

        System.out.println(studentB.getId());
        System.out.println(studentC.getGrade());
        studentC.setGrade(1.3);
        System.out.println(studentC.getGrade());

        /** Example with Record Teacher **/
        System.out.println("*** Example with Record Teacher ***");
        Teacher teacher = new Teacher("T1234", "Smith", "Math");
        System.out.println(teacher);
        System.out.println(teacher.subject());

        /** Example with Class Course **/
        System.out.println("*** Example with Class Course ***");
        Course english = new Course();
        Course math = new Course("MA000", "Math", teacher, Arrays.asList(studentB, studentC, studentD));
        System.out.println(english);
        System.out.println(math);
    }


    public static void createObjectsWithBuilder() {
        /** Example with Class Student **/
        Student studentWithoutArgs = Student.builder().build();
        Student studentWithArgs = Student.builder()
                .name("Sam")
                .grade(3.0)
                .address("Frankfurt")
                .build();

        System.out.println(studentWithoutArgs);
        System.out.println(studentWithArgs);

        /** Example with Record Teacher **/
        Teacher teacherWithoutArgs = Teacher.builder().build();
        Teacher teacherWithArgs = Teacher.builder()
                .subject("Biology")
                .name("Kim")
                .build();

        System.out.println(teacherWithoutArgs);
        System.out.println(teacherWithArgs);

        /** Example with Class Course **/
        Course courseWithoutArgs = Course.builder().build();
        Course courseWithArgs = Course.builder()
                .teacher(teacherWithArgs)
                //.students(Arrays.asList(studentWithArgs, studentWithoutArgs))
                .student(studentWithArgs)
                .student(studentWithoutArgs)
                .build();

        System.out.println(courseWithoutArgs);
        System.out.println(courseWithArgs);
    }


    public static void updateValuesWithWith() {
        /** Record Teacher **/
        Teacher teacherOrg = new Teacher("T1234", "Smith", "Math");
        Teacher teacherCopy = teacherOrg.withSubject("Science");

        System.out.println(teacherOrg);
        System.out.println(teacherCopy);


        /** Class Course **/
        Student studentB = new Student();
        Student studentC = new Student();

        Course math = new Course("MA000", "Math", teacherOrg, Arrays.asList(studentB, studentC));
        Course science = math.withTeacher(teacherCopy);

        System.out.println(math);
        System.out.println(science);

    }


    public static void getAverageGrade() {

        Student studentB = new Student("S114", "StudentC", "Hamburg", 1.7);
        Student studentC = new Student("A3394", "StudentE", "Munich", 1.3);
        Teacher teacher = new Teacher("T1234", "Smith", "Math");
        Course math = new Course("MA000", "Math", teacher, Arrays.asList(studentB, studentC));

        // Get an average grade of a Course
        System.out.println("The avg of a course: " + UniversityService.getAverageGradeOfACourse(math));


        Course science = math.withStudents(Arrays.asList(studentB, new Student("X345", "newStudent", "Frankfurt", 2.7)));
        University AUni = new University("d1234", "A-University", Arrays.asList(math, science));

        // Get an average grade by University
        System.out.println("The avg from a university: " + UniversityService.getAverageGradeOfAUniversity(AUni));

        // Retrieve students with better performance
        List<Student> studentsWithPerformance = UniversityService.getStudentsWithHigherGradesThan2(AUni);
        System.out.println("The students with higher grades with 2: " + studentsWithPerformance);
    }

}
