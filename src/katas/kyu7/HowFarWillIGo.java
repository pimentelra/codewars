package katas.kyu7;

public class HowFarWillIGo {
    public static int travel(int totalTime, int runTime, int restTime, int speed) {
        int cycles = totalTime / (runTime + restTime);
        int remain = (totalTime - cycles * (runTime + restTime)) >= runTime ? runTime : (totalTime - cycles * (runTime + restTime));

        return speed * (cycles * runTime + remain);
    }
}
