package katas.kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IfYouCantSleepJustCountSheeps {
    public static String countingSheep(int num) {
        return IntStream.rangeClosed(1, num).mapToObj(i -> i + " sheep...").collect(Collectors.joining());
    }
}
