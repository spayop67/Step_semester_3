package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class Membership {
    private Member member;
    private MembershipPlan plan;
    private double fee;
    private String status;
    public Membership(Member member, MembershipPlan plan) {
        this.member = member;
        this.plan = plan;
        this.fee = plan.calculateFee();
        this.status = "Active";
    }
    public Member getMember() {
        return member;
    }
    public MembershipPlan getPlan() {
        return plan;
    }
    public double getFee() {
        return fee;
    }
    public String getStatus() {
        return status;
    }
    public boolean checkIn() {
        return status.equals("Active");
    }
    public boolean freeze() {
        if (status.equals("Active")) {
            status = "Frozen";
            return true;
        }
        return false;
    }
    public boolean unfreeze() {
        if (status.equals("Frozen")) {
            status = "Active";
            return true;
        }
        return false;
    }
    public void expire() {
        status = "Expired";
    }
}