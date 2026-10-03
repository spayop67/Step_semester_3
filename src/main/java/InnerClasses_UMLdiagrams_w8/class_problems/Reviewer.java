package InnerClasses_UMLdiagrams_w8.class_problems;

public class Reviewer {
    private String reviewerName;
    public Reviewer(String reviewerName) {
        this.reviewerName = reviewerName;
    }
    public void approveRequest(LeaveRequest request) {
        boolean success = request.approve();
        if (success) {
            System.out.println(request.getEmployee().getName() + "'s leave request (" + request.getDateRange() + ") approved");
            System.out.println("Status: " + request.getStatus());
        }
    }
    public void rejectRequest(LeaveRequest request) {
        boolean success = request.reject();
        if (success) {
            System.out.println(request.getEmployee().getName() + "'s leave request (" + request.getDateRange() + ") rejected");
            System.out.println("Status: " + request.getStatus());
        }
    }
}