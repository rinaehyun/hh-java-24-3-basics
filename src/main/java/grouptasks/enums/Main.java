package grouptasks.enums;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("A1", "ABC", DaysOfWeek.WEDNESDAY, Gender.MALE);
        Person person2 = new Person("A2", "DEF", DaysOfWeek.WEDNESDAY, Gender.FEMALE);
        Person person3 = new Person("A3", "KIM", DaysOfWeek.WEDNESDAY, Gender.FEMALE);
        Person person4 = new Person("B1", "OOO", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person person5 = new Person("B3", "LLL", DaysOfWeek.SUNDAY, Gender.DIVERSE);

        List<Person> personList = List.of(
                person1,
                person2,
                person3,
                person4,
                person5
        );

        PersonRepository personRepo = new PersonRepository(personList);
        Optional<Person> person = personRepo.findPersonById("A1");

        // Check when we return values as Optional
        checkReturnAsOptional(person);

        // Show details of a filtered class
        showNameAndDayFoundById(person);

        // Show count by gender as Map
        showCountByGender(personRepo);

    }

    public static void checkReturnAsOptional(Optional<Person> person) {
        System.out.println(person);
        System.out.println("The Optional is empty?: " + person.isEmpty());
        System.out.println("There is a non-null value inside the Optional object?: " + person.isPresent());

    }

    public static void showNameAndDayFoundById(Optional<Person> person) {
        person.ifPresent(personSelected -> {
            String id = personSelected.id();
            String name = personSelected.name();
            DaysOfWeek favDay = personSelected.favoriteDay();

            String dayCapitalized = favDay.toString().charAt(0) + favDay.toString().substring(1).toLowerCase();

            System.out.println("The person's id is " + id + ", name is " + name + ", favorite day is " + dayCapitalized + ".");
        });
    }

    public static void showCountByGender(PersonRepository personRepo) {
        Map<Gender, Integer> count = personRepo.countPersonsByGender();
        System.out.println(count);
    }
 }
