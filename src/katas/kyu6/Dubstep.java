package katas.kyu6;

public class Dubstep {
    public static String SongDecoder(String song) {
        return song.replace("WUB", " ").replaceAll("\\s{2,}", " ").trim();
    }
}
