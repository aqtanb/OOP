package lab2.problem3;

public class CheckingAccount extends Account {
    private static final int FREE_TRANSACTIONS = 1;
    private static final double COMMISSION = 0.02;
    private int numberOfTransactions;
    public CheckingAccount(int number) {
        super(number);
        this.numberOfTransactions = 0;
    }
    CheckingAccount() {}
    private void deductFee(double sum) {
        if (numberOfTransactions > FREE_TRANSACTIONS) super.withdraw(sum * COMMISSION);
        else System.out.println("Not enough money");
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        numberOfTransactions++;
        deductFee(sum);
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        numberOfTransactions++;
        deductFee(sum);
    }
}
