package katas.kyu7;

public class ANTISTRING {
    public static String antiString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray())
            sb.append((char) (c < 'A' ? '9' + '0' - c : c < 'a' ? 'Z' + 'a' - c : 'z' + 'A' - c));
        return sb.reverse().toString();
    }
}
