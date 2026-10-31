package linkedList_w11.assignment_problems;

public class TeamSorter {
    static void sortTeams(Team[] teams) {
        for (int i = 1; i < teams.length; i++) {
            Team key = teams[i];
            int j = i - 1;
            while (j >= 0 && teams[j].size > key.size) {
                teams[j + 1] = teams[j];
                j--;
            }
            teams[j + 1] = key;
        }
    }
}