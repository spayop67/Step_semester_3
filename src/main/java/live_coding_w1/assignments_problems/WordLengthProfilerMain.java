package live_coding_w1.assignments_problems;

import java.util.Scanner;
public class WordLengthProfilerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of reviews: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter review: ");
            String review = sc.nextLine().trim();
            WordLengthProfiler.classifyWordLengths(review);
        }
        sc.close();
    }
}