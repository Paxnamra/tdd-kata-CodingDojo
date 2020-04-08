package tennis;

public class TennisGame {

    private int playerOneScore = 0;

    public String getScore() {
        if (playerOneScore == 1) {
            return "Fifteen, Love";
        }
        return "Love all";
    }

    public void playerOneScored() {
        playerOneScore++;
    }
}
