package inheritance_polymorphism_w6.assignemts_problems;

import java.util.Scanner;
public class GymTierAnalyzerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        GymMember[] members = new GymMember[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (standard/premium/elite/group), memberId, monthlyFee, extra field, sessionCount: ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String memberId = parts[1].trim();
            int monthlyFee = Integer.parseInt(parts[2].trim());
            GymMember member;
            if (type.equalsIgnoreCase("premium")) {
                String trainerName = parts[3].trim();
                member = new PremiumMember(memberId, monthlyFee, trainerName);
            } else if (type.equalsIgnoreCase("elite")) {
                String trainerName = parts[3].trim();
                String lockerNumber = parts[4].trim();
                member = new EliteMember(memberId, monthlyFee, trainerName, lockerNumber);
            } else if (type.equalsIgnoreCase("group")) {
                String className = parts[3].trim();
                member = new GroupClassMember(memberId, monthlyFee, className);
            } else {
                member = new GymMember(memberId, monthlyFee);
            }
            int sessionCount = Integer.parseInt(parts[parts.length - 1].trim());
            for (int j = 0; j < sessionCount; j++) {
                member.attendSession();
            }
            members[i] = member;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(members[i].displayInfo());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(GymTierAnalyzer.classifyGeneration(members[i]));
        }
        System.out.println(GymTierAnalyzer.getTotalSessionsAttended(members));
        sc.close();
    }
}