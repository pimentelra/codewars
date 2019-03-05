package katas.kyu7;

import java.util.stream.IntStream;

public class Quicksum {
    public int quicksum(String packet) {
        if (packet.length() != packet.replaceAll("[^A-Z ]", "").length()) return 0;
        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return IntStream.rangeClosed(1, packet.length()).map(i -> i * alphabet.indexOf(packet.charAt(i - 1))).sum();
    }
}
