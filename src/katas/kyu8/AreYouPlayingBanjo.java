package katas.kyu8;

public class AreYouPlayingBanjo {
    public static String areYouPlayingBanjo(String name) {
        return name + " " + (name.toLowerCase().charAt(0) == 'r' ? "plays" : "does not play") + " banjo";
    }
}
