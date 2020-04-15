package bank_OCR_code;

public class ScanningMachine {

    private String digitZero = " _ " + "\n| |" + "\n|_|";
    private String digitOne = "   " + "\n| " + "\n| ";
    private String digitTwo = "__ " + "\n__|" + "\n|__";
    private String digitThree = " __" + "\n__|" + "\n__|";

    public String printInput(String number) {

        if (!number.isEmpty()) {
            if (Integer.parseInt(number) == 0) {
                return digitZero;
            } else if (Integer.parseInt(number) == 1) {
                return digitOne;
            } else if (Integer.parseInt(number) == 2) {
                return digitTwo;
            } else if (Integer.parseInt((number)) == 3) {
                return digitThree;
            }
        }
        return number;
    }
}
