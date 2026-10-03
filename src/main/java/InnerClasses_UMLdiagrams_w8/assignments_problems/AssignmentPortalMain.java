package InnerClasses_UMLdiagrams_w8.assignments_problems;

public class AssignmentPortalMain {
    public static void main(String[] args) {
        AssignmentPortal portal = new AssignmentPortal();

        CodingAssignment codingLab = new CodingAssignment("Linked List Lab", 50, 10);
        WrittenAssignment designEssay = new WrittenAssignment("Design Essay", 50, 12);

        Student asha = new Student("Asha");
        Student ravi = new Student("Ravi");

        Submission ashaSubmission = portal.submitWork(asha, codingLab, 10);
        Submission raviSubmission = portal.submitWork(ravi, designEssay, 14);

        portal.gradeSubmission(ashaSubmission, 45);
        portal.gradeSubmission(raviSubmission, 40);

        portal.attemptResubmit(ashaSubmission);
    }
}