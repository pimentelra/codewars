package katas.kyu8;

import java.util.Arrays;

public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple) {
        if (triple == null || triple.length != 3) return 0;
        Arrays.sort(triple);
        return Math.pow(triple[2], 2) == Math.pow(triple[0], 2) + Math.pow(triple[1], 2) ? 1 : 0;
    }
}
