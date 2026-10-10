package DS_w10.class_problems;

public abstract class StaffMember {
    protected String name;
    public StaffMember(String name) {
        this.name = name;
    }
    public abstract int calculatePay();
    public abstract String getTypeName();
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Payslip[name=" + name + ", type=" + getTypeName() + ", pay=" + calculatePay() + "]";
    }
}