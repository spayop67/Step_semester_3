package accessModifiers_encapsulation_w5.assignments_problems;

import java.util.Scanner;
public class AccessCheckerV3Main {
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
            String result = AccessCheckerV3.classifyAccess(attempts[i][0], attempts[i][1]);
            System.out.println(attempts[i][0] + " | " + attempts[i][1] + " -> " + result);
        }
        String summary = AccessCheckerV3.summarizeByModifier(attempts);
        System.out.println(summary);
        sc.close();
    }
}