package live_coding_w1.assignments_problems;

import java.util.Scanner;
public class TrafficStreakAnalyzerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of signal logs: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter signal log: ");
            String signalLog = sc.nextLine().trim();
            TrafficStreakAnalyzer.findLongestStreak(signalLog);
        }
        sc.close();
    }
}