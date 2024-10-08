package lab2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accs;
    public Bank() {
        accs = new Vector<Account>();
    }
    public void create(Account acc) {
        accs.add(acc);
    }
    public void close(Account acc) {
        accs.add(acc);
    }
    public void update() {
        for (Account acc : accs) {
            if (acc instanceof SavingsAccount) ((SavingsAccount) acc).addInterest();
        }
    }
}
