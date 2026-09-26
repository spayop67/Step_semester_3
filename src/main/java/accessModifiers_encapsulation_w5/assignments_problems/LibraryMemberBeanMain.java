package accessModifiers_encapsulation_w5.assignments_problems;

import java.util.Scanner;
public class LibraryMemberBeanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryMemberBean m = new LibraryMemberBean();
        System.out.print("Enter membershipId: ");
        m.setMembershipId(sc.nextLine().trim());
        System.out.print("Enter name: ");
        m.setName(sc.nextLine().trim());
        System.out.print("Enter premiumMember (true/false): ");
        m.setPremiumMember(Boolean.parseBoolean(sc.nextLine().trim()));
        System.out.println(m.getMembershipId());
        System.out.print("Enter another membershipId attempt (should be ignored): ");
        m.setMembershipId(sc.nextLine().trim());
        System.out.println(m.getMembershipId());
        System.out.println(m.isPremiumMember());
        System.out.print("Enter securityAnswer: ");
        m.setSecurityAnswer(sc.nextLine().trim());
        sc.close();
    }
}