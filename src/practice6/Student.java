package practice6;

public class Student extends Person
implements CanHaveParty, CanHaveRetake, CanHavePizza{
    String major;

    Student() {}

    Student(int age, String name, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " moves");
    }

    @Override
    public void dance() {
        System.out.println(this.getName() + " dances");
    }

    @Override
    public void eatPizza() {
        System.out.println(this.getName() + " eats Pizza");
    }

    public String getMajor() {
        return major;
    }

    @Override
    public void cry() {
        System.out.println(this.getName() + " cries");
    }
}
