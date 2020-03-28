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

    private void roll(int throwsNumber, int pins) {
        for (int i = pins; i <= throwsNumber; i++) {
            bowlingGame.roll(pins);
        }
    }
}
