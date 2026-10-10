package DS_w10.class_problems;

public class PartTimeStaff extends StaffMember {
    private int hours;
    private int rate;
    public PartTimeStaff(String name, int hours, int rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }
    public int calculatePay() {
        return hours * rate;
    }
    public String getTypeName() {
        return "PartTime";
    }
}