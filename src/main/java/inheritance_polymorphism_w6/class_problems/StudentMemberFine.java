package inheritance_polymorphism_w6.class_problems;

public class StudentMemberFine extends LibraryMemberFine {
    private String course;
    public StudentMemberFine(String memberId, int borrowLimit, String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }
    @Override
    protected void chargeFine(int amount) {
        super.chargeFine(amount / 2);
    }
}