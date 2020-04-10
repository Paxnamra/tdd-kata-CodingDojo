package tennis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TennisGameTest {

    private TennisGame game;

    @BeforeEach
    void setUp() {
        game = new TennisGame();
    }

    @Test
    void gameShouldStartWithZeroScore() {
        Assertions.assertThat(game.getScore()).isEqualTo("Love all");
    }

    @Test
    void gameShouldReturnScoreAfterFirstPointsPlayerOne() {
        game.playerOneScored();
        Assertions.assertThat(game.getScore()).isEqualTo("Fifteen, Love");
    }

    @Test
    void gameShouldReturnScoreAfterFirstPointsPlayerTwo() {
        game.playerTwoScored();
        Assertions.assertThat(game.getScore()).isEqualTo("Love, Fifteen");
    }

    @Test
    void gameShouldReturnScoreAfterPlayerTwoScoresTwice() {
        game.playerTwoScored();
        game.playerTwoScored();
        Assertions.assertThat(game.getScore()).isEqualTo("Love, Thirty");
    }

    @Test
    void gameShouldReturnScoreAfterPlayerTwoScoresTriple() {
        game.playerTwoScored();
        game.playerTwoScored();
        game.playerTwoScored();
        Assertions.assertThat(game.getScore()).isEqualTo("Love, Forty");
    }
    @Test
    void gameShouldReturnScoreAfterPlayerOneScoresOnceAndPlayerTwoScoresThreeTimes() {
        game.playerOneScored();
        game.playerTwoScored();
        game.playerTwoScored();
        game.playerTwoScored();
        Assertions.assertThat(game.getScore()).isEqualTo("Fifteen, Forty");
    }
}
