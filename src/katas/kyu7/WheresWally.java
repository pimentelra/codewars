package katas.kyu7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WheresWally {
    public static int wheresWally(String str) {
        int answer = -1;
        Pattern p = Pattern.compile("(?<![.',;:\\-\\+])\\bWally\\b");
        Matcher m = p.matcher(str);
        if (m.find()) {
            answer = m.start();
        }
        return answer;
    }
}
