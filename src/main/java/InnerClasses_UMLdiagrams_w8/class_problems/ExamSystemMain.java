package InnerClasses_UMLdiagrams_w8.class_problems;

public class ExamSystemMain {
    public static void main(String[] args) {
        Student student1 = new Student("S1", "Student 1");

        Examination examA = new Examination("Exam A");
        MultipleChoiceQuestion q1 = new MultipleChoiceQuestion("What is 2+2?", 5, "C");
        TrueFalseQuestion q2 = new TrueFalseQuestion("Java is platform independent", 5, true);
        examA.addQuestion(q1);
        examA.addQuestion(q2);

        Attempt attempt = new Attempt(student1, examA);
        System.out.println(examA.getExamName() + " started by " + student1.getName());

        attempt.recordAnswer(q1, "C");
        System.out.println("Answer recorded for Question 1");

        attempt.recordAnswer(q2, "false");
        System.out.println("Answer recorded for Question 2");

        attempt.submit();
        System.out.println(examA.getExamName() + " submitted by " + student1.getName());

        String result = ExamEvaluator.evaluateAttempt(attempt);
        System.out.println(result);

        boolean changed = attempt.recordAnswer(q1, "A");
        if (!changed) {
            System.out.println("Cannot change answers for a submitted examination");
        }
    }
}