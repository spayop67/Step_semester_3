package DS_w10.class_problems;

public abstract class BankAccount {
    protected String id;
    private int balance;
    public BankAccount(String id, int initialBalance) {
        this.id = id;
        this.balance = initialBalance;
    }
    protected abstract int minimumAllowedBalance();
    protected abstract String rejectionMessage();
    public String withdraw(int amount) {
        if (balance - amount < minimumAllowedBalance()) {
            return id + " rejected: " + rejectionMessage();
        }
        balance -= amount;
        return id + " balance " + balance;
    }
    public int getBalance() {
        return balance;
    }
}