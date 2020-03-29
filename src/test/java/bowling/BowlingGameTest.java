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

    @Test
    void shouldStrikeMasterStrike() {
        rollAll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10);
        assertThat(bowlingGame.getScore()).isEqualTo(300);
    }

    private void rollAll(int... pins) {
        for (int pin : pins) {
            bowlingGame.roll(pin);
        }
    }
}
