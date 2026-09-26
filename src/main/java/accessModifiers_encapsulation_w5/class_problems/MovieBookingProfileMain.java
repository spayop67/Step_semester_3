package accessModifiers_encapsulation_w5.class_problems;

import java.util.Scanner;
public class MovieBookingProfileMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine().trim();
        MovieBookingProfile p = new MovieBookingProfile(name);
        System.out.println(p.getName());
        System.out.print("Enter confirmed (true/false): ");
        boolean confirmed = Boolean.parseBoolean(sc.nextLine().trim());
        p.setConfirmed(confirmed);
        System.out.println(p.isConfirmed());
        System.out.print("Enter otp: ");
        String otp = sc.nextLine().trim();
        p.setOtp(otp);
        sc.close();
    }
}