package string_calculator;

public class Calculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        if (isSingleNumber(input)) {
            return Integer.parseInt(input);
        }

        String[] numbersString = input.split("\\,");

        int result = 0;
        for (String number : numbersString) {
            result += Integer.parseInt(number);
        }
        return result;
    }

    private boolean isSingleNumber(String input) {
        return input.matches("[0-9]");
    }
}
