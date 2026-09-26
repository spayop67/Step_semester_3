package accessModifiers_encapsulation_w5.assignments_problems;

public class CirculationLedger {
    static String branchCode;
    static {
        branchCode = "PT-MAIN";
        System.out.println("Branch info loaded");
    }
    static String processNightlyCirculation(LoanReceipt[] receipts) {
        int processed = 0;
        int nullSkipped = 0;
        int referenceOnlyCount = 0;
        int regularCount = 0;
        for (int i = 0; i < receipts.length; i++) {
            if (receipts[i] == null) {
                nullSkipped++;
                continue;
            }
            processed++;
            if (receipts[i] instanceof ReferenceOnlyLoanReceipt) {
                referenceOnlyCount++;
            } else {
                regularCount++;
            }
        }
        return processed + " processed | " + nullSkipped + " null skipped | " + referenceOnlyCount + " reference-only | " + regularCount + " regular";
    }
}