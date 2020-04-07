package name_inverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        return String.format("%s, %s", splitName.get(1), splitName.get(0));
    }

    public static boolean isEmptyOrSpaces(String name) {
        return name.trim().isEmpty();
    }
}

