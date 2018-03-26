package katas.kyu7;

public class SumOfNumbersFrom0ToN {
    public static String showSequence(int value) {
        if (value == 0) return "0=0";
        if (value < 0) return value + "<0";

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < value; i++) {
            answer.append(i).append("+");
        }
        answer.append(value).append(" = ").append((value * (value + 1)) / 2);

        return answer.toString();
    }
}
