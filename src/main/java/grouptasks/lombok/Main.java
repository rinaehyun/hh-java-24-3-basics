package grouptasks.lombok;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student("S3221", "StudentB", "Berlin", "A+");
        Student studentC = new Student("S114", "StudentC", "Hamburg", "A-");
        Student studentD = new Student("S8900", "StudentC", "Hannover", "B+");

        /** Example with Class Student **/
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

}
