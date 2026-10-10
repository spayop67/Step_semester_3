package DS_w10.class_problems;

import java.util.HashSet;
import java.util.Scanner;
public class ClubRegistrationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<ClubMember> members = new HashSet<>();
        boolean countPrinted = false;
        System.out.println("Enter operations (blank line to finish):");
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] parts = line.split("\\s+");
            String command = parts[0];
            String rollNumber = parts[1];
            String name = parts.length > 2 ? parts[2] : "";
            ClubMember member = new ClubMember(rollNumber, name);
            if (command.equalsIgnoreCase("ADD")) {
                if (members.add(member)) {
                    System.out.println("Added");
                } else {
                    System.out.println("duplicate rejected");
                }
            } else if (command.equalsIgnoreCase("CONTAINS")) {
                if (!countPrinted) {
                    System.out.println("member count " + members.size());
                    countPrinted = true;
                }
                System.out.println("contains: " + members.contains(member));
            }
        }
        if (!countPrinted) {
            System.out.println("member count " + members.size());
        }
        sc.close();
    }
}