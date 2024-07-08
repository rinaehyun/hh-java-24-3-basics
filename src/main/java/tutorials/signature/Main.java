package tutorials.signature;

public class Main {
    public static void main(String[] args) {

        // Compare static and instance (non-static) variables
        compareStaticAndInstanceVariables();

        // Test final variables
        testFinalVariable();
    }


    public static void compareStaticAndInstanceVariables() {
        // With instance variables and methods
        Human human = new Human("Park", 30, "1995-10-13");
        human.setAge(human.getAge() + 3);
        System.out.println(human.getAge());

        // With an static variable
        System.out.println(Human.humanAge);
        Human.humanAge = Human.humanAge + 6;
        System.out.println(Human.humanAge);
    }

    public static void testFinalVariable() {
        // LEGAL_AGE is static final
        System.out.println("The static final variable: " + Human.LEGAL_AGE);

        // Initialize an object without any initial values to final -> default value will be stored
        Human human = new Human();
        System.out.println(human);

        Human humanWithBDAY = new Human("Kim", 29, "1995-12-30");
        System.out.println(humanWithBDAY);
    }
}
