package katas.kyu7;

public class NumbersWithDOccurencesOfDigitD {
    public static boolean isDD(int n) {
        for (int i = 1; i <= 9; i++) {
            int temp = n;
            int occurrences = 0;
            while (temp > 0) {
                if (temp % 10 == i) occurrences++;
                temp /= 10;
            }
            if (occurrences == i) return true;
        }
        return false;
    }
}
