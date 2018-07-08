package katas.kyu7;

public class SmoothNumbers {
    public static String isSmooth(long n) {
        long maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2)
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }

        if (n > 2) maxPrime = n;

        switch ((int) maxPrime) {
            case 2: return "power of 2";
            case 3: return "3-smooth";
            case 5: return "Hamming number";
            case 7: return "humble numbers";
            default: return "non-smooth";
        }
    }
}
