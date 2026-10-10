package DS_w10.class_problems;

public class FullTimeStaff extends StaffMember {
    private int salary;
    public FullTimeStaff(String name, int salary) {
        super(name);
        this.salary = salary;
    }
    public int calculatePay() {
        return salary;
    }
    public String getTypeName() {
        return "FullTime";
    }
}