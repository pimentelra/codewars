package katas.kyu8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String newString = "";
        for (int i = 0; i < repeat; i++) {
            newString += string;
        }
        return newString;
    }
}
