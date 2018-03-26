package katas.kyu7;

import java.util.Arrays;
import java.util.Collections;

public class Kids80s2HelpALFFindHisSpaceship {
    public static String findSpaceship(String map) {
        String[] array = map.split("\\n");
        Collections.reverse(Arrays.asList(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if (array[i].charAt(j) == 'X')
                    return "[" + j + ", " + i + "]";
            }
        }

        return "Spaceship lost forever.";
    }
}
