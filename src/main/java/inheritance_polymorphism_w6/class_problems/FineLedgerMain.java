package inheritance_polymorphism_w6.class_problems;

import java.util.Scanner;
public class FineLedgerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter memberId, borrowLimit, course: ");
        String[] parts = sc.nextLine().split(",");
        String memberId = parts[0].trim();
        int borrowLimit = Integer.parseInt(parts[1].trim());
        String course = parts[2].trim();
        StudentMemberFine s = new StudentMemberFine(memberId, borrowLimit, course);
        System.out.print("Enter number of fines to charge: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter fine amount: ");
            int amount = Integer.parseInt(sc.nextLine().trim());
            s.chargeFine(amount);
        }
        System.out.println(s.getTotalFine());
        int[] history = s.getFineHistory();
        history[0] = 999;
        int[] historyAgain = s.getFineHistory();
        for (int i = 0; i < historyAgain.length; i++) {
            System.out.print(historyAgain[i]);
            if (i != historyAgain.length - 1) System.out.print(", ");
        }
        System.out.println();
        sc.close();
    }
}