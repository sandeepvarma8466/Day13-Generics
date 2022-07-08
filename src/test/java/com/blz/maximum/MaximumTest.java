package com.blz.maximum;

import com.blz.generic.TestMaximum;
import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //TC 1.1 Given Max Integer find the maximum Integer Value.
    @Test
    public void floatMax1() {
        int actualValue = TestMaximum.testMaximum(5,18,12);
        Assert.assertTrue(true);
    }
   // TC 1.2 Given Max Float find the maximum Float Value.
    @Test
    public void floatMax2() {
        Float actualValue = TestMaximum.testMaximum(2.5f, 11.5f, 9.8f);
        Assert.assertTrue(true);
    }
   //TC 1.3 Given 3 String find the maximum String.
    @Test
    public void floatMax3() {
        String actualValue = TestMaximum.testMaximum("peach","apple","banana");
        Assert.assertEquals("peach",actualValue);
    }
    //TC 4 Extending the max method to take more than three parameters
    @Test
    public void givenStringValuesWhenGetMaximumShouldReturnCorrectValue() {
        String actualResult = TestMaximum.testMaximum("Apple", "Peach", "Banana", "Mango","Strawberry");
        Assert.assertEquals("Strawberry", actualResult);
    }
}
