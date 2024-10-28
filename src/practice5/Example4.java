package practice5;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        double firstNumber, result, secondNumber;
        String firstToken, operator, secondToken;

        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] expressions = input.split("\\s+");

        for (String expression : expressions) {
            StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);

            try {
                firstToken = tokenizer.nextToken().trim();
                operator = tokenizer.nextToken().trim();
                secondToken = tokenizer.nextToken().trim();

                try {
                    firstNumber = Double.parseDouble(firstToken);
                } catch (NumberFormatException nfe) {
                    System.out.println("Incorrect operand: " + firstToken);
                    continue;
                }

                try {
                    secondNumber = Double.parseDouble(secondToken);
                } catch (NumberFormatException nfe) {
                    System.out.println("Incorrect operand: " + secondToken);
                    continue;
                }

                switch (operator) {
                    case "+":
                        result = firstNumber + secondNumber;
                        break;
                    case "-":
                        result = firstNumber - secondNumber;
                        break;
                    case "*":
                        result = firstNumber * secondNumber;
                        break;
                    case "/":
                        try {
                            result = firstNumber / secondNumber;
                        } catch (ArithmeticException exception) {
                            System.out.println("Divide by 0.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator in expression: " + expression);
                        continue;
                }
                System.out.println("Result: " + result);
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax in expression: " + expression);
            }
        }
    }
}
