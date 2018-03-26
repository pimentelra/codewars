package katas.kyu7;

public class InsertDashes {
    public static String insertDash(int num) {
        String numberString = String.valueOf(num);
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < numberString.length(); i++) {
            answer.append(numberString.substring(i - 1, i));
            if (Integer.parseInt(numberString.substring(i - 1, i)) % 2 != 0 && Integer.parseInt(numberString.substring(i, i + 1)) % 2 != 0)
                answer.append("-");
        }
        answer.append(numberString.substring(numberString.length() - 1));
        return answer.toString();
    }
}
