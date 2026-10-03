import InnerClasses_UMLdiagrams_w8.class_problems.PaymentProcessor;

import java.util.Scanner;
public class PaymentProcessorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        FeeAccount1[] accounts = new FeeAccount1[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (hostel/day) and regNo (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String regNo = parts[1].trim();
            if (type.equalsIgnoreCase("hostel")) {
                accounts[i] = new HostelFeeAccount(regNo);
            } else {
                accounts[i] = new FeeAccount1(regNo);
            }
        }
        System.out.print("Enter payment amount: ");
        double amount = Double.parseDouble(sc.nextLine().trim());
        PaymentProcessor processor = new PaymentProcessor();
        for (int i = 0; i < n; i++) {
            processor.processPayment(accounts[i], amount);
        }
        processor.printCounts();
        sc.close();
    }
}