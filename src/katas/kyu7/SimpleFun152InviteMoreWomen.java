package katas.kyu7;

import java.util.Arrays;

public class SimpleFun152InviteMoreWomen {
    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l).sum() > 0;
    }
}
