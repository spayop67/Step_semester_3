package live_coding_w1.class_problems;

import java.util.Scanner;
public class CustomerNameReverserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter customer name: ");
            String customerName = sc.nextLine().trim();
            String reversed = CustomerNameReverser.reverseCustomerName(customerName);
            System.out.println("Original Name: " + customerName);
            System.out.println("Reversed Name: " + reversed);
        }
        sc.close();
    }
}