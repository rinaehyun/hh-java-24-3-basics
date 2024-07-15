package grouptasks.lombok;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String address;
    private String grade;
}
