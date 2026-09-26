package inheritance_polymorphism_w6.class_problems;

import java.util.Scanner;
public class BatchEnrollerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of memberIds: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] memberIds = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter memberId: ");
            memberIds[i] = sc.nextLine();
        }
        System.out.print("Enter borrowLimit: ");
        int borrowLimit = Integer.parseInt(sc.nextLine().trim());
        String result = BatchEnroller.enrollBatch(memberIds, borrowLimit);
        System.out.println(result);
        sc.close();
    }
}