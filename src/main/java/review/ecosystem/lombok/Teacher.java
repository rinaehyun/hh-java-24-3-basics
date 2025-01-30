package review.ecosystem.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@Builder
@With
public class Teacher {
    private final String id;
    private final String name;
    private final String subject;
}
