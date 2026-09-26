package live_coding_w1.class_problems;

import java.util.Scanner;
import java.util.Random;
public class RockPaperScissorsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};
        System.out.print("Enter number of rounds: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        RockPaperScissors[] rounds = new RockPaperScissors[n];
        int wins = 0, losses = 0, draws = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Round " + (i + 1) + " - Enter your move (Rock/Paper/Scissors): ");
            String playerMove = sc.nextLine().trim();
            String computerMove = moves[rand.nextInt(3)];
            rounds[i] = new RockPaperScissors(playerMove, computerMove);
            System.out.println("Computer chose: " + computerMove + " -> " + rounds[i].result);
            if (rounds[i].result.equals("Player Wins")) wins++;
            else if (rounds[i].result.equals("Computer Wins")) losses++;
            else draws++;
        }
        System.out.println("Round | Player Move | Computer Move | Result");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " | " + rounds[i].playerMove + " | " + rounds[i].computerMove + " | " + rounds[i].result);
        }
        double winPercent = (wins * 100.0) / n;
        System.out.println("Final Summary (after " + n + " rounds)");
        System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws + " | Win % = " + winPercent + "%");
        sc.close();
    }
}