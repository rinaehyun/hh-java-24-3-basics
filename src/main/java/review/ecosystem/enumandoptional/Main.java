package review.ecosystem.enumandoptional;

import java.util.List;

import static review.ecosystem.enumandoptional.DaysOfWeek.WEDNESDAY;
import static review.ecosystem.enumandoptional.DaysOfWeek.getDayType;

public class Main {
    public static void main(String[] args) {
        System.out.println(getDayType(DaysOfWeek.MONDAY));
        System.out.println(getDayType(DaysOfWeek.SATURDAY));

        // Create Person objects
        Person person1 = new Person("P1", "Rora", DaysOfWeek.MONDAY);
        Person person2 = new Person("P2", "Sam", DaysOfWeek.SATURDAY);
        Person person3 = new Person("P3", "Mike", DaysOfWeek.FRIDAY);

        PersonRepository personRepository = new PersonRepository(List.of(person1, person2, person3));
        System.out.println(personRepository);

        System.out.println(personRepository.findPersonById("P3"));
        System.out.println(personRepository.findPersonById("P1"));
        System.out.println(personRepository.findPersonById("A33"));
    }
}
