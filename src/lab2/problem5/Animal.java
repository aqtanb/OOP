package lab2.problem5;

import java.util.Objects;

public abstract class Animal {
    private int age;
    private String name;
    private boolean isHardToMaintain;
    public Animal(String name, int age, boolean isHardToMaintain) {
        this.name = name;
        this.age = age;
        this.isHardToMaintain = isHardToMaintain;
    }

    public Animal() {}

    abstract String getSound();

    @Override
    public String toString() {
        return "Name: " + name + " , age: " + age + ", hard to maintain: " + (isHardToMaintain ? "yes" : "no");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal other)) return false;
        return Objects.equals(this.name, other.name) && this.age == other.age && Objects.equals(this.isHardToMaintain, other.isHardToMaintain);
    }

    public int hashCode() {
        return Objects.hash(name, age, isHardToMaintain);
    }
}
