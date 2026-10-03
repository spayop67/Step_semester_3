package InnerClasses_UMLdiagrams_w8.class_problems;

public class ExamEvaluator {
    static String evaluateAttempt(Attempt attempt) {
        StringBuilder sb = new StringBuilder();
        sb.append("Result: ");
        int totalScore = 0;
        int maxScore = 0;
        for (int i = 0; i < attempt.getAnswers().size(); i++) {
            Answer answer = attempt.getAnswers().get(i);
            Question question = answer.getQuestion();
            boolean correct = question.evaluate(answer.getStudentResponse());
            int earned = correct ? question.getPoints() : 0;
            totalScore += earned;
            maxScore += question.getPoints();
            sb.append("Question ").append(i + 1).append(": ").append(correct ? "Correct" : "Incorrect").append(" (").append(earned).append(" points)");
            if (i != attempt.getAnswers().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(". Total score: ").append(totalScore).append("/").append(maxScore);
        return sb.toString();
    }
}