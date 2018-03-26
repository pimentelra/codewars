package katas.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThinkingTestingSomethingCapitalized {
    public static String testSomethingCapitalized(String s) {
        Matcher m = Pattern.compile("[a-z](?![a-z])").matcher(s);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, m.group().toUpperCase());
        }
        m.appendTail(sb);
        return sb.toString();
    }
}
