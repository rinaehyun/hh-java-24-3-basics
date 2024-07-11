package grouptasks.enums;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("A1", "ABC", DaysOfWeek.WEDNESDAY);
        Person person2 = new Person("A2", "DEF", DaysOfWeek.WEDNESDAY);
        Person person3 = new Person("A3", "KIM", DaysOfWeek.WEDNESDAY);

        List<Person> personList = List.of(
                person1,
                person2,
                person3
        );

        PersonRepository personRepo = new PersonRepository(personList);
        Person person = personRepo.findPersonById("A2");

        System.out.println(person);
    }
}
