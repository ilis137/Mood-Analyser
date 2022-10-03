package com.javapractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MoodAnalyser 
{
    private static final Logger log = LogManager.getLogger(MoodAnalyser.class);
    String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }
    
    public MoodAnalyser() {
    }

    public String analyseMood() {
    log.info("Welcome to Mood Analyser Program!");
	if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
    }
    public static void main( String[] args )
    {   
        String message="I am in sad mood";
        MoodAnalyser analyser=new MoodAnalyser(message);
        String mood=analyser.analyseMood();
        log.info("Mood is "+mood);
    }
}
