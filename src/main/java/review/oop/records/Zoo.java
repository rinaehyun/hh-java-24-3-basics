package review.oop.records;

import java.util.List;

public record Zoo(List<Animal> animalList) {
    // Methods
    public double calculateTotalFood() {
        double totalAmount = 0;
        for (Animal animal : animalList) {
            totalAmount = totalAmount + animal.species().gram();
        }
        return totalAmount;
    }
}
