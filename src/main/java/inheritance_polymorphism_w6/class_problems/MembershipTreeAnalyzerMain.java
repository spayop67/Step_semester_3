package inheritance_polymorphism_w6.class_problems;

import java.util.Scanner;
public class MembershipTreeAnalyzerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        LibraryMemberV2[] members = new LibraryMemberV2[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (general/student/honors/faculty), memberId, borrowLimit, extra field, borrowCount: ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String memberId = parts[1].trim();
            int borrowLimit = Integer.parseInt(parts[2].trim());
            LibraryMemberV2 member;
            if (type.equalsIgnoreCase("student")) {
                String course = parts[3].trim();
                member = new StudentMemberV2(memberId, borrowLimit, course);
            } else if (type.equalsIgnoreCase("honors")) {
                String course = parts[3].trim();
                int bonusLimit = Integer.parseInt(parts[4].trim());
                member = new HonorsStudentMember(memberId, borrowLimit, course, bonusLimit);
            } else if (type.equalsIgnoreCase("faculty")) {
                String department = parts[3].trim();
                member = new FacultyMember(memberId, borrowLimit, department);
            } else {
                member = new LibraryMemberV2(memberId, borrowLimit);
            }
            int borrowCount = Integer.parseInt(parts[parts.length - 1].trim());
            for (int j = 0; j < borrowCount; j++) {
                member.borrowBook();
            }
            members[i] = member;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(members[i].displayInfo());
        }
        for (int i = 0; i < n; i++) {
            System.out.println(MembershipTreeAnalyzer.classifyGeneration(members[i]));
        }
        System.out.println(MembershipTreeAnalyzer.getTotalBooksBorrowed(members));
        sc.close();
    }
}