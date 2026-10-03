package InnerClasses_UMLdiagrams_w8.class_problems;

public class LeaveWorkflowSystem {
    public LeaveRequest submitLeaveRequest(Employee employee, String startDate, String endDate, int days) {
        if (!employee.isLeaveRequestValid(days)) {
            System.out.println("Leave request rejected: exceeds allowed days for this employee type");
            return null;
        }
        LeaveRequest request = new LeaveRequest(employee, startDate, endDate, days);
        System.out.println("Leave request submitted for " + employee.getName() + " (" + request.getDateRange() + ")");
        System.out.println("Status: " + request.getStatus());
        return request;
    }
}