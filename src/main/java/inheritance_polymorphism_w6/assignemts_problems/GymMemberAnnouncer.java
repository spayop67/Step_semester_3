package inheritance_polymorphism_w6.assignemts_problems;

public class GymMemberAnnouncer {
    private String memberId;
    private int monthlyFee;
    private int sessionsAttended;
    public GymMemberAnnouncer(String memberId, int monthlyFee) {
        if (memberId == null || memberId.trim().isEmpty() || memberId.length() < 4) {
            throw new IllegalArgumentException("Construction rejected: invalid memberId");
        }
        this.memberId = memberId;
        this.monthlyFee = monthlyFee;
        this.sessionsAttended = 0;
    }
    void attendSession() {
        sessionsAttended++;
    }
    int getSessionsAttended() {
        return sessionsAttended;
    }
    String displayInfo() {
        return "Standard | Sessions: " + sessionsAttended;
    }
}