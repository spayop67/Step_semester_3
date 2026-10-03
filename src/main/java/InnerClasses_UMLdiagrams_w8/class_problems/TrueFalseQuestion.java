package InnerClasses_UMLdiagrams_w8.class_problems;

public class TrueFalseQuestion extends Question {
    private boolean correctAnswer;
    public TrueFalseQuestion(String questionText, int points, boolean correctAnswer) {
        super(questionText, points);
        this.correctAnswer = correctAnswer;
    }
    public boolean evaluate(String studentAnswer) {
        boolean given = Boolean.parseBoolean(studentAnswer);
        return given == correctAnswer;
    }
}