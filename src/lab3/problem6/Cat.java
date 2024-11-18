package lab3.problem6;

import java.util.Objects;

public class Cat extends Animal implements Interactable {
    private String coloration;
    public Cat(String name, int age, String coloration) {
        super(name, age, false);
        this.coloration = coloration;
    }

    public Cat() {}

    @Override
    String getSound() {
        return "gav gav gav";
    }

    @Override
    public String toString() {
        return super.toString() + ", coloration: " + coloration;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cat cat)) return false;
        if (!super.equals(obj)) return false;
        return coloration.equals(cat.coloration);
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
