package katas.kyu7;

public class ThinkingTestingIncompleteString {
    public static String testIncompleteString(String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            String temp = s.length() > i + 2 ? s.substring(i, i + 2) : s.substring(i);
            int first = temp.charAt(0);
            if (temp.length() < 2) {
                answer.append(String.valueOf((char) first));
                continue;
            }
            int second = temp.charAt(1);
            int distance = Math.abs(second - first) / 2;
            int i1 = second > first ? first + distance : second + distance;
            answer.append(String.valueOf((char) i1));
        }
        return answer.toString();
    }
}
