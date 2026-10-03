package InnerClasses_UMLdiagrams_w8.assignments_problems;

public abstract class Assignment {
    protected String title;
    protected int maxMarks;
    protected int dueDay;
    public Assignment(String title, int maxMarks, int dueDay) {
        this.title = title;
        this.maxMarks = maxMarks;
        this.dueDay = dueDay;
    }
    public abstract double applyLatePenalty(double awardedMarks, int daysLate);
    public String getTitle() {
        return title;
    }
    public int getMaxMarks() {
        return maxMarks;
    }
    public int getDueDay() {
        return dueDay;
    }
}