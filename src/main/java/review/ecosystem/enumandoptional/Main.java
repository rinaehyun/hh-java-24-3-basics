package review.ecosystem.enumandoptional;

import java.util.List;

import static review.ecosystem.enumandoptional.DaysOfWeek.WEDNESDAY;
import static review.ecosystem.enumandoptional.DaysOfWeek.getDayType;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDayType(DaysOfWeek.MONDAY));
        System.out.println(getDayType(DaysOfWeek.SATURDAY));

        // Create Person objects
        Person person1 = new Person("P1", "Rora", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person person2 = new Person("P2", "Sam", DaysOfWeek.SATURDAY, Gender.MALE);
        Person person3 = new Person("P3", "Mike", DaysOfWeek.FRIDAY, Gender.MALE);

        PersonRepository personRepository = new PersonRepository(List.of(person1, person2, person3));
        System.out.println(personRepository);

        // Find Person by id
        System.out.println(personRepository.findPersonById("P3"));
        System.out.println(personRepository.findPersonById("P1"));
        System.out.println(personRepository.findPersonById("A33"));

        // Count persons by Gender
        System.out.println(personRepository.countByGender(Gender.MALE));
        System.out.println(personRepository.countByGender(Gender.FEMALE));
        System.out.println(personRepository.countByGender(Gender.DIVERSE));

        // Find Person by name
        System.out.println(personRepository.findPersonByName("Sam"));
        System.out.println(personRepository.findPersonByName("Naomi"));

        // Find all people by their favorite weekday
        System.out.println(personRepository.findPersonsByDay(DaysOfWeek.FRIDAY));
        System.out.println(personRepository.findPersonsByDay(DaysOfWeek.SATURDAY));
        System.out.println(personRepository.findPersonsByDay(DaysOfWeek.MONDAY));
    }
}
