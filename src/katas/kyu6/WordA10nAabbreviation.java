package katas.kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordA10nAabbreviation {
    public String abbreviate(String string) {
        Pattern p = Pattern.compile("(\\p{L}{4,})");
        Matcher m = p.matcher(string);

        while (m.find()) {
            String word = m.group();
            String a10n = "" + word.charAt(0) + (word.length() - 2) + word.charAt(word.length() - 1);
            string = string.replaceFirst(word, a10n);
        }

        return string;
    }
}
