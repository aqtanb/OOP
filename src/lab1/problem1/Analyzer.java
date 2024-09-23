package lab1.problem1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        Data data = new Data();

        while (!input.equals("Q")) {
            System.out.print("Enter number (Q to quit): ");
            input = scanner.next();
            int number;
            try {
                number = Integer.parseInt(input);
                data.add(number);
            } catch (NumberFormatException e) {
                if (!input.equals("Q")) {
                    System.out.println("Invalid input, you have to enter a number.");
                }
            }
        }
        System.out.print("Average = ");
        System.out.println(data.getAverage());
        System.out.print("Maximum = ");
        System.out.println(data.getMaximum());
    }
}
