package InnerClasses_UMLdiagrams_w8.class_problems;

public class ShortAnswerQuestion extends Question {
    private String correctAnswer;
    public ShortAnswerQuestion(String questionText, int points, String correctAnswer) {
        super(questionText, points);
        this.correctAnswer = correctAnswer;
    }
    public boolean evaluate(String studentAnswer) {
        return correctAnswer.trim().equalsIgnoreCase(studentAnswer.trim());
    }
}