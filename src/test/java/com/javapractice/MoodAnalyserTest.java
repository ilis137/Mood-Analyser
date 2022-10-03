package com.javapractice;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;


public class MoodAnalyserTest {
  
    static String mood = null;
    @Test
    public void givenMessage_whenNull_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.type);
        }
    }

    @Test
    public void givenMessage_whenEmpty_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.type);
        }
    }
}
