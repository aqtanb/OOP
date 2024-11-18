package lab3.problem6;

import java.util.Objects;

public abstract class Person implements Comparable<Person>, Ownership {
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

    public String getName() {
        return name;
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

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }


    @Override
    public void adoptPet(Animal animal) {
        this.animal = animal;
        System.out.println(name + " has adopted a pet: " + animal.getName());
    }

    @Override
    public void giveAwayPet(Animal animal) {
        if (this.animal == animal) {
            this.animal = null;
            System.out.println(name + " has given away their pet: " + animal.getName());
        } else {
            System.out.println(name + " doesn't own this pet.");
        }
    }

    @Override
    public void takeCareOfPet() {
        if (animal != null) {
            System.out.println(name + " is taking care of their pet: " + animal.getName());
        } else {
            System.out.println(name + " has no pet to take care of.");
        }
    }

}