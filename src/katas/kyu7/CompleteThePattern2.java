package katas.kyu7;

public class CompleteThePattern2 {
    public static String pattern(int n) {
        if (n < 1) return "";
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                answer.append(j);
            }
            if (i != n) {
                answer.append("\n");
            }
        }
        return answer.toString();
    }
}
