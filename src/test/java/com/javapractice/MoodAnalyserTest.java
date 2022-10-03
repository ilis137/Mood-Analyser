package com.javapractice;

import org.junit.Test;
import org.junit.Assert;


public class MoodAnalyserTest {
    static MoodAnalyser checkMessage = new MoodAnalyser();
    @Test
    public void givenMesaageWhenSadShouldreturnSad() {
        Assert.assertEquals("SAD", checkMessage.analyseMood());
    }
    @Test
    public void givenMessageWhennotSadShouldReturnHappy() {
        Assert.assertEquals("HAPPY", checkMessage.analyseMood());
    }
   
}