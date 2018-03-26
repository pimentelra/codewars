package katas.kyu7;

import java.util.Arrays;

public class AD2070HelpLorimarTroubleshootHisRobotsUltrasonicDistanceAnalysis {
    public static double[] sensorAnalysis(Object[][] sensor_data) {
        double[] res = new double[2];
        int count = sensor_data.length;

        res[0] = Math.round((Arrays.stream(sensor_data).mapToDouble(aSensor_data -> (double) aSensor_data[1]).sum() / (count * 1.)) * 10000) / 10000.;

        double sum = Arrays.stream(sensor_data).mapToDouble(sensor_datum -> Math.pow(((double) sensor_datum[1] - res[0]), 2)).sum();
        res[1] = Math.round(Math.sqrt(sum / ((count - 1) * 1.)) * 10000) / 10000.;

        return res;
    }
}
