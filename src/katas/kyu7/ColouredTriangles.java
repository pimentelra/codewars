package katas.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ColouredTriangles {
    public static char triangle(String row) {
        String currentRow = row;
        while (currentRow.length() > 1) {
            currentRow = nextRow(currentRow);
        }
        return currentRow.charAt(0);
    }

    private static String nextRow(String currentRow) {
        return IntStream.range(0, currentRow.length() - 1)
                .mapToObj(i -> nextColour(currentRow.charAt(i), currentRow.charAt(i + 1)))
                .collect(Collectors.joining());
    }

    private static String nextColour(char left, char right) {
        if (left == right) return String.valueOf(left);
        if ((left == 'G' && right == 'B') || (left == 'B' && right == 'G')) return String.valueOf('R');
        if ((left == 'R' && right == 'B') || (left == 'B' && right == 'R')) return String.valueOf('G');
        return String.valueOf('B');
    }
}
