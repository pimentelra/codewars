package katas.kyu7;

public class StringInterlacing {
    public static String interlace(final String first, final String second) {
        StringBuilder result = new StringBuilder();
        String before = first.replaceAll(" ", "").length() >= second.replaceAll(" ", "").length() ? first.replaceAll(" ", "") : second.replaceAll(" ", "");
        String after = first.replaceAll(" ", "").length() >= second.replaceAll(" ", "").length() ? second.replaceAll(" ", "") : first.replaceAll(" ", "");

        for (int i = 0; i < before.length(); i++) {
            result.append(before.substring(i, i + 1));
            result.append(after.substring(i % after.length(), i % after.length() + 1));
        }
        return result.toString();
    }
}
