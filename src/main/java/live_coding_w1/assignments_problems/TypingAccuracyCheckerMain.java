package live_coding_w1.assignments_problems;

import java.util.Scanner;
public class TypingAccuracyCheckerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter original passage: ");
            String original = sc.nextLine();
            System.out.print("Enter typed text: ");
            String typed = sc.nextLine();
            TypingAccuracyChecker.checkTypingAccuracy(original, typed);
        }
        sc.close();
    }
}