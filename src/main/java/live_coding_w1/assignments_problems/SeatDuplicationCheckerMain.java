package live_coding_w1.assignments_problems;

import java.util.Scanner;
public class SeatDuplicationCheckerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seats: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] seatNumbers = new int[n];
        System.out.print("Enter seat numbers (comma separated): ");
        String[] parts = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            seatNumbers[i] = Integer.parseInt(parts[i].trim());
        }
        SeatDuplicationChecker.checkDuplicateSeats(seatNumbers);
        sc.close();
    }
}