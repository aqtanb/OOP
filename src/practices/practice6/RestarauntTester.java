package practices.practice6;

public class RestarauntTester {
    public static void main(String[] args) {
        Cat cat = new Cat("Murka", 6, "coloration");
        Child child = new Child(5, "Child");
        Restaurant rest = new Restaurant();
        rest.servePizza(cat);
        //rest.servePizza(child);
    }
}
