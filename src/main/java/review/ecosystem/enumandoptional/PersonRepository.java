package review.ecosystem.enumandoptional;

import org.w3c.dom.ls.LSOutput;
import tutorials.enums.WeekDay;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    // Fields
    List<Person> personList;

    // Constructors
    PersonRepository() {
        this.personList = new ArrayList<>();
    }

    PersonRepository(List<Person> personList) {
        this.personList = new ArrayList<>(personList);
    }

    // Print
    @Override
    public String toString() {
        return "PersonRepository{" +
                "personList=" + personList +
                '}';
    }

    // Methods
    public Optional<Person> findPersonById(String id) {
        for (Person person : this.personList) {
            if (person.id().equals(id)) return Optional.of(person);
        }
        return Optional.empty();
    }

    public int countByGender(Gender gender) {
        int count = 0;
        for (Person person : this.personList) {
            if (person.gender().equals(gender)) count += 1;
        }
        return count;
    }

    public Optional<Person> findPersonByName(String name) {
        for (Person person : this.personList) {
            if (person.name().equals(name)) return Optional.of(person);
        }
        return Optional.empty();
    }

    public List<Person> findPersonsByDay(DaysOfWeek day) {
        List<Person> persons = new ArrayList<>();
        for (Person person : this.personList) {
            if (person.favoriteDay().equals(day)) persons.add(person);
        }
        return persons;
    }
}
