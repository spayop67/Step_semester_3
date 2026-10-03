package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class AnnualPlan extends MembershipPlan {
    public double calculateFee() {
        double fullPrice = BASE_RATE_PER_MONTH * 12;
        return fullPrice * 0.75;
    }
    public String getPlanName() {
        return "Annual";
    }
}