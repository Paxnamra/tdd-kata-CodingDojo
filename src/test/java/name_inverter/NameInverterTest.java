package name_inverter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NameInverterTest {
    private static final String EMPTY_STRING = "";
    private NameInverter nameInverter;

    @BeforeEach
    void setUp() {
        nameInverter = new NameInverter();
    }

    @Test
    void shouldThrowExceptionWhenNullProvided() {
        Assertions.assertThrows(NullPointerException.class, () -> nameInverter.invert(null));
    }

    @Test
    void shouldReturnEmptyStringWhenEmptyStringProvided() {
        String inverted = nameInverter.invert("");
        assertThat(inverted).isEqualTo(EMPTY_STRING);
    }

    @Test
    void shouldReturnEmptyStringWhenSpacesGiven() {
        String inverted = nameInverter.invert("  ");
        assertThat(inverted).isEqualTo(EMPTY_STRING);
    }

    @Test
    void shouldReturnInvertedFirstAndLastName() {
        String inverted = nameInverter.invert("Jan Kowalski");
        assertThat(inverted).isEqualTo("Kowalski, Jan");
    }
}
