package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class QuarterlyPlan extends MembershipPlan {
    public double calculateFee() {
        double fullPrice = BASE_RATE_PER_MONTH * 3;
        return fullPrice * 0.90;
    }
    public String getPlanName() {
        return "Quarterly";
    }
}