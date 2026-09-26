package live_coding_w1.class_problems;

import java.util.Scanner;
public class PalindromeCheckerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings to check: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter text: ");
            String text = sc.nextLine().trim();
            boolean iterative = PalindromeChecker.isPalindromeIterative(text);
            boolean recursive = PalindromeChecker.isPalindromeRecursive(text);
            boolean arrayReversal = PalindromeChecker.isPalindromeArrayReversal(text);
            String r1 = iterative ? "Palindrome" : "Not Palindrome";
            String r2 = recursive ? "Palindrome" : "Not Palindrome";
            String r3 = arrayReversal ? "Palindrome" : "Not Palindrome";
            System.out.println("Iterative: " + r1 + " | Recursive: " + r2 + " | Array Reversal: " + r3);
        }
        sc.close();
    }
}