package review.ecosystem.lombok;

import lombok.Data;

@Data
public class Student {
    private final String id;
    private final String name;
    private final String address;
    private final Grade grade;
}
