package inheritance_polymorphism_w6.assignemts_problems;

import java.util.Scanner;
public class GymSignupProcessorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of memberIds: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] memberIds = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter memberId: ");
            memberIds[i] = sc.nextLine();
        }
        System.out.print("Enter monthlyFee: ");
        int monthlyFee = Integer.parseInt(sc.nextLine().trim());
        String result = GymSignupProcessor.signUpBatch(memberIds, monthlyFee);
        System.out.println(result);
        sc.close();
    }
}