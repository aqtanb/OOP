package lab3.problem4;

import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person person1 = new Person("John");
        Person person2 = new Person("Alice");
        Employee employee1 = new Employee(person1.getName(), 50000, new Date(), "11111111111");
        Employee employee2 = new Employee(person2.getName(), 60000, new Date(), "222222222");
        Manager manager1 = new Manager(person1.getName(), 70000, new Date(), "33333333333", 5000);
        Manager manager2 = new Manager(person2.getName(), 75000, new Date(), "44444444", 4000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(manager1);
        System.out.println(manager2);

        System.out.println(employee1.compareTo(employee2));
        System.out.println(manager1.compareTo(manager2));

        manager1.addTeamMember(employee1);
        manager1.addTeamMember(employee2);
        System.out.println(manager1.getTeam().size());

        try {
            Employee clonedEmployee = (Employee) employee1.clone();
            Manager clonedManager = (Manager) manager1.clone();

            System.out.println(clonedEmployee);
            System.out.println(clonedManager);

            clonedEmployee.setSalary(55000);
            clonedManager.setBonus(6000);

            System.out.println(employee1);
            System.out.println(manager1);
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException("Clone is not supported");
        }
    }
}

