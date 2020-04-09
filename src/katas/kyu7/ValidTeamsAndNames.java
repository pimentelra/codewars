package katas.kyu7;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ValidTeamsAndNames {
    public static String validate(String s) {
        return Pattern.compile("[A-Z]:[A-Z][a-z]+,").matcher(s).results().count() + ":" + String.join(",", Arrays.stream(s.split("[A-Z]:")).filter(t -> t.contains(",")).toArray(String[]::new));
    }
}
