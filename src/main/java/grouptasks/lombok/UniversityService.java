package grouptasks.lombok;

import lombok.Data;

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
                .average()
                .orElseThrow();
    }
}
