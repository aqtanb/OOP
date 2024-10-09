package lab2.problem5;

public class VacationTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PHDStudent("Alice", 26, "Comp. Science", "AI");
        Animal murka = new Cat("Murka", 5);
        john.assignPet(murka);
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        john.leavePetWith(alice);
        System.out.println(registry);
        john.retrievePetFrom(alice);
        System.out.println(registry);

    }
}
