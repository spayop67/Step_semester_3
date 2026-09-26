package accessModifiers_encapsulation_w5.class_problems;

import java.util.Scanner;
public class AccessCheckerV2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of attempts: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        String[][] attempts = new String[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter fieldModifier and accessorContext (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            attempts[i][0] = parts[0].trim();
            attempts[i][1] = parts[1].trim();
        }
        for (int i = 0; i < n; i++) {
            String result = AccessCheckerV2.classifyAccess(attempts[i][0], attempts[i][1]);
            System.out.println(attempts[i][0] + " | " + attempts[i][1] + " -> " + result);
        }
        String summary = AccessCheckerV2.summarizeBatch(attempts);
        System.out.println(summary);
        sc.close();
    }
}