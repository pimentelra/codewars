package katas.kyu7;

public class UltimateArrayReverser {
    public static String[] reverse(String[] a) {
        String all = new StringBuilder(String.join("", a)).reverse().toString(), answer[] = new String[a.length];
        int len = a.length, from = 0, to = 0;
        for (int i = 0; i < len; i++) {
            to += a[i].length();
            answer[i] = all.substring(from, to);
            from += a[i].length();
        }
        return answer;
    }
}
