package katas.kyu7;

public class ReverseWords {
    public static String reverseWords(final String original) {
        StringBuilder answer = new StringBuilder(), temp = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; i--)
            if (original.charAt(i) == ' ') {
                answer = new StringBuilder().append(" ").append(temp.toString()).append(answer);
                temp = new StringBuilder();
            } else temp.append(original.charAt(i));
        return temp.append(answer).toString();
    }
}
