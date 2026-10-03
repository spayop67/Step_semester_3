package InnerClasses_UMLdiagrams_w8.class_problems;

import java.util.ArrayList;
import java.util.List;
public class Attempt {
    private Student student;
    private Examination examination;
    private List<Answer> answers;
    private boolean submitted;
    public Attempt(Student student, Examination examination) {
        this.student = student;
        this.examination = examination;
        this.answers = new ArrayList<>();
        this.submitted = false;
    }
    public boolean recordAnswer(Question question, String studentResponse) {
        if (submitted) {
            return false;
        }
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).getQuestion() == question) {
                return false;
            }
        }
        answers.add(new Answer(question, studentResponse));
        return true;
    }
    public boolean isSubmitted() {
        return submitted;
    }
    public void submit() {
        submitted = true;
    }
    public Student getStudent() {
        return student;
    }
    public Examination getExamination() {
        return examination;
    }
    public List<Answer> getAnswers() {
        return answers;
    }
}