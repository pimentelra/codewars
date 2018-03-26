package katas.kyu7;

import java.util.List;

public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int total, j = total = 0;
        for (int i = binary.size() - 1; i >= 0; i--, j++) {
            total += (binary.get(i) * Math.pow(2, j));
        }
        return total;
    }
}
