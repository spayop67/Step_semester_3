package accessModifiers_encapsulation_w5.class_problems;

public class SettlementProcessor {
    static String processNightlySettlement(BookingReceipt[] receipts) {
        int processed = 0;
        int nullSkipped = 0;
        int groupCount = 0;
        int individualCount = 0;
        for (int i = 0; i < receipts.length; i++) {
            if (receipts[i] == null) {
                nullSkipped++;
                continue;
            }
            processed++;
            if (receipts[i] instanceof GroupBookingReceipt) {
                groupCount++;
            } else {
                individualCount++;
            }
        }
        return processed + " processed | " + nullSkipped + " null skipped | " + groupCount + " group | " + individualCount + " individual";
    }
}