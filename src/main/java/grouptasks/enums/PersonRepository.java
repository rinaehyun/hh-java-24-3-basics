package grouptasks.enums;

import tutorials.enums.WeekDay;

import java.util.*;

import static grouptasks.enums.Gender.*;
import static java.util.Map.entry;

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

    public Map<Gender, Integer> countPersonsByGender() {
        Map<Gender, Integer> countByGender = new HashMap<>(Map.ofEntries(
                entry(MALE, 0),
                entry(FEMALE, 0),
                entry(DIVERSE, 0)
        ));

        /* Initialize an empty Map and then insert data
        Map<Gender, Integer> countByGender = new HashMap<>();
        countByGender.put(MALE, 0);
        countByGender.put(FEMALE, 0);
        countByGender.put(DIVERSE, 0);
        */

        personRepo.forEach(person -> {
            switch (person.gender()) {
                case MALE: countByGender.merge(MALE, 1, Integer::sum); break;
                case FEMALE: countByGender.merge(FEMALE, 1, Integer::sum); break;
                case DIVERSE: countByGender.merge(DIVERSE, 1, Integer::sum); break;
            }
        });

        return countByGender;
    }

    public Optional<Person> findPersonByName(String name) {
        for (Person person : personRepo) {
            if (person.name().equals(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public List<Person> showAllPeopleByWeekDay(DaysOfWeek weekDay) {
        List<Person> peopleWithDay = new ArrayList<>();
        for (Person person : personRepo) {
            if (person.favoriteDay().equals(weekDay)) {
                peopleWithDay.add(person);
            }
        }
        return peopleWithDay;
    }
}
