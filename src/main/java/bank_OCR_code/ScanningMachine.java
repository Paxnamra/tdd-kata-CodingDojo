package bank_OCR_code;

public class ScanningMachine {

    private String digitOne = "   " + " | " + " | ";

    public String printInput(int number) {
        if (number == 1) {
            return digitOne;
        }
        return "";
    }
}

