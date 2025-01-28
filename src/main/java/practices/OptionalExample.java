package practices;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(getNameFromDatabase());

        if (name.isPresent()) {
            System.out.println("Name: " + name.get());
        } else {
            System.out.println("Name nicht gefunden.");
        }

        String defaultName = "John Doe";
        String retrievedName = getNameFromDatabase();
        String nameOrDefault = Optional.ofNullable(retrievedName).orElse(defaultName);
        System.out.println("Result: " + nameOrDefault);
    }

    private static String getNameFromDatabase() {
        return null;
    }
}
