package string_calculator;

public class Calculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        String[] numbersString = input.split(",|\n");

        int result = 0;
        for (String number : numbersString) {
            if (Integer.parseInt(number) < 0) {
                throw new NegativeNumberException();
            }
            result += Integer.parseInt(number);
        }
        return result;
    }
}
