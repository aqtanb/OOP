package lab2.problem5;

import java.util.Objects;

public class Dog extends Animal {
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
}
