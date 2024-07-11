package grouptasks.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PersonRepository {
    private List<Person> personRepo = new ArrayList<>();

    public PersonRepository(List<Person> personRepo) {
        this.personRepo = personRepo;
    }

    public Optional<Person> findPersonById(String id) {
        for (Person person : personRepo) {
            if (Objects.equals(person.id(), id)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
