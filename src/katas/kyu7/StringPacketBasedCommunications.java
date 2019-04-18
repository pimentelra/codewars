package katas.kyu7;

import java.text.DecimalFormat;

public class StringPacketBasedCommunications {
    public static String communicationModule(String packet) {
        int data1 = Integer.parseInt(packet.substring(8, 12)), data2 = Integer.parseInt(packet.substring(12, 16)), result;
        switch (packet.substring(4, 5)) {
            case "0": result = data1 + data2; break;
            case "B": result = data1 - data2; break;
            default: result = data1 * data2;
        }
        result = result < 0 ? 0 : result > 9999 ? 9999 : result;
        return String.format("%sFFFF%s0000%s", packet.substring(0, 4), new DecimalFormat("0000").format(result), packet.substring(16));
    }
}
