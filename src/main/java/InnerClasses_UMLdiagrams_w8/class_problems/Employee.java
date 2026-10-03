package InnerClasses_UMLdiagrams_w8.class_problems;

public abstract class Employee {
    protected String employeeId;
    protected String name;
    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    public abstract boolean isLeaveRequestValid(int days);
    public String getName() {
        return name;
    }
}