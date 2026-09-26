package live_coding_w1.class_problems;

public class RockPaperScissors {
    String playerMove;
    String computerMove;
    String result;
    RockPaperScissors(String playerMove, String computerMove) {
        this.playerMove = playerMove;
        this.computerMove = computerMove;
        this.result = playRound(playerMove, computerMove);
    }
    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";
        if ((playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))) return "Player Wins";
        return "Computer Wins";
    }
}