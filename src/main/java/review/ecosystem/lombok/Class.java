package review.ecosystem.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@Builder
@With
public class Class {
    private final String id;
    private final String name;
    private final Teacher teacher;
    private final List<Student> students;
}
