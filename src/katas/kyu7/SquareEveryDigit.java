package katas.kyu7;

public class SquareEveryDigit {
    public int squareDigits(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = n; i > 0; i /= 10) {
            answer.insert(0, String.valueOf((int) Math.pow(i % 10, 2)));
        }
        return Integer.parseInt(answer.toString());
    }
}
