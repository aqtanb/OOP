package lab3.problem1;

public abstract class Animal {
    protected int age;
    protected String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void makeNoise();

    public void printName() {
        System.out.println(name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Age of animal: " + age + " , name: " + name;
    }
}
// Abstract classes can have both abstract and non-abstract methods and basic fields