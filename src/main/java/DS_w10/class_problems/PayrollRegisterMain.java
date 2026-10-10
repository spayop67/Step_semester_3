package DS_w10.class_problems;

import java.util.ArrayList;
import java.util.Scanner;
public class PayrollRegisterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StaffMember> staff = new ArrayList<>();
        System.out.println("Enter staff (blank line to finish):");
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] parts = line.split("\\s+");
            String type = parts[0];
            String name = parts[1];
            if (type.equalsIgnoreCase("FullTime")) {
                staff.add(new FullTimeStaff(name, Integer.parseInt(parts[2])));
            } else if (type.equalsIgnoreCase("PartTime")) {
                staff.add(new PartTimeStaff(name, Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
            } else if (type.equalsIgnoreCase("Intern")) {
                staff.add(new InternStaff(name, Integer.parseInt(parts[2])));
            }
        }
        int total = 0;
        int topIndex = 0;
        for (int i = 0; i < staff.size(); i++) {
            System.out.println(staff.get(i));
            int pay = staff.get(i).calculatePay();
            total += pay;
            if (pay > staff.get(topIndex).calculatePay()) {
                topIndex = i;
            }
        }
        if (!staff.isEmpty()) {
            System.out.println("Total " + total);
            System.out.println("top earner " + staff.get(topIndex).getName());
        }
        sc.close();
    }
}