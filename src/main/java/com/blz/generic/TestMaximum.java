package com.blz.generic;

public class TestMaximum {
    String x, y, z;

    public TestMaximum(String x, String y, String z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // testMaximum method created for checking max of three Strings
    public static String testMaximum(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        printMax(x, y, z, max);
        return max;
    }

    // printMax method created for displaying maximum values from the given 3 Strings.
    public static void printMax(String x, String y, String z, String max) {
        System.out.printf("The max of %s, %s and %s is %s\n", x, y, z, max);

    }
}
