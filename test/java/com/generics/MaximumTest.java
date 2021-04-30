package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum=new Maximum(9,5,2);
        Comparable maximumInteger = maximum.findMaximumValue();
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Maximum maximum=new Maximum(5,9,2);
        Comparable maximumInteger =  maximum.findMaximumValue();
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Maximum maximum=new Maximum(2,5,9);
        Comparable maximumInteger = maximum.findMaximumValue();
        Assert.assertEquals(9, maximumInteger);
    }
    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum=new Maximum(8.5f,6.6f,7.8f);
        Float maximumFloat = (Float) maximum.findMaximumValue();
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum(6.6f,8.5f,7.8f);
        Float maximumFloat = (Float)maximum.findMaximumValue();
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum(6.6f,7.8f,8.5f);
        Float maximumFloat = (Float) maximum.findMaximumValue();
        Assert.assertEquals(8.5f, maximumFloat,0.0f);
    }
    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnSameString() {
        Maximum maximum=new Maximum("Peach","Apple","Banana");
        Object maximumString = maximum.findMaximumValue();
        Assert.assertEquals("Peach", maximumString);
    }
    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnSameString() {
        Maximum maximum=new Maximum("Apple","Peach","Banana");
        Object maximumString = maximum.findMaximumValue();
        Assert.assertEquals("Peach", maximumString);
    }
    @Test
    public void givenMaxString_AtThirdPosition_ShouldReturnSameString() {
        Maximum maximum=new Maximum("Apple","Banana","Peach");
        Object maximumString = maximum.findMaximumValue();
        Assert.assertEquals("Peach", maximumString);
    }
}