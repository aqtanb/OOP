package lab2.problem3;

public class AccountTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account acc = new Account();
        SavingsAccount sa = new SavingsAccount(325235, 15);
        bank.create(sa);
        sa.addInterest();
        sa.print();
        sa.deposit(1222222);
        sa.addInterest();
        sa.print();

        CheckingAccount ca = new CheckingAccount(134134);
        sa.transfer(1222, ca);
        ca.deposit(1);
        ca.withdraw(1);
        ca.transfer(1, sa);
        ca.print();

    }
}
