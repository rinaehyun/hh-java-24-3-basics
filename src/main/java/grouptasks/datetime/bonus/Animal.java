package grouptasks.datetime.bonus;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
public class Animal {
    // Fields
    ZonedDateTime birthday;
    String name;

}
