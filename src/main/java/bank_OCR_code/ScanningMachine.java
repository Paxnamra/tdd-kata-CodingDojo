package bank_OCR_code;

import java.util.Arrays;

public class ScanningMachine {

    private String digitZero = " _ " + "\n| |" + "\n|_|";
    private String digitOne = "   " + "\n| " + "\n| ";
    private String digitTwo = "__ " + "\n__|" + "\n|__";

    public String printInput(String number) {

        if (!number.isEmpty()) {
            if (Integer.parseInt(number) == 0) {
                return digitZero;
            } else if (Integer.parseInt(number) == 1) {
                return digitOne;
            } else if (Integer.parseInt(number) == 2) {
                return digitTwo;
            }
        }
        return number;
    }
}
