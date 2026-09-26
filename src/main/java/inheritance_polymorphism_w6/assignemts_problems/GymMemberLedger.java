package inheritance_polymorphism_w6.assignemts_problems;

public class GymMemberLedger {
    private String memberId;
    private int monthlyFee;
    private int sessionsAttended;
    private int[] lateFeeHistory;
    private int feeCount;
    public GymMemberLedger(String memberId, int monthlyFee) {
        if (memberId == null || memberId.trim().isEmpty() || memberId.length() < 4) {
            throw new IllegalArgumentException("Construction rejected: invalid memberId");
        }
        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
        this.sessionsAttended = 0;
        this.lateFeeHistory = new int[10];
        this.feeCount = 0;
    }
    void attendSession() {
        sessionsAttended++;
    }
    int getSessionsAttended() {
        return sessionsAttended;
    }
    protected void chargeLateFee(int amount) {
        lateFeeHistory[feeCount] = amount;
        feeCount++;
    }
    int[] getLateFeeHistory() {
        int[] copy = new int[feeCount];
        for (int i = 0; i < feeCount; i++) {
            copy[i] = lateFeeHistory[i];
        }
        return copy;
    }
    int getTotalLateFees() {
        int total = 0;
        for (int i = 0; i < feeCount; i++) {
            total += lateFeeHistory[i];
        }
        return total;
    }
}