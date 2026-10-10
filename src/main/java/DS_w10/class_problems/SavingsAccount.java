package DS_w10.class_problems;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String id, int initialBalance) {
        super(id, initialBalance);
    }
    protected int minimumAllowedBalance() {
        return 1000;
    }
    protected String rejectionMessage() {
        return "minimum balance 1000";
    }
}