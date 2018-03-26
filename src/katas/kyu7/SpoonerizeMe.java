package katas.kyu7;

public class SpoonerizeMe {
    public static String spoonerize(String words) {
        String[] array = words.split(" ");
        return array[1].substring(0, 1) + array[0].substring(1) + " " + array[0].substring(0, 1) + array[1].substring(1);
    }
}
