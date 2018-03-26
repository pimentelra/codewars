package katas.kyu7;

public class TheFirstNonRepeatedCharacterInAString {
    public static Character firstNonRepeated(String source) {
        for (int i = 0; i < source.length(); i++) {
            if (source.replaceAll("[^" + source.substring(i, i + 1) + "]", "").length() == 1) {
                return source.charAt(i);
            }
        }
        return source.charAt(0);
    }
}
