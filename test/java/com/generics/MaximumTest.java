package com.generics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class MaximumTest {
    @Test
    public void givenMaxNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum=new Maximum();
        Optional<Integer> maximumInteger = maximum.findMaximumValue(9,5,2);
        Assert.assertEquals(Optional.of(9), maximumInteger);
    }
    @Test
    public void givenMaxNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Maximum maximum=new Maximum();
        Optional<Integer> maximumInteger = maximum.findMaximumValue(5,9,2);
        Assert.assertEquals(Optional.of(9), maximumInteger);
    }
    @Test
    public void givenMaxNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Maximum maximum=new Maximum();
        Optional maximumInteger = (Optional) maximum.findMaximumValue(2,5,9);
        Assert.assertEquals(Optional.of(9), maximumInteger);
    }
    @Test
    public void givenMaxFloatNumber_AtFirstPosition_ShouldReturnSameNumber() {
        Maximum maximum=new Maximum();
        Optional maximumFloat =(Optional) maximum.findMaximumValue(8.5f,6.6f,7.8f);
        Assert.assertEquals(Optional.of(8.5f), maximumFloat);
    }
    @Test
    public void givenMaxFloatNumber_AtSecondPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        Optional maximumFloat =(Optional) maximum.findMaximumValue(6.6f,8.5f,7.8f);
        Assert.assertEquals(Optional.of(8.5f), maximumFloat);
    }
    @Test
    public void givenMaxFloatNumber_AtThirdPosition_ShouldReturnSameNumber() {
        Maximum maximum = new Maximum();
        Optional maximumFloat = maximum.findMaximumValue(6.6f,7.8f,8.5f);
        Assert.assertEquals(Optional.of(8.5f), maximumFloat);
    }
    @Test
    public void givenMaxString_AtFirstPosition_ShouldReturnSameString() {
        Maximum maximum=new Maximum();
        Object maximumString = maximum.findMaximumValue("Peach","Apple","Banana");
        Assert.assertEquals(Optional.of("Peach"), maximumString);
    }
    @Test
    public void givenMaxString_AtSecondPosition_ShouldReturnSameString() {
        Maximum maximum=new Maximum();
        Object maximumString = maximum.findMaximumValue("Apple","Peach","Banana");
        Assert.assertEquals(Optional.of("Peach"), maximumString);
    }
    @Test
    public void givenMaxString_AtThirdPosition_ShouldReturnSameString() {
        Maximum maximum=new Maximum();
        Object maximumString = maximum.findMaximumValue("Apple","Banana","Peach");
        Assert.assertEquals(Optional.of("Peach"), maximumString);
    }
}