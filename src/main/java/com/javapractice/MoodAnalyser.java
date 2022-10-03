package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoodAnalyser {
    private static final Logger log = LogManager.getLogger(MoodAnalyser.class);
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {
    }

    public String analyseMood() throws MoodAnalyserException {
        log.info("Welcome to Mood Analyser Program!");
        try {
            if (message.isEmpty())
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter proper message");
            if (message.contains("sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        String message = "I am in sad mood";
        MoodAnalyser analyser = new MoodAnalyser(message);
        try {
        String mood = analyser.analyseMood();
        log.info("Mood is " + mood);
        } catch (Exception e) {
          log.info("exception is: "+e);
        }
    }
}
