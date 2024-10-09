package lab2.problem5;

import java.util.Objects;

public class Employee extends Person{
    private String job;
    public Employee(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String getOccupation(Person person) {
        return "Employee";
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + ", Job: " + job;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee employee)) return false;
        if (!super.equals(obj)) return false;
        return job.equals(employee.job);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(job);
    }
}
