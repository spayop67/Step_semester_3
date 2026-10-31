package linkedList_w11.assignment_problems;

public class NoticeBoardSorter {
    static int[] bubbleStats(int[] scores) {
        int passes = 0;
        int swaps = 0;
        for (int i = 0; i < scores.length - 1; i++) {
            passes++;
            boolean swapped = false;
            for (int j = 0; j < scores.length - 1 - i; j++) {
                if (scores[j] > scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                    swaps++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return new int[]{passes, swaps};
    }
}