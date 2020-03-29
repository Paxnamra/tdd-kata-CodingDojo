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
        rollAll(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(bowlingGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScore20WhenPinDown20Times() {
        rollAll(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        assertThat(bowlingGame.getScore()).isEqualTo(20);
    }

    @Test
    void shouldScoreSpare() {
        rollAll(5, 5, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(bowlingGame.getScore()).isEqualTo(18);
    }

    @Test
    void shouldScoreStrike() {
        rollAll(10, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        assertThat(bowlingGame.getScore()).isEqualTo(26);
    }

    private void rollAll(int... pins) {
        for (int pin : pins) {
            bowlingGame.roll(pin);
        }
    }

    private void roll(int throwsNumber, int pins) {
        for (int i = 0; i < throwsNumber; i++) {
            bowlingGame.roll(pins);
        }
    }
}
