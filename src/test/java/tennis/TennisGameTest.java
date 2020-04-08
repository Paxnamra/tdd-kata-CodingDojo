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
    void gameShouldReturnScoreAfterFirstPoints() {
        game.playerOneScored();
        Assertions.assertThat(game.getScore()).isEqualTo("Fifteen, Love");
    }
}
