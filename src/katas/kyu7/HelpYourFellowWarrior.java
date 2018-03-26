package katas.kyu7;

public class HelpYourFellowWarrior {
    public static String getHonorPath(int honorScore, int targetHonorScore) {
        if (targetHonorScore <= honorScore || honorScore < 0 || targetHonorScore < 0) return "";
        int diff = targetHonorScore - honorScore;
        int div2 = diff / 2;
        return "2kyus: " + (diff - div2 * 2) + ", 1kyus: " + div2;
    }
}
