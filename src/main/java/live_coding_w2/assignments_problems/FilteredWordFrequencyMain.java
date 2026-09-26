package live_coding_w2.assignments_problems;

import java.util.Scanner;
public class FilteredWordFrequencyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of paragraphs: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter feedback: ");
            String feedback = sc.nextLine();
            FilteredWordFrequency.printFilteredWordFrequency(feedback);
        }
        sc.close();
    }
}