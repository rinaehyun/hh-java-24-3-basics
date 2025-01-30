package review.ecosystem.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    private final String id;
    private final String name;
    private final String address;
    private final Grade grade;
}
