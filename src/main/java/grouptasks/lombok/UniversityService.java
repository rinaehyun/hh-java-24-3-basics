package grouptasks.lombok;

import lombok.Data;

import java.util.List;

@Data
public class UniversityService {

    public static double getAverageGradeOfACourse(Course course) {

         return course.getStudents()
                .stream()
                 .mapToDouble(Student::getGrade)
                 .average()
                 .orElseThrow();
    }

    public static double getAverageGradeOfAUniversity(University university) {
        return university.courses()
                .stream()
                .mapToDouble(UniversityService::getAverageGradeOfACourse)
                /*.mapToDouble(course -> {
                    return course.getStudents()
                            .stream()
                            .mapToDouble(Student::getGrade)
                            .average()
                            .orElseThrow();
                })*/
                .average()
                .orElseThrow();
    }

    // University -> List<Course> -> List<Student>
    public static List<Student> getStudentsWithHigherGradesThan2(University university) {
          return university.courses()
                .stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() < 2)
                .toList();
    }
}
