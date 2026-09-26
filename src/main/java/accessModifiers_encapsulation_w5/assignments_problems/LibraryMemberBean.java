package accessModifiers_encapsulation_w5.assignments_problems;

public class LibraryMemberBean {
    private String membershipId;
    private boolean membershipIdSet;
    private String name;
    private boolean premiumMember;
    private int securityAnswerHash;
    public LibraryMemberBean() {
    }
    public String getMembershipId() {
        return membershipId;
    }
    public void setMembershipId(String id) {
        if (!membershipIdSet) {
            this.membershipId = id;
            this.membershipIdSet = true;
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isPremiumMember() {
        return premiumMember;
    }
    public void setPremiumMember(boolean premium) {
        this.premiumMember = premium;
    }
    public void setSecurityAnswer(String answer) {
        this.securityAnswerHash = answer.hashCode();
    }
}