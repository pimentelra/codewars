package katas.kyu6;

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
        int[] bills = new int[2];
        for (int i : peopleInLine) {
            switch (i) {
                case 25:
                    bills[0] += 1;
                    break;
                case 50:
                    bills[1] += 1;
                    bills[0] -= 1;
                    break;
                case 100:
                    if (bills[1] > 0) {
                        bills[1] -= 1;
                        bills[0] -= 1;
                    } else {
                        bills[0] -= 3;
                    }
            }
            if (bills[0] < 0 || bills[1] < 0) return "NO";
        }
        return "YES";
    }
}
