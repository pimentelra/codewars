package katas.kyu7;

public class HerosRoot {
    public static long IntRac(long n, long guess) {
        long count = 1;
        long newGuess = (guess + n / guess) / 2;
        while (!(Math.abs(guess - newGuess) < 1)) {
            guess = newGuess;
            newGuess = (newGuess + n / newGuess) / 2;
            count++;
        }
        ;
        return count;
    }
}
