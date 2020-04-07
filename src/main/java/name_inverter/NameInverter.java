package name_inverter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NameInverter {
    public String invert(String name) {
        if (StringHelper.isEmptyOrSpaces(name)) {
            return "";
        }
        List<String> splitName = splitName(name);
        return StringHelper.createInvertedString(splitName);
    }

    private ArrayList<String> splitName(String name) {
        return new ArrayList<>(Arrays.asList(name.split(" ")));
    }
}

class StringHelper {

    public static String createInvertedString(List<String> splitName) {
        splitName.removeIf(n -> Arrays.asList("Pan", "Pani").contains(n));
        Collections.reverse(splitName);

        return String.join(", ", splitName);
    }

    public static boolean isEmptyOrSpaces(String name) {
        return name.trim().isEmpty();
    }
}

