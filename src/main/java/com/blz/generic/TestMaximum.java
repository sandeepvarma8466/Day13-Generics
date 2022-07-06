package com.blz.generic;

public class TestMaximum {
    int x, y, z;

    public TestMaximum(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // testMaximum method created for checking max of three integers
    public static Integer testMaximum(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        printMax(x, y, z, max);
        return max;
    }

    // printMax method created for displaying maximum values from the given 3 variables.
    public static void printMax(Integer x, Integer y, Integer z, Integer max) {
        System.out.printf("The max of %s, %s and %s is %s\n", x, y, z, max);

    }
}
