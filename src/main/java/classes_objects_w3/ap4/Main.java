package classes_objects_w3.ap4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial seat number: ");
        int initial = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter new seat number (set via copy): ");
        int updated = Integer.parseInt(sc.nextLine().trim());
        HallTicket priya = new HallTicket(name, initial);
        HallTicket copy = priya;
        copy.seatNumber = updated;
        HallTicket separate = new HallTicket(name, updated);
        System.out.println(name + "'s seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));
        System.out.println("separate == priya: " + (separate == priya));
        sc.close();
    }
}