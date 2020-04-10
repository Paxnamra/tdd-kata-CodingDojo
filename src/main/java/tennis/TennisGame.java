package tennis;

public class TennisGame {

    private int playerOneScore = 0;
    private int playerTwoScore = 0;

    private String playerOneName = "Radwańska";
    private String playerTwoName = "Janowicz";

    public String getScore() {
        if (isDeuce()) {
            return "Deuce";
        }

        if (isAfterDeuce()) {
            if (isAdvantagePlayerOne()) {
                return "Advantage " + playerTwoName;
            }
            return "Advantage " + playerOneName;
        }

        if (playerOneScore > 3) {
            return "Game won by " + playerOneName;
        } else if (playerTwoScore > 3){
            return "Game won by " + playerTwoName;
        }
        if (playerOneScore > 0 || playerTwoScore > 0) {
            return buildResultString();
        }
        return "Love all";
    }

    private boolean isDeuce() {
        return playerOneScore == 3 && playerTwoScore == playerOneScore;
    }

    private boolean isAfterDeuce() {
        return playerOneScore >= 3 && playerTwoScore >= 3;
    }

    private boolean isAdvantagePlayerOne() {
        return playerTwoScore - playerOneScore == 1;
    }

    private String buildResultString() {
        return getScoreString(playerOneScore) + ", " + getScoreString(playerTwoScore);
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
            case 3:
                return "Forty";
            default:
                return "";
        }
    }
}
