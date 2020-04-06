package string_calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldReturnZeroWhenGotEmptyString() {
        int result = calculator.add("");
        assertThat(result).isEqualTo(0);
    }

    @Test
    void shouldReturnNumberWhenGivenNumber() {
        int result = calculator.add("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void shouldAddTwoNumbersSeparatedWithComma() {
        int result = calculator.add("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void shouldAddThreeNumbersSeparatedWithComma() {
        int result = calculator.add("1,2,3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void shouldAddThreeNumbersSeparatedWithCommaAndNewLine() {
        int result = calculator.add("1,2\n4");
        assertThat(result).isEqualTo(7);
    }

    @Test
    void shouldThrowExceptionWhenNegativeNumberProvided() {
        Assertions.assertThrows(NegativeNumberException.class, () ->  {
            calculator.add("-1");
        });
    }
}
