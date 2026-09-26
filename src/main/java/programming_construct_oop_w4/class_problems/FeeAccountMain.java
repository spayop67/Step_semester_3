package programming_construct_oop_w4.class_problems;

import java.util.Scanner;
public class FeeAccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        FeeAccount[] accounts = new FeeAccount[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter regNo, totalFee, daysLate (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String regNo = parts[0].trim();
            double totalFee = Double.parseDouble(parts[1].trim());
            int daysLate = Integer.parseInt(parts[2].trim());
            accounts[i] = new FeeAccount(regNo, totalFee, daysLate);
        }
        for (int i = 0; i < n; i++) {
            accounts[i].printSummary(accounts[i].daysLate);
        }
        sc.close();
    }
}{
}
