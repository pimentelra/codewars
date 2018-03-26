package katas.kyu7;

public class HelpSuzukiRakeHisGarden {
    public static String rakeGarden(String garden) {
        return garden.replaceAll("\\b(?!(rock|gravel)\\b)\\w+", "gravel");
    }
}
