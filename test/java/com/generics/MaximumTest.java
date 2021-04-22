package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        int maximumInteger = Maximum.findMaximumInteger(9,5,2);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        int maximumInteger = Maximum.findMaximumInteger(5,9,2);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        int maximumInteger = Maximum.findMaximumInteger(2,5,9);
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Float maximumFloat = Maximum.findMaximumFloat(8.5f,6.6f,7.8f);
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Float maximumFloat = Maximum.findMaximumFloat(6.6f,8.5f,7.8f);
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Float maximumFloat = Maximum.findMaximumFloat(6.6f,7.8f,8.5f);
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
}