package katas.kyu7;

import java.text.DecimalFormat;

public class SumOfTheFirstNthTermOfSeries {
    public static String seriesSum(int n) {
        DecimalFormat df = new DecimalFormat("###.00");
        double total, aux = total = 0.0;
        for (int i = 0; i < n; i++) {
            if (i == 0) aux = 1;
            if (i == 1) aux = 4;
            if (i > 1) aux += 3;
            total += (1 / aux);
        }
        return "" + df.format(total);
    }
}
