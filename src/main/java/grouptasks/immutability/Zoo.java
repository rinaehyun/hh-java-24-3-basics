package grouptasks.immutability;

import java.util.List;

public record Zoo(
        List<Animal> animals
) {

    public int calculateTotalFood() {
        int total = 0;
        for (Animal animal : animals) {
            total += animal.speciesRecord().foodInGram();
        }
        return total;
    }
}
