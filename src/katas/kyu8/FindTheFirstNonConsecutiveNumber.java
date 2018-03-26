package katas.kyu8;

public class FindTheFirstNonConsecutiveNumber {
    public static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] - array[i - 1] != 1) {
                return array[i];
            }
        }
        return null;
    }
}
