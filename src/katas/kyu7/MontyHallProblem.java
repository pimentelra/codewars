package katas.kyu7;

import java.util.stream.IntStream;

public class MontyHallProblem {
    public int montyHallCase(int door, int[] guesses) {
        return Math.round(IntStream.range(0, guesses.length).filter(i -> guesses[i] != door).count() * 100 / guesses.length);
    }
}
