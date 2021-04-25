package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        int maximumInteger = Maximum.findMaximumValue(9,5,2);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        int maximumInteger = Maximum.findMaximumValue(5,9,2);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        int maximumInteger = Maximum.findMaximumValue(2,5,9);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Float maximumFloat = Maximum.findMaximumValue(8.5f,6.6f,7.8f);
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Float maximumFloat = Maximum.findMaximumValue(6.6f,8.5f,7.8f);
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Float maximumFloat = Maximum.findMaximumValue(6.6f,7.8f,8.5f);
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnSameString() {
        String maximumString = Maximum.findMaximumValue("Peach","Apple","Banana");
        Assert.assertEquals("Peach", maximumString);
    }
    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnSameString() {
        String maximumString = Maximum.findMaximumValue("Apple","Peach","Banana");
        Assert.assertEquals("Peach", maximumString);
    }
    @Test
    public void givenMaxString_AtThirdPosition_ShouldReturnSameString() {
        String maximumString = Maximum.findMaximumValue("Apple","Banana","Peach");
        Assert.assertEquals("Peach", maximumString);
    }
}