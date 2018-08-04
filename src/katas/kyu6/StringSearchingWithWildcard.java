package katas.kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSearchingWithWildcard {
    static int find(String needle, String haystack) {
        Matcher matcher = Pattern.compile(needle.replaceAll("([^\\p{Alnum}_])", "\\\\$1").replaceAll("_", ".")).matcher(haystack);
        return matcher.find() ? matcher.start() : -1;
    }
}
