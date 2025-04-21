package com.exercicios5.marketingmessage;

public class SocialMedia implements MarketingMessage {
    @Override
    public String sendMessage(String message) {
        return "SOCIALMEDIA: " + message;
    }
}
