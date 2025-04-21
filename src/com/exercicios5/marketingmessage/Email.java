package com.exercicios5.marketingmessage;

public class Email implements MarketingMessage {

    @Override
    public String sendMessage(String message) {
        return "EMAIL: " + message;
    }
}
