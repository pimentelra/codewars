package katas.kyu6;

import java.util.*;
import java.util.stream.*;

public class L3375p34k {
}

class Leetspeak extends Encoder {
    static {
        dict.put("a", "4");
        dict.put("e", "3");
        dict.put("l", "1");
        dict.put("m", "/^^\\");
        dict.put("o", "0");
        dict.put("u", "(_)");
    }

    public String encode(String source) {
        return source == null ? "" : IntStream.range(0, source.length())
                .mapToObj(i -> dict.getOrDefault(String.valueOf(source.charAt(i)).toLowerCase(), String.valueOf(source.charAt(i))))
                .collect(Collectors.joining());
    }
}

abstract class Encoder {
    static Map<String, String> dict = new HashMap<>();
    public abstract String encode(String source);
}
