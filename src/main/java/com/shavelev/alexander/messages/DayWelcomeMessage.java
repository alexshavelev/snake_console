package com.shavelev.alexander.messages;

/**
 * Created by user on 23.11.15.
 */
public class DayWelcomeMessage extends Message {
    private static final String DAY = "day";

    @Override
    public String getDayTime() {
        return DAY;
    }

}
