package katas.kyu7;

public class PizzaPayments {
    public static double michaelPays(double cost) {
        return cost < 5 ? Math.round(cost * 100.) / 100. : cost >= 30 ? Math.round((cost - 10) * 100.) / 100. : Math.round(cost * 200. / 3.) / 100.0;
    }
}
