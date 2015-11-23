package com.shavelev.alexander.messages;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by user on 23.11.15.
 */
public abstract class Message {
    private static final String MESSAGES_FILE = "messages";
    private static final String RECIPIENT = "recipient";
    private static final String END_SYMBOL = "symbol.end";


    /**
     * @return welcome message to user depends on time and lang
     */
    public String getWelcomeMessage() {
        StringBuilder message = new StringBuilder();
        message.append(ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(getDayTime()))
                .append(", ")
                .append(ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(RECIPIENT))
                .append(ResourceBundle.getBundle(MESSAGES_FILE, Locale.getDefault()).getString(END_SYMBOL));
        return message.toString();
    }

    /**
     * @return day part
     */
    public abstract String getDayTime();

    public void printMessage() {
        System.out.println(getWelcomeMessage());
    }


}
