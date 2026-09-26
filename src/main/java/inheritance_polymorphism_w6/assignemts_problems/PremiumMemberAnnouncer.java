package inheritance_polymorphism_w6.assignemts_problems;

public class PremiumMemberAnnouncer extends GymMemberAnnouncer {
    private String trainerName;
    public PremiumMemberAnnouncer(String memberId, int monthlyFee, String trainerName) {
        super(memberId, monthlyFee);
        this.trainerName = trainerName;
    }
    String getTrainerName() {
        return trainerName;
    }
    @Override
    String displayInfo() {
        return "Premium | Trainer: " + trainerName + " | Sessions: " + getSessionsAttended();
    }
}