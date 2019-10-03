package katas.kyu6;

import java.util.stream.IntStream;

public class CalculateStringRotation {
    static int shiftedDiff(String f, String s) {
        return IntStream.range(0, f.length()).filter(i -> (f.substring(f.length() - i) + f.substring(0, f.length() - i)).equals(s)).findFirst().orElse(-1);
    }
}
