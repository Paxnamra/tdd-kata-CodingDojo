package string_calculator;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void shouldReturnZeroWhenGotEmptyString() {
        Calculator calculator = new Calculator();

        int result = calculator.add("");
        assertThat(result).isEqualTo(0);
    }
}
