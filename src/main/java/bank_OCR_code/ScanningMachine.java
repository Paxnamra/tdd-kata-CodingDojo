package bank_OCR_code;

public class ScanningMachine {

    private String digitOne = "   " + " | " + " | ";
    private String digitZero = " _ " + "| |" + "|_|";

    public String printInput(int number) {
        if (number == 1) {
            return digitOne;
        } else if (number == 0) {
            return digitZero;
        }
        return "";
    }
}

