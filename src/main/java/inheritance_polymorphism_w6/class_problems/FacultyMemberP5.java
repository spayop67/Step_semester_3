package inheritance_polymorphism_w6.class_problems;

public class FacultyMemberP5 extends LibraryMemberP5 {
    private String department;
    public FacultyMemberP5(int borrowLimit, String department) {
        super(borrowLimit);
        this.department = department;
    }
    String getDepartment() {
        return department;
    }
}