package InnerClasses_UMLdiagrams_w8.class_problems;

public class Answer {
    private Question question;
    private String studentResponse;
    public Answer(Question question, String studentResponse) {
        this.question = question;
        this.studentResponse = studentResponse;
    }
    public Question getQuestion() {
        return question;
    }
    public String getStudentResponse() {
        return studentResponse;
    }
}