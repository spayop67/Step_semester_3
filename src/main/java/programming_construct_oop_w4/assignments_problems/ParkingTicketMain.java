import java.util.Scanner;
public class ParkingTicketMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tickets: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        String[] vehicleNos = new String[n];
        double[] ratePerMinute = new double[n];
        int[] overstayMinutes = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter vehicleNo, ratePerMinute, overstayMinutes (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            vehicleNos[i] = parts[0].trim();
            ratePerMinute[i] = Double.parseDouble(parts[1].trim());
            overstayMinutes[i] = Integer.parseInt(parts[2].trim());
        }
        ParkingTicket[] tickets = new ParkingTicket[n];
        for (int i = 0; i < n; i++) {
            tickets[i] = new ParkingTicket(vehicleNos[i], ratePerMinute[i]);
        }
        for (int i = 0; i < n; i++) {
            if (overstayMinutes[i] > 0) {
                tickets[i].printReceipt(overstayMinutes[i]);
            } else {
                System.out.println(vehicleNos[i] + " - No fine, within allotted time");
            }
        }
        sc.close();
    }
}