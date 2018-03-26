package katas.kyu7;

import java.util.regex.Pattern;

public class Kids80s5YouCantDoThatOnTelevision {
    public static String bucketOf(String said) {
        Pattern waterPattern = Pattern.compile("(water|wet|wash)");
        Pattern slimePattern = Pattern.compile("(i don't know|slime)");

        boolean water = waterPattern.matcher(said.toLowerCase()).find();
        boolean slime = slimePattern.matcher(said.toLowerCase()).find();

        if (water && slime) return "sludge";
        if (water) return "water";
        if (slime) return "slime";
        return "air";
    }
}
