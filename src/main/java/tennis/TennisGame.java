package tennis;

public class TennisGame {

    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    public String getScore() {
        String scoreString = getScoreString(playerOneScore) + ", " + getScoreString(playerTwoScore);
        if (playerOneScore > 0 || playerTwoScore > 0) {
            return scoreString;
        }
        return "Love all";
    }

    public void playerOneScored() {
        playerOneScore++;
    }

    public void playerTwoScored() {
        playerTwoScore++;
    }

    private String getScoreString(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "";
        }
    }
}
