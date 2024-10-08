package lab2.problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people = new ArrayList<Person>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> findPeopleWithPets() {
        List<Person> peopleWithPets = new ArrayList<>();
        for (Person person : people) {
            if(person.hasPet()) {
                peopleWithPets.add(person);
            }
        }
        return peopleWithPets;
    }

    public List<Person> findPeopleWithoutPets() {
        List<Person> peopleWithPets = new ArrayList<>();
        for (Person person : people) {
            if(!person.hasPet()) {
                peopleWithPets.add(person);
            }
        }
        return peopleWithPets;
    }
}
