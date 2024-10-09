package lab2.problem5;

import java.util.Objects;

public class Cat extends Animal {
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

}
