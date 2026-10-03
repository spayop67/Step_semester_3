package InnerClasses_UMLdiagrams_w8.class_problems;

public class PartTimeEmployee extends Employee {
    private static final int MAX_DAYS = 7;
    public PartTimeEmployee(String employeeId, String name) {
        super(employeeId, name);
    }
    public boolean isLeaveRequestValid(int days) {
        return days > 0 && days <= MAX_DAYS;
    }
}