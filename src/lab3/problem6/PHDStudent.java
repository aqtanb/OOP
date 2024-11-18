package lab3.problem6;

import java.util.Objects;

public class PHDStudent extends Person {
    private String major;
    private String research;

    public PHDStudent(String name, int age, String major, String research) {
        super(name, age);
        this.major = major;
        this.research = research;
    }

    public PHDStudent() {}

    @Override
    public String getOccupation(Person person) {
        return "Being busy";
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }

    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", Research: " + research;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PHDStudent phd)) return false;
        if (!super.equals(obj)) return false;
        return research.equals(phd.research) && major.equals(phd.major);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(major, research);
    }
}
