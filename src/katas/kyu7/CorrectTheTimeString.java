package katas.kyu7;

public class CorrectTheTimeString {
    public static String timeCorrect(String timestring) {
        if (timestring == null || timestring.length() == 0) return timestring;
        if (!timestring.matches("^(?:(?:([0-9]{2}):)([0-9]{2}):)([0-9]{2})$")) return null;
        String[] array = timestring.split(":");

        array[1] = String.format("%02d", Integer.valueOf(array[1]) + (Integer.valueOf(array[2]) / 60));
        array[2] = String.format("%02d", Integer.valueOf(array[2]) % 60);
        array[0] = String.format("%02d", Integer.valueOf(array[0]) + (Integer.valueOf(array[1]) / 60));
        array[1] = String.format("%02d", Integer.valueOf(array[1]) % 60);
        array[0] = String.format("%02d", Integer.valueOf(array[0]) % 24);

        return String.join(":", array);
    }
}
