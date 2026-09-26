package inheritance_polymorphism_w6.assignemts_problems;

public class CheckInSettlementProcessor {
    static String processWeeklyCheckIn(GymMemberSettlement[] members) {
        int processed = 0;
        int nullSkipped = 0;
        int groupCount = 0;
        int individualCount = 0;
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                nullSkipped++;
                continue;
            }
            processed++;
            if (members[i] instanceof GroupClassMemberSettlement) {
                groupCount++;
            } else {
                individualCount++;
            }
        }
        return processed + " processed | " + nullSkipped + " null skipped | " + groupCount + " group | " + individualCount + " individual";
    }
}