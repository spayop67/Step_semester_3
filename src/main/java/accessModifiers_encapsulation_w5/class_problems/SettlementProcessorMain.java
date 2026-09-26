package accessModifiers_encapsulation_w5.class_problems;

import java.util.Scanner;
public class SettlementProcessorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of receipts: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        BookingReceipt[] receipts = new BookingReceipt[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (group/individual/null), bookingId, seats (semicolon separated), groupSize if group: ");
            String line = sc.nextLine().trim();
            if (line.equalsIgnoreCase("null")) {
                receipts[i] = null;
                continue;
            }
            String[] parts = line.split(",");
            String type = parts[0].trim();
            String bookingId = parts[1].trim();
            String[] seats = parts[2].trim().split(";");
            if (type.equalsIgnoreCase("group")) {
                int groupSize = Integer.parseInt(parts[3].trim());
                receipts[i] = new GroupBookingReceipt(bookingId, seats, groupSize);
            } else {
                receipts[i] = new BookingReceipt(bookingId, seats);
            }
        }
        String result = SettlementProcessor.processNightlySettlement(receipts);
        System.out.println(result);
        sc.close();
    }
}