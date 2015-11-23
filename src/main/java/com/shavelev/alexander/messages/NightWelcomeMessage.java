package com.shavelev.alexander.messages;

/**
 * Created by user on 23.11.15.
 */
public class NightWelcomeMessage extends Message {
    private static final String NIGHT = "night";

    @Override
    public String getDayTime() {
        return NIGHT;
    }

}
