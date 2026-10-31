package linkedList_w11.assignment_problems;

import java.util.Scanner;
public class LeaderboardSorterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of entries: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Entry[] entries = new Entry[n];
        System.out.print("Enter entries in submission order, e.g. Asha 90, Ravi 75: ");
        String[] parts = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            String[] fields = parts[i].trim().split("\\s+");
            entries[i] = new Entry(fields[0], Integer.parseInt(fields[1]));
        }
        Entry[] sorted = LeaderboardSorter.leaderboard(entries);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sorted.length; i++) {
            sb.append(sorted[i]);
            if (i != sorted.length - 1) sb.append(", ");
        }
        System.out.println(sb);
        sc.close();
    }
}