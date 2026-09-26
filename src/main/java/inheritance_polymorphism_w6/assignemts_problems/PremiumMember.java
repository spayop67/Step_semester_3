package inheritance_polymorphism_w6.assignemts_problems;

public class PremiumMember extends GymMember {
    private String trainerName;
    public PremiumMember(String memberId, int monthlyFee, String trainerName) {
        super(memberId, monthlyFee);
        this.trainerName = trainerName;
    }
    String getTrainerName() {
        return trainerName;
    }
}