package accessModifiers_encapsulation_w5.class_problems;

import java.util.Scanner;
public class CineScreenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seatsTotal: ");
        int seatsTotal = Integer.parseInt(sc.nextLine().trim());
        CineScreen screen;
        try {
            screen = new CineScreen(seatsTotal);
        } catch (IllegalArgumentException e) {
            System.out.println("Construction rejected");
            sc.close();
            return;
        }
        System.out.print("Enter number of operations: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter operation (book/cancel): ");
            String op = sc.nextLine().trim();
            if (op.equalsIgnoreCase("book")) {
                screen.bookSeat();
            } else if (op.equalsIgnoreCase("cancel")) {
                screen.cancelBooking();
            }
        }
        System.out.println(screen.getSeatsAvailable());
        sc.close();
    }
}