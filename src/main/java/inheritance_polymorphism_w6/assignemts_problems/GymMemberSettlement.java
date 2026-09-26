package inheritance_polymorphism_w6.assignemts_problems;

public class GymMemberSettlement {
    private final String membershipNumber;
    private static int membersEnrolled = 0;
    private int monthlyFee;
    private int feesPaid;
    public GymMemberSettlement(int monthlyFee) {
        membersEnrolled++;
        this.membershipNumber = "GYM-" + (2000 + membersEnrolled);
        this.monthlyFee = monthlyFee;
        this.feesPaid = 0;
    }
    void payFee(int amount) {
        feesPaid += amount;
    }
    void payFee(int amount, String mode) {
        payFee(amount);
    }
    int getFeesPaid() {
        return feesPaid;
    }
    String getMembershipNumber() {
        return membershipNumber;
    }
    static boolean isValidReferralCode(String code) {
        if (code.length() != 4) {
            return false;
        }
        if (code.charAt(0) != 'G') {
            return false;
        }
        if (!Character.isDigit(code.charAt(1)) || !Character.isDigit(code.charAt(2))) {
            return false;
        }
        if (!Character.isUpperCase(code.charAt(3))) {
            return false;
        }
        return true;
    }
    static int getMembersEnrolled() {
        return membersEnrolled;
    }
}