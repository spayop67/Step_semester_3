package abstraction_interface_w7.assgnments_problems;

import java.util.Scanner;
public class ClassroomSetupMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter assetTag: ");
        String assetTag = sc.nextLine().trim();
        Tablet t = new Tablet(assetTag);
        System.out.println(t.operate());
        System.out.println(t.charge());
        System.out.print("Enter charge minutes: ");
        int minutes = Integer.parseInt(sc.nextLine().trim());
        System.out.println(t.charge(minutes));
        sc.close();
    }
}