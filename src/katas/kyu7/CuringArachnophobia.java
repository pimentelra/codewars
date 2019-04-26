package katas.kyu7;

public class CuringArachnophobia {
    public static String drawSpider(int legSize, int bodySize, char mouth, char eye) {
        String[] leg = new String[]{"╱╲", "^", "/\\", "/╲", "╱\\"};
        return String.format("%s%s%s%s%s%s%s", leg[legSize % 4], "(".repeat(bodySize), String.valueOf(eye).repeat((int) Math.pow(2, bodySize) / 2), mouth, String.valueOf(eye).repeat((int) Math.pow(2, bodySize) / 2), ")".repeat(bodySize), leg[legSize == 3 ? 4 : legSize % 4]);
    }
}
