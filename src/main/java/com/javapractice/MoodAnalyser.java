package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MoodAnalyser 
{
    private static final Logger log = LogManager.getLogger(MoodAnalyser.class);

    public String analyseMood(String message) {
    log.info("Welcome to Mood Analyser Program!");
	if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }
    public static void main( String[] args )
    {   
        String message="I am in sad mood";
        MoodAnalyser analyser=new MoodAnalyser();
        String mood=analyser.analyseMood(message);
        log.info("Mood is "+mood);
    }
}
