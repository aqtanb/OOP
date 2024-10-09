package lab2.problem5;

import java.util.Objects;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public Student() {}

    @Override
    public String getOccupation(Person person) {
        return "Student";
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student student)) return false;
        if (!super.equals(obj)) return false;
        return major.equals(student.major);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(major);
    }
}
