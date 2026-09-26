package inheritance_polymorphism_w6.class_problems;

public class StudentMemberReport extends LibraryMemberReport {
    private String course;
    public StudentMemberReport(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }
    String getCourse() {
        return course;
    }
    @Override
    String displayInfo() {
        return "Student | Course: " + course + " | Books: " + getBooksBorrowed();
    }
}