package grouptasks.lombok;

import lombok.Data;

import java.util.OptionalDouble;

@Data
public class UniversityService {

    public static double getAverageGradeOfACourse(Course course) {

         return course.getStudents()
                .stream()
                 .mapToDouble(Student::getGrade)
                 .average()
                 .orElseThrow();
    }
}
