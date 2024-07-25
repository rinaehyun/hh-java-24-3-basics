package grouptasks.lombok;

import lombok.Builder;
import lombok.Singular;

import java.util.List;

@Builder
public record University(
        String id,
        String name,
        @Singular List<Course> courses) {
}
