package classes_objects_w3.cp3;

public class Course {
    String code;
    String title;
    int credits;
    int labCredits;
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }
    int totalCredits() {
        return credits + labCredits;
    }
}