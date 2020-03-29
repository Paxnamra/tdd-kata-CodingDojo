package bowling;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    private BowlingGame bowlingGame;

    @BeforeEach
    void setUp() {
        bowlingGame = new BowlingGame();
    }

    @Test
    void shouldScoreOneWhenNoRolls() {
        assertThat(bowlingGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScore0WhenNoPinDown20Times() {
        roll(20, 0);
        assertThat(bowlingGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScore20WhenPinDown20Times() {
        roll(20, 1);
        assertThat(bowlingGame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldScoreSpare() {
        roll(2, 5);
        roll(1, 4);
        roll(17, 0);
        assertThat(bowlingGame.getScore()).isEqualTo(18);
    }

    @Test
    void shouldScoreStrike() {
        roll(1, 10);
        roll(2, 4);
        roll(16, 0);

        assertThat(bowlingGame.getScore()).isEqualTo(26);
    }

    private void roll(int throwsNumber, int pins) {
        for (int i = 0; i < throwsNumber; i++) {
            bowlingGame.roll(pins);
        }
    }
}
