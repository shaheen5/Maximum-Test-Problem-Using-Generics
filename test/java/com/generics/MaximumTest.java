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
}
