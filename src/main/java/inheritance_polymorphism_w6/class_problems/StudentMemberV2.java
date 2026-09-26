package inheritance_polymorphism_w6.class_problems;

public class StudentMemberV2 extends LibraryMemberV2 {
    private String course;
    public StudentMemberV2(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }
    String getCourse() {
        return course;
    }
    String displayInfo() {
        return "Student Member | Course: " + course + " | Books Borrowed: " + getBooksBorrowed();
    }
}