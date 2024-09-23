package lab1;

import java.util.Scanner;

public class Data {
    private double sum;
    private double maximum;
    private int count;
    Data() {
        sum = 0;
        maximum = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    void add() {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("Q")) {
            input = scanner.next();
            int number;
            try {
                number = Integer.parseInt(input);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, you have to enter a number.");
            }
        }
    }




}
