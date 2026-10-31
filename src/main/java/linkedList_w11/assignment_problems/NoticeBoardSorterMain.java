package linkedList_w11.assignment_problems;

import java.util.Scanner;
public class NoticeBoardSorterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of scores: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] scores = new int[n];
        System.out.print("Enter scores (comma separated): ");
        String[] parts = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            scores[i] = Integer.parseInt(parts[i].trim());
        }
        int[] stats = NoticeBoardSorter.bubbleStats(scores);
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < scores.length; i++) {
            sb.append(scores[i]);
            if (i != scores.length - 1) sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb + " passes = " + stats[0] + ", swaps = " + stats[1]);
        sc.close();
    }
}