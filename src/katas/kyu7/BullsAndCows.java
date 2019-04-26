package katas.kyu7;

import java.util.stream.IntStream;

public class BullsAndCows {
    private int secret;
    private int tries = 0;
    private boolean won = false;

    public BullsAndCows(int n) {
        if (!isValidNumber(n)) throw new IllegalArgumentException();
        this.secret = n;
    }

    public String compareWith(int n) {
        if (won) return "You already won!";
        if (++tries > 8) return "Sorry, you're out of turns!";
        if (!isValidNumber(n)) {
            tries--;
            throw new IllegalArgumentException();
        }
        if (n == secret) {
            won = true;
            return "You win!";
        }
        int[] matches = matching(secret, n);
        return String.format("%s bull%s and %s cow%s", matches[0], matches[0] == 1 ? "" : "s", matches[1], matches[1] == 1 ? "" : "s");
    }

    private boolean isValidNumber(int number) {
        return String.valueOf(number).length() == String.valueOf(number).chars().distinct().count() && number > 999 && number < 10000;
    }

    private int[] matching(int secret, int n) {
        int[] matches = new int[2];
        String secretS = String.valueOf(secret), nS = String.valueOf(n);

        IntStream.range(0, nS.length()).filter(i -> secretS.replace(nS.charAt(i) + "", "").length() != secretS.length())
                .forEach(i -> {
                    matches[1]++;
                    if (secretS.charAt(i) == nS.charAt(i)) {
                        matches[0]++;
                        matches[1]--;
                    }
                });
        return matches;
    }
}
