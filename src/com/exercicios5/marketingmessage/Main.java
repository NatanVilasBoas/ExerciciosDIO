package com.exercicios5.marketingmessage;

public class Main {
    public static void main(String[] args){
        Sms sms = new Sms();
        Email email = new Email();
        SocialMedia socialMedia = new SocialMedia();
        Whatsapp whatsapp = new Whatsapp();

        String message = "Olá está é uma mensagem de marketing";
        System.out.println(sms.sendMessage(message));
        System.out.println(email.sendMessage(message));
        System.out.println(socialMedia.sendMessage(message));
        System.out.println(whatsapp.sendMessage(message));
    }
}
