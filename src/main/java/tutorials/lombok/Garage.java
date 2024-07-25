package tutorials.lombok;

import lombok.*;

/*@Getter
@Setter
@EqualsAndHashCode
@ToString*/
@Data // -> will contain all the above annotations
@AllArgsConstructor
@NoArgsConstructor
public class Garage {

    private int cars;
    private int drivers;

    // @NoArgsConstructor
    //public Garage() {}

    // @AllArgsConstructor
    /*
    Garage(int cars, int drivers) {
        this.cars = cars;
        this.drivers = drivers;
    }
     */

    public void addVehicle() {
        cars++;
        drivers++;
    }

}
