package tennis;

public class TennisGame {

    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public String getScore() {
        if (playerOneScore == 1) {
            return "Fifteen, Love";
        } else if (playerOneScore == 0 && playerTwoScore == 1) {
            return "Love, Fifteen";
        }
        return "Love all";
    }

    public void playerOneScored() {
        playerOneScore++;
    }

    public void playerTwoScored() {
        playerTwoScore++;
    }
}
