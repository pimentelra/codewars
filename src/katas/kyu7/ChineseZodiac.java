package katas.kyu7;

public class ChineseZodiac {
    public static String chineseZodiac(int year) {
        String[] element = new String[]{"Wood", "Fire", "Earth", "Metal", "Water"};
        String[] animal = new String[]{"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};

        return element[(Math.abs(year - 1924) / 2) % 5] + " " + animal[Math.abs(year - 1924) % 12];
    }
}
