package tennis;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TennisGameTest {

    TennisGame game = new TennisGame();

    @Test
    void gameShouldStartWithZeroScore() {
        Assertions.assertThat(game.getScore()).isEqualTo("Love all");
    }
}
