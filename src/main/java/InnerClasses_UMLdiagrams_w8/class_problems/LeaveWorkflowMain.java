package InnerClasses_UMLdiagrams_w8.class_problems;

public class LeaveWorkflowMain {
    public static void main(String[] args) {
        LeaveWorkflowSystem system = new LeaveWorkflowSystem();

        FullTimeEmployee john = new FullTimeEmployee("E1", "John");
        PartTimeEmployee jane = new PartTimeEmployee("E2", "Jane");

        Reviewer alice = new Reviewer("Alice");
        Reviewer bob = new Reviewer("Bob");

        LeaveRequest johnRequest = system.submitLeaveRequest(john, "Jan 1", "Jan 5", 5);
        alice.approveRequest(johnRequest);

        LeaveRequest janeRequest = system.submitLeaveRequest(jane, "Feb 10", "Feb 11", 2);
        bob.rejectRequest(janeRequest);

        boolean reverted = johnRequest.resetToPending();
        if (!reverted) {
            System.out.println("Cannot change leave request status from " + johnRequest.getStatus() + " to Pending");
        }
    }
}