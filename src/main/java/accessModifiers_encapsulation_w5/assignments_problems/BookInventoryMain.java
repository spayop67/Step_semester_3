package accessModifiers_encapsulation_w5.assignments_problems;

import java.util.Scanner;
public class BookInventoryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter copiesTotal: ");
        int copiesTotal = Integer.parseInt(sc.nextLine().trim());
        BookInventory b = new BookInventory(copiesTotal);
        System.out.print("Enter number of operations: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation (checkout/checkin): ");
            String op = sc.nextLine().trim();
            if (op.equalsIgnoreCase("checkout")) {
                b.checkOut();
            } else if (op.equalsIgnoreCase("checkin")) {
                b.checkIn();
            }
        }
        System.out.println(b.getCopiesAvailable());
        sc.close();
    }
}