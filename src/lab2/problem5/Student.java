package lab2.problem5;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student, Major: " + major;
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
        if (!(obj instanceof Student)) return false;
        if (!super.equals(obj)) return false;
        Student student = (Student) obj;
        return major.equals(student.major);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + major.hashCode();
    }
}
