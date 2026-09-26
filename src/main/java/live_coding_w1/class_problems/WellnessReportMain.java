package live_coding_w1.class_problems;

import java.util.Scanner;
public class WellnessReportMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        double[] heights = new double[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (m) and weight (kg) for person " + (i + 1) + " (comma separated): ");
            String[] parts = sc.nextLine().split(",");
            heights[i] = Double.parseDouble(parts[0].trim());
            weights[i] = Double.parseDouble(parts[1].trim());
        }
        WellnessReport.printWellnessReport(heights, weights);
        sc.close();
    }
}
