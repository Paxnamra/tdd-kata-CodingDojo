package bank_OCR_code;

public class ScanningMachine {

    private String digitZero = " _ " + "| |" + "|_|";
    private String digitOne = "   " + " | " + " | ";

    public String printInput(String number) {

        if (!number.isEmpty()) {
            if (Integer.parseInt(number) == 0) {
                return digitZero;
            } else if (Integer.parseInt(number) == 1) {
                return digitOne;
            }
        }
        return number;
    }
}

