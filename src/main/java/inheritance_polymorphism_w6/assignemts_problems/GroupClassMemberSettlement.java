package inheritance_polymorphism_w6.assignemts_problems;

public class GroupClassMemberSettlement extends GymMemberSettlement {
    private String className;
    public GroupClassMemberSettlement(int monthlyFee, String className) {
        super(monthlyFee);
        this.className = className;
    }
    String getClassName() {
        return className;
    }
}