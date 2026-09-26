package inheritance_polymorphism_w6.class_problems;

import java.util.Scanner;
public class CirculationReportBuilderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        LibraryMemberReport[] members = new LibraryMemberReport[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (general/student), memberId, borrowLimit, course if student, borrowCount: ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String memberId = parts[1].trim();
            int borrowLimit = Integer.parseInt(parts[2].trim());
            LibraryMemberReport member;
            int borrowCount;
            if (type.equalsIgnoreCase("student")) {
                String course = parts[3].trim();
                member = new StudentMemberReport(memberId, borrowLimit, course);
                borrowCount = Integer.parseInt(parts[4].trim());
            } else {
                member = new LibraryMemberReport(memberId, borrowLimit);
                borrowCount = Integer.parseInt(parts[3].trim());
            }
            for (int j = 0; j < borrowCount; j++) {
                member.borrowBook();
            }
            members[i] = member;
        }
        String report = CirculationReportBuilder.batchPrint(members);
        System.out.println(report);
        sc.close();
    }
}