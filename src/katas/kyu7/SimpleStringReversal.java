package katas.kyu7;

public class SimpleStringReversal {
    public static String solve(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = s.length() - 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') sb.append(' ');
            else {
                while (s.charAt(j) == ' ') j--;
                sb.append(s.charAt(j));
                j--;
            }
        }
        return sb.toString();
    }
}
