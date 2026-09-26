package inheritance_polymorphism_w6.assignemts_problems;

import java.util.Scanner;
public class AttendanceAnnouncerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        GymMemberAnnouncer[] members = new GymMemberAnnouncer[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (standard/premium), memberId, monthlyFee, trainerName if premium, sessionCount: ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String memberId = parts[1].trim();
            int monthlyFee = Integer.parseInt(parts[2].trim());
            GymMemberAnnouncer member;
            int sessionCount;
            if (type.equalsIgnoreCase("premium")) {
                String trainerName = parts[3].trim();
                member = new PremiumMemberAnnouncer(memberId, monthlyFee, trainerName);
                sessionCount = Integer.parseInt(parts[4].trim());
            } else {
                member = new GymMemberAnnouncer(memberId, monthlyFee);
                sessionCount = Integer.parseInt(parts[3].trim());
            }
            for (int j = 0; j < sessionCount; j++) {
                member.attendSession();
            }
            members[i] = member;
        }
        String announcement = AttendanceAnnouncer.batchPrint(members);
        System.out.println(announcement);
        sc.close();
    }
}