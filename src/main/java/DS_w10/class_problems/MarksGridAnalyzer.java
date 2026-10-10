package DS_w10.class_problems;

import java.util.ArrayList;
public class MarksGridAnalyzer {
    static int[] computeTotals(ArrayList<int[]> marks) {
        int[] totals = new int[marks.size()];
        for (int i = 0; i < marks.size(); i++) {
            int[] row = marks.get(i);
            for (int j = 0; j < row.length; j++) {
                totals[i] += row[j];
            }
        }
        return totals;
    }
    static double[] computeSubjectAverages(ArrayList<int[]> marks, int subjects) {
        double[] averages = new double[subjects];
        for (int j = 0; j < subjects; j++) {
            int sum = 0;
            for (int i = 0; i < marks.size(); i++) {
                sum += marks.get(i)[j];
            }
            averages[j] = (double) sum / marks.size();
        }
        return averages;
    }
    static int findTopperIndex(int[] totals) {
        int best = 0;
        for (int i = 1; i < totals.length; i++) {
            if (totals[i] > totals[best]) {
                best = i;
            }
        }
        return best;
    }
}