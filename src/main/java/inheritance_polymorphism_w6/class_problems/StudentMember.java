package inheritance_polymorphism_w6.class_problems;

public class StudentMember extends LibraryMember {
    private String course;
    public StudentMember(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }
    String getCourse() {
        return course;
    }
}