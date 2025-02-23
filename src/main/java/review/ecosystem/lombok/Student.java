package review.ecosystem.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@Builder
@With
public class Student {
    private final String id;
    private final String name;
    private final String address;
    private final Grade grade;
}
