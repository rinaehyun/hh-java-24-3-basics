package grouptasks.lombok;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Test with lombok annotaions
        generateObjectsWithLombok();

        // Create objects with @Builder()
        System.out.println(" ==== Builder() ==== ");
        createObjectsWithBuilder();

        // Change properties with @With
        updateValuesWithWith();
    }


    public static void generateObjectsWithLombok() {
        /** Example with Class Student **/
        Student studentA = new Student();
        Student studentB = new Student("S3221", "StudentB", "Berlin", "A+");
        Student studentC = new Student("S114", "StudentC", "Hamburg", "A-");
        Student studentD = new Student("S8900", "StudentC", "Hannover", "B+");

        System.out.println("*** Example with Class Student ***");
        System.out.println(studentA);
        System.out.println(studentB);

        System.out.println(studentB.getId());
        System.out.println(studentC.getGrade());
        studentC.setGrade("C+");
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
                .grade("B-")
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
                .studentList(Arrays.asList(studentWithArgs, studentWithoutArgs))
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
}
