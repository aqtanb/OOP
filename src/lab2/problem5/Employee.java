package lab2.problem5;

public class Employee extends Person{
    private String occupation;
    public Employee(String name, int age, String occupation) {
        super(name, age);
        this.occupation = occupation;
    }

}
