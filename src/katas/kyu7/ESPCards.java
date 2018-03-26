package katas.kyu7;

public class ESPCards {
    public static String nameTheShape(final char[][] card) {
        if (card[4][5] != ' ') return "square";
        if (card[2][10] != ' ') return "diamond";
        return "circle";
    }
}
