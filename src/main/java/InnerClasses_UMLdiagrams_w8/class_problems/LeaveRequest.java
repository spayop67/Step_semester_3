package InnerClasses_UMLdiagrams_w8.class_problems;

public class LeaveRequest {
    private Employee employee;
    private String startDate;
    private String endDate;
    private int days;
    private LeaveStatus status;
    public LeaveRequest(Employee employee, String startDate, String endDate, int days) {
        this.employee = employee;
        this.startDate = startDate;
        this.endDate = endDate;
        this.days = days;
        this.status = LeaveStatus.PENDING;
    }
    public Employee getEmployee() {
        return employee;
    }
    public LeaveStatus getStatus() {
        return status;
    }
    public String getDateRange() {
        return startDate + "-" + endDate;
    }
    public boolean approve() {
        if (status == LeaveStatus.PENDING) {
            status = LeaveStatus.APPROVED;
            return true;
        }
        return false;
    }
    public boolean reject() {
        if (status == LeaveStatus.PENDING) {
            status = LeaveStatus.REJECTED;
            return true;
        }
        return false;
    }
    public boolean resetToPending() {
        return false;
    }
}