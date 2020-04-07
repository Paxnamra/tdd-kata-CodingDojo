package name_inverter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class NameInverter {
    String invert(String name) {
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

    static String createInvertedString(List<String> splitName) {
        splitName.removeIf(n -> Arrays.asList("Pan", "Pani").contains(n));
        Collections.reverse(splitName);

        return String.join(", ", splitName);
    }

    static boolean isEmptyOrSpaces(String name) {
        return name.trim().isEmpty();
    }
}

