package katas.kyu7;

import java.util.stream.IntStream;

public class ShadesOfGrey254 {
    static String[] shadesOfGrey(int num) {
        num = Math.min(num, 254);
        if (num < 0) return new String[0];
        String[] answer = new String[num];
        IntStream.range(0, num).forEach(i -> {
            answer[i] = "#" + String.format("%02x%<02x%<02x", i + 1);
        });
        return answer;
    }
}
