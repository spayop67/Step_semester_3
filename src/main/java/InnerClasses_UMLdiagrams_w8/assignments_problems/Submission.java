package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class Submission {
    private Student student;
    private Assignment assignment;
    private int submissionDay;
    private String status;
    private double finalMarks;
    public Submission(Student student, Assignment assignment, int submissionDay) {
        this.student = student;
        this.assignment = assignment;
        this.submissionDay = submissionDay;
        this.status = "Submitted";
    }
    public Student getStudent() {
        return student;
    }
    public Assignment getAssignment() {
        return assignment;
    }
    public int getDaysLate() {
        int late = submissionDay - assignment.getDueDay();
        return Math.max(late, 0);
    }
    public String getStatus() {
        return status;
    }
    public double getFinalMarks() {
        return finalMarks;
    }
    public boolean isGraded() {
        return status.equals("Graded");
    }
    public boolean grade(double awardedMarks) {
        if (isGraded()) {
            return false;
        }
        int daysLate = getDaysLate();
        if (daysLate > 0) {
            finalMarks = assignment.applyLatePenalty(awardedMarks, daysLate);
        } else {
            finalMarks = awardedMarks;
        }
        status = "Graded";
        return true;
    }
}