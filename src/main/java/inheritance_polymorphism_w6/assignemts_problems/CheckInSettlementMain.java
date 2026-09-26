package inheritance_polymorphism_w6.assignemts_problems;

import java.util.Scanner;
public class CheckInSettlementMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        GymMemberSettlement[] members = new GymMemberSettlement[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (group/regular/null), monthlyFee, className if group: ");
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("null")) {
                members[i] = null;
                continue;
            }
            String[] parts = line.split(",");
            String type = parts[0].trim();
            int monthlyFee = Integer.parseInt(parts[1].trim());
            if (type.equalsIgnoreCase("group")) {
                String className = parts[2].trim();
                members[i] = new GroupClassMemberSettlement(monthlyFee, className);
            } else {
                members[i] = new GymMemberSettlement(monthlyFee);
            }
        }
        System.out.print("Enter a referral code to validate: ");
        String code = sc.nextLine().trim();
        System.out.println(GymMemberSettlement.isValidReferralCode(code));
        String result = CheckInSettlementProcessor.processWeeklyCheckIn(members);
        System.out.println(result);
        sc.close();
    }
}