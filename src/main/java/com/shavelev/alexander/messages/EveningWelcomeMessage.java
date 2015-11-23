package com.shavelev.alexander.messages;

/**
 * Created by user on 23.11.15.
 */
public class EveningWelcomeMessage extends Message {

    private static final String EVENING = "evening";

    @Override
    public String getDayTime() {
        return EVENING;
    }

}
