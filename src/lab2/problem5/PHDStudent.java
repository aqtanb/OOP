package lab2.problem5;

public class PHDStudent extends Person{
    private String specialtyOne;
    private String specialtyTwo;

    public PHDStudent(String name, int age, String first, String second) {
        super(name, age);
        this.specialtyOne = first;
        this.specialtyTwo = second;
    }

    @Override
    public void assignPet(Animal animal) {
        if(animal instanceof Dog) {
            super.assignPet(animal);
        } else {
            System.out.println("Invalid User");
        }
    }

    @Override
    public String toString() {
        return "Specialty first: " + specialtyOne + " , specialty: " + specialtyTwo;
    }
}