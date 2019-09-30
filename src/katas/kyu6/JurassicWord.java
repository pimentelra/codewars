package katas.kyu6;

import java.util.Arrays;

public class JurassicWord {
    public static String lunchTime(String scene) {
        String dino = whichDino(new StringBuilder(scene).reverse().substring(3, 8)), something = "Something";

        if (scene.matches("_C.*C}>"))
            return (Arrays.asList("velociraptor", "T-Rex").contains(dino) ? "A " + dino : something) + " is eating a dead dino.";
        else if (scene.matches("iii.*iii"))
            return (Arrays.asList("brachiosaurus", "triceratops").contains(dino) ? "A " + dino : something) + " is eating flowers.";
        else if (scene.matches("\\|\\|\\|.*\\|\\|\\|"))
            return (Arrays.asList("brachiosaurus").contains(dino) ? "A " + dino : something) + " is eating leaves.";
        return (Arrays.asList("brachiosaurus", "triceratops", "velociraptor", "T-Rex").contains(dino) ? "A " + dino : something) + " is eating something.";
    }

    private static String whichDino(String dino) {
        switch (dino) {
            case "uuuuu": return "brachiosaurus";
            case "uuVuu": return "triceratops";
            case "VvvvV": return "T-Rex";
            case "vvvvv": return "velociraptor";
            default: return null;
        }
    }
}
