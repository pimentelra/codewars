package katas.kyu7;

public class Cogs2 {
    public static double[] cogRpm(final int[] cogs, final int n) {
        return new double[]{((n + 1) % 2 == 0 ? -1 : 1) * cogs[n] / (double) cogs[0], ((cogs.length - n) % 2 == 0 ? -1 : 1) * cogs[n] / (double) cogs[cogs.length - 1]};
    }
}
