package katas.kyu8;

public class ThinkfulLogicDrillsTrafficLight {
    public static String updateLight(String current) {
        return current.equals("red") ? "green" : current.equals("green") ? "yellow" : "red";
    }
}
