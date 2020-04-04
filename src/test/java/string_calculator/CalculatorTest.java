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

    @Test
    void shouldReturnNumberWhenGivenNumber() {
        Calculator calculator = new Calculator();

        int result = calculator.add("1");
        assertThat(result).isEqualTo(1);
    }
}
