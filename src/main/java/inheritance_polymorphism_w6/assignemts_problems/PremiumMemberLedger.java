package inheritance_polymorphism_w6.assignemts_problems;

public class PremiumMemberLedger extends GymMemberLedger {
    private String trainerName;
    public PremiumMemberLedger(String memberId, int monthlyFee, String trainerName) {
        super(memberId, monthlyFee);
        this.trainerName = trainerName;
    }
    @Override
    protected void chargeLateFee(int amount) {
        super.chargeLateFee(amount / 2);
    }
}