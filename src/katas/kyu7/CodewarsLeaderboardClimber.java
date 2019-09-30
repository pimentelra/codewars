package katas.kyu7;

public class CodewarsLeaderboardClimber {
    public static String leaderBoard(String user, int userScore, int yourScore) {
        int beta = (userScore - yourScore) / 3, kyu8 = (userScore - yourScore) % 3;
        return userScore < yourScore ? "Winning!" :
               userScore == yourScore ? "Only need one!" :
               String.format("To beat %s's score, I must complete %d Beta kata and %d 8kyu kata.%s", user, beta, kyu8, beta + kyu8 > 1000 ? " Dammit!" : "");
    }
}
