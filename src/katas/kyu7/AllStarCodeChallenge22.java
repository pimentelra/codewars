package katas.kyu7;

public class AllStarCodeChallenge22 {
  public static String toTime(int seconds) {
    return seconds / 3600 + " hour(s) and " + (seconds % 3600) / 60 + " minute(s)";
  }
}
