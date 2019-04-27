package katas.kyu6;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        String who = names.length == 0 ? "no one" : names.length > 3 ? String.join(", ", names[0], names[1], (names.length - 2) + " others") : String.join(", ", names);
        return String.format("%s like%s this", who, names.length < 2 ? "s" : "").replaceFirst(",(?!.*,)", " and");
    }
}
