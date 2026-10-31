package linkedList_w11.assignment_problems;

import java.util.Scanner;
public class TeamSorterMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        Team[] teams = new Team[n];
        System.out.print("Enter teams in registration order, e.g. Pixel(4), Byte(2): ");
        String[] parts = sc.nextLine().split(",");
        for (int i = 0; i < n; i++) {
            String entry = parts[i].trim();
            int open = entry.indexOf('(');
            int close = entry.indexOf(')');
            String name = entry.substring(0, open).trim();
            int size = Integer.parseInt(entry.substring(open + 1, close).trim());
            teams[i] = new Team(name, size);
        }
        TeamSorter.sortTeams(teams);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < teams.length; i++) {
            sb.append(teams[i]);
            if (i != teams.length - 1) sb.append(", ");
        }
        System.out.println(sb);
        sc.close();
    }
}