package accessModifiers_encapsulation_w5.assignments_problems;

import java.util.Scanner;
public class CirculationLedgerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of receipts: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        LoanReceipt[] receipts = new LoanReceipt[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (reference/regular/null), memberId, bookIds (semicolon separated), roomNumber if reference: ");
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("null")) {
                receipts[i] = null;
                continue;
            }
            String[] parts = line.split(",");
            String type = parts[0].trim();
            String memberId = parts[1].trim();
            String[] bookIds = parts[2].trim().split(";");
            if (type.equalsIgnoreCase("reference")) {
                String roomNumber = parts[3].trim();
                receipts[i] = new ReferenceOnlyLoanReceipt(memberId, bookIds, roomNumber);
            } else {
                receipts[i] = new LoanReceipt(memberId, bookIds);
            }
        }
        String result = CirculationLedger.processNightlyCirculation(receipts);
        System.out.println(result);
        sc.close();
    }
}