package katas.kyu7;

public class ReplaceEveryNth {
    public static String replaceNth(String text, int n, char oldValue, char newValue) {
        if (n < 1) return text;
        StringBuilder answer = new StringBuilder();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
            if (text.charAt(i) == oldValue) {
                count++;
                if (count >= n && count % n == 0) temp = newValue;
            }
            answer.append(temp);
        }
        return answer.toString();
    }
}
