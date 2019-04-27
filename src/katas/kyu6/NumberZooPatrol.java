package katas.kyu6;

public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {
        int len = numbers.length; int total = (int) (0.5 * (len + 1) * (len + 2));
        for (int i = 0; i < len; i++) total -= numbers[i];
        return total;
    }
}
