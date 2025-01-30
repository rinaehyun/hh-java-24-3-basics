package review.ecosystem.lombok;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Teacher {
    private final String id;
    private final String name;
    private final String subject;
}
