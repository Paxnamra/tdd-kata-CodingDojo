package bowling;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    BowlingGame bowlingGame = new BowlingGame();

    @Test
    void shouldScoreOneWhenNoRolls() {
        assertThat(bowlingGame.getScore()).isEqualTo(0);
    }

    @Test
    void shouldScoreOneWhenRolledOne() {
        bowlingGame.roll(1);
        assertThat(bowlingGame.getScore()).isEqualTo(1);
    }
}
