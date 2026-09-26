package abstraction_interface_w7.class_problems;

import java.util.Scanner;
public class DropOffLogMain {
    static void logAll(DeliveryNote[] notes) {
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i].confirmDelivery());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of notes: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        DeliveryNote[] notes = new DeliveryNote[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (parcel/letter) and trackingId (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            String type = parts[0].trim();
            String trackingId = parts[1].trim();
            if (type.equalsIgnoreCase("parcel")) {
                notes[i] = new ParcelNote(trackingId);
            } else {
                notes[i] = new LetterNote(trackingId);
            }
        }
        logAll(notes);
        sc.close();
    }
}