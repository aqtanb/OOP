package lab3.problem4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee> {
    double salary;
    Date hireDate;
    String insuranceNumber;

    public Employee() {}

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    @Override
    public String toString() {
        return "Employee: name = " + getName() + ", annual salary = " + salary + ", hire date = " + hireDate +
                ", national insurance number = " + insuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!super.equals(obj)) return false;
        if (getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Double.compare(employee.salary, salary) == 0 && hireDate.equals(employee.hireDate) &&
                insuranceNumber.equals(employee.insuranceNumber);
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.getSalary(), other.getSalary());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.hireDate = (Date) this.hireDate.clone(); // deep
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Clone is not supported");
        }
    }
}
