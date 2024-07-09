package tutorials.immutability.record;

public class Main {
    public static void main(String[] args) {
        Human humanA = new Human("Sarah", 32, "30-06-1992");
        Human humanB = new Human("Sarah", 32, "30-06-1992");


        // Create and print Record Object
        printRecordObject(humanA, humanB);

        // Record is immutable: if elements need to be changed -> copy the object
        copyRecordObject(humanB);
    }


    public static void printRecordObject(Human humanA, Human humanB) {
        // Print the whole object (toString)
        System.out.println(humanA);

        // Check the auto-generated getters
        System.out.println(humanA.name());
        System.out.println(humanA.birthday());

        // Access to an element with customized getter
        System.out.println(humanA.getHumanAge());
        System.out.println(humanA.getLegalAge());

        // Only static fields can be further added.
        System.out.println(Human.humanAge);
        System.out.println(Human.LEGAL_AGE);

        // Test customized methods
        humanA.print();

        // Check if two objects are equal
        System.out.println(humanA.equals(humanB));
    }

    public static void copyRecordObject(Human human) {
        // Record is not mutable - copy the object with updated values
        Human copy = new Human(human.name(), 33, human.birthday());

        System.out.println(copy);
        System.out.println(human.equals(copy));
    }
}
