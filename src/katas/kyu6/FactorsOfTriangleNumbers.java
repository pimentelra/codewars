package katas.kyu6;

public class FactorsOfTriangleNumbers {
    public static int calculate(int n) {
        int i = 1;
        for (; ; i++) {
            int number = (i * (i + 1)) / 2;
            int count = 0;
            for (int j = 1; j <= Math.sqrt(number); j++) {
                if (number % j == 0) if (number / j == j) count++;
                else count = count + 2;
            }
            if (count > n) return number;
        }
    }
}
