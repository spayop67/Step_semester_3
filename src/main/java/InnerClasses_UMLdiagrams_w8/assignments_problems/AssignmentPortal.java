package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class AssignmentPortal {
    public Submission submitWork(Student student, Assignment assignment, int submissionDay) {
        Submission submission = new Submission(student, assignment, submissionDay);
        int daysLate = submission.getDaysLate();
        if (daysLate > 0) {
            System.out.println(student.getName() + "'s submission for '" + assignment.getTitle() + "' received (" + daysLate + " days late)");
        } else {
            System.out.println(student.getName() + "'s submission for '" + assignment.getTitle() + "' received (on time)");
        }
        System.out.println("Status: " + submission.getStatus());
        return submission;
    }
    public void gradeSubmission(Submission submission, double awardedMarks) {
        if (submission.isGraded()) {
            System.out.println("Cannot resubmit: '" + submission.getAssignment().getTitle() + "' has already been graded");
            return;
        }
        int daysLate = submission.getDaysLate();
        boolean success = submission.grade(awardedMarks);
        if (success) {
            int maxMarks = submission.getAssignment().getMaxMarks();
            if (daysLate > 0) {
                double penaltyPercent = daysLate * (submission.getAssignment() instanceof CodingAssignment ? 10 : 20);
                System.out.println(submission.getStudent().getName() + " graded: " + (int) submission.getFinalMarks() + "/" + maxMarks + " after " + penaltyPercent + "% late penalty");
            } else {
                System.out.println(submission.getStudent().getName() + " graded: " + (int) submission.getFinalMarks() + "/" + maxMarks);
            }
            System.out.println("Status: " + submission.getStatus());
        }
    }
    public void attemptResubmit(Submission submission) {
        if (submission.isGraded()) {
            System.out.println("Cannot resubmit: '" + submission.getAssignment().getTitle() + "' has already been graded");
        }
    }
}