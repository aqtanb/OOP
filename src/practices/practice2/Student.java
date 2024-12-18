package practices.practice2;

public class Student {
    private final String name;
    private final int id;
    private int yearOfStudy;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        yearOfStudy++;
    }

    @Override
    public String toString() {
        return "(Student " + name + ", id: " + id  + ")";
    }
}
