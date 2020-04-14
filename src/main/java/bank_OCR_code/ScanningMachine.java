package bank_OCR_code;

public class ScanningMachine {

    private String digitZero = " _ " + "| |" + "|_|";
    private String digitOne = "   " + " | " + " | ";
    private String digitTwo = " __" + "__|" + "|__";

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
