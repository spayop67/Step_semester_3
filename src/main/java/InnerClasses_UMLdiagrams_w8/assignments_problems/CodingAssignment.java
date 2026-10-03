package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class CodingAssignment extends Assignment {
    private static final double PENALTY_PER_DAY = 0.10;
    public CodingAssignment(String title, int maxMarks, int dueDay) {
        super(title, maxMarks, dueDay);
    }
    public double applyLatePenalty(double awardedMarks, int daysLate) {
        double penaltyFraction = PENALTY_PER_DAY * daysLate;
        if (penaltyFraction > 1) {
            penaltyFraction = 1;
        }
        return awardedMarks * (1 - penaltyFraction);
    }
}