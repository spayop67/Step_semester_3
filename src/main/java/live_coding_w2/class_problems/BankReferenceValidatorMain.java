package live_coding_w2.class_problems;

import java.util.Scanner;
public class BankReferenceValidatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of references: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter raw reference: ");
            String raw = sc.nextLine();
            String normalized = BankReferenceValidator.normalizeReference(raw);
            String result = BankReferenceValidator.validateAndFormat(normalized);
            System.out.println(result);
        }
        sc.close();
    }
}