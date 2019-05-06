package katas.kyu6;

public class FLAMESGameVersion1 {
    public static String showRelationship(String male, String female) {
        String[] flames = new String[]{"Siblings", "Friendship", "Love", "Affection", "Marriage", "Enemies"};
        String common = male.replaceAll(female.length() == 0 ? "" : String.format("[^%s]", female), "");
        int index = (male.replaceAll(common.length() == 0 ? "" : String.format("[%s]", common), "").length() +
                female.replaceAll(common.length() == 0 ? "" : String.format("[%s]", common), "").length()) % flames.length;
        return flames[index];
    }
}
