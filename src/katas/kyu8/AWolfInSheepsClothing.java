package katas.kyu8;

import java.util.stream.IntStream;

public class AWolfInSheepsClothing {
    public static String warnTheSheep(String[] array) {
        int s = IntStream.range(0, array.length).filter(i -> array[array.length - 1 - i].equals("wolf")).findFirst().getAsInt();
        return s == 0 ? "Pls go away and stop eating my sheep" : "Oi! Sheep number " + s + "! You are about to be eaten by a wolf!";
    }
}
