package lab3.problem6;

import java.util.Objects;

public class Dog extends Animal implements Interactable {
    private String coloration;
    public Dog(String name, int age, String coloration) {
        super(name, age, true);
        this.coloration = coloration;
    }

    @Override
    String getSound() {
        return "meow meow meow";
    }

    @Override
    public String toString() {
        return super.toString() + ", coloration: " + coloration;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog dog)) return false;
        if (!super.equals(obj)) return false;
        return coloration.equals(dog.coloration);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(coloration);
    }

    @Override
    public void interactWithPerson(Person person) {
        System.out.println(super.getName() + " interacts with " + person.getName());
    }

    @Override
    public void interactWithAnimal(Animal animal) {
        System.out.println(super.getName() + " interacts with " + animal.getName());
    }
}
