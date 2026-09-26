package inheritance_polymorphism_w6.assignemts_problems;

import java.util.Scanner;
public class LoyaltyLedgerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter memberId, monthlyFee, trainerName: ");
        String[] parts = sc.nextLine().split(",");
        String memberId = parts[0].trim();
        int monthlyFee = Integer.parseInt(parts[1].trim());
        String trainerName = parts[2].trim();
        PremiumMemberLedger p = new PremiumMemberLedger(memberId, monthlyFee, trainerName);
        System.out.print("Enter number of late fees to charge: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter fee amount: ");
            int amount = Integer.parseInt(sc.nextLine().trim());
            p.chargeLateFee(amount);
        }
        System.out.println(p.getTotalLateFees());
        int[] history = p.getLateFeeHistory();
        history[0] = 999;
        int[] historyAgain = p.getLateFeeHistory();
        for (int i = 0; i < historyAgain.length; i++) {
            System.out.print(historyAgain[i]);
            if (i != historyAgain.length - 1) System.out.print(", ");
        }
        System.out.println();
        sc.close();
    }
}