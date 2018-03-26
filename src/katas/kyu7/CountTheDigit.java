package katas.kyu7;

public class CountTheDigit {
    public static int nbDig(int n, int d) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            long temp = i * i;
            if (temp == 0 && temp == d) total++;
            while (temp != 0) {
                long k = temp % 10;
                temp = temp / 10;
                if (k == d) {
                    total++;
                }
            }
        }
        return total;
    }
}
