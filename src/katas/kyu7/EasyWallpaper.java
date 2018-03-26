package katas.kyu7;

public class EasyWallpaper {
    public String wallpaper(double l, double w, double h) {
        String[] answer = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        if (l * w * h == 0) return answer[0];
        return answer[(int) Math.ceil((((2 * l * h) + (2 * w * h)) * 1.15) / 5.2)];
    }
}
