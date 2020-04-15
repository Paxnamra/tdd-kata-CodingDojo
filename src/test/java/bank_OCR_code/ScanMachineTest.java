package bank_OCR_code;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScanMachineTest {

    private ScanningMachine scanningMachine = new ScanningMachine();

    @Test
    void should_Print_Empty_String_When_No_Digits_Given() {
        scanningMachine.printInput("");
        assertThat(scanningMachine.printInput("")).isEqualTo("");
    }

    @Test
    void should_Print_String_Digit_Zero() {
        scanningMachine.printInput("0");
        assertThat(scanningMachine.printInput("0")).isEqualTo(
                " _ " +
                "\n| |" +
                "\n|_|");
    }

    @Test
    void should_Print_String_Digit_One() {
        scanningMachine.printInput("1");
        assertThat(scanningMachine.printInput("1")).isEqualTo(
                "   " +
                "\n| " +
                "\n| ");
    }

    @Test
    void should_Print_String_Digit_Two() {
        scanningMachine.printInput("2");
        assertThat(scanningMachine.printInput("2")).isEqualTo(
                "__ " +
                "\n__|" +
                "\n|__");
    }

    @Test
    void should_Print_String_Digit_Three() {
        scanningMachine.printInput("3");
        assertThat(scanningMachine.printInput("3")).isEqualTo(
                " __" +
                "\n__|" +
                "\n__|");
    }
}

