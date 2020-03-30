package bowling;

public class BowlingGame {

    private int rollMark = 0;
    private int[] rolls = new int[21];

    public int getScore() {
        int score = 0;
        int cursor = 0;

        for (int i = 0; i < 10; i++) {
            if (rolls[cursor] == 10) {
                score += 10 + rolls[cursor + 1 ] + rolls[cursor + 2];
                cursor++;
            }
            else if (isSpare(cursor)) {
                score += 10 + rolls[cursor + 2];
                cursor += 2;
            } else {
                score += rolls[cursor] + rolls[cursor + 1];
                cursor += 2;
            }
        }
        return score;
    }

    public void roll(int pins) {
        rolls[rollMark++] = pins;
    }

    private boolean isSpare(int cursor) {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }
}
