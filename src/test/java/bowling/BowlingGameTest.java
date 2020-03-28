package bowling;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingGameTest {

    BowlingGame bowlingGame = new BowlingGame();

    @Test
    void shouldScoreOneWhenNoRolls() {
        Assertions.assertThat(bowlingGame.score()).isEqualTo(0);
    }
}
