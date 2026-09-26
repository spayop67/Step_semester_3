package live_coding_w2.class_problems;

import java.util.Scanner;
public class PhoneNumberMaskerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of phone numbers: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter phone number: ");
            String phone = sc.nextLine().trim();
            String result = PhoneNumberMasker.maskPhoneNumber(phone);
            System.out.println(result);
        }
        sc.close();
    }
}