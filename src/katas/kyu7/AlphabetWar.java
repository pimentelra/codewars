package katas.kyu7;

import java.util.Map;
import java.util.stream.IntStream;

public class AlphabetWar {
    public static String alphabetWar(String fight) {
        Map<Character, Integer> war = Map.of('w', -4, 'p', -3, 'b', -2, 's', -1, 'm', 4, 'q', 3, 'd', 2, 'z', 1);
        int result = IntStream.range(0, fight.length()).map(fight::charAt).map(c -> war.getOrDefault((char) c, 0)).sum();
        return result < 0 ? "Left side wins!" : result > 0 ? "Right side wins!" : "Let's fight again!";
    }
}
