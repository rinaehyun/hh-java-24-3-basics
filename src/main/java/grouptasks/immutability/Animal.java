package grouptasks.immutability;

public record Animal(
        int id,
        String name,
        String species,
        int age,
        Owner owner,
        Species speciesRecord) {
}
