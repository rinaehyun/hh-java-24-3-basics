package review.ecosystem.lombok;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Class {
    private final String id;
    private final String name;
    private final Teacher teacher;
    private final List<Student> students;
}
