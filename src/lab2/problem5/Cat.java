package lab2.problem5;

public class Cat extends Animal {
    private String coloration;
    public Cat(int age, String name, String coloration) {
        super(name, age);
        this.coloration = coloration;
    }

    public Cat(String murka, int i) {
        super();
    }

    @Override
    String getSound() {
        return "gav gav gav";
    }
}
