package katas.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class DecodeTheMorseCode {
    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.split(" ")).map(code -> (!code.equals("")) ? MorseCode.get(code) : " ").collect(Collectors.joining()).replace("  ", " ").trim();
    }
}
