package lab2.problem3;

public class Account {
    private double balance; // The current balance
    private int accNumber; // The account number

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public Account() {}

    public void deposit(double sum) {
        if (sum > 0) balance += sum;
        else System.out.println("Negative number");

    }

    public void withdraw(double sum) {
        if (balance >= sum && sum > 0) balance -= sum;
        else System.out.println("Not enough money");
    }

    public double getBalance() {
        return balance;
    }

    public double getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if (this == other) {
            System.out.println("You cant transfer money to yourself");
            return;
        }
        if (balance >= amount && amount > 0) {
            this.withdraw(amount);
            other.deposit(amount);
        }
        else System.out.println("Not enough money");

    }

    public String toString() {
        return "Balance : " + balance + " , Account: " + accNumber;
    }

    public final void print() {
        System.out.println(toString());
    }
}