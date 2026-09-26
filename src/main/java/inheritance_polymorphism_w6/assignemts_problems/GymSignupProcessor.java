package inheritance_polymorphism_w6.assignemts_problems;

public class GymSignupProcessor {
    static String signUpBatch(String[] memberIds, int monthlyFee) {
        int signedUp = 0;
        int rejected = 0;
        for (int i = 0; i < memberIds.length; i++) {
            try {
                GymMember m = new GymMember(memberIds[i], monthlyFee);
                signedUp++;
            } catch (IllegalArgumentException e) {
                rejected++;
            }
        }
        return "Signed Up: " + signedUp + " | Rejected: " + rejected;
    }
}