package bank_OCR_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ScanningMachineTest {

    private ScanningMachine scanningMachine;

    @BeforeEach
    void setup() {
        scanningMachine = new ScanningMachine();
    }

    @Test
    void printInput_emptyString_returnEmptyString() {
        scanningMachine.printInput("");
        assertThat(scanningMachine.printInput("")).isEqualTo("");
    }

    @Test
    void printInput_integerZero_stringSingleDigitZeroCode() {
        scanningMachine.printInput("0");
        assertThat(scanningMachine.printInput("0")).isEqualTo(
                " _ " +
                        "\n| |" +
                        "\n|_|");
    }

    @Test
    void printInput_integerOne_stringSingleDigitOneCode() {
        scanningMachine.printInput("1");
        assertThat(scanningMachine.printInput("1")).isEqualTo(
                "   " +
                        "\n| " +
                        "\n| ");
    }

    @Test
    void printInput_integerTwo_stringSingleDigitTwoCode() {
        scanningMachine.printInput("2");
        assertThat(scanningMachine.printInput("2")).isEqualTo(
                "__ " +
                        "\n__|" +
                        "\n|__");
    }

    @Test
    void printInput_integerThree_stringSingleDigitThreeCode() {
        scanningMachine.printInput("3");
        assertThat(scanningMachine.printInput("3")).isEqualTo(
                " __" +
                        "\n__|" +
                        "\n__|");
    }

    @Test
    void printInput_integerTwelve_stringMultiDigitTwelveCode() {
        scanningMachine.printInput("12");
        assertThat(scanningMachine.printInput("12")).isEqualTo(
                 "   " + "__ " +
          "\n" + " | " + "__|" +
          "\n" + " | " + "|__");
    }
}

