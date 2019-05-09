package katas.kyu6;

public class BuyingACar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        if (startPriceNew <= startPriceOld) return new int[]{0, startPriceOld - startPriceNew};
        double priceOld = startPriceOld, priceNew = startPriceNew, loss, money = 0;
        for (int i = 1; money < priceNew; i++) {
            loss = 0.01 * (percentLossByMonth + 0.5 * (i >> 1));
            priceNew = priceNew * (1 - loss);
            priceOld = priceOld * (1 - loss);
            money = priceOld + (savingperMonth * i);
            if (priceNew <= money) return new int[]{i, (int) Math.round(money - priceNew)};
        }
        return null;
    }
}
