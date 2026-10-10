package DS_w10.assignments_problems;

import java.util.Scanner;
public class TurnCircleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TurnCircle circle = new TurnCircle();
        System.out.print("Enter players (comma separated): ");
        String[] players = sc.nextLine().split(",");
        for (int i = 0; i < players.length; i++) {
            circle.addLast(players[i].trim());
        }
        System.out.print("Enter number of turns: ");
        int turns = Integer.parseInt(sc.nextLine().trim());
        System.out.println(circle.printTurns(turns));
        sc.close();
    }
}