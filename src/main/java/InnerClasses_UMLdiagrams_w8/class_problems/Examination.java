package InnerClasses_UMLdiagrams_w8.class_problems;

import java.util.ArrayList;
import java.util.List;
public class Examination {
    private String examName;
    private List<Question> questions;
    public Examination(String examName) {
        this.examName = examName;
        this.questions = new ArrayList<>();
    }
    public void addQuestion(Question question) {
        questions.add(question);
    }
    public List<Question> getQuestions() {
        return questions;
    }
    public String getExamName() {
        return examName;
    }
}