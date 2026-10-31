package linkedList_w11.assignment_problems;

public class LeaderboardSorter {
    static Entry[] leaderboard(Entry[] entries) {
        int[] count = new int[101];
        for (int i = 0; i < entries.length; i++) {
            count[100 - entries[i].marks]++;
        }
        for (int k = 1; k < count.length; k++) {
            count[k] += count[k - 1];
        }
        Entry[] output = new Entry[entries.length];
        for (int i = entries.length - 1; i >= 0; i--) {
            int key = 100 - entries[i].marks;
            count[key]--;
            output[count[key]] = entries[i];
        }
        return output;
    }
}