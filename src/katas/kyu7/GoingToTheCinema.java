package katas.kyu7;

public class GoingToTheCinema {
    public static int movie(int card, int ticket, double perc) {
        double priceA = ticket;
        double priceB = card + ticket * perc;
        int count = 1;
        while (Math.ceil(priceB) >= priceA) {
            count++;
            priceA = ticket * count;
            priceB += ticket * Math.pow(perc, count);
        }
        return count;
    }
}
