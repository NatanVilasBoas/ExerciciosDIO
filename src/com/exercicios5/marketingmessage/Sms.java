package com.exercicios5.marketingmessage;

public class Sms implements MarketingMessage{

    @Override
    public String sendMessage(String message) {
        return "SMS: " + message;
    }
}
