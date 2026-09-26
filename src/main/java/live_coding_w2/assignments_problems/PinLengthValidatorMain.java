package live_coding_w2.assignments_problems;

import java.util.Scanner;
public class PinLengthValidatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of PINs: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter PIN: ");
            String pin = sc.nextLine().trim();
            PinLengthValidator.checkPinLength(pin);
        }
        sc.close();
    }
}