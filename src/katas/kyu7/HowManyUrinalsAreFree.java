package katas.kyu7;

import java.util.regex.Pattern;

public class HowManyUrinalsAreFree {
    public static int getFreeUrinals(String urinals) {
        return urinals.matches(".*1{2}.*") ? -1 : (int) Pattern.compile("(?<=(?:^|10)(?:0{2}){0,10})0(?=0|$)").matcher(urinals).results().count();
    }
}
