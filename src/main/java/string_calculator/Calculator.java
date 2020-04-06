package string_calculator;

public class Calculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        String[] numbersString = input.split(",|\n");

        int result = 0;
        for (String number : numbersString) {
            result += Integer.parseInt(number);
        }
        return result;
    }
}
