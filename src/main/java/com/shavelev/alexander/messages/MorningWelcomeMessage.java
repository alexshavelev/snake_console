package com.shavelev.alexander.messages;

/**
 * Created by user on 23.11.15.
 */
public class MorningWelcomeMessage extends Message {
    private static final String MORNING = "morning";

    @Override
    public String getDayTime() {
        return MORNING;
    }

}
