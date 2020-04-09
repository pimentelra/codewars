package katas.kyu7;

import java.util.Arrays;

public class ConferenceTraveller {
    static String conferencePicker(String[] citiesVisited, String[] citiesOffered) {
        return Arrays.stream(citiesOffered).filter(c -> !Arrays.asList(citiesVisited).contains(c)).findFirst().orElse("No worthwhile conferences this year!");
    }
}
