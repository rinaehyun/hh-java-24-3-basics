package tutorials.signature;

public class Main {
    public static void main(String[] args) {

        // Compare static and instance (non-static) variables
        compareStaticAndInstanceVariables();

    }


    public static void compareStaticAndInstanceVariables() {
        // With instance variables and methods
        Human human = new Human("Lee", 30);
        human.setAge(human.getAge() + 3);
        System.out.println(human.getAge());

        // With an static variable
        System.out.println(Human.humanAge);
        Human.humanAge = Human.humanAge + 6;
        System.out.println(Human.humanAge);
    }
}
