package com.javapractice;

import org.junit.Test;
import org.junit.Assert;


public class MoodAnalyserTest {
     MoodAnalyser checkMessage1 = new MoodAnalyser("I am in sad mood");
    @Test
    public void givenMesaageWhenSadShouldreturnSad() {
        Assert.assertEquals("SAD", checkMessage1.analyseMood());
    }
    MoodAnalyser checkMessage2 = new MoodAnalyser("I am in happy mood");

    @Test
    public void givenMessageWhennotSadShouldReturnHappy() {
        Assert.assertEquals("HAPPY", checkMessage2.analyseMood());
    }
   
}