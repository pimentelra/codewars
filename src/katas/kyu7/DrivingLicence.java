package katas.kyu7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DrivingLicence {
    public static String driver(final String[] data) {
        return new StringBuilder().append(String.format("%-5s", String.format("%.5s", data[2])).replace(' ', '9').toUpperCase())
                .append(data[3].charAt(data[3].length() - 2))
                .append(String.format("%02d", LocalDate.parse(data[3], data[3].split("-")[1].length() > 3 ? DateTimeFormatter.ofPattern("dd-MMMM-yyyy") : DateTimeFormatter.ofPattern("dd-MMM-yyyy")).getMonth().getValue() + (data[4].equals("F") ? 50 : 0)))
                .append(data[3].split("-")[0])
                .append(data[3].charAt(data[3].length() - 1))
                .append(data[0].charAt(0))
                .append(data[1].length() > 0 ? data[1].charAt(0) : "9")
                .append("9AA")
                .toString();
    }
}
