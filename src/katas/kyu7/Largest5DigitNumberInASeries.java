package katas.kyu7;

public class Largest5DigitNumberInASeries {
    public static int solve(final String digits) {
        if (digits.length() <= 5) return Integer.parseInt(digits);
        int answer = 0;
        for (int i = 0; i < digits.length() - 4; i++) {
            answer = Math.max(answer, Integer.parseInt(digits.substring(i, i + 5)));
        }
        return answer;
    }
}
