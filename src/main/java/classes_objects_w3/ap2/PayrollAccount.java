package classes_objects_w3.ap2;

public class PayrollAccount {
    private double basicSalary;
    private double bonus;
    public PayrollAccount(double openingBasicSalary) {
        if (openingBasicSalary < 0) {
            System.out.println("Warning: negative basic salary not allowed. Starting at 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = openingBasicSalary;
        }
        this.bonus = 0;
    }
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Bonus credit rejected: amount must be positive");
        } else {
            bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }
    }
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Tax deduction rejected: percent must be between 0 and 100");
        } else {
            basicSalary -= basicSalary * (percent / 100);
            System.out.println("Tax deducted: " + percent + "%");
        }
    }
    public double getNetSalary() {
        return basicSalary + bonus;
    }
}