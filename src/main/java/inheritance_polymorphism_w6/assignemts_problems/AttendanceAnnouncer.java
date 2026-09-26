package inheritance_polymorphism_w6.assignemts_problems;

public class AttendanceAnnouncer {
    static String batchPrint(GymMemberAnnouncer[] members) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < members.length; i++) {
            sb.append(members[i].displayInfo());
            if (members[i] instanceof PremiumMemberAnnouncer) {
                PremiumMemberAnnouncer premium = (PremiumMemberAnnouncer) members[i];
                sb.append(" [Trainer via downcast: ").append(premium.getTrainerName()).append("]");
            }
            sb.append(" | ");
        }
        return sb.toString();
    }
}