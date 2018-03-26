package katas.kyu8;

public class FuelCalculator {
    public static double fuelPrice(int litres, double pricePerLiter) {
        double price = Math.round(litres * pricePerLiter * 100) / 100.;

        double discount = 0;

        if(litres > 10){
            discount = 0.25 * litres;
        } else {
            discount = (litres / 2) * 0.05 * litres;
        }
        discount = Math.round(discount * 100) / 100.;

        return Math.round((price - discount) * 100) / 100.;
    }
}
