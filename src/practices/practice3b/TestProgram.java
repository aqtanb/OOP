package practices.practice3b;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestProgram {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add person\n2. Print all people\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.println("Add 1. Student or 2. Staff?");
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter address:");
                String address = scanner.nextLine();

                if (type == 1) {
                    System.out.println("Enter program:");
                    String program = scanner.nextLine();
                    System.out.println("Enter year:");
                    int year = scanner.nextInt();
                    System.out.println("Enter fee:");
                    double fee = scanner.nextDouble();
                    people.add(new Student(name, address, program, year, fee));
                } else if (type == 2) {
                    System.out.println("Enter school:");
                    String school = scanner.nextLine();
                    System.out.println("Enter pay:");
                    double pay = scanner.nextDouble();
                    people.add(new Staff(name, address, school, pay));
                }
            } else if (choice == 2) {
                for (Person p : people) {
                    System.out.println(p);
                }
            } else if (choice == 3) {
                break;
            }
        }

        scanner.close();
    }
}
