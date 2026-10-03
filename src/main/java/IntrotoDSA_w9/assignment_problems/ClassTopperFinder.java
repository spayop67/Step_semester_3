package IntrotoDSA_w9.assignment_problems;

public class ClassTopperFinder {
    static int[] findTopper(int[][] marks) {
        int bestRow = 0;
        int bestTotal = 0;
        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            if (i == 0 || total > bestTotal) {
                bestTotal = total;
                bestRow = i;
            }
        }
        return new int[]{bestRow, bestTotal};
    }
}