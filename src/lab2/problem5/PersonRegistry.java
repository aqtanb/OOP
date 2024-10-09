package lab2.problem5;

import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public List<Person> findPeopleWithPets() {
        List<Person> peopleWithPets = new ArrayList<>();
        for (Person person : people) {
            if(person.hasPet()) peopleWithPets.add(person);
        }
        return peopleWithPets;
    }

    public List<Person> findPeopleWithoutPets() {
        List<Person> peopleWithoutPets = new ArrayList<>();
        for (Person person : people) {
            if(!person.hasPet()) peopleWithoutPets.add(person);
        }
        return peopleWithoutPets;
    }


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Person person : people) {
            System.out.println(person);
            if (person.hasPet()) {
                output.append(person.getAnimal());
            }
        }
        return output.toString();
    }
}

