package katas.kyu7;

import java.util.Arrays;

public class SwapPairsInArray {
    public Object[][][] swapp(Object[][] input) {
        Object[][] output = Arrays.stream(input).map(Object[]::clone).toArray($ -> input.clone());
        Arrays.stream(output).forEach(oe -> {
            Object temp = oe[0];
            oe[0] = oe[1];
            oe[1] = temp;
        });
        return new Object[][][]{input, output};
    }
}
