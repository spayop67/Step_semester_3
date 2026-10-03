package InnerClasses_UMLdiagrams_w8.class_problems;

public class FullTimeEmployee extends Employee {
    private static final int MAX_DAYS = 15;
    public FullTimeEmployee(String employeeId, String name) {
        super(employeeId, name);
    }
    public boolean isLeaveRequestValid(int days) {
        return days > 0 && days <= MAX_DAYS;
    }
}