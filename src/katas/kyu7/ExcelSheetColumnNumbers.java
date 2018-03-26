package katas.kyu7;

public class ExcelSheetColumnNumbers {
    public static long titleToNumber(String title) {
        long answer = 0;
        for (int i = title.length() - 1; i >= 0; i--) {
            answer += (Math.abs('A' - title.charAt(i)) + 1) * (Math.pow(26, Math.abs(title.length() - 1 - i)));
        }
        return answer;
    }
}
