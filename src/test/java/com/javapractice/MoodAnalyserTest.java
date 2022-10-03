package com.javapractice;

import org.junit.Test;
import org.junit.Assert;


public class MoodAnalyserTest {
     MoodAnalyser checkMessage = new MoodAnalyser();
    @Test
    public void givenMesaageWhenSadShouldreturnSad() {
        Assert.assertEquals("SAD", checkMessage.analyseMood());
    }
    @Test
    public void givenMessageWhennotSadShouldReturnHappy() {
        Assert.assertEquals("HAPPY", checkMessage.analyseMood());
    }

    MoodAnalyser checkNullMessage = new MoodAnalyser();
    @Test
    public void givenNullMessageWhennotSadShouldReturnHappy() {
        Assert.assertEquals("HAPPY", checkMessage.analyseMood());
    }
}