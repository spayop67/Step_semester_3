package DS_w10.class_problems;

public class InternStaff extends StaffMember {
    private int stipend;
    public InternStaff(String name, int stipend) {
        super(name);
        this.stipend = stipend;
    }
    public int calculatePay() {
        return stipend;
    }
    public String getTypeName() {
        return "Intern";
    }
}