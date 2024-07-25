package tutorials.lombok;

import lombok.Builder;
import lombok.With;

@With
@Builder
public record Car(String name, int year, int wheels, int seats) {
    // Can be replaced with @With
    /*
    Car withName (String name) {
        return Car(name);
    }
     */
}
