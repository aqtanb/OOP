package practices.practice6;

import java.util.Objects;

public abstract class Animal {
    private int age;
    private String name;

    public Animal() {}

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String getSound();

    @Override
    public String toString() {
        return "Name: " + name + " , age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal other)) return false;
        return Objects.equals(this.name, other.name) && this.age == other.age;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
}
