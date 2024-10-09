package lab2.problem5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal animal;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {}

    public void assignPet(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void removePet() {
        this.animal = null;
    }

    public boolean hasPet() {
        return this.animal != null;
    }

    public abstract String getOccupation(Person person);

    public void leavePetWith(Person person) {
        if (!this.hasPet()) {
            throw new IllegalArgumentException("You dont have a pet");
        } else {
            person.assignPet(this.animal);
            this.removePet();
        }
    }

    public void retrievePetFrom(Person person) {
        if (!person.hasPet()) {
            throw new IllegalArgumentException("This person doesnt have a pet");
        } else {
            this.assignPet(person.animal);
            person.removePet();
        }
    }


    @Override
    public String toString() {
        return "Name: " + name + " , age: " + age + ", has an animal: " + (hasPet() ? "yes" : "no");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person other)) return false;
        return Objects.equals(this.name, other.name) && this.age == other.age && Objects.equals(this.animal, other.animal);
    }

    public int hashCode() {
        return Objects.hash(name, age, animal);
    }
}