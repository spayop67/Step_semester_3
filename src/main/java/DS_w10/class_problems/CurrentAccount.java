package DS_w10.class_problems;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(String id, int initialBalance) {
        super(id, initialBalance);
    }
    protected int minimumAllowedBalance() {
        return -5000;
    }
    protected String rejectionMessage() {
        return "overdraft limit 5000";
    }
}