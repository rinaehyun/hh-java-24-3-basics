package grouptasks;

public class Person {
    // Fields
    String name;
    int age;
    String gender;


    // Constructors
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    // Methods
    public void introduce() {
        System.out.println("Hello, I am " + this.name + " and " + this.age + " years old.");
    }
}
