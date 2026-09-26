package inheritance_polymorphism_w6.assignemts_problems;

public class GroupClassMember extends GymMember {
    private String className;
    public GroupClassMember(String memberId, int monthlyFee, String className) {
        super(memberId, monthlyFee);
        this.className = className;
    }
    String displayInfo() {
        return "Group Class Member | Class: " + className + " | Sessions: " + getSessionsAttended();
    }
}