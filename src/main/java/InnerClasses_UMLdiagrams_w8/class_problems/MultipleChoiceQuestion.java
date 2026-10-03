package InnerClasses_UMLdiagrams_w8.class_problems;

public class MultipleChoiceQuestion extends Question {
    private String correctOption;
    public MultipleChoiceQuestion(String questionText, int points, String correctOption) {
        super(questionText, points);
        this.correctOption = correctOption;
    }
    public boolean evaluate(String studentAnswer) {
        return correctOption.equalsIgnoreCase(studentAnswer);
    }
}