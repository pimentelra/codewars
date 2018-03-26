package katas.kyu7;

import java.util.ArrayList;
import java.util.List;

public class Mumbling {
    public static String accum(String s) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                temp.append((j == 0) ? s.substring(i, i + 1).toUpperCase() : s.substring(i, i + 1).toLowerCase());
            }
            answer.add(temp.toString());
        }
        return String.join("-", answer);
    }
}
