package lab3.problem6;

import java.util.Objects;

public abstract class Animal implements Cloneable, AnimalActions {
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

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

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

    @Override
    public Animal clone() throws CloneNotSupportedException {
        if (this.getAge() < 10) {
            try {
                Animal cloned = (Animal) super.clone();
                cloned.name = new String(this.name);
                return cloned;
            } catch (CloneNotSupportedException e) {
                throw new CloneNotSupportedException("Clone is not supported");
            }
        } else {
            throw new CloneNotSupportedException("Aged animals can't be currently cloned");
        }
    }

    @Override
    public void move() {
        System.out.println("The animal moves");
    }

    @Override
    public void communicate() {
        System.out.println("The animal communicates");
    }

    @Override
    public void reproduce() {
        System.out.println("The animal reproduces");
    }

}
