package inheritance_polymorphism_w6.class_problems;

public class FacultyMember extends LibraryMemberV2 {
    private String department;
    public FacultyMember(String memberId, int borrowLimit, String department) {
        super(memberId, borrowLimit);
        this.department = department;
    }
    String displayInfo() {
        return "Faculty Member | Department: " + department + " | Books Borrowed: " + getBooksBorrowed();
    }
}