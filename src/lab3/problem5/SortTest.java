package lab3.problem5;

import lab3.problem4.Employee;
import lab3.problem4.Person;

import java.util.Arrays;
import java.util.Date;

public class SortTest {
    public static void main(String[] args) {
        Chocolate twix = new Chocolate("Twix", 50.5);
        Chocolate mars = new Chocolate("Mars", 55.0);
        Chocolate snickers = new Chocolate("Snickers", 60.0);

        System.out.println(twix);
        System.out.println(mars);
        System.out.println(snickers);

        System.out.println(twix.compareTo(mars));
        System.out.println(snickers.compareTo(mars));

        Time[] times = {
                new Time(0, 57, 15),
                new Time(8, 45, 20),
                new Time(12, 0, 0),
                new Time(9, 15, 10)
        };

        System.out.println("b4");
        for (Time time : times) {
            System.out.println(time);
        }

        Sort.bubbleSort(times);

        System.out.println("after");
        for (Time time : times) {
            System.out.println(time);
        }

        Person person1 = new Person("John");
        Person person2 = new Person("Alice");
        Employee employee1 = new Employee(person1.getName(), 77777, new Date(), "11111111111");
        Employee employee2 = new Employee(person2.getName(), 60000, new Date(), "222222222");
        Employee[] employees = {employee1, employee2};
        System.out.println(Arrays.toString(employees));
        Sort.bubbleSort(employees);
        System.out.println(Arrays.toString(employees));

    }
}
