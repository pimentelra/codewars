package katas.kyu7;

public class NicknameGenerator {
    public static String nickname(String name) {
        return name.length() < 4 ? "Error: Name too short" : "aeiou".contains(name.substring(2, 3)) ? name.substring(0, 4) : name.substring(0, 3);
    }
}
