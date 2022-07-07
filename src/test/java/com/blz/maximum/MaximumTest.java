package com.blz.maximum;

import com.blz.generic.TestMaximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //TC 1.1 Given Max String at 1st position return the Same String.
    @Test
    public void floatMax1() {
        String actualValue = TestMaximum.testMaximum("dogs", "cat", "dog");
        Assert.assertTrue(true);
    }
   // TC 1.2 Given Max String at 2nd position return the Same String.
    @Test
    public void floatMax2() {
        String actualValue = TestMaximum.testMaximum("cat","goat","dog");
        Assert.assertTrue(true);
    }
   //TC 1.3 Given Max String at 3rd position return the Same String.
    @Test
    public void floatMax3() {
        String actualValue = TestMaximum.testMaximum("bat", "ball","wicket");
        Assert.assertTrue(true);
    }
}
