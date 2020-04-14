package bank_OCR_code;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ScanMachineTest {

    private ScanningMachine scanningMachine = new ScanningMachine();

    @Test
    void should_Print_Empty_String_When_No_Digits_Given() {
        scanningMachine.printInput(0);
        assertThat(scanningMachine.printInput(0)).isEqualTo("");
    }

    @Test
    void should_Print_String_Digit_One() {
        scanningMachine.printInput(1);
        assertThat(scanningMachine.printInput(1)).isEqualTo("   " +
                                                           " | " +
                                                           " | ");
    }
}

