package katas.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BinaryToTextASCIIConversion {
    public static String binaryToText(String binary) {
        return binary.isEmpty() ? "" : Arrays.stream(binary.split("(?<=\\G\\d{8})")).map(b -> (char) Integer.parseInt(b, 2) + "").collect(Collectors.joining(""));
    }
}
