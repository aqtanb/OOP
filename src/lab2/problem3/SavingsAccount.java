package lab2.problem3;

public class SavingsAccount extends Account {
    private double interest;
    public SavingsAccount(int number, int interest) {
        super(number);
        this.interest = interest;
    }
    SavingsAccount() {}
    public void addInterest() {
        deposit(getBalance() * (interest / 100.0));
    }
}
