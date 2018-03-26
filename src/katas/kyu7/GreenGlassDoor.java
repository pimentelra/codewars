package katas.kyu7;

import java.util.regex.Pattern;

public class GreenGlassDoor {
    boolean stepThroughWith(String s) {
        return Pattern.compile("(.)\\1").matcher(s).find();
    }
}
