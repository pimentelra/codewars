package katas.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParseBankAccountNumber {
    public static long parse(final String acctNbr) {
        String[] key = new String[]{" _ | ||_|", "     |  |", " _  _||_ ", " _  _| _|", "   |_|  |",
                " _ |_  _|", " _ |_ |_|", " _   |  |", " _ |_||_|", " _ |_| _|"};
        String[] l = acctNbr.replaceAll("\n", "").split("(?<=\\G...)");
        String[] n = IntStream.range(0, l.length / 3).mapToObj(i -> l[i] + l[l.length / 3 + i] + l[2 * l.length / 3 + i]).toArray(String[]::new);
        return Long.parseLong(Arrays.stream(n).map(w -> "" + IntStream.range(0, 11).filter(i -> key[i].equals(w)).findFirst().getAsInt()).collect(Collectors.joining()));
    }
}
