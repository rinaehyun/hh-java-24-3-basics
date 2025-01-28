package review.ecosystem.enumandoptional;

import org.w3c.dom.ls.LSOutput;

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
}
