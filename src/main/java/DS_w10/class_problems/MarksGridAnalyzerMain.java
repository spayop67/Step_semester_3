package DS_w10.class_problems;

import java.util.ArrayList;
import java.util.Scanner;
public class MarksGridAnalyzerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<int[]> marks = new ArrayList<>();
        final int SUBJECTS = 3;
        System.out.println("Enter students (blank line to finish):");
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            int open = line.indexOf('[');
            int close = line.indexOf(']');
            String name = line.substring(0, open).trim();
            String[] parts = line.substring(open + 1, close).split(",");
            int[] row = new int[SUBJECTS];
            for (int j = 0; j < SUBJECTS; j++) {
                row[j] = Integer.parseInt(parts[j].trim());
            }
            names.add(name);
            marks.add(row);
        }
        int[] totals = MarksGridAnalyzer.computeTotals(marks);
        double[] averages = MarksGridAnalyzer.computeSubjectAverages(marks, SUBJECTS);
        int topper = MarksGridAnalyzer.findTopperIndex(totals);

        StringBuilder sb = new StringBuilder("Totals ");
        for (int i = 0; i < names.size(); i++) {
            sb.append(names.get(i)).append(" ").append(totals[i]);
            if (i != names.size() - 1) sb.append(", ");
        }
        System.out.println(sb);

        StringBuilder avg = new StringBuilder("averages ");
        for (int j = 0; j < SUBJECTS; j++) {
            avg.append(String.format("%.2f", averages[j]));
            if (j != SUBJECTS - 1) avg.append(", ");
        }
        System.out.println(avg);

        System.out.println("topper " + names.get(topper) + " " + totals[topper]);
        sc.close();
    }
}