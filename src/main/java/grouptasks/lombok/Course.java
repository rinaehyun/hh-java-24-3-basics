package grouptasks.lombok;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@With
public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> studentList;
}
