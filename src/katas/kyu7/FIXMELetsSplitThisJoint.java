package katas.kyu7;

public class FIXMELetsSplitThisJoint {
    public static String[] split(final String joint) {
        return joint.length() == 0 ? new String[0] : joint.split("\\.", -1);
    }
}
