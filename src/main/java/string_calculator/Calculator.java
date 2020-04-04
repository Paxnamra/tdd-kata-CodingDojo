package string_calculator;

public class Calculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }

        if (input.matches("[0-9]")) {
            return Integer.parseInt(input);
        }

        String[] numbersString = input.split("\\,");
        return Integer.parseInt(numbersString[0]) + Integer.parseInt(numbersString[1]);
    }
}
