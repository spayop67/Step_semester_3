package live_coding_w2.assignments_problems;

import java.util.Scanner;
public class IsbnCodeValidatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of codes: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter raw code: ");
            String raw = sc.nextLine();
            String normalized = IsbnCodeValidator.normalizeCode(raw);
            String result = IsbnCodeValidator.validateAndFormat(normalized);
            System.out.println(result);
        }
        sc.close();
    }
}