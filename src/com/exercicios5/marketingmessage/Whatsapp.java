package com.exercicios5.marketingmessage;

public class Whatsapp implements MarketingMessage {
    @Override
    public String sendMessage(String message) {
        return "WHATSAPP: " + message;
    }
}
