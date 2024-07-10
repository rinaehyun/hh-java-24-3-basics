package tutorials.signature;

import java.util.Objects;

public class Human {
    // Fields
    public static int numOfHumans = 0;
    public static final int LEGAL_AGE = 18;

    private String name;
    private int age;
    private final String birthday;

    // Constructors
    public Human() {
        numOfHumans++;
        this.birthday = "2000-01-01";
    }

    public Human(String name, int age, String birthday) {
        numOfHumans++;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Comparisons
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(birthday, human.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }

    // Print
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday='" + birthday +
                ", id=" + numOfHumans +
                '}';
    }
}
