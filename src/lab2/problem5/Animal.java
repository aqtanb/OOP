package lab2.problem5;

public abstract class Animal {
    private int age;
    private String name;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {}

    abstract String getSound();

    @Override
    public String toString() {
        return "Name: " + name + " , Age: " + age;
    }
}
