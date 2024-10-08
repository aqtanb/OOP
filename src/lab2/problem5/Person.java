package lab2.problem5;


import javax.lang.model.type.NullType;
import java.util.Objects;

public abstract class Person {
    private final String name;
    private int age;
    private Animal animal;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal animal) {
        this.animal = animal;
    }

    public void removePet() {
        this.animal = null;
    }

    public boolean hasPet() {
        return this.animal != null;
    }

    public void getOccupation(Person occupator) {
        occupator.assignPet(this.animal);
        this.removePet();
    }

    public void retrievePetFrom(Person occupator) {
        if(!this.hasPet() && occupator.hasPet()) {
            this.assignPet(occupator.animal);
            occupator.removePet();
        }
    }

    public abstract String getOccupation();

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void leavePetWith(Person alice) {
        alice.assignPet(this.animal);
    }
}