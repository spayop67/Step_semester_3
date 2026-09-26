package inheritance_polymorphism_w6.class_problems;

import java.util.Scanner;
public class CirculationAuditorP5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of members: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        LibraryMemberP5[] members = new LibraryMemberP5[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (faculty/regular/null), borrowLimit, department if faculty: ");
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("null")) {
                members[i] = null;
                continue;
            }
            String[] parts = line.split(",");
            String type = parts[0].trim();
            int borrowLimit = Integer.parseInt(parts[1].trim());
            if (type.equalsIgnoreCase("faculty")) {
                String department = parts[2].trim();
                members[i] = new FacultyMemberP5(borrowLimit, department);
            } else {
                members[i] = new LibraryMemberP5(borrowLimit);
            }
        }
        System.out.print("Enter a renewal code to validate: ");
        String code = sc.nextLine().trim();
        System.out.println(LibraryMemberP5.isValidRenewalCode(code));
        String result = CirculationAuditorP5.processNightlyAudit(members);
        System.out.println(result);
        sc.close();
    }
}