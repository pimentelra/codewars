package katas.kyu8;

import java.util.Arrays;

public class FindTheForceOfGravityBetweenTwoObjects {
    public static double solution(double[] arrVal, String[] arrUnit) {
        double g = 6.67 * Math.pow(10, -11);
        double m[] = new double[]{arrVal[0], arrVal[1]}, d = arrVal[2];

        for (int i = 0; i < 2; i++) {
            switch (arrUnit[i]) {
                case "g": m[i] = arrVal[i] * 0.001; break;
                case "mg": m[i] = arrVal[i] * 0.000001; break;
                case "μg": m[i] = arrVal[i] * 0.000000001; break;
                case "lb": m[i] = arrVal[i] * 0.453592;
            }
        }

        switch (arrUnit[2]) {
            case "cm": d = arrVal[2] * 0.01; break;
            case "mm": d = arrVal[2] * 0.001; break;
            case "μm": d = arrVal[2] * 0.000001; break;
            case "ft": d = arrVal[2] * 0.3048;
        }
        return g * m[0] * m[1] / Math.pow(d, 2);
    }
}
