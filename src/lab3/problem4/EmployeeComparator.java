package lab3.problem4;

import java.util.Comparator;

public class EmployeeComparator {
    public static Comparator<Employee> sortByName() {
        return Comparator.comparing(Person::getName);
    }

    public static Comparator<Employee> sortByHireDate() {
        return Comparator.comparing(Employee::getHireDate);
    }
}
