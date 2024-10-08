package lab2.problem5;

public class Dog extends Animal {
    private String coloration;
    public Dog(String name, int age, String coloration) {
        super(name, age);
        this.coloration = coloration;
    }

    @Override
    String getSound() {
        return "meow meow meow";
    }
}
