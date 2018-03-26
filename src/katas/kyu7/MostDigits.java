package katas.kyu7;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        int answer = numbers[0];
        for (int number : numbers) {
            if (String.valueOf(Math.abs(number)).length() > String.valueOf(Math.abs(answer)).length()) answer = number;
        }
        return answer;
    }
}
